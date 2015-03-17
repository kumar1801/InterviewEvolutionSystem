/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Prototypical.Branch;
import Prototypical.Contactbranch;
import Prototypical.Organization;
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
public class OrganizationOperationTest {
    
    public OrganizationOperationTest() {
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
     * Test of insertDetails method, of class OrganizationOperation.
     */
    @Test
    public void testInsertDetails() {
        System.out.println("insertDetails");
        Organization org = null;
        OrganizationOperation instance = new OrganizationOperation();
        boolean expResult = false;
        boolean result = instance.insertDetails(org);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OrganizationDetails method, of class OrganizationOperation.
     */
    @Test
    public void testOrganizationDetails() {
        System.out.println("OrganizationDetails");
        OrganizationOperation instance = new OrganizationOperation();
        ArrayList<Organization> expResult = null;
        ArrayList<Organization> result = instance.OrganizationDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BranchDetails method, of class OrganizationOperation.
     */
    @Test
    public void testBranchDetails() {
        System.out.println("BranchDetails");
        OrganizationOperation instance = new OrganizationOperation();
        ArrayList<Branch> expResult = null;
        ArrayList<Branch> result = instance.BranchDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BranchContactDetails method, of class OrganizationOperation.
     */
    @Test
    public void testBranchContactDetails() {
        System.out.println("BranchContactDetails");
        OrganizationOperation instance = new OrganizationOperation();
        ArrayList<Contactbranch> expResult = null;
        ArrayList<Contactbranch> result = instance.BranchContactDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
