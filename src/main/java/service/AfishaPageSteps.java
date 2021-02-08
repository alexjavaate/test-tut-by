package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.AfishaPage;
import util.Waiters;

public class AfishaPageSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickOnlineCinemaLink() {
        AfishaPage afishaPage = new AfishaPage();
        logger.info("Navigate to Online cinema page");
        Waiters.waitForElementDisplayed(afishaPage.getOnlineCinemaLink());
        afishaPage.getOnlineCinemaLink().click();
    }
}
