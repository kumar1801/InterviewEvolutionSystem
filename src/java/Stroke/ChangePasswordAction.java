/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Databaseutil.MyFilterHib;
import Procedure.ChangePasswordOperation;
import Prototypical.ChangePassword;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Nagdaman
 */
public class ChangePasswordAction extends ActionSupport implements ModelDriven,Preparable {
    
    ChangePassword chpwd;
    
    
    @Override
    public ChangePassword getModel() {
       return chpwd;
    }

    @Override
    public void prepare() throws Exception {
        chpwd=new ChangePassword();
    }
    
    
     public String changePwd()
    {
        String str="";
        EmailAction emailaction=new EmailAction();
        emailaction.emailSend(chpwd.getEmail(), "Your Changed Password Details\n\n","Your New Password\n"+chpwd.getNewpassword());
        
        ChangePasswordOperation cpo=new ChangePasswordOperation();
        boolean save = cpo.changePassword(chpwd);
                                   if (save) {
                                       addActionMessage("SUCCESSFULLY CHANGED");
                                        return SUCCESS;
                                   } else {
                                       addActionError("ERROR");
                                        return ERROR;
                                    }
      
}
}
