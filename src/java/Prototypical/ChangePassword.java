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
public class ChangePassword implements java.io.Serializable {
    
    private String newpassword;
    private String password;
    private String email;
    
    public ChangePassword()
    {
        
    }

    public ChangePassword(String newpassword, String password) {
        this.newpassword = newpassword;
        this.password = password;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
}
