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
public class ResultIdTest {
    
    public ResultIdTest() {
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
     * Test of getPersonid method, of class ResultId.
     */
    @Test
    public void testGetPersonid() {
        System.out.println("getPersonid");
        ResultId instance = new ResultId();
        int expResult = 0;
        int result = instance.getPersonid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonid method, of class ResultId.
     */
    @Test
    public void testSetPersonid() {
        System.out.println("setPersonid");
        int personid = 0;
        ResultId instance = new ResultId();
        instance.setPersonid(personid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundId method, of class ResultId.
     */
    @Test
    public void testGetRoundId() {
        System.out.println("getRoundId");
        ResultId instance = new ResultId();
        int expResult = 0;
        int result = instance.getRoundId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoundId method, of class ResultId.
     */
    @Test
    public void testSetRoundId() {
        System.out.println("setRoundId");
        int roundId = 0;
        ResultId instance = new ResultId();
        instance.setRoundId(roundId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ResultId.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ResultId instance = new ResultId();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
