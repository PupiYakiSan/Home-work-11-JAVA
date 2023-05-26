package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();
    MovieManager managerLimit = new MovieManager(6);

    MovieItem item1 = new MovieItem("Бладшот", "боевик", "картинка1");
    MovieItem item2 = new MovieItem("Вперед", "мультфильм", "картинка2");
    MovieItem item3 = new MovieItem("Отель Белград", "комедия", "картинка3");
    MovieItem item4 = new MovieItem("Джентльмены", "боевик", "картинка4");
    MovieItem item5 = new MovieItem("Человек-Невидимка", "ужасы", "картинка5");
    MovieItem item6 = new MovieItem("Тролли. Мировой тур", "мультфильм", "картинка6");
    MovieItem item7 = new MovieItem("Номер один", "комедия", "картинка7");

    @Test
    public void addZeroFilm() {

        MovieItem[] expected = {};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {

        manager.addNewFilm(item1);

        MovieItem[] expected = {item1};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTwoFilm() {

        manager.addNewFilm(item1);
        manager.addNewFilm(item2);

        MovieItem[] expected = {item1, item2};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addManyFilm() {

        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFindItemZeroDefaultLimit() {

        MovieItem[] expected = {};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemOneDefaultLimit() {

        manager.addNewFilm(item1);

        MovieItem[] expected = {item1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemLessDefaultLimit() {

        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);

        MovieItem[] expected = {item3, item2, item1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemEquallyDefaultLimit() {

        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);

        MovieItem[] expected = {item5, item4, item3, item2, item1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemMoreDefaultLimit() {

        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemZeroLimit() {

        MovieItem[] expected = {};
        MovieItem[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemOneLimit() {

        managerLimit.addNewFilm(item1);

        MovieItem[] expected = {item1};
        MovieItem[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemLessLimit() {

        managerLimit.addNewFilm(item1);
        managerLimit.addNewFilm(item2);
        managerLimit.addNewFilm(item3);

        MovieItem[] expected = {item3, item2, item1};
        MovieItem[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemEquallyLimit() {

        managerLimit.addNewFilm(item1);
        managerLimit.addNewFilm(item2);
        managerLimit.addNewFilm(item3);
        managerLimit.addNewFilm(item4);
        managerLimit.addNewFilm(item5);
        managerLimit.addNewFilm(item6);

        MovieItem[] expected = {item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFindItemMoreLimit() {

        managerLimit.addNewFilm(item1);
        managerLimit.addNewFilm(item2);
        managerLimit.addNewFilm(item3);
        managerLimit.addNewFilm(item4);
        managerLimit.addNewFilm(item5);
        managerLimit.addNewFilm(item6);
        managerLimit.addNewFilm(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3, item2};
        MovieItem[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
