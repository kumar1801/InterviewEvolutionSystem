/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Interviewee;
import java.util.List;
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
public class IntervieweeOperationTest {
    
    public IntervieweeOperationTest() {
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
     * Test of dataretrival method, of class IntervieweeOperation.
     */
    @Test
    public void testDataretrival() {
        System.out.println("dataretrival");
        IntervieweeOperation instance = new IntervieweeOperation();
        List<Interviewee> expResult = null;
        List<Interviewee> result = instance.dataretrival();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetails method, of class IntervieweeOperation.
     */
    @Test
    public void testInsertDetails() {
        System.out.println("insertDetails");
        Interviewee interviewee = null;
        IntervieweeOperation instance = new IntervieweeOperation();
        boolean expResult = false;
        boolean result = instance.insertDetails(interviewee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
