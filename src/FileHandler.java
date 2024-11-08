import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private File file = new File("MovieList.txt");
    private Scanner scanner = new Scanner(file);

    public FileHandler() throws FileNotFoundException {
    }

    public ArrayList<Movie> readFile() throws FileNotFoundException {
        ArrayList<Movie> movies = new ArrayList<>();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split(",");
            String title = words[0];
            String director = words[1];
            int length = Integer.parseInt(words[2]);
            int year = Integer.parseInt(words[3]);
            String genre = words[4];
            boolean isColor = false;
            String tempColor = words[5];
            if (tempColor.equals("true")){
                isColor = true;
            } else {
                isColor = false;
            }
            movies.add(new Movie(title, director, length, year, genre, isColor));
        }
        return movies;
    }
    public void saveFile(ArrayList<Movie> movies) throws IOException {
        FileWriter fileWriter = new FileWriter("MovieList.txt");
        for (Movie movie : movies) {
            fileWriter.write(movie.getTitle() + "," + movie.getDirector() + "," + movie.getLength() + "," + movie.getYear()
            + "," + movie.getGenre() + "," + movie.isColor() + "\n");
        }
        fileWriter.close();
    }


}
