package innovaManagersTestCases;

import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import innovaManagersPO.navigateToAddManagerPO;
import innovaSignInTestCases.innovaSignInTC;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class navigateToAddManagerTC extends BaseTest {


    public navigateToAddManagerTC() {
    }

    public navigateToAddManagerTC(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void navigateToAddManagerTest() throws Exception {

        innovaSignInTC SignIn = new innovaSignInTC(driver);
        SignIn.innovaSignInTC();
        //Sign in 1-3 steps are available in innovaSignInTC below further continuation

        navigateToAddManagerPO addMgr_obj = new navigateToAddManagerPO(driver);


        {
            //Step 4: Click On Users
            test = extent.createTest("Test Passed", "Verify Users tab");
            test.assignCategory("Module 3 - Add Manager  ");
            assertEquals(addMgr_obj.clickUsers(), true, "Opps!! unable to click Users");
            test.log(Status.PASS,"Users link available" );
            test.log(Status.INFO,"Test case ended");


            //Step 5: Click On Managers
            test = extent.createTest("Test Passed", "Verify Manager tab");
            test.assignCategory("Module 3 - Add Manager  ");
            assertEquals(addMgr_obj.clickManagers(), true, "Opps!! unable to click Managers");
            test.log(Status.PASS,"Managers link available" );
            test.log(Status.INFO,"Test case ended");

            //Step 6: Click On addmanager
            test = extent.createTest("Test Passed", "Verify Add Manager tab");
            test.assignCategory("Module 3 - Add Manager  ");
            assertEquals(addMgr_obj.clickAddmanager(), true, "Opps!! unable to click addmanager");
            test.log(Status.PASS,"Users Add manager button able to click" );
            test.log(Status.INFO,"Test case ended");

            //Step 7: Enter valid Firstname
            test = extent.createTest("Test Passed", "Verify  first name able to input or not");
            test.assignCategory("Module 3 - Add Manager  ");
            String firstname = "DrewNik";
            Assert.assertEquals(addMgr_obj.enterfirstName(firstname), true, "Opps!! unable to enter first name");
            test.log(Status.PASS,"Users first name able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 8: Enter valid Lastname
            test = extent.createTest("Test Passed", "Verify last name able to enter or not");
            test.assignCategory("Module 3 - Add Manager  ");
            String lastname = "Rossi1";
            Assert.assertEquals(addMgr_obj.enterLasttName(lastname), true, "Opps!! unable to enter last name");
            test.log(Status.PASS,"Users last name able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 9: Enter valid Username
            test = extent.createTest("Test Passed", "Verify username input");
            test.assignCategory("Module 3 - Add Manager  ");
            String UserN = "Testxzy";
            Assert.assertEquals(addMgr_obj.enterUserN(UserN), true, "Opps!! unable to enter user name");
            test.log(Status.PASS,"Users able to enter user name" );
            test.log(Status.INFO,"Test case ended");

            //Step 10: Enter valid Email
            test = extent.createTest("Test Passed", "Verify email input");
            test.assignCategory("Module 3 - Add Manager  ");
            String email = "test01@gmail.com";
            Assert.assertEquals(addMgr_obj.enterEmail(email), true, "Opps!! unable to enter emailID");
            test.log(Status.PASS,"Users able to enter emailid" );
            test.log(Status.INFO,"Test case ended");

            //Step 11: Enter valid Mgr
            test = extent.createTest("Test Passed", "Verify Manager info input");
            test.assignCategory("Module 3 - Add Manager  ");
            String MGRType = "Test_MGR";
            Assert.assertEquals(addMgr_obj.enterManagerType(MGRType), true, "Opps!! unable to enter manager");
            test.log(Status.PASS,"User able to enter manager" );
            test.log(Status.INFO,"Test case ended");

            //Step 12: Enter valid Pwd
            test = extent.createTest("Test Passed", "Verify password input");
            test.assignCategory("Module 3 - Add Manager  ");
            String pwd = "Abc=001";
            Assert.assertEquals(addMgr_obj.enterPassword(pwd), true, "Opps!! unable to enter passowrd");
            test.log(Status.PASS,"User able to enter pwd" );
            test.log(Status.INFO,"Test case ended");

            //Step 13: Enter valid ConfirmPassword
            test = extent.createTest("Test Passed", "Verify confirmpwd entry");
            test.assignCategory("Module 3 - Add Manager  ");
            String ConfirmPwd = "Abc=001";
            Assert.assertEquals(addMgr_obj.enterConfirmPassword(ConfirmPwd), true, "Opps!! unable to enter confirm Password");
            test.log(Status.PASS,"User able to enter confirempassword" );
            test.log(Status.INFO,"Test case ended");

            //Step 14: Enter valid Phone
            test = extent.createTest("Test Passed", "Verify able to enter phone info");
            test.assignCategory("Module 3 - Add Manager  ");
            String Phone = "111-222-3333";
            Assert.assertEquals(addMgr_obj.enterPhone(Phone), true, "Opps!! unable to enter phone number");
            test.log(Status.PASS,"User phone number able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 15 Enter valid Cell Phone Number
            test = extent.createTest("Test Passed", "Verify able to input cell phone info");
            test.assignCategory("Module 3 - Add Manager  ");
            String CellPhone = "789-456-1230";
            Assert.assertEquals(addMgr_obj.enterCellPhone(CellPhone), true, "Opps!! unable to enter Cell Number");
            test.log(Status.PASS,"User cell phone able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 16: Enter valid Address
            test = extent.createTest("Test Passed", "Verify able to enter address");
            test.assignCategory("Module 3 - Add Manager  ");
            String address = "123 XYZ Street";
            Assert.assertEquals(addMgr_obj.enterAddress(address), true, "Opps!! unable to enter Address");
            test.log(Status.PASS,"User address able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 17: Enter valid City
            test = extent.createTest("Test Passed", "Verify able to input city info");
            test.assignCategory("Module 3 - Add Manager  ");
            String City = "San Jose";
            Assert.assertEquals(addMgr_obj.enterCity(City), true, "Opps!! unable to enter City");
            test.log(Status.PASS,"User city info able to enter" );
            test.log(Status.INFO,"Test case ended");

            //Step 18: Enter valid State
            test = extent.createTest("Test Passed", "Verify state inputbutton working or not");
            test.assignCategory("Module 3 - Add Manager  ");
            String State = "California";
            Assert.assertEquals(addMgr_obj.enterState(State), true, "Opps!! unable to enter State");
            test.log(Status.PASS,"User able to enter State" );
            test.log(Status.INFO,"Test case ended");

            //Step 19: Enter valid Zip
            test = extent.createTest("Test Passed", "Verify zip input working or not");
            test.assignCategory("Module 3 - Add Manager  ");
            String zip = "00125";
            Assert.assertEquals(addMgr_obj.enterZip(zip), true, "Opps!! unable to enter Zip");
            test.log(Status.PASS,"User able to enter zip" );
            test.log(Status.INFO,"Test case ended");

            //Step 20: Save& Close
            test = extent.createTest("Test Passed", "Verify Save&CLose able to click or not");
            test.assignCategory("Module 3 - Add Manager  ");
            Assert.assertEquals(addMgr_obj.clickSaveClose(), true, "Opps!! unable to Save&Close");
            test.log(Status.PASS,"User able to Save&Close successfully" );
            test.log(Status.INFO,"Test case ended");

            //Step 21 :: Enter On Search
            test = extent.createTest("Test Passed", "Verify created employee exist or not");
            test.assignCategory("Module 3 - Add Manager  ");
            String search = "Testxzy";
            Assert.assertEquals(addMgr_obj.enterSearchName(search), true, "Opps!! unable to find Drew");
            test.log(Status.PASS,"Ble to find the search successfully" );
            test.log(Status.INFO,"Test case ended");

            test = extent.createTest("Test Passed", "Verify Alert");
            test.assignCategory("Module 3 - Add Manager  ");
            Assert.assertEquals(addMgr_obj.clickAlert(), true, "Opps!! unable to click alert ok");
            test.log(Status.PASS,"User able " );
            test.log(Status.INFO,"Test case ended");


        }
    }
}
