/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

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
@Suite.SuiteClasses({Procedure.SMSOperationTest.class, Procedure.HeadOperationTest.class, Procedure.OrganizationOperationTest.class, Procedure.LoginOperationTest.class, Procedure.RoundOperationTest.class, Procedure.ChangePasswordOperationTest.class, Procedure.SchedualOperationTest.class, Procedure.ResultOperationTest.class, Procedure.JobOpeningOperationTest.class, Procedure.IntervieweeOperationTest.class, Procedure.RCMOperationTest.class})
public class ProcedureSuite {

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
