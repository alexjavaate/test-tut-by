package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class='b-topbar-i']//a[contains(@href,'afisha')]")
    private WebElement posterLink;

    public WebElement getAfishaLink() {
        return posterLink;
    }
}
