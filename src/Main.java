public class Main {
    public static void main(String[] args) {
        FilmRepetoire filmRepetoire = new FilmRepetoire();
        filmRepetoire.playMovie();

        MovieCollection movieCollection = new MovieCollection();
        Movie movie1 = new Movie("ok","john",1999,"yes",90,"horror");
        Movie movie2 = new Movie("bawjd","johwww",99,"yes",90,"rror");
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.printMovieList();


    }
}