public class Controller {
    private MovieCollection movieCollection = new MovieCollection();

    public void addMovie(Movie movie) {
        movieCollection.addMovie(movie);
    }

    public String printMovieList() {
        return movieCollection.printMovieList();
    }

    public String findMovie(String input) {
        String printString = "";
        for (Movie movie : movieCollection.findMovie(input)) {
            printString += movie.toString() + "\n";
        }
        return printString;
    }

    public void removeMovie(String input) {
        movieCollection.removeMovieFromList(input);
    }

//    public void editMovieFromList(String input) {
//        movieCollection.editMovieFromList(input);
//    }

    public Movie editMovieFromList(String movieTitle) {
        return movieCollection.editMovieFromList(movieTitle);
    }


}
