package EmployeeTC;

import EmployeePO.EmployeeAddPO_FileProp;
import SetUp.BaseTest;
import innovaSignInTestCases.innovaSignInTC;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EmployeeAddTC_FileProp extends BaseTest {
    public EmployeeAddTC_FileProp() {
    }

    public EmployeeAddTC_FileProp(WebDriver passDriver) {
        driver = passDriver;
    }

    @Test
    public void EmployeeAddTC() throws InterruptedException, IOException {
        innovaSignInTC SignIn = new innovaSignInTC(driver);
        SignIn.innovaSignInTC();

        EmployeeAddPO_FileProp file = new EmployeeAddPO_FileProp(driver);
        Properties prop = new Properties();

        //*********testing reading data from config file *******
        prop.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Config_EE.properties"));
        System.out.println(prop.getProperty("config_FirstName"));


        //Step 1: Click On Users
        assertEquals(file.clickUsers(), true, "Opps!! unable to click Users");

        //Step 2: Click On Employees
        assertEquals(file.clickEmployees(), true, "Opps!! unable to click Employees");

        //Step 3: Click On AddEE
        assertEquals(file.clickAddEmployees(), true, "Opps!! unable to click Add Employee");

        //Step 4: Enter valid Firstname
        String firstname = prop.getProperty("config_FirstName");
        assertEquals(file.enterFirstName(firstname), true, "Opps!! unable to enter first name");

        //Step 5: Enter valid Lastname
        String lastname = prop.getProperty("config_LastName");
        assertEquals(file.enterLastName(lastname), true, "Opps!! unable to enter last name");

        //Step 6: Enter valid EEID
        String eeID = prop.getProperty("config_EEID");
        assertEquals(file.enterEEID(eeID), true, "Opps!! unable to enter user name");

        //Step 7: Enter valid Email
        String jobzone = "Freezer";
        assertEquals(file.enterJobzone(jobzone), true, "Opps!! unable to enter emailID");

        //Step 8: Enter valid PWd
        String PWD = prop.getProperty("config_PWD ");
        assertEquals(file.enterPwd(PWD), true, "Opps!! unable to enter PWd");

        //Step 9: Enter Confirm Pwd
        String Confirmpwd = prop.getProperty("config_Confirmpwd");
        assertEquals(file.enterConPassword(Confirmpwd), true, "Opps!! unable to enter Confirm Pwd");

        //Step 10: Enter valid Barcode
        String BarCode = prop.getProperty("config_BarCode");
        assertEquals(file.enterBarCode(BarCode), true, "Opps!! unable to enter Barcode");

        //Step 11: Enter valid Locker
        String LockerNumber = prop.getProperty("config_LockerNumber");
        assertEquals(file.enterLockerNo(LockerNumber), true, "Opps!! unable to enter Locker");

        //Step 12: Enter valid Dept#
        String DeptNumber = prop.getProperty("config_DeptNumber");
        assertEquals(file.enterDept(DeptNumber), true, "Opps!! unable to enter Dept#");

        //Step 13: Enter Location
        String Loc = prop.getProperty("config_Loc");
        assertEquals(file.enterLocation(Loc), true, "Opps!! unable to enter Location");

        //Step 14: Enter valid CombinationNum
        String CombinationNum = prop.getProperty("config_CombinationNum");
        assertEquals(file.enterCombinationNo(CombinationNum), true, "Opps!! unable to enter CombinationNum");

        //Step 15: Enter DateofHire
        //String enterDtofHire = prop.getProperty("config_Dt");;
        assertEquals(file.enterDtofHire(), true, "Opps!! unable to enter DateofHire");

        //Step 16: Image Upload
        //assertEquals(file.imageUpLoad(), true, "Opps!! unable to attach image");

       //Step 16: Click valid clickSaveClose
      //  assertEquals(file.clickSaveClose(), true, "Opps!! unable to enter SaveClose");


    }
}
