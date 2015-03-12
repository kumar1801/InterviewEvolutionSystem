/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Interviewee;
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
public class ResultActionTest {
    
    public ResultActionTest() {
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
     * Test of getModel method, of class ResultAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ResultAction instance = new ResultAction();
        Object expResult = null;
        Object result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class ResultAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        ResultAction instance = new ResultAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonid method, of class ResultAction.
     */
    @Test
    public void testGetPersonid() {
        System.out.println("getPersonid");
        ResultAction instance = new ResultAction();
        int expResult = 0;
        int result = instance.getPersonid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonid method, of class ResultAction.
     */
    @Test
    public void testSetPersonid() {
        System.out.println("setPersonid");
        int personid = 0;
        ResultAction instance = new ResultAction();
        instance.setPersonid(personid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundId method, of class ResultAction.
     */
    @Test
    public void testGetRoundId() {
        System.out.println("getRoundId");
        ResultAction instance = new ResultAction();
        int expResult = 0;
        int result = instance.getRoundId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoundId method, of class ResultAction.
     */
    @Test
    public void testSetRoundId() {
        System.out.println("setRoundId");
        int roundId = 0;
        ResultAction instance = new ResultAction();
        instance.setRoundId(roundId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveResult method, of class ResultAction.
     */
    @Test
    public void testSaveResult() {
        System.out.println("saveResult");
        ResultAction instance = new ResultAction();
        String expResult = "";
        String result = instance.saveResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDispint method, of class ResultAction.
     */
    @Test
    public void testGetDispint() {
        System.out.println("getDispint");
        ResultAction instance = new ResultAction();
        ArrayList<Interviewee> expResult = null;
        ArrayList<Interviewee> result = instance.getDispint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDispint method, of class ResultAction.
     */
    @Test
    public void testSetDispint() {
        System.out.println("setDispint");
        ArrayList<Interviewee> dispint = null;
        ResultAction instance = new ResultAction();
        instance.setDispint(dispint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisprnd method, of class ResultAction.
     */
    @Test
    public void testGetDisprnd() {
        System.out.println("getDisprnd");
        ResultAction instance = new ResultAction();
        ArrayList<Round> expResult = null;
        ArrayList<Round> result = instance.getDisprnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisprnd method, of class ResultAction.
     */
    @Test
    public void testSetDisprnd() {
        System.out.println("setDisprnd");
        ArrayList<Round> disprnd = null;
        ResultAction instance = new ResultAction();
        instance.setDisprnd(disprnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayIntRnd method, of class ResultAction.
     */
    @Test
    public void testDisplayIntRnd() {
        System.out.println("DisplayIntRnd");
        ResultAction instance = new ResultAction();
        String expResult = "";
        String result = instance.DisplayIntRnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
