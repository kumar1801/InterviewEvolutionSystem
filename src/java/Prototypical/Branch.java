package Prototypical;
// Generated 1 Feb, 2015 11:53:00 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Branch generated by hbm2java
 */
public class Branch  implements java.io.Serializable {


     private int branchid;
     private String branchtype;
     private String street;
     private String city;
     private String state;
     private String pincode;
     private Set contact = new HashSet(0);
     private Head head;

    public Branch() {
    }

	
    public Branch(int branchid) {
        this.branchid = branchid;
    }
    public Branch(int branchid, String branchtype, String street, String city, String state, String pincode, Set contact, Head head) {
       this.branchid = branchid;
       this.branchtype = branchtype;
       this.street = street;
       this.city = city;
       this.state = state;
       this.pincode = pincode;
       this.contact = contact;
       this.head = head;
    }
   
    public int getBranchid() {
        return this.branchid;
    }
    
    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }
    public String getBranchtype() {
        return this.branchtype;
    }
    
    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
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
    public String getPincode() {
        return this.pincode;
    }
    
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public Set getContact() {
        return this.contact;
    }
    
    public void setContact(Set contact) {
        this.contact = contact;
    }
    public Head getHead() {
        return this.head;
    }
    
    public void setHead(Head head) {
        this.head = head;
    }




}


