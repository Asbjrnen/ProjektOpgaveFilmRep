import java.util.Scanner;

public class UserInterface {

    public void startProgram(){
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        Movie movie1 = new Movie("koen ko","john",1995,"yes",5,"horror");
        Movie movie2 = new Movie("adolf body","john hitler",1965,"no",100,"documentary");
        controller.addMovie(movie1);
        controller.addMovie(movie2);

        boolean running = true;

        while (running){
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

            switch (choice){
                case 1 ->
                {
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

                    Movie movie = new Movie(name,director,year,isInColor,movieLength,genre);
                    controller.addMovie(movie);
                }

                case 2-> controller.printMovieList();
                case 3->
                {
                    System.out.println("Enter title:");
                    controller.findMovie(scanner.nextLine());
                }
//                case 4-> // editfunktion
                case 5->
                {
                    System.out.println("Enter title:");
                    controller.removeMovie(scanner.nextLine());
                }
                case 6-> running = false;
            }
        }

    }
}
