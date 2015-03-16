/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

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
public class ChangePasswordActionTest {
    
    public ChangePasswordActionTest() {
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
     * Test of getModel method, of class ChangePasswordAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ChangePasswordAction instance = new ChangePasswordAction();
        ChangePassword expResult = null;
        ChangePassword result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of prepare method, of class ChangePasswordAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        ChangePasswordAction instance = new ChangePasswordAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of changePwd method, of class ChangePasswordAction.
     */
    @Test
    public void testChangePwd() {
        System.out.println("changePwd");
        ChangePasswordAction instance = new ChangePasswordAction();
        String expResult = null;
        String result = instance.changePwd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
