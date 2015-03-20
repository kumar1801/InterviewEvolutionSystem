/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.RCM;
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
public class RoundActionTest {
    
    public RoundActionTest() {
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
     * Test of getListround method, of class RoundAction.
     */
    @Test
    public void testGetListround() {
        System.out.println("getListround");
        RoundAction instance = new RoundAction();
        List<Round> expResult = null;
        List<Round> result = instance.getListround();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListround method, of class RoundAction.
     */
    @Test
    public void testSetListround() {
        System.out.println("setListround");
        List<Round> listround = null;
        RoundAction instance = new RoundAction();
        instance.setListround(listround);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class RoundAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        RoundAction instance = new RoundAction();
        Object expResult = null;
        Object result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class RoundAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        RoundAction instance = new RoundAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewR method, of class RoundAction.
     */
    @Test
    public void testViewR() {
        System.out.println("viewR");
        RoundAction instance = new RoundAction();
        String expResult = "";
        String result = instance.viewR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveRound method, of class RoundAction.
     */
    @Test
    public void testSaveRound() {
        System.out.println("saveRound");
        RoundAction instance = new RoundAction();
        String expResult = "";
        String result = instance.saveRound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListrcm method, of class RoundAction.
     */
    @Test
    public void testGetListrcm() {
        System.out.println("getListrcm");
        RoundAction instance = new RoundAction();
        List<RCM> expResult = null;
        List<RCM> result = instance.getListrcm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListrcm method, of class RoundAction.
     */
    @Test
    public void testSetListrcm() {
        System.out.println("setListrcm");
        List<RCM> listrcm = null;
        RoundAction instance = new RoundAction();
        instance.setListrcm(listrcm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
