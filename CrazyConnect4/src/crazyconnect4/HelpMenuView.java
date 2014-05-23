/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.util.Scanner;

/**
 *
 * @author kylugo
 */
public class HelpMenuView 
{

    private final static String[][] menuItems = 
    {
        {"I", "Instructions"},
        {"K", "Keyboard Functions"}, 
        {"S", "Statistics"},
        {"E", "Exit"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "I":
                    this.helpMenuControl.displayInstructions();
                    break;
                case "K":
                    this.helpMenuControl.displayKeyboardFunctions();
                    break;
                case "S":
                    this.helpMenuControl.displayStatistics();
                    break;                  
                case "E":
                    this.helpMenuControl.displayExit();
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
        
    }

        // displays the help menu
    public final void display() 
    {
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : HelpMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
    }
    
}
