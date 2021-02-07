import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import services.PropertyReader;

public enum DriverSingleton {
    DRIVER_SINGLETON

    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            String driverType = PropertyReader.getProperty("driver.type");
            driver = getDriverType(driverType);
            return driver;
        }
        return driver;
    }
}
