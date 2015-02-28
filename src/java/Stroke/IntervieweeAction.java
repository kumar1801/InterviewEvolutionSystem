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
import Prototypical.Acdemicdetails;
import Prototypical.AcdemicdetailsId;
import Prototypical.ContactPerson;
import Prototypical.Jobopeningdetails;
import Prototypical.Languageknown;
import Prototypical.LanguageknownId;
import Prototypical.Round;
import Prototypical.Workexperience;
import Prototypical.WorkexperienceId;
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
        StringTokenizer st,st1,st2,st3,st4,st5,st6,st7,st8,st9;
        //for work experience
          st1 = new StringTokenizer(orgname, ",");
          st2 = new StringTokenizer(responsibility, ",");
          st3 = new StringTokenizer(designation, ",");
          st4 = new StringTokenizer(duration, ","); 
          st5 = new StringTokenizer(salaryDrawn, ",");
           
         while (st1.hasMoreElements()&&st2.hasMoreElements()&&st3.hasMoreElements()&&st4.hasMoreElements()&&st5.hasMoreElements()) {
           wxid=new WorkexperienceId(interviewee.getPersonid(),st1.nextToken().trim(), st2.nextToken().trim(), st3.nextToken().trim(), Float.parseFloat(st4.nextToken().trim()), Float.parseFloat(st5.nextToken().trim()));
           wx=new Workexperience(wxid);
           workexperience.add(wx);
         }
         interviewee.setWorkexperience(workexperience);
         //for acdemic details
          st6 = new StringTokenizer(degreetype, ",");
          st7 = new StringTokenizer(institutionname, ",");
          st8 = new StringTokenizer(yearofpassing, ",");
          st9 = new StringTokenizer(percentageobtained, ","); 
         
           
         while (st6.hasMoreElements()&&st7.hasMoreElements()&&st8.hasMoreElements()&&st9.hasMoreElements()) {
          adid=new AcdemicdetailsId(interviewee.getPersonid(),st6.nextToken().trim(), st7.nextToken().trim(), Integer.parseInt(st8.nextToken().trim()), Float.parseFloat(st9.nextToken().trim()));
          ad=new Acdemicdetails(adid);
          acdemicdetails.add(ad);
         }
         interviewee.setAcdemicdetails(acdemicdetails);
         //for contact no
        ContactPerson co = new ContactPerson();
        Set<ContactPerson> cp = new HashSet();
        st = new StringTokenizer(contactno, ",");
        
        while (st.hasMoreElements()) {
            String str = st.nextToken().trim();
            a = Long.parseLong(str);
            co.setContactno(a);
            co.setPersonid(interviewee.getPersonid());
            cp.add(co);
            interviewee.setContact(cp);
        }
          //for language known   
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
    Set<Workexperience> workexperience=new HashSet();
    Set<Acdemicdetails> acdemicdetails=new HashSet();
    List<Jobopeningdetails> listjod;
    Workexperience wx;
    WorkexperienceId wxid;
    Acdemicdetails ad;
    AcdemicdetailsId adid;
      String orgname;
      String responsibility;
      String designation;
      String duration;
      String salaryDrawn; 
      String degreetype;
      String institutionname;
      String yearofpassing;
      String percentageobtained;
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

    public Set<Workexperience> getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(Set<Workexperience> workexperience) {
        this.workexperience = workexperience;
    }
   
    
    
    

    public String getOrgname() {
        return orgname;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSalaryDrawn() {
        return salaryDrawn;
    }

    public void setSalaryDrawn(String salaryDrawn) {
        this.salaryDrawn = salaryDrawn;
    }
    

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    public String getInstitutionname() {
        return institutionname;
    }

    public void setInstitutionname(String institutionname) {
        this.institutionname = institutionname;
    }

    public Set<Acdemicdetails> getAcdemicdetails() {
        return acdemicdetails;
    }

    public void setAcdemicdetails(Set<Acdemicdetails> acdemicdetails) {
        this.acdemicdetails = acdemicdetails;
    }

    public String getYearofpassing() {
        return yearofpassing;
    }

    public void setYearofpassing(String yearofpassing) {
        this.yearofpassing = yearofpassing;
    }

    public String getPercentageobtained() {
        return percentageobtained;
    }

    public void setPercentageobtained(String percentageobtained) {
        this.percentageobtained = percentageobtained;
    }

   
    
}
