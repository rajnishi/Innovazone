package LoginTestCases;

import LoginPO.LoginPO;
import LoginPO.SignInPagePO;
import SetUp.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTC extends BaseTest {
    public SignInTC(){}

    public SignInTC(WebDriver passDriver) {
        driver = passDriver;

    }
    @Test
    public void SignInTest() throws InterruptedException {


      //  SignInPagePO signInPage = new SignInPagePO(driver);
      LoginTC  login = new LoginTC(driver);
      login.LoginTest();

      SignInPagePO signInPage = new SignInPagePO(driver);


        //Step 1: Click On Users
       Assert.assertEquals(signInPage.clickUsers(), true,"Opps!! unable to click Users");

        //Step 2 :: Click On Managers

       Assert.assertEquals(signInPage.clickManagers(), true,"Opps!! unable to click Managers");

        //Step 3: Click On addmanager

        Assert.assertEquals(signInPage.clickAddmanager(), true,"Opps!! unable to click addmanager");

        //Step 1 :: Enter valid Username

        String firstname="testname";
        Assert.assertEquals(signInPage.enterfirstName(firstname), true,"Opps!! unable to enter first name");

        //Step 1 :: Enter valid Username
        String lastname="testlastname";
        Assert.assertEquals(signInPage.enterlasttName(lastname), true,"Opps!! unable to enter last name");


    }


}