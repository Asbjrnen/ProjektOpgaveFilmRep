import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MovieCollectionTest {

    @Test
    void getMovieArrayList() {
        MovieCollection movieCollection1 = new MovieCollection();
        MovieCollection movieCollection2 = new MovieCollection();
        MovieCollection movieCollection3 = new MovieCollection();
        Movie movie1 = new Movie("john","mr",1990,"yes",50,"Horror");
        Movie movie2 = new Movie("ko","awd",10,"no",2,"rror");
        Movie movie3 = new Movie("john","r",10,"o",30,"ror");

        movieCollection2.addMovie(movie1);

        movieCollection3.addMovie(movie2);
        movieCollection3.addMovie(movie3);

        int actualSize1 = movieCollection1.getMovieArrayList().size();
        int actualSize2 = movieCollection2.getMovieArrayList().size();
        int actualSize3 = movieCollection3.getMovieArrayList().size();

        int expectedSize1 = 0;
        int expectedSize2 = 1;
        int expectedSize3 = 2;

        assertEquals(actualSize1, expectedSize1);
        assertEquals(actualSize2, expectedSize2);
        assertEquals(actualSize3, expectedSize3);
    }

    @Test
    void addMovie() {

        MovieCollection movieCollection = new MovieCollection();
        Movie movie1 = new Movie("boen","Bo",1990,"yes",50,"Horror");
        Movie movie2 = new Movie("en","B",10,"no",0,"rror");
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);

        int actualSize = movieCollection.getMovieArrayList().size();
        int expectedSize = 2;

        assertEquals(actualSize, expectedSize);
    }
}