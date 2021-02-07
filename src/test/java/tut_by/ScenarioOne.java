package tut_by;

import org.testng.annotations.Test;
import util.Genre;

import java.util.List;

public class ScenarioOne extends BaseTest {

    @Test
    public void testGenreFilter() {
        onlineCinemaPageStep.clickGenreFilmDropDown();
        onlineCinemaPageStep.chooseGenreFilms(Genre.COMEDY.getGenre());

        List<String> descriptions = onlineCinemaPageStep.getAllDescriptions();
        verifyFiltering(descriptions, Genre.COMEDY.getGenre());
    }
}
