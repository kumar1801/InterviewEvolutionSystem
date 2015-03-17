/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Interviewee;
import Prototypical.Login;
import java.util.List;
import java.util.Map;
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
public class LoginActionTest {
    
    public LoginActionTest() {
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
     * Test of getModel method, of class LoginAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        LoginAction instance = new LoginAction();
        Login expResult = null;
        Login result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class LoginAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        LoginAction instance = new LoginAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class LoginAction.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        LoginAction instance = new LoginAction();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class LoginAction.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        LoginAction instance = new LoginAction();
        String expResult = "";
        String result = instance.signIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signOut method, of class LoginAction.
     */
    @Test
    public void testSignOut() {
        System.out.println("signOut");
        LoginAction instance = new LoginAction();
        String expResult = "";
        String result = instance.signOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListinterviewee method, of class LoginAction.
     */
    @Test
    public void testGetListinterviewee() {
        System.out.println("getListinterviewee");
        LoginAction instance = new LoginAction();
        List<Interviewee> expResult = null;
        List<Interviewee> result = instance.getListinterviewee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListinterviewee method, of class LoginAction.
     */
    @Test
    public void testSetListinterviewee() {
        System.out.println("setListinterviewee");
        List<Interviewee> listinterviewee = null;
        LoginAction instance = new LoginAction();
        instance.setListinterviewee(listinterviewee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSession method, of class LoginAction.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Map<String, Object> map = null;
        LoginAction instance = new LoginAction();
        instance.setSession(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
