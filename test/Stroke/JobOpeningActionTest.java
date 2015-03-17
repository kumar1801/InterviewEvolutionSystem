/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Jobopeningdetails;
import Prototypical.Requiedqualification;
import Prototypical.Requireddocuments;
import java.io.File;
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
public class JobOpeningActionTest {
    
    public JobOpeningActionTest() {
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
     * Test of getListjod method, of class JobOpeningAction.
     */
    @Test
    public void testGetListjod() {
        System.out.println("getListjod");
        JobOpeningAction instance = new JobOpeningAction();
        List<Jobopeningdetails> expResult = null;
        List<Jobopeningdetails> result = instance.getListjod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListjod method, of class JobOpeningAction.
     */
    @Test
    public void testSetListjod() {
        System.out.println("setListjod");
        List<Jobopeningdetails> listjod = null;
        JobOpeningAction instance = new JobOpeningAction();
        instance.setListjod(listjod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImage method, of class JobOpeningAction.
     */
    @Test
    public void testGetUserImage() {
        System.out.println("getUserImage");
        JobOpeningAction instance = new JobOpeningAction();
        File expResult = null;
        File result = instance.getUserImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImage method, of class JobOpeningAction.
     */
    @Test
    public void testSetUserImage() {
        System.out.println("setUserImage");
        File userImage = null;
        JobOpeningAction instance = new JobOpeningAction();
        instance.setUserImage(userImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImageContentType method, of class JobOpeningAction.
     */
    @Test
    public void testGetUserImageContentType() {
        System.out.println("getUserImageContentType");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getUserImageContentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImageContentType method, of class JobOpeningAction.
     */
    @Test
    public void testSetUserImageContentType() {
        System.out.println("setUserImageContentType");
        String userImageContentType = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setUserImageContentType(userImageContentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImageFileName method, of class JobOpeningAction.
     */
    @Test
    public void testGetUserImageFileName() {
        System.out.println("getUserImageFileName");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getUserImageFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImageFileName method, of class JobOpeningAction.
     */
    @Test
    public void testSetUserImageFileName() {
        System.out.println("setUserImageFileName");
        String userImageFileName = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setUserImageFileName(userImageFileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequiredDocuments method, of class JobOpeningAction.
     */
    @Test
    public void testGetRequiredDocuments() {
        System.out.println("getRequiredDocuments");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getRequiredDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequiredDocuments method, of class JobOpeningAction.
     */
    @Test
    public void testSetRequiredDocuments() {
        System.out.println("setRequiredDocuments");
        String requiredDocuments = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setRequiredDocuments(requiredDocuments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequiredQualification method, of class JobOpeningAction.
     */
    @Test
    public void testGetRequiredQualification() {
        System.out.println("getRequiredQualification");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getRequiredQualification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequiredQualification method, of class JobOpeningAction.
     */
    @Test
    public void testSetRequiredQualification() {
        System.out.println("setRequiredQualification");
        String requiredQualification = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setRequiredQualification(requiredQualification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesiredskilled method, of class JobOpeningAction.
     */
    @Test
    public void testGetDesiredskilled() {
        System.out.println("getDesiredskilled");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getDesiredskilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesiredskilled method, of class JobOpeningAction.
     */
    @Test
    public void testSetDesiredskilled() {
        System.out.println("setDesiredskilled");
        String desiredskilled = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setDesiredskilled(desiredskilled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class JobOpeningAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        JobOpeningAction instance = new JobOpeningAction();
        Object expResult = null;
        Object result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class JobOpeningAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        JobOpeningAction instance = new JobOpeningAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveData method, of class JobOpeningAction.
     */
    @Test
    public void testSaveData() {
        System.out.println("SaveData");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.SaveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retriveData method, of class JobOpeningAction.
     */
    @Test
    public void testRetriveData() {
        System.out.println("retriveData");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.retriveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServletRequest method, of class JobOpeningAction.
     */
    @Test
    public void testSetServletRequest() {
        System.out.println("setServletRequest");
        HttpServletRequest hsr = null;
        JobOpeningAction instance = new JobOpeningAction();
        instance.setServletRequest(hsr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobcode method, of class JobOpeningAction.
     */
    @Test
    public void testGetJobcode() {
        System.out.println("getJobcode");
        JobOpeningAction instance = new JobOpeningAction();
        String expResult = "";
        String result = instance.getJobcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobcode method, of class JobOpeningAction.
     */
    @Test
    public void testSetJobcode() {
        System.out.println("setJobcode");
        String jobcode = "";
        JobOpeningAction instance = new JobOpeningAction();
        instance.setJobcode(jobcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequired method, of class JobOpeningAction.
     */
    @Test
    public void testGetRequired() {
        System.out.println("getRequired");
        JobOpeningAction instance = new JobOpeningAction();
        List<Requiedqualification> expResult = null;
        List<Requiedqualification> result = instance.getRequired();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequired method, of class JobOpeningAction.
     */
    @Test
    public void testSetRequired() {
        System.out.println("setRequired");
        List<Requiedqualification> required = null;
        JobOpeningAction instance = new JobOpeningAction();
        instance.setRequired(required);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocuments method, of class JobOpeningAction.
     */
    @Test
    public void testGetDocuments() {
        System.out.println("getDocuments");
        JobOpeningAction instance = new JobOpeningAction();
        List<Requireddocuments> expResult = null;
        List<Requireddocuments> result = instance.getDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocuments method, of class JobOpeningAction.
     */
    @Test
    public void testSetDocuments() {
        System.out.println("setDocuments");
        List<Requireddocuments> documents = null;
        JobOpeningAction instance = new JobOpeningAction();
        instance.setDocuments(documents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
