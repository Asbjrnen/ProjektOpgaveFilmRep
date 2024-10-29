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

    public void printMovieList() {
        int counter = 0;
        for (Movie movie : movieArrayList) {
            counter++;
            System.out.println(counter + ". " + movie);
        }
    }

    public void findMovie(String input) {
        for (Movie movie : movieArrayList) {
            if (movie.getName().toLowerCase().contains(input)) {
                System.out.println("Found movie!");
                System.out.println(movie);
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
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
            if (movie.getName().toLowerCase().equals(movieName)) {
                return movie;
                }

            }
        return null;
        }
    }



