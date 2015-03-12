/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Head;
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
public class HeadOperationTest {
    
    public HeadOperationTest() {
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
     * Test of dataretrival method, of class HeadOperation.
     */
    @Test
    public void testDataretrival() {
        System.out.println("dataretrival");
        HeadOperation instance = new HeadOperation();
        List<Head> expResult = null;
        List<Head> result = instance.dataretrival();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetails method, of class HeadOperation.
     */
    @Test
    public void testInsertDetails() {
        System.out.println("insertDetails");
        Head head = null;
        HeadOperation instance = new HeadOperation();
        boolean expResult = false;
        boolean result = instance.insertDetails(head);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
