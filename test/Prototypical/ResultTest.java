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
public class ResultTest {
    
    public ResultTest() {
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
     * Test of getId method, of class Result.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Result instance = new Result();
        ResultId expResult = null;
        ResultId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class Result.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        ResultId id = null;
        Result instance = new Result();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getObtainMark method, of class Result.
     */
    @Test
    public void testGetObtainMark() {
        System.out.println("getObtainMark");
        Result instance = new Result();
        int expResult = 0;
        int result = instance.getObtainMark();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setObtainMark method, of class Result.
     */
    @Test
    public void testSetObtainMark() {
        System.out.println("setObtainMark");
        int obtainMark = 0;
        Result instance = new Result();
        instance.setObtainMark(obtainMark);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRoundStatus method, of class Result.
     */
    @Test
    public void testGetRoundStatus() {
        System.out.println("getRoundStatus");
        Result instance = new Result();
        String expResult = null;
        String result = instance.getRoundStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRoundStatus method, of class Result.
     */
    @Test
    public void testSetRoundStatus() {
        System.out.println("setRoundStatus");
        String roundStatus = null;
        Result instance = new Result();
        instance.setRoundStatus(roundStatus);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Result.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Result instance = new Result();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
