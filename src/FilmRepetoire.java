public class FilmRepetoire {
    private UserInterface ui;


    public FilmRepetoire() {
        ui = new UserInterface();
    }

    public void playMovie() {
        ui.displayMessage("Welcome to your own personlized movie repetoire.");
    }

    public void displayMenu() {
        boolean running = true;
        Inventory inventory = new Inventory();
        while (running) {
            String input = ui.getInput("Command: ");
            if (input.equals("quit")) {
                break;
            }
            handleInput(input);
        }

    }
    public void handleInput(String input) {
        switch (input) {
            case "asd":
                break;
        }
    }


}


//As a (Role) I want (Some function) so that (some reason) ((USER STORY))
//
//As a user I want a program where I can create a repetoire of movies, so that I can get an overview
//
// https://app.diagrams.net/#G1Eblpo_xq-dyjEohXQbY_nFsgygfxhazA#%7B%22pageId%22%3A%22dErmq0-pZ0exho5y4ZfI%22%7D (KLASSE DIAGRAM)
//
//
//- arrayliste hvor en masse ting tilføjes imens programmet kører og fjernes igen når programmet afsluttes.
