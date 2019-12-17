package innovaSignInTestCases;

import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import innovaSignInPO.innovaSignInPagePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

       public class innovaSignInTC extends BaseTest {
        public innovaSignInTC(){}

        public innovaSignInTC(WebDriver passDriver) {
            driver = passDriver;

        }
        @Test
        public void innovaSignInTC() {

            innovaSignInPagePO SignInPage = new innovaSignInPagePO(driver);

            //Step 1 :: Enter valid Username
            test = extent.createTest("Test Passed", "Verify User name");
            test.assignCategory("Module  - Sign In to Innovazone  ");
            String UserEmail="company@admin.com";
            Assert.assertEquals(SignInPage.enterUserEmail(UserEmail), true,"Opps!! unable to enter UserName");
            test.log(Status.PASS,"User able to enter username" );
            test.log(Status.INFO,"Test case ended");

            //Step 2 :: Enter Password
            test = extent.createTest("Test Passed", "Enter password");
            test.assignCategory("Module  - Sign In to Innovazone  ");
            String Password="admin";
            Assert.assertEquals(SignInPage.enterPassword(Password), true,"Opps!! unable to enter Password");
            test.log(Status.PASS,"User able to enter password" );
            test.log(Status.INFO,"Test case ended");

            //Step 3: Click On Sign In
            test = extent.createTest("Test Passed", "Click on Sign In tab");
            test.assignCategory("Module  - Sign In to Innovazone  ");
            Assert.assertEquals(SignInPage.verifyClickOnSign(), true,"Opps!! unable to click On Sign In");
            test.log(Status.PASS,"User able to click on sign in button" );
            test.log(Status.INFO,"Test case ended");

        }
    }

