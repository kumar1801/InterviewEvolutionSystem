/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.RCM;
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
public class RCMOperationTest {
    
    public RCMOperationTest() {
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
     * Test of dataretrival method, of class RCMOperation.
     */
    @Test
    public void testDataretrival() {
        System.out.println("dataretrival");
        RCMOperation instance = new RCMOperation();
        List<RCM> expResult = null;
        List<RCM> result = instance.dataretrival();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetails method, of class RCMOperation.
     */
    @Test
    public void testInsertDetails() {
        System.out.println("insertDetails");
        RCM rcm = null;
        RCMOperation instance = new RCMOperation();
        boolean expResult = false;
        boolean result = instance.insertDetails(rcm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
