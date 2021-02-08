package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PosterPage extends BasePage {

    @FindBy(xpath = "//ul[@class='main_menu']//a[contains(@href,'online-cinema')]")
    private WebElement onlineCinemaLink;

    public WebElement getOnlineCinemaLink() {
        return onlineCinemaLink;
    }

}
