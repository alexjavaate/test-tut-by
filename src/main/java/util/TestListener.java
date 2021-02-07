package util;

import driver.DriverSingleton;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

    Logger logger = LogManager.getLogger(TestListener.class);

    private final long time = System.currentTimeMillis();
    private static final String FILE_PATH = ".//test-output/screenshots/screenshot";
    private static final String FILE_VIEW_PATH = "screenshots/screenshot";
    private static final String FILE_EXT = ".png";

    @Override
    public void onTestStart(ITestResult iTestResult) {
        iTestResult.getName();
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.error(iTestResult.getName() + " failure" + takeScreenshot());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    private String takeScreenshot() {
        WebDriver driver = DriverSingleton.getInstance().getDriver();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(FILE_PATH + time + FILE_EXT));
        }catch (IOException e) {
            e.printStackTrace();
        }
        return FILE_VIEW_PATH+time+FILE_EXT;
    }
}
