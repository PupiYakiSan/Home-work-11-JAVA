package org.example;

public class MovieItem {

    private String nameFilm;
    private String genreFilm;
    private String linkPictureFilm;

    public MovieItem(String nameFilm, String genreFilm, String linkPictureFilm) {
        this.nameFilm = nameFilm;
        this.genreFilm = genreFilm;
        this.linkPictureFilm = linkPictureFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public String getLinkPictureFilm() {
        return linkPictureFilm;
    }

    public void setLinkPictureFilm(String linkPictureFilm) {
        this.linkPictureFilm = linkPictureFilm;
    }
}
