package HomePageTestCases;

import innovaHomePage.HomePagePO;
import SetUp.BaseTest_HomePageReport;
import com.aventstack.extentreports.Status;
import innovaSignInTestCases.innovaSignInTC;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HomePageTC extends BaseTest_HomePageReport {
    public HomePageTC(){}
    public HomePageTC(WebDriver passDriver) {
        driver = passDriver;

    }

    @Test
    public void HomePageTC1() throws Exception {
        innovaSignInTC SignIn1 = new innovaSignInTC(driver);
        SignIn1.innovaSignInTC();

        HomePagePO homePage_Obj = new HomePagePO(driver);


        //Step 1: Click On Prod Management tab
        test = extent.createTest("Test Passed", "Verify Prod Management tab");
        test.assignCategory("Module 1 - Smoke Testcases  ");
        test.log(Status.INFO, "Test Case Started");
        assertEquals(homePage_Obj.clickprodManagementLink(), true, "Opps!! unable to click on Prod Mangt");
        test.log(Status.PASS, "Prod Management tab is available");
        test.log(Status.INFO, "Test Case Ended");

        //Step 2: Click On JobZOne tab
        test = extent.createTest("Test Passed", "Verify Jobzone tab");
        test.assignCategory("Module 1 - Smoke Testcases  ");
        test.log(Status.INFO, "Test Case Started");
        assertEquals(homePage_Obj.clickjobZoneLabel(), true, "Opps!! unable to click on Jobzone");
        test.log(Status.PASS, "Jobzone tab is available");
        test.log(Status.INFO, "Test Case Ended");

        //Step 3: Click On Users tab
        test = extent.createTest("Test Passed", "Verify Users tab");
        test.assignCategory("Module 1 - Smoke Testcases  ");
        test.log(Status.INFO, "Test Case Started");
        assertEquals(homePage_Obj.clickusersLink(), true, "Opps!! unable to click on users tab");
        test.log(Status.PASS, "Users tab is able to click");
        test.log(Status.INFO, "Test Case Ended");

        //Step 4: Click On Managers
        test = extent.createTest("Test Passed", "Verify Managers link working or not");
        test.assignCategory("Module 1 - Smoke Testcases ");
        test.log(Status.INFO, "Test Case Started");
        assertEquals(homePage_Obj.clickManagers(), true, "Opps!! unable to manager link");
        test.log(Status.PASS, "Managers link clickable");
        test.log(Status.INFO, "Test Case Ended");

        //Step 5: Verify search
        test = extent.createTest("Test Passed", "Verify search text");
        test.assignCategory("Module 1 - Smoke Testcases ");
        test.log(Status.INFO, "Test Case Started");
        String search = "test";
        assertEquals(homePage_Obj.enterSearchName(search), true, "Opps!! unable to find search");
        test.log(Status.PASS, "search appears");
        test.log(Status.INFO, "Test Case Ended");

        //Step 6: Verify Alert
        test = extent.createTest("Test Passed", "Verify Alert");
        test.assignCategory("Module 1 - Smoke Testcases ");
        test.log(Status.INFO, "Test Case Started");
        assertEquals(homePage_Obj.clickAlert(), true, "Opps!! unable to get Alert pop up");
        test.log(Status.PASS, "Alert appears");
        test.log(Status.INFO, "Test Case Ended");

    }
}
