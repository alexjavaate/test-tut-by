package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static DriverSingleton instance;
    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private WebDriver driver;

    private DriverSingleton() {}

    public static synchronized DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }
        return instance;
    }

    public WebDriver getDriver() {
        if (driver == null){
            driver = configureDriver(initDriver());
            DRIVER_THREAD_LOCAL.set(driver);
        }
        return DRIVER_THREAD_LOCAL.get();
    }

    public void closeDriver() {
        DRIVER_THREAD_LOCAL.get().close();
        DRIVER_THREAD_LOCAL.remove();
        driver = null;
    }

    private WebDriver initDriver() {
        String browserType = System.getProperty("BROWSER_TYPE", "CHROME");
        switch (browserType){
            case "CHROME" :
                return new ChromeDriver();
            case "FF" :
                return new FirefoxDriver();
            case "OPERA" :
                return new OperaDriver();
            default:
                throw new RuntimeException("Not supported browser type");
        }
    }

    private WebDriver configureDriver(WebDriver driver) {
        long implicitWait = Long.parseLong(System.getProperty("IMPLICIT_WAIT", "10"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return driver;
    }
}
