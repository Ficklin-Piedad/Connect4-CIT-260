package crazyconnect4;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henrydiazlds
 */
class MainMenu extends Menu {
    
    boolean whatMenu = true;

    static final String[][] mainMenuItems = {
        {"P", "One Player"},
        {"T", "Two Players"},
        {"S", "Statistics"},
        {"O", "Options"},
        {"H", "Help"},
        {"Q", "Exit"},};

    private final MainMenuControl mainMenuControl = new MainMenuControl();

    @Override
    public void getInput(boolean whatMenu) {
        super.getInput(whatMenu); //To change body of generated methods, choose Tools | Templates.

        do {

            this.displayMenu(whatMenu); // display the menu

            // get commaned entered
            userInput = inFile.nextLine();
            userInput = userInput.trim().toUpperCase();

            switch (userInput) {
                case "P":
                    this.mainMenuControl.onePlayer();
                    break;
                case "T":
                    this.mainMenuControl.twoPlayer();
                    break;
                case "S":
                    this.mainMenuControl.displayStatistics();
                    break;
                case "O":
                    this.mainMenuControl.displayOptions();
                    break;
                case "H":
                    this.mainMenuControl.displayHelp();
                    break;
                case "Q":
                    this.mainMenuControl.byeBye();
                    break;
                default:
                    System.out.println("Invalid. Please enter a valid command.");

            }
        } while (!userInput.equals("Q"));
    }
        public static void main(String[] args) throws IOException, InterruptedException {
        MainMenu menu = new MainMenu();
        menu.getInput(true);
        
    }//end Main
}

