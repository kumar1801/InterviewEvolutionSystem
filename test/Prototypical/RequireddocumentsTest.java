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
public class RequireddocumentsTest {
    
    public RequireddocumentsTest() {
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
     * Test of getId method, of class Requireddocuments.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Requireddocuments instance = new Requireddocuments();
        RequireddocumentsId expResult = null;
        RequireddocumentsId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class Requireddocuments.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        RequireddocumentsId id = null;
        Requireddocuments instance = new Requireddocuments();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
