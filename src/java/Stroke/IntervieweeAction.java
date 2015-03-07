/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Interviewee;
import Procedure.IntervieweeOperation;
import Procedure.JobOpeningOperation;
import Procedure.RoundOperation;
import Prototypical.ContactPerson;
import Prototypical.Jobopeningdetails;
import Prototypical.Languageknown;
import Prototypical.LanguageknownId;
import Prototypical.Round;
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
public class IntervieweeAction extends ActionSupport implements ModelDriven,Preparable,ServletRequestAware {
   
    Interviewee interviewee;
    List<Round> listround;
    String str;
   
    @Override
        public Interviewee getModel() {
       return interviewee;
    }

    @Override
    public void prepare() throws Exception {
        interviewee = new Interviewee();
    }
    
     public String retriveData(){
       
        IntervieweeOperation intop = new IntervieweeOperation();
        JobOpeningOperation joo = new JobOpeningOperation();
         RoundOperation ro1 = new RoundOperation();
        
        listround = ro1.asdewes();
        listjod = joo.dataretrival();
        listinterviewee = intop.dataretrival();
       
        return SUCCESS;
    }
    
    

    
    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
    
    public String saveData()
    {   
        IntervieweeOperation intervieweeoperation = new IntervieweeOperation();
        Long a;
        StringTokenizer st;
        ContactPerson co = new ContactPerson();
        Set<ContactPerson> cp = new HashSet();
        st = new StringTokenizer(contactno, ",");
        
        while (st.hasMoreElements()) {
            str = st.nextToken().trim();
            a = Long.parseLong(str);
            co.setContactno(a);
            co.setPersonid(interviewee.getPersonid());
            cp.add(co);
            interviewee.setContact(cp);
        }
        
     
        
        StringTokenizer stds = new StringTokenizer(langknown, ",");
        lkn = new HashSet<>();   
        while (stds.hasMoreTokens()) {
            langid = new LanguageknownId(interviewee.getPersonid(), stds.nextToken().trim());
            languageknown = new Languageknown(langid, interviewee);
            lkn.add(languageknown);
        } 
        interviewee.setLanguageknown(lkn);
        
       
        boolean save=intervieweeoperation.insertDetails(interviewee);
        JobOpeningOperation joo = new JobOpeningOperation();
        listjod = joo.dataretrival();
        if(save)
        {
            SMSAction smsa = new SMSAction();
            smsa.SMSSend("91"+str, "You are Registered in Interview Evolution System.\nUsername: "+interviewee.getUsername()+"\nPassword: "+interviewee.getPassword()+"\nThankyou");
            addActionMessage("SUCCESSFULLY INSERTED");
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
        
    }
    String contactno,langknown;
    List<Interviewee> listinterviewee;
    HttpServletRequest request;
    LanguageknownId langid;
    Languageknown languageknown;
    Set<Languageknown> lkn;
    List<Jobopeningdetails> listjod;
    public String intervieweeData()
    {
        IntervieweeOperation io=new IntervieweeOperation();
        listinterviewee=io.dataretrival();
        return SUCCESS;
    }
    public Set<Languageknown> getLkn() {
        
        return lkn;
    }

    public void setLkn(Set<Languageknown> lkn) {
        this.lkn = lkn;
    }

    public String getLangknown() {
        return langknown;
    }

    public void setLangknown(String langknown) {
        
        this.langknown = langknown;
    }

    public List<Jobopeningdetails> getListjod() {
        return listjod;
    }

    public void setListjod(List<Jobopeningdetails> listjod) {
        this.listjod = listjod;
    }
    public Interviewee getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(Interviewee interviewee) {
        this.interviewee = interviewee;
    }

    public List<Interviewee> getListinterviewee() {
        return listinterviewee;
    }

    public void setListinterviewee(List<Interviewee> listinterviewee) {
        this.listinterviewee = listinterviewee;
    }
    
    public String getContactno() {
    
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public List<Round> getListround() {
        return listround;
    }

    public void setListround(List<Round> listround) {
        this.listround = listround;
    }
    
    

    
}
