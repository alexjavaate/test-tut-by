package tut_by;

import org.testng.annotations.Test;
import util.Genre;

import java.util.List;

public class ScenarioTwo extends BaseTest {

    @Test
    public void testGenresOfSerials() {
        onlineCinemaPageStep.clickSerialLink();
        onlineCinemaPageStep.clickGenreSerialDropDown();
        onlineCinemaPageStep.chooseGenreSerial(Genre.FANTASY.getGenre());

        List<String> descriptions = onlineCinemaPageStep.getAllDescriptions();
        verifyFiltering(descriptions, Genre.FANTASY.getGenre());
    }
}
