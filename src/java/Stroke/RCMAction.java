/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Procedure.JobOpeningOperation;
import Prototypical.RCM;
import Procedure.RCMOperation;
import Prototypical.ContactPerson;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Devank
 */
public class RCMAction extends ActionSupport implements ModelDriven,Preparable,ServletRequestAware {
    RCM rcm;
    String contactno;
    List<RCM> listrcm;
     HttpServletRequest request;
    

    public List<RCM> getListrcm() {
        return listrcm;
    }

    public void setListrcm(List<RCM> listrcm) {
        this.listrcm = listrcm;
    }
    
    
   

    public String getContactno() {
        
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
    
    @Override
    public RCM getModel() {
        return rcm;
    }

    @Override
    public void prepare() throws Exception {
        rcm=new RCM();
    }
    
     public String retriveData(){
       
        RCMOperation rcmop = new RCMOperation();
        listrcm = rcmop.dataretrival();
        return SUCCESS;
    }
    
    

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
     public String saveData()
    {   
        RCMOperation rcmoperation = new RCMOperation();
        Long a;
        StringTokenizer st;
        ContactPerson co = new ContactPerson();
        Set<ContactPerson> cp = new HashSet();
        st = new StringTokenizer(contactno, ",");

        while (st.hasMoreElements()) {
            String str = st.nextToken().trim();
            a = Long.parseLong(str);
            co.setContactno(a);
            co.setPersonid(rcm.getPersonid());
            cp.add(co);
            rcm.setContact(cp);
        }
        
        EmailAction emailaction=new EmailAction();
        emailaction.emailSend(rcm.getEmailid(), rcm.getFname()+rcm.getMname()+rcm.getLname()+"Registration", "Your Registration Details are \n\n UserName\t:\t"+rcm.getUsername()+"\n Password\t:\t"+rcm.getPassword());
        
        
        boolean save=rcmoperation.insertDetails(rcm);
      
        if(save)
        {
            addActionMessage("SUCCESSFULLY INSERTED");
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }
}
