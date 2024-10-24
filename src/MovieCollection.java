import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

    public void addMovie(Movie movie) {
        movieArrayList.add(movie);
    }
    public void printMovieList(){
        int counter = 0;
        for (Movie i : movieArrayList){
            counter++;
            System.out.println(counter + ". " + i);
        }
    }
}
