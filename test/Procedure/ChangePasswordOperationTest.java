/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.ChangePassword;
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
public class ChangePasswordOperationTest {
    
    public ChangePasswordOperationTest() {
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
     * Test of changePassword method, of class ChangePasswordOperation.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        ChangePassword cp = null;
        ChangePasswordOperation instance = new ChangePasswordOperation();
        boolean expResult = false;
        boolean result = instance.changePassword(cp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
