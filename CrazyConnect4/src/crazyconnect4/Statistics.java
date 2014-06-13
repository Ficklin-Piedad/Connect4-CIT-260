/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lugoky
 */
public class Statistics 
{    
    //String gamesPlayed;
    //String gamesWon;
   // String gamesLost;
   // String gamesTies;
   // double gamePercent;
   // double sumPlayed;
    
    int array[];

    @SuppressWarnings("empty-statement")

    public Statistics() 
    {
        
    }

    public void computeScore()throws IOException
    {
     //   Scanner input = new Scanner(System.in);
    //    System.out.println("Enter the amount of games played: ");
      //  this.gamesPlayed = input.nextLine();
      //  int played = Integer.parseInt(gamesPlayed);
      //  
      //  System.out.println("Enter the amount of games won: ");
     //   this.gamesWon = input.nextLine();
     //   int won = Integer.parseInt(gamesWon);
        
     //   System.out.println("Enter the amount of games lost: ");
     //   this.gamesPlayed = input.nextLine();
     //   int lost = Integer.parseInt(gamesLost);
        
     //   System.out.println("Enter the amount of games tied: ");
     //   this.gamesPlayed = input.nextLine();
      //  int tied = Integer.parseInt(gamesTies);
        
      //  sumPlayed = won + lost + tied;
        
      //  if (sumPlayed > played || sumPlayed == 0)
      //  {
      //      System.out.println("The numbers are all wrong! Try again!");
     //   }
     //   else 
      //  {
      //      gamePercent = (double) (won) * 100 / (played); 
      //      gamePercent = Math.round(gamePercent *100) / 100.0d;    //Redondea a dos decimales
      //      System.out.println("Game Statics");
      //      System.out.println("\tGames Played: " + played);
      //      System.out.println("\tGames Won: " + won);
      //      System.out.println("\tGames Lost:" + lost);
      //      System.out.println("\tGames Tied:" + tied);
      //      System.out.println("\tPercent: " + gamePercent +"%");
      //  }

        //variables
        
        boolean valid = true;
        String choose = null;
        String invalidEntry = "Please try again.\n";

        while (valid) 
        {
            //user entry
            Scanner input = new Scanner(System.in);
            System.out.println("Hello! Welcome to Game Statistics!\nThis will display the amount of games played,"
                    + " the amount of games won, the amount of games lost, and the amount of games tied.\n");
            System.out.println("Choose a number from 1-5 to view the Game Statistics");
            choose = input.nextLine();

            //validating user entry
            if (choose == null || choose.length() < 1) 
            {
                System.out.println(invalidEntry);
            } 
            else 
            {
                if (choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") 
                        || choose.equals("5")) 
                {
                    break;
                } 
                else 
                {
                    System.out.println(invalidEntry); 
                }
            }
        }
        if (choose.equals("1")) 
        {
            Runtime.getRuntime().exec("clear");
            //DUMMY data
            int array[] = {5, 3, 1, 1};
            System.out.println("\nChoosing Option 1...\n");
            System.out.println("Number of games played: " + array[0]);
            System.out.println("Number of games won: " + array[1]);
            System.out.println("Number of games lost: " + array[2]);
            System.out.println("Number of games tied: " + array[3]);
            System.out.println("\n");
        }
        else if (choose.equals("2")) 
        {
            Runtime.getRuntime().exec("clear");
            //DUMMY data
            int array[] = {10, 9, 0, 1};
            System.out.println("\nChoosing Option 2...\n");
            System.out.println("Number of games played: " + array[0]);
            System.out.println("Number of games won: " + array[1]);
            System.out.println("Number of games lost: " + array[2]);
            System.out.println("Number of games tied: " + array[3]);
            System.out.println("\n");
        }
        else if (choose.equals("3")) 
        {
            Runtime.getRuntime().exec("clear");
            //DUMMY data
            int array[] = {1, 0, 1, 0};
            System.out.println("\nChoosing Option 3...\n");
            System.out.println("Number of games played: " + array[0]);
            System.out.println("Number of games won: " + array[1]);
            System.out.println("Number of games lost: " + array[2]);
            System.out.println("Number of games tied: " + array[3]);
            System.out.println("\n");
        }
        else if (choose.equals("4")) 
        {
            Runtime.getRuntime().exec("clear");
            //DUMMY data
            int array[] = {12, 4, 5, 3};
            System.out.println("\nChoosing Option 4...\n");
            System.out.println("Number of games played: " + array[0]);
            System.out.println("Number of games won: " + array[1]);
            System.out.println("Number of games lost: " + array[2]);
            System.out.println("Number of games tied: " + array[3]);
            System.out.println("\n");
        }
        else if (choose.equals("5")) 
        {
            Runtime.getRuntime().exec("clear");
            //DUMMY data
            int array[] = {7, 3, 2, 2};
            System.out.println("\nChoosing Option 5...\n");
            System.out.println("Number of games played: " + array[0]);
            System.out.println("Number of games won: " + array[1]);
            System.out.println("Number of games lost: " + array[2]);
            System.out.println("Number of games tied: " + array[3]);
            System.out.println("\n");
        }
    }
            
    public static void main(String[] args) throws IOException {
        
        Statistics statistics = new Statistics();
            statistics.computeScore();
    }
}

