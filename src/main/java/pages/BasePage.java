package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver webDriver;

    public BasePage() {
        webDriver = DriverSingleton.getInstance().getDriver();
        PageFactory.initElements(webDriver, this);
    }
}
