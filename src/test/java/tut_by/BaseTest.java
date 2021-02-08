package tut_by;

import driver.DriverSingleton;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import service.PosterMainPageSteps;
import service.BaseSteps;
import service.OnlineCinemaPageStep;
import util.PropertyReader;

import java.util.List;

public class BaseTest {

    private static final String TUT_BY_URL = "tut.by.url";
    protected OnlineCinemaPageStep onlineCinemaPageStep = new OnlineCinemaPageStep();

    @BeforeTest
    public void setUp() {
        DriverSingleton.getInstance().getDriver().get(PropertyReader.getProperty(TUT_BY_URL));
        BaseSteps mainPageStep = new BaseSteps();
        mainPageStep.clickPosterLink();
        PosterMainPageSteps afishaMainPageSteps = new PosterMainPageSteps();
        afishaMainPageSteps.clickOnlineCinemaLink();
    }

    protected void verifyFiltering(List<String> descriptions, String genre) {
        //use softassert & add failure message
        for (String description : descriptions) {
            Assert.assertTrue(description.contains(genre));
        }
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.getInstance().closeDriver();
    }
}
