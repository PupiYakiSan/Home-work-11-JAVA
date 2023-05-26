package org.example;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    private int movieLimit;

    public MovieManager() {
        movieLimit = 5;
    }

    public MovieManager(int limit) {
        movieLimit = limit;
    }

    public void addNewFilm(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (items.length < movieLimit) {
            resultLength = items.length;
        } else {
            resultLength = movieLimit;
        }
        MovieItem[] tmp = new MovieItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - i - 1];
        }
        return tmp;

    }

}
