import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

    public void addMovie(Movie movie) {
        movieArrayList.add(movie);
    }
    public void removeMovie(Movie movie){
        movieArrayList.remove(movie);
    }
    public void printMovieList(){
        int counter = 0;
        for (Movie i : movieArrayList){
            counter++;
            System.out.println(counter + ". " + i);
        }
    }
    public void findMovie(String input){
        for (Movie i : movieArrayList){
            if (i.getName().toLowerCase().contains(input)){
                System.out.println("Found movie!");
                System.out.println(i);
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
    }
    public void removeMovieFromList(String input){
        for (Movie i : movieArrayList){
            if (i.getName().toLowerCase().contains(input)){
                System.out.println("Found movie!");
                System.out.println(i);
                removeMovie(i);
                System.out.println("Has been removed");
                break;
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
    }

}
