import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Controller controller;
    private Scanner scanner;

    public UserInterface() {
        this.controller = new Controller();
        this.scanner = new Scanner(System.in);
    }

    public void startProgram() {
        boolean exit = false;
        while (!exit) {
            System.out.println("--------------------------------------------");
            System.out.println("1) Add movie to your collection");
            System.out.println("2) Edit a movie in your collection");
            System.out.println("3) Delete a movie in your collection");
            System.out.println("4) View all movies in your collection");
            System.out.println("5) Search for a movie in your collection");
            System.out.println("6) Exit your collection");
            System.out.println("--------------------------------------------");


            int choice = getIntInput("Choose an option: ");
            switch (choice) {
                case 1 -> addMovie();

                case 2 -> editMovie();

                case 3 -> deleteMovie();

                case 4 -> viewMovies();

                case 5 -> searchMovie();

                case 6 -> exit = true;

                case 7 -> sort();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void sort (){
        controller.sortTitle();
        viewMovies();
//        boolean sort = false;
//        while (!sort) {
//            System.out.println("-------------------------------------------");
//            System.out.println("1) Sort by Title");
//            System.out.println("2) Exit your collection");

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

    private void addMovie() {
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter director: ");
        String director = scanner.nextLine();

        int length = getIntInput("Enter length in minutes: ");

        int year = getIntInput("Enter year of creation: ");

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        scanner.nextLine();

        boolean isColor = getIntInput("Is the movie in color?: \"\\n 1 for yes or 0 for no\"") == 1;

        controller.addMovie(title, director, length, year, genre, isColor);
        System.out.println("Movie added successfully");
    }

    private void editMovie() {
        scanner.nextLine();
        System.out.print("Enter movie title to edit: ");
        String title = scanner.nextLine();

        System.out.print("Enter new director: ");
        String director = scanner.nextLine();

        int length = getIntInput("Enter new length in minutes: ");
        int year = getIntInput("Enter new year of creation: ");
        System.out.print("Enter new genre for the movie: ");
        String genre = scanner.nextLine();
        scanner.nextLine();

        boolean isColor = getIntInput("Is the movie in color?: " + "\n 1 for yes or 0 for no") == 1;

        controller.editMovie(title, director, length, year, genre, isColor);
        System.out.println("Movie edited successfully");
    }

    private void deleteMovie() {
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
