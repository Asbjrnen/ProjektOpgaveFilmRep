import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class UserInterface {
    private final Controller controller;
    private final Scanner scanner;
    private final MovieCollection movieCollection;

    public UserInterface() {
        this.controller = new Controller();
        this.scanner = new Scanner(System.in);
        this.movieCollection = new MovieCollection();
    }

    public void startProgram() {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        Movie Koen = new Movie("Koen","hans",1900,"yes",60,"Romance");
        movieCollection.addMovie(Koen);

        boolean running = true;

        while (running) {
            System.out.println("Welcome to your own personalized movie collection\n");
            System.out.println("1. Add movie");
            System.out.println("2. Show all movies");
            System.out.println("3. Search for a movie by title");
            System.out.println("4. Edit movie");
            System.out.println("5. Remove movie");
            System.out.println("6. Exit");
            System.out.println("Choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Write movie name: ");
                    String name = scanner.nextLine();
                    System.out.println("Write movie director: ");
                    String director = scanner.nextLine();
                    System.out.println("Write year: ");
                    int year = scanner.nextInt();
                    System.out.println("Is the movie in color? yes or no:");
                    String isInColor = scanner.next();
                    System.out.println("Write movie length in minutes: ");
                    int movieLength = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Write movie genre: ");
                    String genre = scanner.nextLine();

                    Movie movie = new Movie(name, director, year, isInColor, movieLength, genre);
                    controller.addMovie(movie);
                }

                case 2 -> System.out.println(controller.printMovieList());
                case 3 -> {
                    System.out.println("Enter title:");
                    controller.findMovie(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Enter title of the movie you want to edit:");
                    editMovieFromList();
                }
                case 5 -> {
                    System.out.println("Enter title:");
                    controller.removeMovie(scanner.nextLine());
                }
                case 6 -> running = false;
            }
        }
    }

        private void editMovieFromList() {
            System.out.println("Choose the title of the movie you want to edit:");

            scanner.nextLine();
            String newTitle = scanner.nextLine();
            Movie movieEdit = controller.editMovieFromList(newTitle);

                    if (!newTitle.isEmpty()) {
                        movieEdit.setName(newTitle);
                    }
                    System.out.println("Director: ");
                    String newDirector = scanner.nextLine();
                    if (!newDirector.isEmpty()) {
                        movieEdit.setDirector(newDirector);
                    }
                    System.out.println("Is it in colour: ");
                    String newIsInColor = scanner.nextLine();
                    if (!newIsInColor.isEmpty()) {
                        movieEdit.setIsInColor(newIsInColor);
                    }

                    System.out.println("Genre: ");
                    String newGenre = scanner.nextLine();
                    if (!newGenre.isEmpty()) {
                        movieEdit.setGenre(newGenre);
                    }
                    System.out.println("year: ");
                    String newYear = scanner.nextLine();
                    if (!newYear.isEmpty()) {
                        int ko = Integer.parseInt(newYear);
                        movieEdit.setYear(ko);
                        System.out.println("You did not write a number!");
                    }
                System.out.println("Length in minutes: ");
                String newLengthInMinutes = scanner.nextLine();
                if (!newLengthInMinutes.isEmpty()) {
                    int minuteChange = Integer.parseInt(newLengthInMinutes);
                    movieEdit.setLengthInMinutes(minuteChange);
                    System.out.println("You did not write a number!");
                }


            }

        }



//            for (Movie i : ) {
//        if (i.getName().toLowerCase().contains(scanner)) {
//        System.out.println("Found movie!");
//                    System.out.println(i);
//                    System.out.println("Please change the data you would like to edit and press ENTER");
//                    System.out.println("Title: " + i.getName());