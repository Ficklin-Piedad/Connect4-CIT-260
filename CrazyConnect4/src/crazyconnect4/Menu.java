package crazyconnect4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class Menu {

    String userInput;
    Scanner inFile = new Scanner(System.in);

    Menu() {

    }

    public void getInput(boolean whichMenu) {
        this.displayMenu(whichMenu);

        // get commaned entered
        userInput = inFile.nextLine();
        userInput = userInput.trim().toUpperCase();

    }

    // displays the help menu
    public final void displayMenu(boolean whichMenu) {
        System.out.println("\tEnter the letter associated with one of the following commands:");

        if (whichMenu) {

            for (String[] menuItem : MainMenu.mainMenuItems) {
                System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
            }
        } else {
            for (String[] menuItem : HelpMenu.helpMenuItems) {
                System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
            }
        }
    }
}
