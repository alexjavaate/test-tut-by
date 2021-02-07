package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.MainPage;

public class MainPageSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickAfishaLink() {
        MainPage mainPage = new MainPage();
        logger.info("Navigate to Afisha page");
        mainPage.getAfishaLink().click();

    }
}
