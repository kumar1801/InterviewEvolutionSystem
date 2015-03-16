/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototypical;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Devank
 */
public class ContactPersonTest {
    
    public ContactPersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPersonid method, of class ContactPerson.
     */
    @Test
    public void testGetPersonid() {
        System.out.println("getPersonid");
        ContactPerson instance = new ContactPerson();
        Integer expResult = null;
        Integer result = instance.getPersonid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPersonid method, of class ContactPerson.
     */
    @Test
    public void testSetPersonid() {
        System.out.println("setPersonid");
        Integer personid = null;
        ContactPerson instance = new ContactPerson();
        instance.setPersonid(personid);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getContactno method, of class ContactPerson.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        ContactPerson instance = new ContactPerson();
        Long expResult = null;
        Long result = instance.getContactno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setContactno method, of class ContactPerson.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        Long contactno = null;
        ContactPerson instance = new ContactPerson();
        instance.setContactno(contactno);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class ContactPerson.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContactPerson instance = new ContactPerson();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
