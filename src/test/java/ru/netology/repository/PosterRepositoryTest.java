package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmsPoster;

import static org.junit.jupiter.api.Assertions.*;

class PosterRepositoryTest {
    private PosterRepository repository = new PosterRepository();

    @Test
    public void shouldSave(){
        FilmsPoster first = new FilmsPoster(1, "first", "comedy", 10);
        repository.save(first);
        FilmsPoster[] actual = repository.findAll();
        FilmsPoster[] expected = new FilmsPoster[]{first};
        assertArrayEquals(expected,actual);


    }

    @Test
    public void shouldFindById(){
        FilmsPoster first = new FilmsPoster(1, "first", "comedy", 10);
        FilmsPoster second = new FilmsPoster(2, "second", "comedy", 15);
        FilmsPoster third = new FilmsPoster(3, "third", "comedy", 23);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.findById(1);
        FilmsPoster[] actual = repository.findAll();
        FilmsPoster[] expected = new FilmsPoster[]{first};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldClear() { //следует очистить
        FilmsPoster first = new FilmsPoster(1, "first", "comedy", 10);
        FilmsPoster second = new FilmsPoster(2, "second", "comedy", 15);
        FilmsPoster third = new FilmsPoster(3, "third", "comedy", 23);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.removeAll();
        FilmsPoster[] actual = repository.findAll();
        FilmsPoster[] expected = new FilmsPoster[]{};
        assertArrayEquals(expected, actual);
    }


}