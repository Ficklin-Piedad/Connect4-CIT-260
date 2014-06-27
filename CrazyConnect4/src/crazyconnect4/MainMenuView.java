/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class MainMenuView {
    
    public MainMenuView() {
        
    }
    
    public final static String[][] mainMenuItems = {
        {"P", "One Player"},
        {"T", "Two Players"}, 
        {"S", "Statistics"}, 
        {"O", "Options"},
        {"H", "Help"},
        {"Q", "Exit"},
    };
    
    // Create instance of the MainMenuControl (action) class
    private final MainMenuControl mainMenuControl = new MainMenuControl();
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String userInput;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.showMainMenu(); // display the menu
            
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

    // displays the help menu
    public final void showMainMenu() 
    {
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.mainMenuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
    }
    
}
