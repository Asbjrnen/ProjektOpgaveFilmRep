public class Movie {
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

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Length: " + length + " mins, Year: " + year + ", Genre: " + genre + ", Color: " + (isColor ? "Yes" : "No");
    }
}
