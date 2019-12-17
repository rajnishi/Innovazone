package LoginTestCases;

import LoginPO.LoginPO;
import SetUp.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseTest {
    @Test
    public void LoginTest() {

        LoginPO loginPage = new LoginPO(driver);

        //Step 1 :: Enter valid Username
        String Email="company@admin.com";
        Assert.assertEquals(loginPage.enterUsername(Email), true,"Opps!! unable to enter UserName");

        //Step 2 :: Enter Password
        String Password="admin";
        Assert.assertEquals(loginPage.enterPassword(Password), true,"Opps!! unable to enter Password");

        //Step 3: Click On Sign In
        Assert.assertEquals(loginPage.verifyClickOnSign(), true,"Opps!! unable to click On Sign In");

    }
}