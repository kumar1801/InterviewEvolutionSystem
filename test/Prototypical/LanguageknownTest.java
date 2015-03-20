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
public class LanguageknownTest {
    
    public LanguageknownTest() {
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
     * Test of getId method, of class Languageknown.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Languageknown instance = new Languageknown();
        LanguageknownId expResult = null;
        LanguageknownId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class Languageknown.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        LanguageknownId id = null;
        Languageknown instance = new Languageknown();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPerson method, of class Languageknown.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        Languageknown instance = new Languageknown();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPerson method, of class Languageknown.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        Languageknown instance = new Languageknown();
        instance.setPerson(person);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Languageknown.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Languageknown instance = new Languageknown();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
