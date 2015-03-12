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
public class RequireddocumentsIdTest {
    
    public RequireddocumentsIdTest() {
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
     * Test of getJobReferenceCode method, of class RequireddocumentsId.
     */
    @Test
    public void testGetJobReferenceCode() {
        System.out.println("getJobReferenceCode");
        RequireddocumentsId instance = new RequireddocumentsId();
        int expResult = 0;
        int result = instance.getJobReferenceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobReferenceCode method, of class RequireddocumentsId.
     */
    @Test
    public void testSetJobReferenceCode() {
        System.out.println("setJobReferenceCode");
        int jobReferenceCode = 0;
        RequireddocumentsId instance = new RequireddocumentsId();
        instance.setJobReferenceCode(jobReferenceCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequiredDocuments method, of class RequireddocumentsId.
     */
    @Test
    public void testGetRequiredDocuments() {
        System.out.println("getRequiredDocuments");
        RequireddocumentsId instance = new RequireddocumentsId();
        String expResult = "";
        String result = instance.getRequiredDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequiredDocuments method, of class RequireddocumentsId.
     */
    @Test
    public void testSetRequiredDocuments() {
        System.out.println("setRequiredDocuments");
        String requiredDocuments = "";
        RequireddocumentsId instance = new RequireddocumentsId();
        instance.setRequiredDocuments(requiredDocuments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
