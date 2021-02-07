package service;

import pages.MainPage;

public class MainPageStep {

    public void clickAfishaLink() {
        MainPage mainPage = new MainPage();
        mainPage.getAfishaLink().click();
    }
}
