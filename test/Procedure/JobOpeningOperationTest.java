/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Jobopeningdetails;
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
public class JobOpeningOperationTest {
    
    public JobOpeningOperationTest() {
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
     * Test of insData method, of class JobOpeningOperation.
     */
    @Test
    public void testInsData() {
        System.out.println("insData");
        Jobopeningdetails jobopeningdetails = null;
        JobOpeningOperation instance = new JobOpeningOperation();
        boolean expResult = false;
        boolean result = instance.insData(jobopeningdetails);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dataretrival method, of class JobOpeningOperation.
     */
    @Test
    public void testDataretrival() {
        System.out.println("dataretrival");
        JobOpeningOperation instance = new JobOpeningOperation();
        List<Jobopeningdetails> expResult = null;
        List<Jobopeningdetails> result = instance.dataretrival();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
