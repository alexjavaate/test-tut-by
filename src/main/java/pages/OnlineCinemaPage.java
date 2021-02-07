package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OnlineCinemaPage extends BasePage {

    private static final String GENRE_FILM_XPATH = "//div[@id='tab-films']//span[text()='%s']";

    private static final String GENRE_SERIAL_XPATH = "//div[@id='tab-tv-series']//span[text()='%s']";

    private static final String GENRE_ANIMATION_XPATH = "//div[@id='tab-cartoons']//span[text()='%s']";

    @FindBy(xpath = "//div[@id='tab-films']//button[contains(@title, 'Жанры')]")
    private WebElement genreFilmDropDown;

    @FindBy(xpath = "//div[@id='tab-tv-series']//button[contains(@title, 'Жанры')]")
    private WebElement genreSerialDropDown;

    @FindBy(xpath = "//div[@id='tab-cartoons']//button[contains(@title, 'Жанры')]")
    private WebElement genreAnimationDropDown;


    @FindBy(xpath = "//div[@class= 'txt']//p")
    private List<WebElement> descriptions;

    @FindBy(xpath = "//a[contains(@href, 'serial')]")
    private WebElement serialLink;

    @FindBy(xpath = "//a[contains(@href, '/animation')]")
    private WebElement animationLink;

    public WebElement getGenreDropDown() {
        return genreFilmDropDown;
    }

    public WebElement getGenreSerialDropDown() {
        return genreSerialDropDown;
    }

    public WebElement getGenreAnimationDropDown() {
        return genreAnimationDropDown;
    }

    public WebElement findGenreElement(String genre) {
        return webDriver.findElement(By.xpath(String.format(GENRE_FILM_XPATH, genre)));
    }

    public WebElement findGenreSerial(String genre) {
        return webDriver.findElement(By.xpath(String.format(GENRE_SERIAL_XPATH, genre)));
    }

    public WebElement findGenreAnimation(String genre) {
        return webDriver.findElement(By.xpath(String.format(GENRE_ANIMATION_XPATH, genre)));
    }

    public List<WebElement> getDescriptions() {
        return descriptions;
    }

    public WebElement getSerialLink() {
        return serialLink;
    }

    public WebElement getAnimationLink() {
        return animationLink;
    }
}
