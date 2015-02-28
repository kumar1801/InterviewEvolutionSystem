package Prototypical;
// Generated 1 Feb, 2015 4:12:43 PM by Hibernate Tools 3.6.0


import java.util.Set;

/**
 * RCM generated by hbm2java
 */
public class RCM extends Prototypical.Person implements java.io.Serializable {


     private String Department;
     private String Designation;
     private String RCMRole;

    public RCM() {
    }

	
    public RCM(Integer personid) {
        super(personid);        
    }
    public RCM(Integer personid, String fname, String mname, String lname, String emailid, String street, String city, String state, String country, Integer pincode, String username, String password, String confirmpassword, Set contact, String Department, String Designation, String RCMRole) {
        super(personid, fname, mname, lname, emailid, street, city, state, country, pincode, username, password, confirmpassword, contact);        
       this.Department = Department;
       this.Designation = Designation;
       this.RCMRole = RCMRole;
    }
   
    public String getDepartment() {
        return this.Department;
    }
    
    public void setDepartment(String Department) {
        this.Department = Department;
    }
    public String getDesignation() {
        return this.Designation;
    }
    
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    public String getRCMRole() {
        return this.RCMRole;
    }
    
    public void setRCMRole(String RCMRole) {
        this.RCMRole = RCMRole;
    }




}


