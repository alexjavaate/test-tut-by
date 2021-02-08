package service;

import driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineCinemaPage;
import util.Waiters;
import java.util.ArrayList;
import java.util.List;

public class OnlineCinemaPageStep {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void clickGenreFilmDropDown() {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.getGenreDropDown().click();
    }

    public void clickGenreSerialDropDown() {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.getGenreSerialDropDown().click();
    }

    public void clickGenreAnimationDropDown() {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.getGenreAnimationDropDown().click();
    }

    public void chooseGenreFilms(String genre) {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.findGenreElement(genre).click();
        logger.info("Select film genre {}", genre);
        actionPerform();
    }

    public void chooseGenreSerial(String genre) {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.findGenreSerial(genre).click();
        logger.info("Select serial genre {}", genre);
        actionPerform();
    }

    public void chooseGenreAnimation(String genre) {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.findGenreAnimation(genre).click();
        logger.info("Select animation genre {}", genre);
        actionPerform();
    }

    public List<String> getAllDescriptions() {
        logger.info("Get descriptions of all filtered elements");
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        List<WebElement> filmsList = onlineCinemaPage.getDescriptions();
        List<String> descriptions = new ArrayList<>();
        for (WebElement film : filmsList) {
            descriptions.add(film.getText());
        }
        return descriptions;
    }

    public void clickSerialLink() {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.getSerialLink().click();
        logger.info("Switch to serial link");
    }

    public void clickAnimationLink() {
        OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage();
        onlineCinemaPage.getAnimationLink().click();
        logger.info("Switch to animation link");
    }

    private void actionPerform() {
        Actions actions = new Actions(DriverSingleton.getInstance().getDriver());
        actions.sendKeys(Keys.ESCAPE);
        actions.perform();
        Waiters.waitForPageLoaded();
    }
}
