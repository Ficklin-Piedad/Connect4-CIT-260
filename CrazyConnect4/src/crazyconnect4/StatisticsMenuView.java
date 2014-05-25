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
public class StatisticsMenuView 
{
    public StatisticsMenuView() {
        
    }
    
    private final static String[][] StatisticsMenuItems = {
        {"H1", "High Score Player 1"},
        {"H2", "High Score Player 2"}, 
        {"L1", "Low Score Player 1"}, 
        {"L2", "Low Score Player 2"},
        {"H", "Help Menu"},
        {"Q", "Exit"},
    };
    
    // Create instance of the MainMenuControl (action) class
    private final StatisticsMenuControl StatisticsMenuControl = new StatisticsMenuControl();
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String userInput;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.StatisticsMenuView(); // display the menu
            
            // get commaned entered
            userInput = inFile.nextLine();
            userInput = userInput.trim().toUpperCase();
            
            switch (userInput) {
                case "H1":
                    this.StatisticsMenuControl.highScorePlayer1();
                    break;
                case "H2":
                    this.StatisticsMenuControl.highScorePlayer2();
                    break;                  
                case "L1":
                    this.StatisticsMenuControl.lowScorePlayer1();
                    break;
                case "L2":
                    this.StatisticsMenuControl.lowScorePlayer2();
                    break;
                case "H":
                    this.StatisticsMenuControl.displayHelp();
                    break;
                case "Q":
                    this.StatisticsMenuControl.byeBye();
                    break;
                default: 
                    System.out.println("Invalid. Please enter a valid command.");
            }
        } while (!userInput.equals("Q"));  
        
    }

    // displays the help menu
    public final void showStatsMenu() 
    {
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : StatisticsMenuView.StatisticsMenuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
    }
    
}
