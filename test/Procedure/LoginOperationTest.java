/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Login;
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
public class LoginOperationTest {
    
    public LoginOperationTest() {
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
     * Test of getLoginDetails method, of class LoginOperation.
     */
    @Test
    public void testGetLoginDetails() {
        System.out.println("getLoginDetails");
        Login login = null;
        LoginOperation instance = new LoginOperation();
        boolean expResult = false;
        boolean result = instance.getLoginDetails(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordDetails method, of class LoginOperation.
     */
    @Test
    public void testGetPasswordDetails() {
        System.out.println("getPasswordDetails");
        Login login = null;
        LoginOperation instance = new LoginOperation();
        boolean expResult = false;
        boolean result = instance.getPasswordDetails(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
