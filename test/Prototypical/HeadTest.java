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
public class HeadTest {
    
    public HeadTest() {
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
     * Test of getImagename method, of class Head.
     */
    @Test
    public void testGetImagename() {
        System.out.println("getImagename");
        Head instance = new Head();
        String expResult = null;
        String result = instance.getImagename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setImagename method, of class Head.
     */
    @Test
    public void testSetImagename() {
        System.out.println("setImagename");
        String imagename = null;
        Head instance = new Head();
        instance.setImagename(imagename);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeadimg method, of class Head.
     */
    @Test
    public void testGetHeadimg() {
        System.out.println("getHeadimg");
        Head instance = new Head();
        byte[] expResult = null;
        byte[] result = instance.getHeadimg();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeadimg method, of class Head.
     */
    @Test
    public void testSetHeadimg() {
        System.out.println("setHeadimg");
        byte[] headimg = null;
        Head instance = new Head();
        instance.setHeadimg(headimg);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeadDetail method, of class Head.
     */
    @Test
    public void testGetHeadDetail() {
        System.out.println("getHeadDetail");
        Head instance = new Head();
        String expResult = null;
        String result = instance.getHeadDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeadDetail method, of class Head.
     */
    @Test
    public void testSetHeadDetail() {
        System.out.println("setHeadDetail");
        String headDetail = null;
        Head instance = new Head();
        instance.setHeadDetail(headDetail);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeadType method, of class Head.
     */
    @Test
    public void testGetHeadType() {
        System.out.println("getHeadType");
        Head instance = new Head();
        String expResult = null;
        String result = instance.getHeadType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeadType method, of class Head.
     */
    @Test
    public void testSetHeadType() {
        System.out.println("setHeadType");
        String headType = null;
        Head instance = new Head();
        instance.setHeadType(headType);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
