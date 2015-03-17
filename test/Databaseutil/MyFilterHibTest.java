/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Databaseutil;

import org.hibernate.SessionFactory;
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
public class MyFilterHibTest {
    
    public MyFilterHibTest() {
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
     * Test of getsessionfactory method, of class MyFilterHib.
     */
    @Test
    public void testGetsessionfactory() {
        System.out.println("getsessionfactory");
        SessionFactory expResult = null;
        SessionFactory result = MyFilterHib.getsessionfactory();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
