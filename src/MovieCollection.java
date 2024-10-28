import java.util.ArrayList;
import java.util.Scanner;

public class MovieCollection {
    private ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

    public ArrayList<Movie> getMovieArrayList() {
        return movieArrayList;
    }

    public void addMovie(Movie movie) {
        movieArrayList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieArrayList.remove(movie);
    }

    public void printMovieList() {
        int counter = 0;
        for (Movie i : movieArrayList) {
            counter++;
            System.out.println(counter + ". " + i);
        }
    }

    public void findMovie(String input) {
        for (Movie i : movieArrayList) {
            if (i.getName().toLowerCase().contains(input)) {
                System.out.println("Found movie!");
                System.out.println(i);
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
    }

    public void removeMovieFromList(String input) {
        for (Movie i : movieArrayList) {
            if (i.getName().toLowerCase().contains(input)) {
                System.out.println("Found movie!");
                System.out.println(i);
                removeMovie(i);
                System.out.println("Has been removed");
                break;
            } else {
                System.out.println("Error: movie not found, be more specific");
            }
        }
    }

    //Stop using scanner, make method in ui
    public void editMovieFromList(String input) {
        Scanner scanner = new Scanner(System.in);
        for (Movie i : movieArrayList) {
            if (i.getName().toLowerCase().contains(input)) {
                System.out.println("Found movie!");
                System.out.println(i);
                System.out.println("Please change the data you would like to edit and press ENTER");
                System.out.println("Title: " + i.getName());
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) {
                    i.setName(newTitle);
                }
                System.out.println("Director: " + i.getDirector());
                String newDirector = scanner.nextLine();
                if (!newDirector.isEmpty()) {
                    i.setDirector(newDirector);
                }
                System.out.println("Is it in colour: " + i.getIsInColor());
                String newIsInColor = scanner.nextLine();
                if (!newIsInColor.isEmpty()) {
                    i.setIsInColor(newIsInColor);
                }
                System.out.println("Genre: " + i.getGenre());
                String newGenre = scanner.nextLine();
                if (!newGenre.isEmpty()) {
                    i.setGenre(newGenre);
                }
                System.out.println("year: " + i.getYear());
                String newYear = scanner.nextLine();
                if (!newYear.isEmpty()) {
                    int ko = Integer.parseInt(newYear);
                    i.setYear(ko);

                }
                System.out.println("Length in minutes: " + i.getLengthInMinutes());
                String newLengthInMinutes = scanner.nextLine();
                if (!newLengthInMinutes.isEmpty()) {
                    int minuteChange = Integer.parseInt(newLengthInMinutes);
                    i.setLengthInMinutes(minuteChange);
                }

            }
        }
    }
}


