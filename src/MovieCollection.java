import java.util.ArrayList;
import java.util.Scanner;

public class MovieCollection {
    private ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

    public ArrayList<Movie> getMovieArrayList() {
        return movieArrayList;
    }

    public void addMovie(Movie movie) {
        movieArrayList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieArrayList.remove(movie);
    }

    public String printMovieList() {
        int counter = 0;
        String stringprint = "";
        for (Movie movie : movieArrayList) {
            counter++;
             stringprint  += counter + ". " + movie.toString() + "\n";
        }
        if (movieArrayList.isEmpty()) {
            return "movielist is empty";
        }
        return  stringprint;
    }

    public ArrayList<Movie> findMovie(String input) {
        ArrayList<Movie> foundMovies = new ArrayList<Movie>();
        for (Movie movie : movieArrayList) {
            if (movie.getName().contains(input)) {
                foundMovies.add(movie);
            }
        }
        if (!foundMovies.isEmpty()){
            return foundMovies;
        }
        return null;
    }

    public void removeMovieFromList(String input) {
        for (Movie movie : movieArrayList) {
            if (movie.getName().toLowerCase().contains(input)) {
                System.out.println("Found movie!");
                System.out.println(movie);
                removeMovie(movie);
                System.out.println("Has been removed");
                break;
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
    }

    //Stop using scanner, make method in ui
    public Movie editMovieFromList(String movieName) {
        for (Movie movie : movieArrayList) {
            if (movie.getName().toLowerCase().equalsIgnoreCase(movieName)) {
                return movie;
                }
            }
        return null;
        }
    }



