import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        private scanner = new Scanner(System.in);
    }


    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getInput(String command){
        System.out.println(command);
        return scanner.nextLine();
    }

    public void close(){
        scanner.close();
    }
}
