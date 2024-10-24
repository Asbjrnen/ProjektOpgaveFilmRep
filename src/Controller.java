public class Controller {
    private MovieCollection movieCollection = new MovieCollection();

    public void addMovie (Movie movie){
        movieCollection.addMovie(movie);
    }
    public void printMovieList(){
        movieCollection.printMovieList();
    }
    public void findMovie(String input){
        movieCollection.findMovie(input);
    }
    public void removeMovie(String input){
        movieCollection.removeMovieFromList(input);
    }
    public void editMovieFromList(String input){
        movieCollection.editMovieFromList(input);
    }

}
