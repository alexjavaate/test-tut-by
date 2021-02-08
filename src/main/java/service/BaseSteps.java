package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.MainPage;

public class BaseSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickPosterLink() {
        MainPage mainPage = new MainPage();
        logger.info("Navigate to Poster page");
        mainPage.getAfishaLink().click();
    }
}
