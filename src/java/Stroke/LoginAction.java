/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Procedure.HeadOperation;
import Procedure.IntervieweeOperation;
import Procedure.RCMOperation;
import Prototypical.Head;
import Prototypical.Interviewee;
import Prototypical.Login;
import Prototypical.RCM;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import static org.apache.struts2.ServletActionContext.getServletContext;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Devank
 */
public class LoginAction extends ActionSupport implements ModelDriven,Preparable,SessionAware {

    Login login;
    List list;
    List<Interviewee> listinterviewee;
    List<Head> listhead;
    List<RCM> listrcm;
    public Map map;
    private Map<String, Object> session;
    @Override
    public Login getModel() {
       return login;
    }

    @Override
    public void prepare() throws Exception {
        login=new Login();
    }
   
    @Override
    public String execute()
    {
        String flag;
        ServletContext sc=getServletContext();
        String un=(String)sc.getInitParameter("Loginid");
        String pwd=(String)sc.getInitParameter("Password");
        if(login.getUsername().equals(un)&&login.getPassword().equals(pwd))
        {
            map.put("username", login.getUsername());
            map.put("Password", login.getPassword());
            flag=SUCCESS;
        }
        else
        {
            addActionError("Not Valid");
            flag=ERROR;
        }
        return flag;
    }
    public String signIn()
    {
        String str="";
        boolean flagn=false,flagp=false;
        IntervieweeOperation io=new IntervieweeOperation();
        HeadOperation ho=new HeadOperation();
        RCMOperation ro=new RCMOperation();
        listinterviewee = io.dataretrival();
        listhead=ho.dataretrival();
        listrcm=ro.dataretrival();
        list.add(listhead);
        list.add(listinterviewee);
        list.add(listrcm);
        
        for (Interviewee i : listinterviewee) {
            if(login.getUsername().equals(i.getUsername()))       
            {
                flagn=true;
                if( login.getPassword().equals(i.getPassword()))
                {   flagp=true;
                    map.put("username", login.getUsername());
                    map.put("Password", login.getPassword());
                    break;
                }
                
            }
        }
        
        if(flagn && flagp)
        {
            str= SUCCESS;
        }
        
        if(flagn && !flagp)
        {
                     addActionError("password is incorrect");
                     str= ERROR;
        }
        if(!flagn && !flagp)
        {
                 addActionError("username & password is incorrect");
                 str= ERROR;
        }
          
        return str;
    }
    public String signOut()
    { 
        map.remove("username");
        return SUCCESS;
    }

    public List<Interviewee> getListinterviewee() {
        return listinterviewee;
    }

    public void setListinterviewee(List<Interviewee> listinterviewee) {
        this.listinterviewee = listinterviewee;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.map=map;
    }
    
    
}
