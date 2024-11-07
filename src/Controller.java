import java.util.List;

public class Controller {
    private MovieCollection movieCollection;

    public Controller() {
        this.movieCollection = new MovieCollection();
    }
    public void sortTitle(){
        movieCollection.getMovieCollectionList().sort(Movie.titleComparator);
    }

    public void addMovie(String title, String director, int length, int year, String genre, boolean isColor) {
        Movie movie = new Movie(title, director, length, year, genre, isColor);
        movieCollection.addMovie(movie);
    }

    public void editMovie(String title, String newDirector, int newLength, int newYear, String newGenre, boolean newIsColor) {
        List<Movie> foundMovies = movieCollection.searchMovies(title);

        if (!foundMovies.isEmpty()) {
            Movie movie = foundMovies.get(0);
            movieCollection.deleteMovie(movie);

            Movie updatedMovie = new Movie(title, newDirector, newLength, newYear, newGenre, newIsColor);
            movieCollection.addMovie(updatedMovie);
        } else {
            System.out.println("No movie found with the title: " + title);
        }
    }

    public void deleteMovie(String title) {
        List<Movie> foundMovies = movieCollection.searchMovies(title);

        if (!foundMovies.isEmpty()) {
            Movie movieToDelete = foundMovies.get(0);
            movieCollection.deleteMovie(movieToDelete);
        } else {
            System.out.println("No movie found with the title: " + title);
        }
    }

    public List<Movie> getAllMovies() {
        return movieCollection.getMovieCollectionList();
    }

    public List<Movie> searchMovies(String title) {
        return movieCollection.searchMovies(title);
    }
}
