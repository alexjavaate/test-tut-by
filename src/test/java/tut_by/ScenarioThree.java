package tut_by;

import org.testng.annotations.Test;
import util.Genre;
import java.util.List;

public class ScenarioThree extends BaseTest {

    @Test
    public void testGenresOfAnimation() {
        onlineCinemaPageStep.clickAnimationLink();
        onlineCinemaPageStep.clickGenreAnimationDropDown();
        onlineCinemaPageStep.chooseGenreAnimation(Genre.MELODRAMA.getGenre());
        List<String> descriptions = onlineCinemaPageStep.getAllDescriptions();
        verifyFiltering(descriptions, Genre.MELODRAMA.getGenre());
    }
}
