/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import Prototypical.Head;
import java.io.File;
import java.util.Set;
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
public class HeadActionTest {
    
    public HeadActionTest() {
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
     * Test of getAhead method, of class HeadAction.
     */
    @Test
    public void testGetAhead() {
        System.out.println("getAhead");
        HeadAction instance = new HeadAction();
        Set<Head> expResult = null;
        Set<Head> result = instance.getAhead();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAhead method, of class HeadAction.
     */
    @Test
    public void testSetAhead() {
        System.out.println("setAhead");
        Set<Head> ahead = null;
        HeadAction instance = new HeadAction();
        instance.setAhead(ahead);
       
    }

    /**
     * Test of getModel method, of class HeadAction.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        HeadAction instance = new HeadAction();
        Head expResult = null;
        Head result = instance.getModel();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of prepare method, of class HeadAction.
     * @throws java.lang.Exception
     */
    @Test
    public void testPrepare() throws Exception {
        System.out.println("prepare");
        HeadAction instance = new HeadAction();
        instance.prepare();
       
    }

    /**
     * Test of saveData method, of class HeadAction.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        HeadAction instance = new HeadAction();
        String expResult = null;
        String result = instance.saveData();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setServletRequest method, of class HeadAction.
     */
    @Test
    public void testSetServletRequest() {
        System.out.println("setServletRequest");
        HttpServletRequest servletRequest = null;
        HeadAction instance = new HeadAction();
        instance.setServletRequest(servletRequest);
        
    }

    /**
     * Test of getContactno method, of class HeadAction.
     */
    @Test
    public void testGetContactno() {
        System.out.println("getContactno");
        HeadAction instance = new HeadAction();
        String expResult = null;
        String result = instance.getContactno();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setContactno method, of class HeadAction.
     */
    @Test
    public void testSetContactno() {
        System.out.println("setContactno");
        String contactno = null;
        HeadAction instance = new HeadAction();
        instance.setContactno(contactno);
        
    }

    /**
     * Test of getUserImage method, of class HeadAction.
     */
    @Test
    public void testGetUserImage() {
        System.out.println("getUserImage");
        HeadAction instance = new HeadAction();
        File expResult = null;
        File result = instance.getUserImage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserImage method, of class HeadAction.
     */
    @Test
    public void testSetUserImage() {
        System.out.println("setUserImage");
        File userImage = null;
        HeadAction instance = new HeadAction();
        instance.setUserImage(userImage);
        
    }

    /**
     * Test of getUserImageContentType method, of class HeadAction.
     */
    @Test
    public void testGetUserImageContentType() {
        System.out.println("getUserImageContentType");
        HeadAction instance = new HeadAction();
        String expResult = null;
        String result = instance.getUserImageContentType();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUserImageContentType method, of class HeadAction.
     */
    @Test
    public void testSetUserImageContentType() {
        System.out.println("setUserImageContentType");
        String userImageContentType = null;
        HeadAction instance = new HeadAction();
        instance.setUserImageContentType(userImageContentType);
       
    }

    /**
     * Test of getUserImageFileName method, of class HeadAction.
     */
    @Test
    public void testGetUserImageFileName() {
        System.out.println("getUserImageFileName");
        HeadAction instance = new HeadAction();
        String expResult = null;
        String result = instance.getUserImageFileName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUserImageFileName method, of class HeadAction.
     */
    @Test
    public void testSetUserImageFileName() {
        System.out.println("setUserImageFileName");
        String userImageFileName = null;
        HeadAction instance = new HeadAction();
        instance.setUserImageFileName(userImageFileName);
       
    }
    
}
