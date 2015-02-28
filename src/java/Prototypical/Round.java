package Prototypical;
// Generated 1 Feb, 2015 4:12:43 PM by Hibernate Tools 3.6.0



/**
 * Round generated by hbm2java
 */
public class Round  implements java.io.Serializable {


     private int roundId;
     private String roundName;
     private Integer roundPreference;
     private String roundDescription;
     private Integer totalMarks;
     private Integer passingCriteria;
     private String date;
     private String time;
     private Integer rcmid;
     private Integer jobReferenceCode;

    public Round() {
    }

	
    public Round(int roundId) {
        this.roundId = roundId;
    }
    public Round(int roundId, String roundName, Integer roundPreference, String roundDescription, Integer totalMarks, Integer passingCriteria, String date, String time, Integer rcmid, Integer jobReferenceCode) {
       this.roundId = roundId;
       this.roundName = roundName;
       this.roundPreference = roundPreference;
       this.roundDescription = roundDescription;
       this.totalMarks = totalMarks;
       this.passingCriteria = passingCriteria;
       this.date = date;
       this.time = time;
       this.rcmid = rcmid;
       this.jobReferenceCode = jobReferenceCode;
    }
   
    public int getRoundId() {
        return this.roundId;
    }
    
    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }
    public String getRoundName() {
        return this.roundName;
    }
    
    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }
    public Integer getRoundPreference() {
        return this.roundPreference;
    }
    
    public void setRoundPreference(Integer roundPreference) {
        this.roundPreference = roundPreference;
    }
    public String getRoundDescription() {
        return this.roundDescription;
    }
    
    public void setRoundDescription(String roundDescription) {
        this.roundDescription = roundDescription;
    }
    public Integer getTotalMarks() {
        return this.totalMarks;
    }
    
    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }
    public Integer getPassingCriteria() {
        return this.passingCriteria;
    }
    
    public void setPassingCriteria(Integer passingCriteria) {
        this.passingCriteria = passingCriteria;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public Integer getRcmid() {
        return this.rcmid;
    }
    
    public void setRcmid(Integer rcmid) {
        this.rcmid = rcmid;
    }
    public Integer getJobReferenceCode() {
        return this.jobReferenceCode;
    }
    
    public void setJobReferenceCode(Integer jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }




}


