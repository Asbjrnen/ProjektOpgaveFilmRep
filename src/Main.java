public class Main {
    public static void main(String[] args) {
        FilmRepetoire filmRepetoire = new FilmRepetoire();
        filmRepetoire.playMovie();

        MovieCollection movieCollection = new MovieCollection();
        Movie movie1 = new Movie("ok","john",1999,"yes",90,"horror");
        movieCollection.addMovie(movie1);
        System.out.println(movieCollection.toString());


    }
}