/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Branch;
import Prototypical.Organization;
import java.io.File;
import java.util.ArrayList;
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
public class OrganizationActionTest {
    
    public OrganizationActionTest() {
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
     * Test of getContactno method, of class OrganizationAction.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        OrganizationAction instance = new OrganizationAction();
        String expResult = "";
        String result = instance.getContactno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactno method, of class OrganizationAction.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        String contactno = "";
        OrganizationAction instance = new OrganizationAction();
        instance.setContactno(contactno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrgdetail method, of class OrganizationAction.
     */
    @Test
    public void testGetOrgdetail() {
        System.out.println("getOrgdetail");
        OrganizationAction instance = new OrganizationAction();
        ArrayList<Organization> expResult = null;
        ArrayList<Organization> result = instance.getOrgdetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrgdetail method, of class OrganizationAction.
     */
    @Test
    public void testSetOrgdetail() {
        System.out.println("setOrgdetail");
        ArrayList<Organization> orgdetail = null;
        OrganizationAction instance = new OrganizationAction();
        instance.setOrgdetail(orgdetail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBr method, of class OrganizationAction.
     */
    @Test
    public void testGetBr() {
        System.out.println("getBr");
        OrganizationAction instance = new OrganizationAction();
        Branch expResult = null;
        Branch result = instance.getBr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBr method, of class OrganizationAction.
     */
    @Test
    public void testSetBr() {
        System.out.println("setBr");
        Branch br = null;
        OrganizationAction instance = new OrganizationAction();
        instance.setBr(br);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class OrganizationAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        OrganizationAction instance = new OrganizationAction();
        Organization expResult = null;
        Organization result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class OrganizationAction.
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        OrganizationAction instance = new OrganizationAction();
        instance.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveData method, of class OrganizationAction.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        OrganizationAction instance = new OrganizationAction();
        String expResult = "";
        String result = instance.saveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServletRequest method, of class OrganizationAction.
     */
    @Test
    public void testSetServletRequest() {
        System.out.println("setServletRequest");
        HttpServletRequest servletRequest = null;
        OrganizationAction instance = new OrganizationAction();
        instance.setServletRequest(servletRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImage method, of class OrganizationAction.
     */
    @Test
    public void testGetUserImage() {
        System.out.println("getUserImage");
        OrganizationAction instance = new OrganizationAction();
        File expResult = null;
        File result = instance.getUserImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImage method, of class OrganizationAction.
     */
    @Test
    public void testSetUserImage() {
        System.out.println("setUserImage");
        File userImage = null;
        OrganizationAction instance = new OrganizationAction();
        instance.setUserImage(userImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImageContentType method, of class OrganizationAction.
     */
    @Test
    public void testGetUserImageContentType() {
        System.out.println("getUserImageContentType");
        OrganizationAction instance = new OrganizationAction();
        String expResult = "";
        String result = instance.getUserImageContentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImageContentType method, of class OrganizationAction.
     */
    @Test
    public void testSetUserImageContentType() {
        System.out.println("setUserImageContentType");
        String userImageContentType = "";
        OrganizationAction instance = new OrganizationAction();
        instance.setUserImageContentType(userImageContentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImageFileName method, of class OrganizationAction.
     */
    @Test
    public void testGetUserImageFileName() {
        System.out.println("getUserImageFileName");
        OrganizationAction instance = new OrganizationAction();
        String expResult = "";
        String result = instance.getUserImageFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserImageFileName method, of class OrganizationAction.
     */
    @Test
    public void testSetUserImageFileName() {
        System.out.println("setUserImageFileName");
        String userImageFileName = "";
        OrganizationAction instance = new OrganizationAction();
        instance.setUserImageFileName(userImageFileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retriveData method, of class OrganizationAction.
     */
    @Test
    public void testRetriveData() {
        System.out.println("retriveData");
        OrganizationAction instance = new OrganizationAction();
        String expResult = "";
        String result = instance.retriveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBranchdetail method, of class OrganizationAction.
     */
    @Test
    public void testGetBranchdetail() {
        System.out.println("getBranchdetail");
        OrganizationAction instance = new OrganizationAction();
        ArrayList<Branch> expResult = null;
        ArrayList<Branch> result = instance.getBranchdetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBranchdetail method, of class OrganizationAction.
     */
    @Test
    public void testSetBranchdetail() {
        System.out.println("setBranchdetail");
        ArrayList<Branch> branchdetail = null;
        OrganizationAction instance = new OrganizationAction();
        instance.setBranchdetail(branchdetail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
