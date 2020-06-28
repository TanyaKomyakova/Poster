package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.FilmsPoster;

@NoArgsConstructor
@Data
public class PosterManager {
    private FilmsPoster[] films = new FilmsPoster[0];

    private int amountOfFilms = 10;
    private int setAmountOfFilms;



    public void add(FilmsPoster film) {    // Метод добавления
        int length = films.length + 1;
        FilmsPoster[] movies = new FilmsPoster[length];

        System.arraycopy(films, 0, movies, 0, films.length);

        int lastIndex = movies.length - 1;
        movies[lastIndex] = film;

        films = movies;
    }

    public FilmsPoster[] getAll10LatestMovies() {   // Получить все 10 фильмов в обратном порядке
        FilmsPoster[] result = new FilmsPoster[amountOfFilms];

        for (int i = 0; i < amountOfFilms; i++) {
            int index = amountOfFilms - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

    public FilmsPoster[] getAllFilmsOfAGivenNumber() {// Получить все фильмы с заданным количеством
        FilmsPoster[] result = new FilmsPoster[setAmountOfFilms];
        for (int i = 0; i < setAmountOfFilms; i++) {
            int index = setAmountOfFilms - 1 - i;
            result[i] = films[index];
        }
        return result;
    }
}
