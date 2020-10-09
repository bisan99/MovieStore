package bisan.android.assign1.model;

public class Movie {
    private String title;
    private int year;
    private String genre;

    public Movie(String title,int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String Print(){
        return "Title: " + title + ", Year: " + year + ", Genere: " + genre +"\n" ;
    }

}