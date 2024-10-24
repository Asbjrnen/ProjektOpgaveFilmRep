public class Movie {

    private String name;
    private String director;
    private int year;
    private String isInColor;
    private int lengthInMinutes;
    private String genre;



    public Movie(String name, String director, int year, String isInColor, int lengthInMinutes, String genre) {
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
    public void setName(String name) {
        this.name = name;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setIsInColor(String isInColor) {
        this.isInColor = isInColor;
    }
    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString(){
        return "Name: " + name + ". Director: " + director + ". Year: " + year + ". Color: " + isInColor + ". Length: " + lengthInMinutes + " minutes" + ". Genre: " + genre;
    }

}
