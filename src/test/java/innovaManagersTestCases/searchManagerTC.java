package innovaManagersTestCases;

import SetUp.BaseTest;
import innovaManagersPO.searchManagerPO;
import innovaSignInTestCases.innovaSignInTC;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class searchManagerTC extends BaseTest {
    public searchManagerTC() {}
        public searchManagerTC(WebDriver passDriver) {driver = passDriver;}

    @Test
    public void searchManagerTest() throws Exception {


        innovaSignInTC SignIn1 = new innovaSignInTC(driver);
        SignIn1.innovaSignInTC();
        searchManagerPO searchMgr_Obj = new searchManagerPO(driver);


        //Step 1: Click On Users
        Assert.assertEquals(searchMgr_Obj.clickUsers(), true, "Opps!! unable to click Users");
        //Step 2: Click On Managers
        assertEquals(searchMgr_Obj.clickManagers(), true, "Opps!! unable to click Managers");

        //Step 3 :: Enter On Search
        String search = "Manager1";
        Assert.assertEquals(searchMgr_Obj.enterSearchName(search), true, "Opps!! unable to Enter On Search");

        Assert.assertEquals(searchMgr_Obj.clickAlert(), true, "Opps!! unable to click alert ok");

    }

}
