package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.PosterPage;
import util.Waiters;

public class PosterMainPageSteps {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickOnlineCinemaLink() {
        PosterPage posterMainPage = new PosterPage();
        logger.info("Navigate to Online cinema page");
        Waiters.waitForElementDisplayed(posterMainPage.getOnlineCinemaLink());
        posterMainPage.getOnlineCinemaLink().click();
    }
}
