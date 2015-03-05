/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototypical;

import java.util.Date;

/**
 *
 * @author Jyotil
 */
public class Schedule implements java.io.Serializable {


     private ScheduleId id;
     private String type;
     private Date date;
     private String interviewAssesmentReport;
     private String street;
     private String city;
     private String state;

    public Schedule() {
    }

    public Schedule(ScheduleId id, String type, Date date, String interviewAssesmentReport, String street, String city, String state) {
       this.id = id;
       this.type = type;
       this.date = date;
       this.interviewAssesmentReport = interviewAssesmentReport;
       this.street = street;
       this.city = city;
       this.state = state;
    }
   
    public ScheduleId getId() {
        return this.id;
    }
    
    public void setId(ScheduleId id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getInterviewAssesmentReport() {
        return this.interviewAssesmentReport;
    }
    
    public void setInterviewAssesmentReport(String interviewAssesmentReport) {
        this.interviewAssesmentReport = interviewAssesmentReport;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Schedule{" + "id=" + id + ", type=" + type + ", date=" + date + ", interviewAssesmentReport=" + interviewAssesmentReport + ", street=" + street + ", city=" + city + ", state=" + state + '}';
    }




}
