package EmployeeTC;

import EmployeePO.EmployeeAddPO;
import SetUp.BaseTest;
import com.aventstack.extentreports.Status;
import innovaSignInTestCases.innovaSignInTC;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.Assert.assertEquals;

public class EmployeeAddTC extends BaseTest {
    public EmployeeAddTC() {
    }

    public EmployeeAddTC(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void EmployeeAddTC() throws InterruptedException, IOException {
        innovaSignInTC SignIn = new innovaSignInTC(driver);
        SignIn.innovaSignInTC();

        EmployeeAddPO EmpPO_Obj = new EmployeeAddPO(driver);

        //Step 1: Click On Users
        test = extent.createTest("Test Passed", "Verify Users tab");
        test.assignCategory("Module 2 - Add Employee's  ");
        assertEquals(EmpPO_Obj.clickUsers(), true, "Opps!! unable to click Users");
        test.log(Status.PASS,"Users link available" );
        test.log(Status.INFO,"Test case ended");

        //Step 2: Click On Employees
        test = extent.createTest("Test Passed", "Verify Employees link");
        test.assignCategory("Module 2 - Add Employee's");
        assertEquals(EmpPO_Obj.clickEmployees(), true, "Opps!! unable to click Employees");
        test.log(Status.PASS,"Employees link available");
        test.log(Status.INFO, "Test case ended");

        //Step 3: Click On AddEE
        test = extent.createTest("Test Passed", "Verify Add Employee button");
        test.assignCategory("Module 2 - Add Employee's");
         assertEquals(EmpPO_Obj.clickAddEmployees(), true, "Opps!! unable to click Add Employee");
        test.log(Status.PASS,"Employees button available");
        test.log(Status.INFO, "Test case ended");

        //Step 4: Enter valid Firstname
        test = extent.createTest("Test Passed", "Enter valid first name");
        test.assignCategory("Module 2 - Add Employee's");
        String firstname = "TestFirstName";
        assertEquals(EmpPO_Obj.enterFirstName(firstname), true, "Opps!! unable to enter first name");
        test.log(Status.PASS,"Employees First Name able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 5: Enter valid Lastname
        test = extent.createTest("Test Passed", "enter Employees last name");
        test.assignCategory("Module 2 - Add Employee's");
        String lastname = "testlastname";
        assertEquals(EmpPO_Obj.enterLastName(lastname), true, "Opps!! unable to enter last name");
        test.log(Status.PASS,"Employee last name Name able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 6: Enter valid EEID
        test = extent.createTest("Test Passed", "Enter Employee Email ID");
        test.assignCategory("Module 2 - Add Employee's");
        String eeID = "company@admin.com";
        assertEquals(EmpPO_Obj.enterEEID(eeID), true, "Opps!! unable to enter user name");
        test.log(Status.PASS,"Employees Email ID Name able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 7: Enter valid Email
        test = extent.createTest("Test Passed", "Verify valid email id");
        test.assignCategory("Module 2 - Add Employee's");
        String jobzone = "Freezer";
        assertEquals(EmpPO_Obj.enterJobzone(jobzone), true, "Opps!! unable to enter emailID");
        test.log(Status.PASS,"Employees EmailID Name able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 8: Enter valid PWd

        test = extent.createTest("Test Passed", "Verify Employees link");
        test.assignCategory("Module 2 - Add Employee's");
        String PWD = "admin";
        assertEquals(EmpPO_Obj.enterPwd(PWD), true, "Opps!! unable to enter PWd");
        test.log(Status.PASS,"Employees passowrd able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 9: Enter Confirm Pwd
        test = extent.createTest("Test Passed", "Verify pwd");
        test.assignCategory("Module 2 - Add Employee's");
        String Confirmpwd = "admin";
        assertEquals(EmpPO_Obj.enterConPassword(Confirmpwd), true, "Opps!! unable to enter Confirm Pwd");
        test.log(Status.PASS,"Employees Confirmpwd able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 10: Enter valid Barcode
        test = extent.createTest("Test Passed", "enter Employees barcode");
        test.assignCategory("Module 2 - Add Employee's");
        String BarCode = "Bar007";
        assertEquals(EmpPO_Obj.enterBarCode(BarCode), true, "Opps!! unable to enter Barcode");
        test.log(Status.PASS,"Employees barcode able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 11: Enter valid Locker
        test = extent.createTest("Test Passed", "Verify Employees locker");
        test.assignCategory("Module 2 - Add Employee's");
        String LockerNumber = "Lock007";
        assertEquals(EmpPO_Obj.enterLockerNo(LockerNumber), true, "Opps!! unable to enter Locker");
        test.log(Status.PASS,"Employees locker able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 12: Enter valid Dept#
        test = extent.createTest("Test Passed", "Verifying Dropdown");
        test.assignCategory("Module 2 - Add Employee's");
        String Dept = "General";
        assertEquals(EmpPO_Obj.enterDept(Dept), true, "Opps!! unable to enter Dept#");
        test.log(Status.PASS,"Employees dept option able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 13: Enter Location
        test = extent.createTest("Test Passed", "Verify locker input");
        test.assignCategory("Module 2 - Add Employee's");
        String Loc = "Location 007";
        assertEquals(EmpPO_Obj.enterLocation(Loc), true, "Opps!! unable to enter Location");
        test.log(Status.PASS,"Employees location able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 14: Enter valid CombinationNum
        test = extent.createTest("Test Passed", "Verify Combination number input");
        test.assignCategory("Module 2 - Add Employee's");
        String CombinationNum = "Comb=007";
        assertEquals(EmpPO_Obj.enterCombinationNo(CombinationNum), true, "Opps!! unable to enter CombinationNum");
        test.log(Status.PASS,"Employees combination number able to enter");
        test.log(Status.INFO, "Test case ended");

        //Step 15: Enter DateofHire
        //  String dt = "11/01/2018";
        test = extent.createTest("Test Passed", "Verify date option");
        test.assignCategory("Module 2 - Add Employee's");
        assertEquals(EmpPO_Obj.enterDtofHire(), true, "Opps!! unable to select date");
        test.log(Status.PASS,"Employees able to select current date");
        test.log(Status.INFO, "Test case ended");

        //Step 16 Iamge upload
        test = extent.createTest("Test Passed", "Verify image upload");
        test.assignCategory("Module 2 - Add Employee's");
        assertEquals(EmpPO_Obj.imageUpLoad(), true, "Opps!! unable to attach image");
        test.log(Status.PASS,"Employees image upload successful");
        test.log(Status.INFO, "Test case ended");

        //Step 17: Click valid clickSaveClose
        test = extent.createTest("Test Passed", "Verify Save&Close button if clicking or not");
        test.assignCategory("Module 2 - Add Employee's");
        assertEquals(EmpPO_Obj.clickSaveClose(), true, "Opps!! unable to click SaveClose");
        test.log(Status.PASS,"Able to save and close ");
        test.log(Status.INFO, "Test case ended");

    }
}
