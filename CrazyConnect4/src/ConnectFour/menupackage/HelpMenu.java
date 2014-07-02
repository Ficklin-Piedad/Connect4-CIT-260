/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.io.IOException;

/**
 *
 * @author kylugo
 */
class HelpMenu extends Menu {
    
    boolean whatMenu = false;

    static final String[][] helpMenuItems = {
        {"I", "Display Instructions"},
        {"K", "Display Keyboard Functions"},
        {"S", "Statistics"},
        {"Q", "Exit"},};

    private final HelpMenuControl helpMenuControl = new HelpMenuControl();

    @Override
    public void getInput(boolean whatMenu) {
        super.getInput(whatMenu); //To change body of generated methods, choose Tools | Templates.

        do {

            this.displayMenu(whatMenu); // display the menu

            // get commaned entered
            userInput = inFile.nextLine();
            userInput = userInput.trim().toUpperCase();

            switch (userInput) {
                case "I":
                    this.helpMenuControl.displayInstructions();
                    break;
                case "K":
                    this.helpMenuControl.displayKeyboardFunctions();
                    break;
                case "S":
                    this.helpMenuControl.displayStatistics();
                    break;
                case "Q":
                    this.helpMenuControl.displayExit();
                    break;
                default:
                    System.out.println("Invalid. Please enter a valid command.");

            }
        } while (!userInput.equals("Q"));
    }
        public static void main(String[] args) throws IOException, InterruptedException {
        HelpMenu menu = new HelpMenu();
        menu.getInput(false);
        
    }//end Help
}

