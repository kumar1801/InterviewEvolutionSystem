/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;
import Procedure.JobOpeningOperation;
import Prototypical.Requireddocuments;
import Prototypical.Requiedqualification;
import Prototypical.Desiredskills;
import Prototypical.Jobopeningdetails;
import Prototypical.RequiedqualificationId;
import Prototypical.DesiredskillsId;
import Prototypical.RequireddocumentsId;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Jyotil
 */
public class JobOpeningAction extends ActionSupport implements ModelDriven, Preparable,ServletRequestAware {

    Jobopeningdetails jod;
    String requiredDocuments, desiredskilled,requiredQualification;
   List<Jobopeningdetails> listjod;
    DesiredskillsId did;
    Desiredskills desiredskills;
    Set<Desiredskills> std;
    RequiedqualificationId rid;
    Requiedqualification requiedqualification;
    Set<Requiedqualification> str;
    Requireddocuments requireddocuments;
    RequireddocumentsId rqid;
    Set<Requireddocuments> srq;
    HttpServletRequest request;
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;

    public List<Jobopeningdetails> getListjod() {
        return listjod;
    }

    public void setListjod(List<Jobopeningdetails> listjod) {
        this.listjod = listjod;
    }
   
    
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

    
    public String getRequiredDocuments() {
        return requiredDocuments;
    }

    public void setRequiredDocuments(String requiredDocuments) {
        
        this.requiredDocuments = requiredDocuments;
    }

    public String getRequiredQualification() {
        return requiredQualification;
    }

    public void setRequiredQualification(String requiredQualification) {
        this.requiredQualification = requiredQualification;
    }
    
    public String getDesiredskilled() {
        return desiredskilled;
    }

    public void setDesiredskilled(String desiredskilled) {
        this.desiredskilled = desiredskilled;
    }

    @Override
    public Object getModel() {
        return jod;
    }

    @Override
    public void prepare() throws Exception {
        jod = new Jobopeningdetails();
    }

    public String SaveData() {
        
        StringTokenizer stds = new StringTokenizer(desiredskilled, ",");
        StringTokenizer strd = new StringTokenizer(requiredQualification, ",");
        StringTokenizer strq = new StringTokenizer(requiredDocuments, ",");
        std = new HashSet<Desiredskills>();
        str = new HashSet<Requiedqualification>();
        srq=new HashSet<Requireddocuments>();

         while (strq.hasMoreTokens()) {
           rqid = new RequireddocumentsId(jod.getJobReferenceCode(), strq.nextToken());
            requireddocuments = new Requireddocuments(rqid);
            srq.add(requireddocuments);
        }
        while (stds.hasMoreTokens()) {
            did = new DesiredskillsId(jod.getJobReferenceCode(), stds.nextToken());
            desiredskills = new Desiredskills(did, jod);
            std.add(desiredskills);
        }
        
        while (strd.hasMoreTokens()) {
            rid = new RequiedqualificationId(jod.getJobReferenceCode(), strd.nextToken());
            requiedqualification = new Requiedqualification(rid, jod);
            str.add(requiedqualification);
        }
        

        jod.setRequiedqualifications(str);
        jod.setDesiredskillses(std);
        jod.setRequireddocuments(srq);
        
        try {

            String filePath = request.getSession().getServletContext().getRealPath("/uploadedImages/");
            System.out.println("Server path:---------------------------------" + filePath);
          
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);
            byte[] bFile = new byte[(int) fileToCreate.length()];

            FileInputStream fileInputStream = new FileInputStream(fileToCreate);

            fileInputStream.read(bFile);
            fileInputStream.close();

            String fname = "uploadedImages/" + userImageFileName;
            jod.setImagename(fname);
           jod.setImage(bFile);

        } catch (IOException e) {
            return INPUT;
        }
        
        
        boolean save = new Procedure.JobOpeningOperation().insData(jod);
        if (save) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    
    public String retriveData(){
       
        JobOpeningOperation joo = new JobOpeningOperation();
        listjod = joo.dataretrival();
        return SUCCESS;
    }
    
    

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
    
    

   

}
