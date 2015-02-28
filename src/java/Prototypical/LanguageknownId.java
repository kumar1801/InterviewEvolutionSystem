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
public class LanguageknownId implements java.io.Serializable {
    
    private int personid;
    private String langknown;
     
     
     public LanguageknownId()
     {
         
     }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getLangknown() {
        return langknown;
    }

    public void setLangknown(String langknown) {
        this.langknown = langknown;
    }

    public LanguageknownId(int personid, String langknown) {
        this.personid = personid;
        this.langknown = langknown;
    }

    @Override
    public String toString() {
        return "LanguageknownId{" + "personid=" + personid + ", langknown=" + langknown + '}';
    }
    
}
