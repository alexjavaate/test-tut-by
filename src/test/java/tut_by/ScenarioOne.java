package tut_by;

import org.testng.annotations.Test;
import java.util.List;
import static util.Genre.COMEDY;

public class ScenarioOne extends BaseTest {

    @Test
    public void testGenreFilter() {
        onlineCinemaPageStep.clickGenreFilmDropDown();
        onlineCinemaPageStep.chooseGenreFilms(COMEDY.getGenre());
        List<String> descriptions = onlineCinemaPageStep.getAllDescriptions();
        verifyFiltering(descriptions, COMEDY.getGenre());
    }
}
