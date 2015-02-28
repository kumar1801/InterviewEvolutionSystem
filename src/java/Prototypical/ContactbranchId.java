/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototypical;

/**
 *
 * @author Nagdaman
 */
public class ContactbranchId implements java.io.Serializable{
    
     private int branchid;
     private long contactno;
     
     public ContactbranchId()
     {
    
     }
     
    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public long getContactno() {
        return contactno;
    }

    /**
     *
     * @param contactno
     */
    public void setContactno(long contactno) {
        this.contactno = contactno;
    }

    public ContactbranchId(int branchid, long contactno) {
        this.branchid = branchid;
        this.contactno = contactno;
    }

    @Override
    public String toString() {
        return "ContactbranchId{" + "branchid=" + branchid + ", contactno=" + contactno + '}';
    }
     
     
}
