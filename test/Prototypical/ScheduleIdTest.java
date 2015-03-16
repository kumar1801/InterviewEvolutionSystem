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
public class ScheduleIdTest {
    
    public ScheduleIdTest() {
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
     * Test of getScheduleNo method, of class ScheduleId.
     */
    @Test
    public void testGetScheduleNo() {
        System.out.println("getScheduleNo");
        ScheduleId instance = new ScheduleId();
        int expResult = 0;
        int result = instance.getScheduleNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setScheduleNo method, of class ScheduleId.
     */
    @Test
    public void testSetScheduleNo() {
        System.out.println("setScheduleNo");
        int scheduleNo = 0;
        ScheduleId instance = new ScheduleId();
        instance.setScheduleNo(scheduleNo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRoundId method, of class ScheduleId.
     */
    @Test
    public void testGetRoundId() {
        System.out.println("getRoundId");
        ScheduleId instance = new ScheduleId();
        int expResult = 0;
        int result = instance.getRoundId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRoundId method, of class ScheduleId.
     */
    @Test
    public void testSetRoundId() {
        System.out.println("setRoundId");
        int roundId = 0;
        ScheduleId instance = new ScheduleId();
        instance.setRoundId(roundId);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class ScheduleId.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        ScheduleId instance = new ScheduleId();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class ScheduleId.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ScheduleId instance = new ScheduleId();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class ScheduleId.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScheduleId instance = new ScheduleId();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
