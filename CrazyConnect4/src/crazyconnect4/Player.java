/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

/**
 *
 * @author Piedad
 */
import java.io.Serializable;

public class Player implements Serializable {
     public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER"; 
    
    private String name;
    private double age;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String marker;
    
    

    private Player() {
    }

    private Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    } 

    private String getPlayerStastics() {
        String playerStatistics = 
                this.name + " has won "
                + this.getWinningPercentage(this.wins, this.losses, this.ties) + "% of the games."
                + "\n\t" + this.wins + " wins, "
                + this.losses + " losses and "
                + this.ties + " ties.";
        
        return playerStatistics;
    }

    
    private double getWinningPercentage(long wins, long losses, long ties) {
     
        if (wins < 0 ) {
            System.out.println("\n\tThe number of wins must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (losses < 0 ) {
            System.out.println("\n\tThe number of losses must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (ties < 0 ) {
            System.out.println("\n\tThe number of ties must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        double totalScore = wins + losses + ties;
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = wins / totalScore;
        return winLossRatio * 100;
    }

    private Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    
}
