/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.util.Scanner;

/**
 *
 * @author Piedad Ficklin
 */
import java.io.Serializable;
import java.util.Objects;

public class HelpMenuView implements Serializable{

    private final static String[][] helpMenuItems = 
    {
        {"I", "Instructions"},
        {"K", "Keyboard Functions"}, 
        {"R", "Return to Main Menu"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    private HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    private void getInput() {       
              
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
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("R"));  
        
    }

    // displays the help menu
    private final void display() 
    {
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : HelpMenuView.helpMenuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
    }

       @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.helpMenuControl);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HelpMenuView other = (HelpMenuView) obj;
        if (!Objects.equals(this.helpMenuControl, other.helpMenuControl)) {
            return false;
        }
        return true;
    }
    
}

