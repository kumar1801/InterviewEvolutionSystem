package Prototypical;
// Generated 1 Feb, 2015 4:12:43 PM by Hibernate Tools 3.6.0



/**
 * RequiedqualificationId generated by hbm2java
 */
public class RequiedqualificationId  implements java.io.Serializable {


     private int jobReferenceCode;
     private String requierdQualification;

    @Override
    public String toString() {
        return "RequiedqualificationId{" + "jobReferenceCode=" + jobReferenceCode + ", requierdQualification=" + requierdQualification + '}';
    }

    public RequiedqualificationId() {
    }

    public RequiedqualificationId(int jobReferenceCode, String requierdQualification) {
       this.jobReferenceCode = jobReferenceCode;
       this.requierdQualification = requierdQualification;
    }
   
    public int getJobReferenceCode() {
        return this.jobReferenceCode;
    }
    
    public void setJobReferenceCode(int jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }
    public String getRequierdQualification() {
        return this.requierdQualification;
    }
    
    public void setRequierdQualification(String requierdQualification) {
        this.requierdQualification = requierdQualification;
    }




}


