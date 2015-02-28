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
public class Contactbranch implements java.io.Serializable {
    
    private ContactbranchId id;
     private Branch br;
     
     public Contactbranch()
     {
         
     }

    public ContactbranchId getId() {
        return id;
    }

    public void setId(ContactbranchId id) {
        this.id = id;
    }

    public Branch getBr() {
        return br;
    }

    public void setBr(Branch br) {
        this.br = br;
    }

    public Contactbranch(ContactbranchId id, Branch br) {
        this.id = id;
        this.br = br;
    }

    @Override
    public String toString() {
        return "Contactbranch{" + "id=" + id + ", br=" + br + '}';
    }
     
    
     
}
