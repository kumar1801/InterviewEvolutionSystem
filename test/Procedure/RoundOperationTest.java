/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Round;
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
public class RoundOperationTest {
    
    public RoundOperationTest() {
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
     * Test of insRound method, of class RoundOperation.
     */
    @Test
    public void testInsRound() {
        System.out.println("insRound");
        Round round = null;
        RoundOperation instance = new RoundOperation();
        boolean expResult = false;
        boolean result = instance.insRound(round);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asdewes method, of class RoundOperation.
     */
    @Test
    public void testAsdewes() {
        System.out.println("asdewes");
        RoundOperation instance = new RoundOperation();
        List<Round> expResult = null;
        List<Round> result = instance.asdewes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
