package util;

import driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waiters {

    private static final int WAIT_TIME = 15;

    public static void waitForElementDisplayed(WebElement element) {
        ExpectedCondition<Boolean> expectation = webDriver -> element.isDisplayed();
        WebDriverWait webDriverWait = new WebDriverWait(DriverSingleton.getInstance().getDriver(), WAIT_TIME);
        webDriverWait.until(expectation);
    }

    public static void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
        WebDriverWait webDriverWait = new WebDriverWait(DriverSingleton.getInstance().getDriver(), WAIT_TIME);
        webDriverWait.until(expectation);
    }

}
