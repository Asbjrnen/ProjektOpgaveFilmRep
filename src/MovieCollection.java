import java.util.ArrayList;
import java.util.List;

public class MovieCollection {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void deleteMovie(Movie movie) {
        movies.remove(movie);
    }

    public List<Movie> getMovieCollectionList() {
        return movies;
    }

    public List<Movie> searchMovies(String title) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }
}
