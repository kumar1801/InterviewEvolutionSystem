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
public class RequiedqualificationIdTest {
    
    public RequiedqualificationIdTest() {
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
     * Test of toString method, of class RequiedqualificationId.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RequiedqualificationId instance = new RequiedqualificationId();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobReferenceCode method, of class RequiedqualificationId.
     */
    @Test
    public void testGetJobReferenceCode() {
        System.out.println("getJobReferenceCode");
        RequiedqualificationId instance = new RequiedqualificationId();
        int expResult = 0;
        int result = instance.getJobReferenceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobReferenceCode method, of class RequiedqualificationId.
     */
    @Test
    public void testSetJobReferenceCode() {
        System.out.println("setJobReferenceCode");
        int jobReferenceCode = 0;
        RequiedqualificationId instance = new RequiedqualificationId();
        instance.setJobReferenceCode(jobReferenceCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequierdQualification method, of class RequiedqualificationId.
     */
    @Test
    public void testGetRequierdQualification() {
        System.out.println("getRequierdQualification");
        RequiedqualificationId instance = new RequiedqualificationId();
        String expResult = "";
        String result = instance.getRequierdQualification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequierdQualification method, of class RequiedqualificationId.
     */
    @Test
    public void testSetRequierdQualification() {
        System.out.println("setRequierdQualification");
        String requierdQualification = "";
        RequiedqualificationId instance = new RequiedqualificationId();
        instance.setRequierdQualification(requierdQualification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
