/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototypical;

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
public class RCMTest {
    
    public RCMTest() {
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
     * Test of getDepartment method, of class RCM.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        RCM instance = new RCM();
        String expResult = null;
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDepartment method, of class RCM.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String Department = null;
        RCM instance = new RCM();
        instance.setDepartment(Department);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDesignation method, of class RCM.
     */
    @Test
    public void testGetDesignation() {
        System.out.println("getDesignation");
        RCM instance = new RCM();
        String expResult = null;
        String result = instance.getDesignation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDesignation method, of class RCM.
     */
    @Test
    public void testSetDesignation() {
        System.out.println("setDesignation");
        String Designation = null;
        RCM instance = new RCM();
        instance.setDesignation(Designation);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRCMRole method, of class RCM.
     */
    @Test
    public void testGetRCMRole() {
        System.out.println("getRCMRole");
        RCM instance = new RCM();
        String expResult = null;
        String result = instance.getRCMRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRCMRole method, of class RCM.
     */
    @Test
    public void testSetRCMRole() {
        System.out.println("setRCMRole");
        String RCMRole = null;
        RCM instance = new RCM();
        instance.setRCMRole(RCMRole);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
