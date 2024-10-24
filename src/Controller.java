public class Controller {
    private MovieCollection movieCollection = new MovieCollection();

    public void addMovie (Movie movie){
        movieCollection.addMovie(movie);
    }
    public void printMovieList(){
        movieCollection.printMovieList();
    }

}
