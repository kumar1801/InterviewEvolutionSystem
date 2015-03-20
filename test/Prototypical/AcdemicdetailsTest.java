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
public class AcdemicdetailsTest {
    
    public AcdemicdetailsTest() {
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
     * Test of getId method, of class Acdemicdetails.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Acdemicdetails instance = new Acdemicdetails();
        AcdemicdetailsId expResult = null;
        AcdemicdetailsId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class Acdemicdetails.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        AcdemicdetailsId id = null;
        Acdemicdetails instance = new Acdemicdetails();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
