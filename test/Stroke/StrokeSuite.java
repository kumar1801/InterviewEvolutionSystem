/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stroke;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Devank
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Stroke.RCMActionTest.class, Stroke.SMSActionTest.class, Stroke.RoundActionTest.class, Stroke.ScheduleActionTest.class, Stroke.ResultActionTest.class, Stroke.OrganizationActionTest.class, Stroke.HeadActionTest.class, Stroke.JobOpeningActionTest.class, Stroke.LoginActionTest.class, Stroke.IntervieweeActionTest.class, Stroke.ChangePasswordActionTest.class})
public class StrokeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
