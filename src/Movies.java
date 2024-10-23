public class Movies {

    private String name;
    private String description;
    private int year;
    private String genre;



    public Movies(String name, String description, int year, String genre) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }


}
