/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

/**
 *
 * @author Devank
 */
import Procedure.OrganizationOperation;
import Prototypical.Branch;
import Prototypical.Contactbranch;
import Prototypical.ContactbranchId;
import Prototypical.Organization;
import static com.opensymphony.xwork2.Action.INPUT;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Nagdaman
 */
public class OrganizationAction extends ActionSupport implements ModelDriven, Preparable, ServletRequestAware {

    Branch br;
    Organization org;
    String contactno;
    Set<Branch> br1 = new HashSet();
    ArrayList<Organization> orgdetail;
    ArrayList<Branch> branchdetail;
    ArrayList<Contactbranch> viewBranchContact;
    ContactbranchId cid;
    Contactbranch contactbranch;
    Set<Contactbranch> ctd;
    private HttpServletRequest servletRequest;

    public String getContactno() {

        return contactno;
    }

    public void setContactno(String contactno) {
        System.out.println("" + contactno.toString());
        this.contactno = contactno;
    }

    public ArrayList<Organization> getOrgdetail() {
        return orgdetail;
    }

    public void setOrgdetail(ArrayList<Organization> orgdetail) {
        this.orgdetail = orgdetail;
    }

    public Branch getBr() {
        return br;
    }

    public void setBr(Branch br) {
        System.out.println("" + br.toString());
        this.br = br;
    }

    @Override
    public Organization getModel() {
        return org;
    }

    @Override
    public void prepare() throws Exception {

        org = new Organization();
    }

    public String saveData() {
        OrganizationOperation oo = new OrganizationOperation();
        /*   Integer a;
         Integer i=0;
         StringTokenizer st;
         contactno_branch co=new contactno_branch();
         Set<contactno_branch> cp=new HashSet();
         st = new StringTokenizer(contactno,",");
       
         while (st.hasMoreElements())
         {   System.out.println("-------"+st.nextElement());
         a=Integer.parseInt(st.nextToken().trim());
         co.setContactno(a);
         System.out.println("------------------------"+co.getContactno());
         co.setBranchid(br.getBranchid());
         cp.add(co);
                
         }  
         br.setContact(cp);*/
        br = getBr();
        StringTokenizer stds = new StringTokenizer(contactno, ",");

        ctd = new HashSet<Contactbranch>();

        while (stds.hasMoreTokens()) {

            cid = new ContactbranchId(br.getBranchid(), Long.parseLong(stds.nextToken()));
            contactbranch = new Contactbranch(cid, br);
            ctd.add(contactbranch);

        }
        br.setContact(ctd);

        //  br.setOrgname(org.getOrgname());
        // org.getBranches().add(br.getOrganization());
        br1.add(br);
        org.setBranches(br1);
        try {

            String filePath = servletRequest.getSession().getServletContext().getRealPath("/uploadedImages/");
            System.out.println("Server path:---------------------------------" + filePath);
            addActionMessage("---------------------------------------" + filePath);
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);
            byte[] bFile = new byte[(int) fileToCreate.length()];

            FileInputStream fileInputStream = new FileInputStream(fileToCreate);

            fileInputStream.read(bFile);
            fileInputStream.close();

            String fname = "uploadedImages/" + userImageFileName;

            org.setImagename(fname);
            org.setOrglogo(bFile);

        } catch (IOException e) {
            return INPUT;
        }

        boolean save = oo.insertDetails(org);
        if (save) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    public String retriveData() {System.out.println(">--191-->");
        OrganizationOperation org1 = new OrganizationOperation();System.out.println(">--192-->");
        branchdetail = org1.BranchDetails();System.out.println(">--193-->");
        if (branchdetail.isEmpty()) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public ArrayList<Branch> getBranchdetail() {
        return branchdetail;
    }

    public void setBranchdetail(ArrayList<Branch> branchdetail) {
        this.branchdetail = branchdetail;
    }
    
}
