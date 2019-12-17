package LoginTestCases;

import LoginPO.LoginPO;
import LoginPO.SignInPagePO;
import LoginPO.SignInPO_test;
import SetUp.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTC_test extends BaseTest {
    @Test
    public void SignInTC_test() {

        SignInPO_test signInPage = new SignInPO_test(driver);


        //Step 1: Enter valid Username
        String Email = "company@admin.com";
        Assert.assertEquals(signInPage.enterEmailName(Email), true, "Opps!! unable to enter UserName");

        //Step 2: Enter Password
        String Password = "admin";
        Assert.assertEquals(signInPage.enterPassword(Password), true, "Opps!! unable to enter Password");

        //Step 3: Click On Sign In
        Assert.assertEquals(signInPage.verifyClickOnSign(), true, "Opps!! unable to click On Sign In");

        //Step 4: Click On Users
        Assert.assertEquals(signInPage.clickUsers(), true, "Opps!! unable to click Users");

        //Step 5: Click On Managers
        Assert.assertEquals(signInPage.clickManagers(), true, "Opps!! unable to click Users");

        //Step 6: Click On addmanager
        Assert.assertEquals(signInPage.clickAddmanager(), true, "Opps!! unable to click addmanager");

        //Step 7: Enter valid Firstname
        String firstname = "testname";
        Assert.assertEquals(signInPage.enterfirstName(firstname), true, "Opps!! unable to enter first name");

        //Step 8: Enter valid Lastname
        String lastname = "testlastname";
        Assert.assertEquals(signInPage.enterlasttName(lastname), true, "Opps!! unable to enter last name");

        //Step 9: Enter valid Username
        String UserName = "testnamexyz";
        Assert.assertEquals(signInPage.enterUserName(UserName), true, "Opps!! unable to enter user name");

        //Step 10: Enter valid Email
        String email = "test@gmail.com";
        Assert.assertEquals(signInPage.enterEmail(email), true, "Opps!! unable to enter emailID");

        //Step 11: Enter valid Mgr
        String Mgr = "Test_MGR";
        Assert.assertEquals(signInPage.enterMgrType(Mgr), true, "Opps!! unable to enter manager");

        //Step 12: Enter valid Pwd
        String pwd = "Abc=001";
        Assert.assertEquals(signInPage.enterPwd(pwd), true, "Opps!! unable to enter passowrd");

        //Step 13: Enter valid ConfirmPassword
        String ConfirmPwd = "Abc=001";
        Assert.assertEquals(signInPage.enterConfirmPassword(ConfirmPwd), true, "Opps!! unable to enter Valid Password");

        //Step 14: Enter valid Phone
        String Phone = "123-456-7890";
        Assert.assertEquals(signInPage.enterPhone(Phone), true, "Opps!! unable to enter phone number");

        //Step 15 Enter valid Cell Phone Number
        String CellPhone = "789-456-1230";
        Assert.assertEquals(signInPage.enterCellPhone(CellPhone), true, "Opps!! unable to enter Cell Number");

        //Step 16: Enter valid Address
        String address = "123 XYZ Street";
        Assert.assertEquals(signInPage.enteraddress(address), true, "Opps!! unable to enter Address");

        //Step 17: Enter valid City
        String City = "San Jose";
        Assert.assertEquals(signInPage.enterCity(City), true, "Opps!! unable to enter City");

        //Step 18: Enter valid State
        String State = "California";
        Assert.assertEquals(signInPage.enterState(State), true, "Opps!! unable to enter State");

        //Step 19: Enter valid Zip
        String zip = "01234";
        Assert.assertEquals(signInPage.enterZip(zip), true, "Opps!! unable to enter Zip");


    }
    }


