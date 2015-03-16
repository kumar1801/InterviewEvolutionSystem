/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototypical;

import java.util.Set;
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
public class OrganizationTest {
    
    public OrganizationTest() {
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
     * Test of getOrgname method, of class Organization.
     */
    @Test
    public void testGetOrgname() {
        System.out.println("getOrgname");
        Organization instance = new Organization();
        String expResult = null;
        String result = instance.getOrgname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrgname method, of class Organization.
     */
    @Test
    public void testSetOrgname() {
        System.out.println("setOrgname");
        String orgname = null;
        Organization instance = new Organization();
        instance.setOrgname(orgname);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrglogo method, of class Organization.
     */
    @Test
    public void testGetOrglogo() {
        System.out.println("getOrglogo");
        Organization instance = new Organization();
        byte[] expResult = null;
        byte[] result = instance.getOrglogo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrglogo method, of class Organization.
     */
    @Test
    public void testSetOrglogo() {
        System.out.println("setOrglogo");
        byte[] orglogo = null;
        Organization instance = new Organization();
        instance.setOrglogo(orglogo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getImagename method, of class Organization.
     */
    @Test
    public void testGetImagename() {
        System.out.println("getImagename");
        Organization instance = new Organization();
        String expResult = null;
        String result = instance.getImagename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setImagename method, of class Organization.
     */
    @Test
    public void testSetImagename() {
        System.out.println("setImagename");
        String imagename = null;
        Organization instance = new Organization();
        instance.setImagename(imagename);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrgdetails method, of class Organization.
     */
    @Test
    public void testGetOrgdetails() {
        System.out.println("getOrgdetails");
        Organization instance = new Organization();
        String expResult = null;
        String result = instance.getOrgdetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrgdetails method, of class Organization.
     */
    @Test
    public void testSetOrgdetails() {
        System.out.println("setOrgdetails");
        String orgdetails = null;
        Organization instance = new Organization();
        instance.setOrgdetails(orgdetails);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNoofbranches method, of class Organization.
     */
    @Test
    public void testGetNoofbranches() {
        System.out.println("getNoofbranches");
        Organization instance = new Organization();
        Integer expResult = null;
        Integer result = instance.getNoofbranches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNoofbranches method, of class Organization.
     */
    @Test
    public void testSetNoofbranches() {
        System.out.println("setNoofbranches");
        Integer noofbranches = null;
        Organization instance = new Organization();
        instance.setNoofbranches(noofbranches);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getBranches method, of class Organization.
     */
    @Test
    public void testGetBranches() {
        System.out.println("getBranches");
        Organization instance = new Organization();
        Set expResult = null;
        Set result = instance.getBranches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setBranches method, of class Organization.
     */
    @Test
    public void testSetBranches() {
        System.out.println("setBranches");
        Set branches = null;
        Organization instance = new Organization();
        instance.setBranches(branches);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
