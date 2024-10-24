public class Movies {

    private String name;
    private String director;
    private int year;
    private String isInColor;
    private int lengthInMinutes;
    private String genre;



    public Movies(String name, String director, int year, String isInColor, int lengthInMinutes, String genre) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public String getDirector() {
        return director;
    }
    public int getYear() {
        return year;
    }
    public String getIsInColor(){
        return isInColor;
    }
    public int getLengthInMinutes(){
        return lengthInMinutes;
    }
    public String getGenre() {
        return genre;
    }

}
