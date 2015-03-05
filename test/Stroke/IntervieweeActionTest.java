/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Interviewee;
import Prototypical.Jobopeningdetails;
import Prototypical.Languageknown;
import Prototypical.Round;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nagdaman
 */
public class IntervieweeActionTest {
    
    public IntervieweeActionTest() {
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
     * Test of getModel method, of class IntervieweeAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        IntervieweeAction instance = new IntervieweeAction();
        Interviewee expResult = null;
        Interviewee result = instance.getModel();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of prepare method, of class IntervieweeAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        IntervieweeAction instance = new IntervieweeAction();
        instance.prepare();
    }

    /**
     * Test of retriveData method, of class IntervieweeAction.
     */
    @Test
    public void testRetriveData() {
        System.out.println("retriveData");
        IntervieweeAction instance = new IntervieweeAction();
        String expResult = "";
        String result = instance.retriveData();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServletRequest method, of class IntervieweeAction.
     */
    @Test
    public void testSetServletRequest() {
        System.out.println("setServletRequest");
        HttpServletRequest hsr = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setServletRequest(hsr);
    }

    /**
     * Test of saveData method, of class IntervieweeAction.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        IntervieweeAction instance = new IntervieweeAction();
        String expResult = "";
        String result = instance.saveData();
        assertEquals(expResult, result);
    }

    /**
     * Test of intervieweeData method, of class IntervieweeAction.
     */
    @Test
    public void testIntervieweeData() {
        System.out.println("intervieweeData");
        IntervieweeAction instance = new IntervieweeAction();
        String expResult = null;
        String result = instance.intervieweeData();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getLkn method, of class IntervieweeAction.
     */
    @Test
    public void testGetLkn() {
        System.out.println("getLkn");
        IntervieweeAction instance = new IntervieweeAction();
        Set<Languageknown> expResult = null;
        Set<Languageknown> result = instance.getLkn();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLkn method, of class IntervieweeAction.
     */
    @Test
    public void testSetLkn() {
        System.out.println("setLkn");
        Set<Languageknown> lkn = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setLkn(lkn);
      
    }

    /**
     * Test of getLangknown method, of class IntervieweeAction.
     */
    @Test
    public void testGetLangknown() {
        System.out.println("getLangknown");
        IntervieweeAction instance = new IntervieweeAction();
        String expResult = null;
        String result = instance.getLangknown();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLangknown method, of class IntervieweeAction.
     */
    @Test
    public void testSetLangknown() {
        System.out.println("setLangknown");
        String langknown = "";
        IntervieweeAction instance = new IntervieweeAction();
        instance.setLangknown(langknown);
       
    }

    /**
     * Test of getListjod method, of class IntervieweeAction.
     */
    @Test
    public void testGetListjod() {
        System.out.println("getListjod");
        IntervieweeAction instance = new IntervieweeAction();
        List<Jobopeningdetails> expResult = null;
        List<Jobopeningdetails> result = instance.getListjod();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setListjod method, of class IntervieweeAction.
     */
    @Test
    public void testSetListjod() {
        System.out.println("setListjod");
        List<Jobopeningdetails> listjod = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setListjod(listjod);
      
    }

    /**
     * Test of getInterviewee method, of class IntervieweeAction.
     */
    @Test
    public void testGetInterviewee() {
        System.out.println("getInterviewee");
        IntervieweeAction instance = new IntervieweeAction();
        Interviewee expResult = null;
        Interviewee result = instance.getInterviewee();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setInterviewee method, of class IntervieweeAction.
     */
    @Test
    public void testSetInterviewee() {
        System.out.println("setInterviewee");
        Interviewee interviewee = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setInterviewee(interviewee);
       
    }

    /**
     * Test of getListinterviewee method, of class IntervieweeAction.
     */
    @Test
    public void testGetListinterviewee() {
        System.out.println("getListinterviewee");
        IntervieweeAction instance = new IntervieweeAction();
        List<Interviewee> expResult = null;
        List<Interviewee> result = instance.getListinterviewee();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setListinterviewee method, of class IntervieweeAction.
     */
    @Test
    public void testSetListinterviewee() {
        System.out.println("setListinterviewee");
        List<Interviewee> listinterviewee = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setListinterviewee(listinterviewee);
       
    }

    /**
     * Test of getContactno method, of class IntervieweeAction.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        IntervieweeAction instance = new IntervieweeAction();
        String expResult = null;
        String result = instance.getContactno();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setContactno method, of class IntervieweeAction.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        String contactno = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setContactno(contactno);
        
    }

    /**
     * Test of getListround method, of class IntervieweeAction.
     */
    @Test
    public void testGetListround() {
        System.out.println("getListround");
        IntervieweeAction instance = new IntervieweeAction();
        List<Round> expResult = null;
        List<Round> result = instance.getListround();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setListround method, of class IntervieweeAction.
     */
    @Test
    public void testSetListround() {
        System.out.println("setListround");
        List<Round> listround = null;
        IntervieweeAction instance = new IntervieweeAction();
        instance.setListround(listround);
        
    }
    
}
