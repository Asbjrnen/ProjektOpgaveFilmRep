package models;
import java.util.Comparator;


public class Movie {

    public static Comparator<Movie> titleComparator = Comparator.comparing(Movie::getTitle)
            .thenComparing(Movie::getYear)
            .thenComparing(Movie::getDirector);
    private String title;
    private String director;
    private int length;
    private int year;
    private String genre;
    private boolean isColor;

    public Movie(String title, String director, int length, int year, String genre, boolean isColor) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.year = year;
        this.genre = genre;
        this.isColor = isColor;
    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getYear() {
        return year;
    }
    public int getLength() {
        return length;
    }
    public String getGenre() {
        return genre;
    }
    public boolean isColor() {
        return isColor;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Length: " + length + " mins, Year: " + year + ", Genre: " + genre + ", Color: " + (isColor ? "Yes" : "No");
    }
}
