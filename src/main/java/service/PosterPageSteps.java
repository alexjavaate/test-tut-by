package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.PosterPage;
import util.Waiters;

public class PosterPageSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickOnlineCinemaLink() {
        PosterPage posterPage = new PosterPage();
        logger.info("Navigate to Online cinema page");
        Waiters.waitForElementDisplayed(posterPage.getOnlineCinemaLink());
        posterPage.getOnlineCinemaLink().click();
    }
}
