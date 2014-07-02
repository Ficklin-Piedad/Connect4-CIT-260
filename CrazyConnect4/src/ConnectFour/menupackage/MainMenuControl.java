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
public class MainMenuControl {
    

    public MainMenuControl() {
  
    }


    public void onePlayer() {
        System.out.println("\tThis will run the game with one player agains the computer.\n");
    }
    
    public void twoPlayer() {
        System.out.println("\tThis will play the game again another player.\n");
    }
    
    public void displayStatistics(){
        Statistics statistics = new Statistics();
        //statistics.computeScore();
        //System.out.println("\tThis will show the Statistics of game.\n");
    }
    
    public void displayOptions() {
        System.out.println("\tThis will display the game options.\n");
    }
    
    public void displayHelp() {
        MainMenuView menu = new MainMenuView();
        menu.getInput();
    }
    public void byeBye() {

        System.out.println("\tThanks for choosing our game!\n");
        System.exit(0);


    }

}
