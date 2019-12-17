package nopCommerceTestCases;

import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import nocCommercePO.LoginCheckoutPO;
import nopCommerceTestCases.RegisterNopCommTC;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginCheckoutTC extends BaseTest {
    public LoginCheckoutTC(){}
    public LoginCheckoutTC(WebDriver passDriver) { driver = passDriver; }

    @Test
   public void LoginChkOutTC() throws InterruptedException, IOException {

        LoginCheckoutPO LoginChk_Obj = new LoginCheckoutPO(driver);

        //Step 1 :: Click on Log In
        test = extent.createTest("Test Passed", "Verify Log In button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickLoginInBtn(), true,"Opps!! unable to Click on Log In button");
        test.log(Status.PASS, "Log In link tab is available");
        test.log(Status.INFO, "Test Case Ended");

        //Step 2 :: Enter on EmailID
        test = extent.createTest("Test Passed", "Enter Existing Email ID");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String email = "Test101@gmail.com";
        Assert.assertEquals(LoginChk_Obj.enterEmailID(email), true,"Opps!! unable to enter email id");
        test.log(Status.PASS, "Able to enter Email ID");
        test.log(Status.INFO, "Test Case Ended");

        //Step 3 :: Enter on password
        test = extent.createTest("Test Passed", "Enter password");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String pwd = "abc=2019";
        Assert.assertEquals(LoginChk_Obj.enterPassword(pwd), true,"Opps!! unable to enter password");
        test.log(Status.PASS, "Able to enter password");
        test.log(Status.INFO, "Test Case Ended");

        //Step 4 :: click on Remember me chkbox
        test = extent.createTest("Test Passed", "Click Remember Me checkbox");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickRemMe(), true,"Opps!! unable to click Remember Me checkbox");
        test.log(Status.PASS, "Able to click Remember Me checkbox");
        test.log(Status.INFO, "Test Case Ended");

        //Step 5 :: click on Submit button
        test = extent.createTest("Test Passed", "Click on Submit");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickSubmit(), true,"Opps!! unable to click Submit");
        test.log(Status.PASS, "Able to click Submit");
        test.log(Status.INFO, "Test Case Ended");

////////////////////////////////////////////////////////////////
        //Step 6 :: click on Books tab
        test = extent.createTest("Test Passed", "Click on Books tab");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickBooksLink(), true,"Opps!! unable to click Books tab");
        test.log(Status.PASS, "Able to click Books tab");
        test.log(Status.INFO, "Test Case Ended");

        //Step 7 :: click on Sorting Options dropdown
        test = extent.createTest("Test Passed", "Click on Sorting Options");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String Prodnames = "Price: Low to High";
        Assert.assertEquals(LoginChk_Obj.clickSortByOptions(Prodnames), true,"Opps!! unable to click Sorting Options");
        test.log(Status.PASS, "Able to click Sorting Options");
        test.log(Status.INFO, "Test Case Ended");

        //Step 8 :: click on Add to cart
        test = extent.createTest("Test Passed", "Click on Add to cart");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickAddtoCart(), true,"Opps!! unable to click Add to cart");
        test.log(Status.PASS, "Able to click Add to cart");
        test.log(Status.INFO, "Test Case Ended");

        //Step 9 :: click on Shopping cart link
        test = extent.createTest("Test Passed", "Click on Shopping Cart");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickShoppingCart(), true,"Opps!! unable to click Shopping Cart");
        test.log(Status.PASS, "Able to click Shopping Cart");
        test.log(Status.INFO, "Test Case Ended");

        //Step 10 :: click on terms of service
        test = extent.createTest("Test Passed", "Click on terms of service");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickTermofServ(), true,"Opps!! unable to click terms of service");
        test.log(Status.PASS, "Able to click terms of service");
        test.log(Status.INFO, "Test Case Ended");

        //Step 11 :: click on check out
         test = extent.createTest("Test Passed", "Click on Checkout");
         test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
         test.log(Status.INFO, "Test Case Started");
         Assert.assertEquals(LoginChk_Obj.clickCheckOutBtn(), true,"Opps!! unable to click Checkout");
         test.log(Status.PASS, "Able to click Checkout");
         test.log(Status.INFO, "Test Case Ended");

         //Step 12 :: click on Uncehck Same Address
         test = extent.createTest("Test Passed", "Click on UnCheck for same adderess");
         test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
         test.log(Status.INFO, "Test Case Started");
         Assert.assertEquals(LoginChk_Obj.clickUnCheckBtn(), true,"Opps!! unable to click UnCheck for same adderess");
         test.log(Status.PASS, "Able to click UnCheck for same adderess");
         test.log(Status.INFO, "Test Case Ended");

         //Step 13 :: click on New address Options dropdown
         test = extent.createTest("Test Passed", "Click on new address option");
         test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
         test.log(Status.INFO, "Test Case Started");
         String newaddress = "New Address";
         Assert.assertEquals(LoginChk_Obj.enterNewAddress(newaddress), true,"Opps!! unable to click new address option");
         test.log(Status.PASS, "Able to click new address option");
         test.log(Status.INFO, "Test Case Ended");


        //Step 14 :: click on country Options dropdown
        test = extent.createTest("Test Passed", "Click on country option");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String country = "United States";
        Assert.assertEquals(LoginChk_Obj.enterCountry(country), true,"Opps!! unable to click Country option");
        test.log(Status.PASS, "Able to click country option");
        test.log(Status.INFO, "Test Case Ended");

        //Step 15 :: Enter state info
        test = extent.createTest("Test Passed", "Click on state option");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String state = "Maryland";
        Assert.assertEquals(LoginChk_Obj.enterState(state), true,"Opps!! unable to click state option");
        test.log(Status.PASS, "Able to click state option");
        test.log(Status.INFO, "Test Case Ended");

        //Step 16 :: Enter city info
        test = extent.createTest("Test Passed", "Enter city info");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String city = "Lexington";
        Assert.assertEquals(LoginChk_Obj.enterCity(city), true,"Opps!! unable to enter city info");
        test.log(Status.PASS, "Able to enter city info");
        test.log(Status.INFO, "Test Case Ended");

        //Step 17 :: Enter address info
        test = extent.createTest("Test Passed", "Enter address");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String address = "123 Sun drive";
        Assert.assertEquals(LoginChk_Obj.enterAddress(address), true,"Opps!! unable to enter address");
        test.log(Status.PASS, "Able to enter address");
        test.log(Status.INFO, "Test Case Ended");

        //Step 18 :: Enter zip info
        test = extent.createTest("Test Passed", "Enter zipcode");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String zip = "10023";
        Assert.assertEquals(LoginChk_Obj.enterzip(zip), true,"Opps!! unable to enter zipcode");
        test.log(Status.PASS, "Able to enter zipcode");
        test.log(Status.INFO, "Test Case Ended");

        //Step 19 :: Enter phone info
        test = extent.createTest("Test Passed", "Enter phone number");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        String phone = "111-222-3333";
        Assert.assertEquals(LoginChk_Obj.enterphone(phone), true,"Opps!! unable to enter phone number");
        test.log(Status.PASS, "Able to enter phone number");
        test.log(Status.INFO, "Test Case Ended");

        //Step 20 :: Click to Billing continue button
        test = extent.createTest("Test Passed", "Click to Billing continue button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickBillingContinueBtn(), true,"Opps!! unable to click Billing continue button");
        test.log(Status.PASS, "Able to click Billing continue button");
        test.log(Status.INFO, "Test Case Ended");

        //Step 21 :: Click to Billing continue button
        test = extent.createTest("Test Passed", "Click to Shipping save button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickShippingSaveBtn(), true,"Opps!! unable to click Shipping save button");
        test.log(Status.PASS, "Able to click shipping save button");
        test.log(Status.INFO, "Test Case Ended");

        //Step 22 :: Click to Shipping continue button
        test = extent.createTest("Test Passed", "Click to Shipping continue button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickShippingContinueBtn(), true,"Opps!! unable to click Shipping continue button");
        test.log(Status.PASS, "Able to click Shipping continue button");
        test.log(Status.INFO, "Test Case Ended");

        //Step 23 :: Click to Payment continue button
        test = extent.createTest("Test Passed", "Click to Payment continue button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickPaymentContinueBtn(), true,"Opps!! unable to click Payment continue button");
        test.log(Status.PASS, "Able to click Payment continue button");
        test.log(Status.INFO, "Test Case Ended");

        //Step 24 :: Click to PaymentInfo continue button
        test = extent.createTest("Test Passed", "Click to PaymentInfo continue button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickPaymentinfoBtn(), true,"Opps!! unable to click PaymentInfo continue button");
        test.log(Status.PASS, "Able to click PaymentInfo continue button");
        test.log(Status.INFO, "Test Case Ended");

        //Step 25 :: Click to Confirm button
        test = extent.createTest("Test Passed", "Click to Confirm button");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickConfirmBtn(), true,"Opps!! unable to click Confirm button");
        test.log(Status.PASS, "Your order has been successfully processed!");
        test.log(Status.INFO, "Test Case Ended");

/*        //Step 26 :: Click to get order number
        test = extent.createTest("Test Passed", "Click to get order number");
        test.assignCategory("Module 1 - Login as existing user and Checkout buying a product  ");
        test.log(Status.INFO, "Test Case Started");
        Assert.assertEquals(LoginChk_Obj.clickOrderNumber(), true,"Opps!! unable to click to get order number");
        test.log(Status.PASS, "Able to get order number successfully");
        test.log(Status.INFO, "Test Case Ended");*/

    }
}
