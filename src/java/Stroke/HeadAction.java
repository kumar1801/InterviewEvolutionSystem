/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Prototypical.ContactPerson;
import Prototypical.Head;
import Procedure.HeadOperation;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Devank
 */
public class HeadAction extends ActionSupport implements ModelDriven, Preparable,ServletRequestAware {

    String contactno;
    Head head;
    Set<Head> ahead;
    private HttpServletRequest servletRequest;
    
    public Set<Head> getAhead() {
        return ahead;
    }

    public void setAhead(Set<Head> ahead) {
        this.ahead = ahead;
    }

    @Override

    public Head getModel() {

        return head;
    }

    @Override
    public void prepare() throws Exception {
        head = new Head();
    }

    public String saveData() {
        HeadOperation headoperation = new HeadOperation();
        Long a;
        StringTokenizer st;
        ContactPerson co = new ContactPerson();
        Set<ContactPerson> cp = new HashSet();
        st = new StringTokenizer(contactno, ",");

        while (st.hasMoreElements()) {
            String str = st.nextToken().trim();
            a = Long.parseLong(str);
            co.setContactno(a);
            co.setPersonid(head.getPersonid());
            cp.add(co);
            head.setContact(cp);
        }
                    try
                    {
                            
                                            String filePath=servletRequest.getSession().getServletContext().getRealPath("/uploadedImages/");
                                            File fileToCreate = new File(filePath, this.userImageFileName);
                                            FileUtils.copyFile(this.userImage, fileToCreate);
                                            byte[] bFile = new byte[(int) fileToCreate.length()];
            try (FileInputStream fileInputStream = new FileInputStream(fileToCreate)) {
                fileInputStream.read(bFile);
            }
                        
                                            String fname="uploadedImages/"+userImageFileName;
                                            head.setImagename(fname);
                                            head.setHeadimg(bFile);
                    }
                    catch(IOException e)
                    {
                        return INPUT;
                    }
                    
                                    boolean save = headoperation.insertDetails(head);
                                    if (save) {
                                        addActionMessage("SUCCESSFULLY INSERTED");
                                        return SUCCESS;
                                    } else {
                                        addActionError("Not inserted");
                                        return ERROR;
                                    }

    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
            this.servletRequest=servletRequest;    }
    
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    
    public String getContactno() {
       
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
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
}
