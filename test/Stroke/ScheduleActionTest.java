/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

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
public class ScheduleActionTest {
    
    public ScheduleActionTest() {
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
     * Test of getScheduleNo method, of class ScheduleAction.
     */
    @Test
    public void testGetScheduleNo() {
        System.out.println("getScheduleNo");
        ScheduleAction instance = new ScheduleAction();
        int expResult = 0;
        int result = instance.getScheduleNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScheduleNo method, of class ScheduleAction.
     */
    @Test
    public void testSetScheduleNo() {
        System.out.println("setScheduleNo");
        int scheduleNo = 0;
        ScheduleAction instance = new ScheduleAction();
        instance.setScheduleNo(scheduleNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundId method, of class ScheduleAction.
     */
    @Test
    public void testGetRoundId() {
        System.out.println("getRoundId");
        ScheduleAction instance = new ScheduleAction();
        int expResult = 0;
        int result = instance.getRoundId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoundId method, of class ScheduleAction.
     */
    @Test
    public void testSetRoundId() {
        System.out.println("setRoundId");
        int roundId = 0;
        ScheduleAction instance = new ScheduleAction();
        instance.setRoundId(roundId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisprnd method, of class ScheduleAction.
     */
    @Test
    public void testGetDisprnd() {
        System.out.println("getDisprnd");
        ScheduleAction instance = new ScheduleAction();
        ArrayList<Round> expResult = null;
        ArrayList<Round> result = instance.getDisprnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisprnd method, of class ScheduleAction.
     */
    @Test
    public void testSetDisprnd() {
        System.out.println("setDisprnd");
        ArrayList<Round> disprnd = null;
        ScheduleAction instance = new ScheduleAction();
        instance.setDisprnd(disprnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goSchedule method, of class ScheduleAction.
     */
    @Test
    public void testGoSchedule() {
        System.out.println("goSchedule");
        ScheduleAction instance = new ScheduleAction();
        String expResult = "";
        String result = instance.goSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class ScheduleAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ScheduleAction instance = new ScheduleAction();
        Object expResult = null;
        Object result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class ScheduleAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        ScheduleAction instance = new ScheduleAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSchedule method, of class ScheduleAction.
     */
    @Test
    public void testSaveSchedule() {
        System.out.println("saveSchedule");
        ScheduleAction instance = new ScheduleAction();
        String expResult = "";
        String result = instance.saveSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
