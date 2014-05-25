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
import java.io.IOException;
import java.util.Scanner;

   

public class Game {
    
    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;
    double gamePercent;
    
    
    String playerName;
    String welcomeGretting = "This is the fabulous game \"Four in a Line\".\n\n"
            + "You will be playing against the computer or against another player.\n"
            + "The objective of this game is to place four of your chips in a \n"
            + "line, either horizontally, vertically or diagonally.\n"
            + "Good Luck! and enjoy this fun and challenging game.\n";
      

    public void getName() throws IOException{
        
        //playerName = JOptionPane.showInputDialog(null,"Enter your name to start playing", "User Name", JOptionPane.QUESTION_MESSAGE); 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");//Pregunta el nombre del jugador
        this.playerName = input.nextLine();     //Asigna la entrada a la variable playerName*/
        
        //Ejecuta la siguiente instruccion.
        displayGretting();
    }
    
    public void displayGretting() throws IOException {
        
        //JOptionPane.showMessageDialog(null, welcomeGretting, "Welcome " + playerName, JOptionPane.PLAIN_MESSAGE);
        
        System.out.println("\nWelcome " + 
                this.playerName +"!\n");        //Msj de Bienvenida
        System.out.println(this.welcomeGretting);
        
    }

    /*public void musicStatus() throws IOException {

        char musicOnOff;

        System.out.println("Music Option :"); 
        System.out.println("Do you want hear the background music?");
        System.out.println("    1. Yes");
        System.out.println("    2. No");
        System.out.println("Choose one");
        musicOnOff = (char) System.in.read();

        switch (musicOnOff) {
            case '1':
                Sound.BACK.loop();
                break;
            case '2':
		Sound.BACK.stop();
                break;
            default:
                System.out.print("Selection not found.");
        }
        computeScore();
    }*/


    
    public void computeScore(){
        gamesWon =4;
        gamesLost = 3;
        gamesTies = 2;
        
        gamesPlayed = gamesWon + gamesLost + gamesTies;
        
        if (gamesPlayed == 0)
        {
            System.out.println(this.playerName +", You Need to play first.");
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
        //this.HelpMenuView();
    }
    
 

      
    public static void main(String[] args) throws IOException {   
        Game myGame = new Game();   //Construye un objeto
        myGame.getName();           //Llama a la funcion getName
        myGame.displayGretting();   //Llama a la funcion displayHelp
        //myGame.computeScore();      //Llama a la funcion que muestra estadistica del juego
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        
    }
}
