/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.RCM;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class RCMActionTest {
    
    public RCMActionTest() {
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
     * Test of getListrcm method, of class RCMAction.
     */
    @Test
    public void testGetListrcm() {
        System.out.println("getListrcm");
        RCMAction instance = new RCMAction();
        List<RCM> expResult = null;
        List<RCM> result = instance.getListrcm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListrcm method, of class RCMAction.
     */
    @Test
    public void testSetListrcm() {
        System.out.println("setListrcm");
        List<RCM> listrcm = null;
        RCMAction instance = new RCMAction();
        instance.setListrcm(listrcm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactno method, of class RCMAction.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        RCMAction instance = new RCMAction();
        String expResult = "";
        String result = instance.getContactno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactno method, of class RCMAction.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        String contactno = "";
        RCMAction instance = new RCMAction();
        instance.setContactno(contactno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class RCMAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        RCMAction instance = new RCMAction();
        RCM expResult = null;
        RCM result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class RCMAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        RCMAction instance = new RCMAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retriveData method, of class RCMAction.
     */
    @Test
    public void testRetriveData() {
        System.out.println("retriveData");
        RCMAction instance = new RCMAction();
        String expResult = "";
        String result = instance.retriveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServletRequest method, of class RCMAction.
     */
    @Test
    public void testSetServletRequest() {
        System.out.println("setServletRequest");
        HttpServletRequest hsr = null;
        RCMAction instance = new RCMAction();
        instance.setServletRequest(hsr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveData method, of class RCMAction.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        RCMAction instance = new RCMAction();
        String expResult = "";
        String result = instance.saveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
