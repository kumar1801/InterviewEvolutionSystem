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
public class LanguageknownIdTest {
    
    public LanguageknownIdTest() {
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
     * Test of getPersonid method, of class LanguageknownId.
     */
    @Test
    public void testGetPersonid() {
        System.out.println("getPersonid");
        LanguageknownId instance = new LanguageknownId();
        int expResult = 0;
        int result = instance.getPersonid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonid method, of class LanguageknownId.
     */
    @Test
    public void testSetPersonid() {
        System.out.println("setPersonid");
        int personid = 0;
        LanguageknownId instance = new LanguageknownId();
        instance.setPersonid(personid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLangknown method, of class LanguageknownId.
     */
    @Test
    public void testGetLangknown() {
        System.out.println("getLangknown");
        LanguageknownId instance = new LanguageknownId();
        String expResult = "";
        String result = instance.getLangknown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLangknown method, of class LanguageknownId.
     */
    @Test
    public void testSetLangknown() {
        System.out.println("setLangknown");
        String langknown = "";
        LanguageknownId instance = new LanguageknownId();
        instance.setLangknown(langknown);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LanguageknownId.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LanguageknownId instance = new LanguageknownId();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
