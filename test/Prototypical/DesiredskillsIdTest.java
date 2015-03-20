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
public class DesiredskillsIdTest {
    
    public DesiredskillsIdTest() {
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
     * Test of getJobReferenceCode method, of class DesiredskillsId.
     */
    @Test
    public void testGetJobReferenceCode() {
        System.out.println("getJobReferenceCode");
        DesiredskillsId instance = new DesiredskillsId();
        int expResult = 0;
        int result = instance.getJobReferenceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setJobReferenceCode method, of class DesiredskillsId.
     */
    @Test
    public void testSetJobReferenceCode() {
        System.out.println("setJobReferenceCode");
        int jobReferenceCode = 0;
        DesiredskillsId instance = new DesiredskillsId();
        instance.setJobReferenceCode(jobReferenceCode);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDesiredSkills method, of class DesiredskillsId.
     */
    @Test
    public void testGetDesiredSkills() {
        System.out.println("getDesiredSkills");
        DesiredskillsId instance = new DesiredskillsId();
        String expResult = null;
        String result = instance.getDesiredSkills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDesiredSkills method, of class DesiredskillsId.
     */
    @Test
    public void testSetDesiredSkills() {
        System.out.println("setDesiredSkills");
        String desiredSkills = null;
        DesiredskillsId instance = new DesiredskillsId();
        instance.setDesiredSkills(desiredSkills);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
