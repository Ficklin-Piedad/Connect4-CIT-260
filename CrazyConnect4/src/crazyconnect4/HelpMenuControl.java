/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

/**
 *
 * @author kylugo
 */
public class HelpMenuControl {
    
    public HelpMenuControl() 
    {
        
    } 

    public void displayInstructions() 
    {     
        System.out.println("\tThis will display the game instructions.");
    }
        
    public void displayKeyboardFunctions() 
    { 
        System.out.println("\tThis will display what each key does during the game."); 
    }
            
    public void displayStatistics() 
    {     
        System.out.println("\tThis will show the player statistics."); 
    }
    
    public void displayExit() 
    {     
        System.out.println("\tThis will exit out of the Help Menu."); 
    }
    
}
