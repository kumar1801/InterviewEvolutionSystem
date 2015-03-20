/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Interviewee;
import Prototypical.Result;
import Prototypical.Round;
import java.util.ArrayList;
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
public class ResultOperationTest {
    
    public ResultOperationTest() {
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
     * Test of saveR method, of class ResultOperation.
     */
    @Test
    public void testSaveR() {
        System.out.println("saveR");
        Result result_2 = null;
        ResultOperation instance = new ResultOperation();
        boolean expResult = false;
        boolean result = instance.saveR(result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dispi method, of class ResultOperation.
     */
    @Test
    public void testDispi() {
        System.out.println("Dispi");
        ResultOperation instance = new ResultOperation();
        ArrayList<Interviewee> expResult = null;
        ArrayList<Interviewee> result = instance.Dispi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Disprnd method, of class ResultOperation.
     */
    @Test
    public void testDisprnd() {
        System.out.println("Disprnd");
        ResultOperation instance = new ResultOperation();
        ArrayList<Round> expResult = null;
        ArrayList<Round> result = instance.Disprnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
