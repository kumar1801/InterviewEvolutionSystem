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
public class DesiredskillsTest {
    
    public DesiredskillsTest() {
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
     * Test of getId method, of class Desiredskills.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Desiredskills instance = new Desiredskills();
        DesiredskillsId expResult = null;
        DesiredskillsId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Desiredskills.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        DesiredskillsId id = null;
        Desiredskills instance = new Desiredskills();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobopeningdetails method, of class Desiredskills.
     */
    @Test
    public void testGetJobopeningdetails() {
        System.out.println("getJobopeningdetails");
        Desiredskills instance = new Desiredskills();
        Jobopeningdetails expResult = null;
        Jobopeningdetails result = instance.getJobopeningdetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobopeningdetails method, of class Desiredskills.
     */
    @Test
    public void testSetJobopeningdetails() {
        System.out.println("setJobopeningdetails");
        Jobopeningdetails jobopeningdetails = null;
        Desiredskills instance = new Desiredskills();
        instance.setJobopeningdetails(jobopeningdetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
