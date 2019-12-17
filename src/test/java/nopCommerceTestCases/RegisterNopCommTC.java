package nopCommerceTestCases;

import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import nocCommercePO.RegisterNopCommercePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterNopCommTC extends BaseTest {
    public RegisterNopCommTC(){}

    public RegisterNopCommTC(WebDriver passDriver) {
        driver = passDriver;

    }
        @Test
        public void RegisNocTC() {
            RegisterNopCommercePO RegisPage = new RegisterNopCommercePO(driver);

            //Step 1 :: Click on Register
            test = extent.createTest("Test Passed", "Verify Register");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            Assert.assertEquals(RegisPage.clickRegister(), true,"Opps!! unable to Click on Register button");
            test.log(Status.PASS, "Register link tab is available");
            test.log(Status.INFO, "Test Case Ended");

            //Step 2 :: Click on gender
            test = extent.createTest("Test Passed", "Select on Gender");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            Assert.assertEquals(RegisPage.clickGender(), true,"Opps!! unable to select");
            test.log(Status.PASS, "Able to select");
            test.log(Status.INFO, "Test Case Ended");

            //Step 3: Enter FNAme
            test = extent.createTest("Test Passed", "Able to enter First name");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String FirstName = "Raj1";
            Assert.assertEquals(RegisPage.enterFirstName(FirstName), true,"Opps!! unable to enter FName");
            test.log(Status.PASS, "First name able to enter succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 4: Enter LastName
            test = extent.createTest("Test Passed", "Able to enter Last name");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String LastName = "Nishi1";
            Assert.assertEquals(RegisPage.enterLastName(LastName), true,"Opps!! unable to enter Lname");
            test.log(Status.PASS, "Last name able to enter succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 5: Select Date
            test = extent.createTest("Test Passed", "Able to select date");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String date = "10";
            assertEquals(RegisPage.selectDt(date), true, "Opps!! unable to select date");
            test.log(Status.PASS, "able to select date succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 6: Enter Month
            test = extent.createTest("Test Passed", "Able to select month");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String month = "July";
            assertEquals(RegisPage.selectMonth(month), true, "Opps!! unable to select month");
            test.log(Status.PASS, "Able to select month succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 7: Enter Year
            test = extent.createTest("Test Passed", "Able to select year");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String yr = "2006";
            assertEquals(RegisPage.selectYear(yr), true, "Opps!! unable to select year");
            test.log(Status.PASS, "Able to select year succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 8: Enter email
            test = extent.createTest("Test Passed", "Eneter email info");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String email = "Test101@gmail.com";
            Assert.assertEquals(RegisPage.enterEmail(email), true,"Opps!! unable to enter email ");
            test.log(Status.PASS, "Able to enter succesfully Email ID");
            test.log(Status.INFO, "Test Case Ended");

            //Step 9: Enter Company Info
            test = extent.createTest("Test Passed", "Able to enter company info");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String Company = "Demo Testing Site";
            Assert.assertEquals(RegisPage.enterComp(Company), true,"Opps!! unable to enter company info");
            test.log(Status.PASS, "Able to enter company info succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 10: Enter pwd
            test = extent.createTest("Test Passed", "Able to enter pwd");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String password = "abc=2019";
            Assert.assertEquals(RegisPage.enterPassword(password), true,"Opps!! unable to enter pwd");
            test.log(Status.PASS, "Able to enter password succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 11: Enter enterConfirmPwd
            test = extent.createTest("Test Passed", "Able to confirm pwd");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            String Confirmpwd = "abc=2019";
            Assert.assertEquals(RegisPage.enterConfirmPwd(Confirmpwd), true,"Opps!! unable to enter confirmpwd");
            test.log(Status.PASS, "Able to enter confirm pwd succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 12: Click Register
            test = extent.createTest("Test Passed", "Able to register successfully");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            Assert.assertEquals(RegisPage.clickRegisBtn(), true,"Opps!! unable to register");
            test.log(Status.PASS, "Able to registerr succesfully");
            test.log(Status.INFO, "Test Case Ended");

            //Step 13: Click continue
            test = extent.createTest("Test Passed", "Verify continue button");
            test.assignCategory("Module 1 - User Registration Page  ");
            test.log(Status.INFO, "Test Case Started");
            Assert.assertEquals(RegisPage.clickContinueBtn(), true,"Opps!! unable to click continue");
            test.log(Status.PASS, "Able to verify continue button succesfully");
            test.log(Status.INFO, "Test Case Ended");


        }
}
