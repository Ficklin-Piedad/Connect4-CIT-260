/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

/**
 *
 * @author henrydiazlds
 */
public class Statistics {
    
    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;
    double gamePercent;

    public Statistics() {
        
    }
    
        public void computeScore(){
        gamesWon =4;
        gamesLost = 3;
        gamesTies = 2;
        
        gamesPlayed = gamesWon + gamesLost + gamesTies;
        
        if (gamesPlayed == 0)
        {
            System.out.println("You Need to play first.");
        }
        else 
        {
            gamePercent = (double) (gamesWon) * 100 / (gamesPlayed); 
            gamePercent = Math.round(gamePercent *100) / 100.0d;    //Redondea a dos decimales
            System.out.println("Game Statics");
            System.out.println("\tGames Played: " + gamesPlayed);
            System.out.println("\tGames Won: " + gamesWon);
            System.out.println("\tGames Lost:" + gamesLost);
            System.out.println("\tGames Ties:" + gamesTies);
            System.out.println("\tPercent: " + gamePercent +"%");
        }
    }
}
