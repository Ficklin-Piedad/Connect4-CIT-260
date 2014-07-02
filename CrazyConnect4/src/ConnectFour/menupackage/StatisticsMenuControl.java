/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectFour.menupackage;

/**
 *
 * @author kylugo
 */
public class StatisticsMenuControl 
{

    public StatisticsMenuControl() {
  
    }


    public void highScorePlayer1() {
        System.out.println("\tThis will display the highest score for player 1.\n");
    }
    
    public void highScorePlayer2() {
        System.out.println("\tThis will display the highest score for player 2.\n");
    }
    
    public void lowScorePlayer1(){
        System.out.println("\tThis will display the lowest score for player 1.\n");
    }
    
    public void lowScorePlayer2() {
        System.out.println("\tThis will display the lowest score for player 2.\n");
    }
    
    public void displayHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    public void byeBye() {
        System.out.println("\tThanks for choose our game!\n");
    }

    
}
