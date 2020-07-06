package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.FilmsPoster;

@NoArgsConstructor
@Data
public class PosterManager {
    private FilmsPoster[] films = new FilmsPoster[0];

    private int posterLength10 = 10;
    private int posterLength;

    public PosterManager(int posterLength) {
        this.posterLength = posterLength;
    }

    public void add(FilmsPoster film) {    // Метод добавления
        int length = films.length + 1;
        FilmsPoster[] movies = new FilmsPoster[length];

        System.arraycopy(films, 0, movies, 0, films.length);

        int lastIndex = movies.length - 1;
        movies[lastIndex] = film;

        films = movies;
    }

    public FilmsPoster[] getAll10LatestMovies() {   // Получить все 10 фильмов в обратном порядке
        FilmsPoster[] result = new FilmsPoster[posterLength10];

        for (int i = 0; i < posterLength10; i++) {
            int index = posterLength10 - 1 - i;
            result[i] = films[index];
        }

        for (int i = 0; i < posterLength; i++) {
            int index = posterLength - 1 - i;
            result[i] = films[index];
        }
        return result;


    }

}
