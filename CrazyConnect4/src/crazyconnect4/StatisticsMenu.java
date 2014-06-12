/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author kylugo
 */
public class StatisticsMenu {
    
    int[] array;
    String greeting = "Welcome to the Statistics Menu!\n "
            + "Choose what you would like to view!\n";

    @SuppressWarnings("empty-statement")
    
    private final static String[][] statisticsMenuItems = 
    {
        {"1", "Display score from low to high"},
        {"2", "Display average score"}, 
        {"3", "Show number of games"},
        {"4", "Display best score"},
        {"5", "Display timer"},
        {"6", "Return to Main Menu"},  
        {"7", "Exit Menu"}
    };
    
    StatisticsMenu() 
    {
    }
    
    public void menu()
    {
        System.out.println(this.greeting);

        //variables
        boolean valid = true;
        String choose = null;
        String invalidEntry = "\nWrong Entry, Please try again.\n";

        while (valid) {
            //user entry
            Scanner input = new Scanner(System.in);
            System.out.println("Which option would you like to view?");
            System.out.println("1. Scores\t 2. Average\t 3. Games\t 4. Best\t 5. Timer\t 6. Main\t 7. Exit\n");
            choose = input.nextLine();

            //{"Scores", "Display score from low to high"},
            //{"Average", "Display average score"}, 
            //{"Games", "Show number of games"},
            //{"Best", "Display best score"},
            //{"Timer", "Display timer"},
            //{"Main", "Return to Main Menu"},
            

            //validating user entry
            if (choose == null || choose.length() < 1) {
                System.out.println(invalidEntry);
            } else {
                if (choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") 
                        || choose.equals("5") || choose.equals("6") || choose.equals("7")) {
                    break;
                } else {

                    System.out.println(invalidEntry);
                }
            }
        }
        //option 1
        if (choose.equals("1")) {
            //user array
            SortScores sortscores = new SortScores();
            sortscores.caller();
            }
            //option 2 
            else if (choose.equals("2")){
            ScoreAverage scoreaverage = new ScoreAverage();
            scoreaverage.scoreoption();
            } 
            
            else if (choose.equals("3")) {
            //user array
            Statistics statistics = new Statistics();
            statistics.computeScore();
            }
            
            else if (choose.equals("4")) {
            //user array
            
            }
            
            else if (choose.equals("5")) {
            //user array
            
            }
            
            else if (choose.equals("6")) {
            //user array
            
            }
            
            else if (choose.equals("7")) {
            //user array
                System.out.println("\nCome back soon!\n");
            }

        }
    public static void main(String[] args) throws IOException {
        
        StatisticsMenu statisticsmenu = new StatisticsMenu();
        statisticsmenu.menu();
    }
}
