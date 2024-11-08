package models;

import data_source.FileHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    private MovieCollection movieCollection;
    private FileHandler fileHandler = new FileHandler();

    public Controller() throws FileNotFoundException {
        this.movieCollection = new MovieCollection();
    }
    public ArrayList<Movie> getMovieCollectionList() {
        return movieCollection.getMovieCollectionList();
    }

    public void sortTitle() throws IOException {
        movieCollection.getMovieCollectionList().sort(Movie.titleComparator);
        saveFile();
    }
    public void readFile() throws FileNotFoundException {
        for(Movie movie : fileHandler.readFile()){
            movieCollection.addMovie(movie);
        }
    }
    public void saveFile() throws IOException {
        fileHandler.saveFile(movieCollection.getMovieCollectionList());
    }

    public void addMovie(String title, String director, int length, int year, String genre, boolean isColor) throws IOException {
        Movie movie = new Movie(title, director, length, year, genre, isColor);
        movieCollection.addMovie(movie);
        saveFile();
    }

    public void editMovie(String title, String newDirector, int newLength, int newYear, String newGenre, boolean newIsColor) throws IOException {
        List<Movie> foundMovies = movieCollection.searchMovies(title);

        if (!foundMovies.isEmpty()) {
            Movie movie = foundMovies.get(0);
            movieCollection.deleteMovie(movie);

            Movie updatedMovie = new Movie(title, newDirector, newLength, newYear, newGenre, newIsColor);
            movieCollection.addMovie(updatedMovie);
        } else {
            System.out.println("No movie found with the title: " + title);
        }
        saveFile();
    }

    public void deleteMovie(String title) throws IOException {
        List<Movie> foundMovies = movieCollection.searchMovies(title);

        if (!foundMovies.isEmpty()) {
            Movie movieToDelete = foundMovies.get(0);
            movieCollection.deleteMovie(movieToDelete);
        } else {
            System.out.println("No movie found with the title: " + title);
        }
        saveFile();
    }

    public List<Movie> getAllMovies() {
        return movieCollection.getMovieCollectionList();
    }

    public ArrayList<Movie> searchMovies(String title) {
        return movieCollection.searchMovies(title);
    }
}
