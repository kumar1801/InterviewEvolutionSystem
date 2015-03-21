/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Procedure.EmailOperation;
import Prototypical.Email;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.StringTokenizer;

/**
 *
 * @author Devank
 */
public class EmailAction extends ActionSupport implements ModelDriven,Preparable {
    
    Email email;
    @Override
     public Email getModel() {
            return email;
    }

    @Override
    public void prepare() throws Exception {
        email = new Email();
    }
    public EmailAction(){}
    public void emailSend(String to,String subject,String actualcontent)
    {
            EmailOperation eop=new EmailOperation();
            eop.emailSending(to, subject, actualcontent);
            
    }
    public String emailSendByAdmin()
    {
       /* StringTokenizer st = new StringTokenizer(email_to, ",");
        System.out.println("-------------------"+st);
        while (st.hasMoreElements()) {
            
           String str =st.nextToken().trim();
           
           
        }
        */
           EmailOperation eop=new EmailOperation();
           eop.emailSending(email.getEmail_to(), email.getSubject(), email.getMessage());
        return SUCCESS;
    }
    
    String email_to;

    public String getEmail_to() {
        return email_to;
    }

    public void setEmail_to(String email_to) {
        this.email_to = email_to;
    }
}
