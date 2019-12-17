package nopCommerceTestCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;

public class ExtentReportDemo {

    private ExtentHtmlReporter htmlReporter; //used for look and fill of report
    private ExtentReports extent; // used to add data/logs in report
    private ExtentTest test; //used for add/update test status in report
    private static WebDriver driver;

    @BeforeClass
    public void reportSetUp() throws IOException {
         //   FileUtils.deleteDirectory(new File(System.getProperty("user.dir") + "\\Reports"));

        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "\\Reports\\ExtendReportDemo.html");
        htmlReporter.config().setDocumentTitle("Automation Testing"); //Title of report
        htmlReporter.config().setReportName("Extent Report Understanding to Rajani"); //Name of report
        htmlReporter.config().setTheme(Theme.STANDARD); //set report theme
        String css = ".r-img {width: 50%;}"; //set width for failure image
        htmlReporter.config().setCSS(css);


        extent = new ExtentReports();

        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester Name", "Nishit Trivedi");
        extent.setSystemInfo("HostName", "Nopcommerce");
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("Browser Name", "Chrome");
        extent.setSystemInfo("Trainer", "Nishit");
        extent.setSystemInfo("Trainee", "Rajani");

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }


    @BeforeMethod
    public void browserSetUp()  {

        driver.get("https://demo.nopcommerce.com/");
           }

  @Test //PASS TestCASE
    public void test()throws IOException, InterruptedException {

        test = extent.createTest("Test Passed", "Verify Title");
        test.assignCategory("Module 1");

        test.log(Status.INFO, "Test Case Started");

        Assert.assertFalse(driver.getTitle().isEmpty(), "Title is Empty");
        test.log(Status.PASS, "Title is not Empty1");

        test.log(Status.INFO, "Test Case Ended");
    }

   @Test
    public void test2() {
        test = extent.createTest("Test Failed", "Verify Title");
        test.assignCategory("Module 1"); //By categories

        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
        test.log(Status.PASS, "Valid Title is displaying");

        //Step2
        Assert.assertFalse(driver.getTitle().isEmpty(), "Title is Empty");
        test.log(Status.PASS, "Title is not Empty");
    }


    @Test
    public void test3() {
        test = extent.createTest("Test Skipped");
        test.assignCategory("Module 1");

        throw new SkipException("Skipping - This is not ready for testing ");
    }

    @AfterMethod(alwaysRun = true)
    public void testResults(ITestResult result) throws IOException, InterruptedException {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, result.getName() + " Test Case Failed"); //Get name of test case
            test.log(Status.FAIL, "Failed Test Case Error: " + result.getThrowable()); //add error in report

            MediaEntityModelProvider screenshot = createScreenCaptureFromPath(getScreenshot(driver, result.getMethod().getMethodName())).build();
            test.log(Status.FAIL, "Screenshot", screenshot);

            //test.addScreenCaptureFromPath(ExtentReportDemo.getScreenshot(driver, result.getMethod().getMethodName())); // add failure image in report
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, result.getName() + " Test Case Skipped");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, result.getName() + " Test Case Passed");
        }
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void terminateReport() {
        driver.quit();
        extent.flush();
    }

    private static String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);

        String destination = System.getProperty("user.dir") + "\\Reports\\failureImages\\" + screenShotName + "_" + currentDate + ".png";
        File fileDestination = new File(destination);
        FileUtils.copyFile(source, fileDestination);
        System.out.println("Image Path: " + destination);
        return destination;
    }


}



