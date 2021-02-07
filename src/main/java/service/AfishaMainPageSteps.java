package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.AfishaMainPage;
import util.Waiters;

public class AfishaMainPageSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickOnlineCinemaLink() {
        AfishaMainPage afishaMainPage = new AfishaMainPage();
        logger.info("Navigate to Online cinema page");
        Waiters.waitForElementDisplayed(afishaMainPage.getOnlineCinemaLink());
        afishaMainPage.getOnlineCinemaLink().click();
    }
}
