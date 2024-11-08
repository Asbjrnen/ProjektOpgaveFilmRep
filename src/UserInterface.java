import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Controller controller;
    private Scanner scanner;

    public UserInterface() throws FileNotFoundException {
        this.controller = new Controller();
        this.scanner = new Scanner(System.in);
    }

    public void startProgram() throws IOException {
        controller.readFile();
        boolean exit = false;
        while (!exit) {
            System.out.println("--------------------------------------------");
            System.out.println("1) Add movie to your collection");
            System.out.println("2) Edit a movie in your collection");
            System.out.println("3) Delete a movie in your collection");
            System.out.println("4) View all movies in your collection");
            System.out.println("5) Search for a movie in your collection");
            System.out.println("6) Sort your collection");
            System.out.println("7) Exit your collection");
            System.out.println("--------------------------------------------");


            int choice = getIntInput("Choose an option: ");
            switch (choice) {
                case 1 -> addMovie();

                case 2 -> editMovie();

                case 3 -> deleteMovie();

                case 4 -> viewMovies();

                case 5 -> searchMovie();

                case 6 -> sort();

                case 7 -> exit = true;

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void sort () throws IOException {
        controller.sortTitle();
        viewMovies();

    }

    private int getIntInput(String userInput) {
        while (true) {
            System.out.print(userInput);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private void addMovie() throws IOException {
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter director: ");
        String director = scanner.nextLine();

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();


        boolean isColor = getIntInput("Is the movie in color?: \"\\n 1 for yes or 0 for no\"") == 1;

        int length = getIntInput("Enter length in minutes: ");

        int year = getIntInput("Enter year of creation: ");
        scanner.nextLine();

        controller.addMovie(title, director, length, year, genre, isColor);
        System.out.println("Movie added successfully");
    }

    private void editMovie() throws IOException {
        System.out.print("Enter movie title to edit: ");
        String title = scanner.next();
        int counter = 0;

        scanner.nextLine();
        ArrayList<Movie> movieArrayList = controller.searchMovies(title);


        if (!movieArrayList.isEmpty()) {
            for (Movie movie : movieArrayList) {
                counter++;
                System.out.println(counter + ". " + movie);
            }
            if (movieArrayList.size() >= 2) {
                System.out.println("Choose a number that is referring to the movie you want to edit:");
                int input = scanner.nextInt();
                scanner.nextLine();
                Movie movieToEdit = movieArrayList.get(input - 1);

                System.out.println("Enter the movie title you want to edit");
                movieToEdit.setTitle(scanner.nextLine());

                System.out.println("Enter the movie director you want to edit");
                movieToEdit.setDirector(scanner.nextLine());

                System.out.println("Enter the movie genre you want to edit");
                movieToEdit.setGenre(scanner.nextLine());

                System.out.println("Enter the color of the movie you want to edit, 1 for yes or 0 for no");
                boolean color = true;
                if (scanner.nextInt() == 1) {
                    color = true;
                } else {
                    color = false;
                }
                movieToEdit.setColor(color);

                System.out.println("Enter the movie year you want to edit");
                movieToEdit.setYear(scanner.nextInt());

                System.out.println("Enter the new length for the movie you want to edit in minutes");
                movieToEdit.setLength(scanner.nextInt());

                System.out.println("Movie edited successfully");
            } else {
                Movie movieToEdit = movieArrayList.getFirst();
                System.out.println("Enter the movie title you want to edit");
                movieToEdit.setTitle(scanner.nextLine());

                System.out.println("Enter the movie director you want to edit");
                movieToEdit.setDirector(scanner.nextLine());

                System.out.println("Enter the movie genre you want to edit");
                movieToEdit.setGenre(scanner.nextLine());

                System.out.println("Enter the color of the movie you want to edit, 1 for yes or 0 for no");
                boolean color = true;
                if (scanner.nextInt() == 1) {
                    color = true;
                } else {
                    color = false;
                }
                movieToEdit.setColor(color);

                System.out.println("Enter the movie year you want to edit");
                movieToEdit.setYear(scanner.nextInt());

                System.out.println("Enter the new length for the movie you want to edit in minutes");
                movieToEdit.setLength(scanner.nextInt());

                System.out.println("Movie edited successfully");
            }
        }
    }

    private void deleteMovie() throws IOException {
        scanner.nextLine();
        System.out.print("Enter movie title to delete: ");
        String title = scanner.nextLine();
        controller.deleteMovie(title);

        System.out.println("Movie deleted successfully");
    }

    private void viewMovies() {
        List<Movie> movies = controller.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies found");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private void searchMovie() {
        scanner.nextLine();
        System.out.print("Enter the movie title you wish to search for: ");
        String title = scanner.nextLine();
        List<Movie> results = controller.searchMovies(title);

        if (results.isEmpty()) {
            System.out.println("No movies found with the given title");
        } else {
            results.forEach(System.out::println);
        }
    }
}
