/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Databaseutil.MyFilterHib;
import Procedure.HeadOperation;
import Procedure.IntervieweeOperation;
import Procedure.RCMOperation;
import Prototypical.Head;
import Prototypical.Interviewee;
import Prototypical.Login;
import Prototypical.Person;
import Prototypical.RCM;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javassist.bytecode.Descriptor;
import javax.servlet.ServletContext;
import static org.apache.struts2.ServletActionContext.getServletContext;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Devank
 */
public class LoginAction extends ActionSupport implements ModelDriven,Preparable,SessionAware {

    Login login;
    List<Interviewee> listinterviewee;
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
        
       
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("from Person where type=:interviewee");
        Query q2=s.createQuery("from Person where type=:RCM");
        q.setParameter("interviewee","interviewee");
        q2.setParameter("RCM","RCM");
        List<Person> person=q.list();
        List<Person> pers=q2.list();
       for(Person p : person)
       {
           if(login.getUsername().equals(p.getUsername()))       
            {
                flagn=true;
                if( login.getPassword().equals(p.getPassword()))
                {   flagp=true;
                    map.put("username", login.getUsername());
                    map.put("Password", login.getPassword());
                    break;
                }
                
            }
       }
       for(Person p1 : pers)
       {
           if(login.getUsername().equals(p1.getUsername()))       
            {
                flagn=true;
                if( login.getPassword().equals(p1.getPassword()))
                {   
                    flagp=true;
                
                    map.put("username", login.getUsername());
                    map.put("Password", login.getPassword());
                    Query q3=s.createQuery("select RCMRole from RCM where personid = "+p1.getPersonid());
                    List<RCM> rcmrole=q3.list();
                    Iterator it1=rcmrole.iterator();
                    String rcmole=it1.next().toString();
                    if(rcmole.toString().contains("HR"))
                    {   
                        return "HR";
                    }
                     if(rcmole.toString().contains("Recruiter"))
                    {   
                        return "Recruiter";
                    }
                      if(rcmole.toString().contains("Interviewer"))
                    {   
                        return "Interviewer";
                    }
                   
                    break;
                }
                
            }
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
        tx.commit();
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
