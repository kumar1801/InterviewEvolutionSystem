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
public class ContactbranchTest {
    
    public ContactbranchTest() {
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
     * Test of getId method, of class Contactbranch.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Contactbranch instance = new Contactbranch();
        ContactbranchId expResult = null;
        ContactbranchId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Contactbranch.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        ContactbranchId id = null;
        Contactbranch instance = new Contactbranch();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBr method, of class Contactbranch.
     */
    @Test
    public void testGetBr() {
        System.out.println("getBr");
        Contactbranch instance = new Contactbranch();
        Branch expResult = null;
        Branch result = instance.getBr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBr method, of class Contactbranch.
     */
    @Test
    public void testSetBr() {
        System.out.println("setBr");
        Branch br = null;
        Contactbranch instance = new Contactbranch();
        instance.setBr(br);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contactbranch.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contactbranch instance = new Contactbranch();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
