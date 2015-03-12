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
public class WorkexperienceTest {
    
    public WorkexperienceTest() {
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
     * Test of getId method, of class Workexperience.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Workexperience instance = new Workexperience();
        WorkexperienceId expResult = null;
        WorkexperienceId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Workexperience.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        WorkexperienceId id = null;
        Workexperience instance = new Workexperience();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Workexperience.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Workexperience instance = new Workexperience();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
