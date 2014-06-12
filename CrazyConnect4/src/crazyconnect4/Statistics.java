/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lugoky
 */
public class Statistics 
{    
    String gamesPlayed;
    String gamesWon;
    String gamesLost;
    String gamesTies;
    double gamePercent;
    double sumPlayed;


    public Statistics() {
        
    }

    public void computeScore()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of games played: ");
        this.gamesPlayed = input.nextLine();
        int played = Integer.parseInt(gamesPlayed);
        
        System.out.println("Enter the amount of games won: ");
        this.gamesWon = input.nextLine();
        int won = Integer.parseInt(gamesWon);
        
        System.out.println("Enter the amount of games lost: ");
        this.gamesPlayed = input.nextLine();
        int lost = Integer.parseInt(gamesLost);
        
        System.out.println("Enter the amount of games tied: ");
        this.gamesPlayed = input.nextLine();
        int tied = Integer.parseInt(gamesTies);
        
        sumPlayed = won + lost + tied;
        
        if (sumPlayed > played || sumPlayed == 0)
        {
            System.out.println("The numbers are all wrong! Try again!");
        }
        else 
        {
            gamePercent = (double) (won) * 100 / (played); 
            gamePercent = Math.round(gamePercent *100) / 100.0d;    //Redondea a dos decimales
            System.out.println("Game Statics");
            System.out.println("\tGames Played: " + played);
            System.out.println("\tGames Won: " + won);
            System.out.println("\tGames Lost:" + lost);
            System.out.println("\tGames Tied:" + tied);
            System.out.println("\tPercent: " + gamePercent +"%");
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        Statistics statistics = new Statistics();
            statistics.computeScore();
    }
}

