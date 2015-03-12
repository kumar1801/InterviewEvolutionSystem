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
public class ContactbranchIdTest {
    
    public ContactbranchIdTest() {
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
     * Test of getBranchid method, of class ContactbranchId.
     */
    @Test
    public void testGetBranchid() {
        System.out.println("getBranchid");
        ContactbranchId instance = new ContactbranchId();
        int expResult = 0;
        int result = instance.getBranchid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBranchid method, of class ContactbranchId.
     */
    @Test
    public void testSetBranchid() {
        System.out.println("setBranchid");
        int branchid = 0;
        ContactbranchId instance = new ContactbranchId();
        instance.setBranchid(branchid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactno method, of class ContactbranchId.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        ContactbranchId instance = new ContactbranchId();
        long expResult = 0L;
        long result = instance.getContactno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactno method, of class ContactbranchId.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        long contactno = 0L;
        ContactbranchId instance = new ContactbranchId();
        instance.setContactno(contactno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContactbranchId.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContactbranchId instance = new ContactbranchId();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
