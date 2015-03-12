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
public class ChangePasswordTest {
    
    public ChangePasswordTest() {
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
     * Test of getNewpassword method, of class ChangePassword.
     */
    @Test
    public void testGetNewpassword() {
        System.out.println("getNewpassword");
        ChangePassword instance = new ChangePassword();
        String expResult = "";
        String result = instance.getNewpassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewpassword method, of class ChangePassword.
     */
    @Test
    public void testSetNewpassword() {
        System.out.println("setNewpassword");
        String newpassword = "";
        ChangePassword instance = new ChangePassword();
        instance.setNewpassword(newpassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class ChangePassword.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        ChangePassword instance = new ChangePassword();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class ChangePassword.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        ChangePassword instance = new ChangePassword();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
