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
public class Languageknown implements java.io.Serializable {
    private LanguageknownId id;
     private Person person;
     
     public Languageknown()
     {
         
     }

    public Languageknown(LanguageknownId id, Person person) {
        this.id = id;
        this.person = person;
    }
     
     

    public LanguageknownId getId() {
        return id;
    }

    public void setId(LanguageknownId id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
     
}
