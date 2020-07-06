package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmsPoster;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    PosterManager manager = new PosterManager();
    FilmsPoster first = new FilmsPoster(1, "first", "comedy", 10);
    FilmsPoster second = new FilmsPoster(2, "second", "comedy", 15);
    FilmsPoster third = new FilmsPoster(3, "third", "comedy", 23);
    FilmsPoster fourth = new FilmsPoster(4, "fourth", "comedy", 1);
    FilmsPoster fifth = new FilmsPoster(5, "fifth", "comedy", 17);
    FilmsPoster sixth = new FilmsPoster(6, "sixth", "comedy", 19);
    FilmsPoster seventh = new FilmsPoster(7, "seventh", "comedy", 21);
    FilmsPoster eighth = new FilmsPoster(8, "eighth", "comedy", 22);
    FilmsPoster ninth = new FilmsPoster(9, "ninth", "comedy", 23);
    FilmsPoster tenth = new FilmsPoster(10, "tenth", "comedy", 12);
    FilmsPoster eleventh = new FilmsPoster(11, "eleventh", "comedy", 13);


    @BeforeEach
    public void setUp(){ // Настроить
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
    }

    @Test
    public void showInReverseOrder(){// Показать в обратном порядке 10
        manager.getAll10LatestMovies();
        FilmsPoster[] actual = manager.getAll10LatestMovies();
        FilmsPoster[] expected = new FilmsPoster[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showInReverseOrderLess10(){// Показать в обратном порядке менее 10
        manager.setPosterLength(5);
        manager.getAll10LatestMovies();
        FilmsPoster[] actual = manager.getAll10LatestMovies();
        FilmsPoster[] expected = new FilmsPoster[]{fifth,fourth,third,second,first};
        assertArrayEquals(expected, actual);

    }


}