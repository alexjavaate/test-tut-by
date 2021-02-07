package util;

public enum Genre {

    COMEDY("Комедия"),
    ACTION("Боевик"),
    FANTASY("Фэнтези"),
    FICTION("Фантастика"),
    ANIME("Аниме"),
    HORROR("Ужасы"),
    THRILLER("Триллер"),
    DRAMA("Драма"),
    MELODRAMA("Мелодрама"),
    DETECTIVE("Детектив");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre()
    {
        return genre;
    }
}
