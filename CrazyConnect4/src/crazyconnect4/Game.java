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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {

    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;
    double gamePercent;
    Boolean musicStatus = false;
    String flagMusic;

    String playerName;
    String welcomeGretting = "This is the fabulous game \"Four in a Line\".\n\n"
            + "You will be playing against the computer or against another player.\n"
            + "The objective of this game is to place four of your chips in a \n"
            + "line, either horizontally, vertically or diagonally.\n"
            + "Good Luck! and enjoy this fun and challenging game.\n";

    public void getName() throws IOException {

        //playerName = JOptionPane.showInputDialog(null,"Enter your name to start playing", "User Name", JOptionPane.QUESTION_MESSAGE); 
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name: ");//Pregunta el nombre del jugador
        this.playerName = inputName.nextLine();     //Asigna la entrada a la variable playerName*/

        //Ejecuta la siguiente instruccion.
        displayGretting();
    }

    public void displayGretting() throws IOException {

        //JOptionPane.showMessageDialog(null, welcomeGretting, "Welcome " + playerName, JOptionPane.PLAIN_MESSAGE);
        System.out.println("\nWelcome "
                + this.playerName + "!\n");        //Msj de Bienvenida
        System.out.println(this.welcomeGretting);

    }

    public void playMusic() {
        Boolean bandera = true;

        while (bandera) {
            // prompt for input
            Scanner input = new Scanner(System.in);
            System.out.println("\n\t" + playerName
                    + ", do you want to hear music while paying this game? "
                    + "Please, press Y/N.");
            this.flagMusic = input.nextLine();

            // no marker entered?
            if (flagMusic != null || flagMusic.length() > 1) {
                bandera = false;
                continue;
            }
            else {
               return;
            }   
        }
        if (flagMusic == "Y") {
            musicStatus = true;
        }
        //Play background music
        if (musicStatus) {
            SoundTest soundtest = new SoundTest();
            try {
                soundtest.backgroundMusic();
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
    public void computeScore() {
        //Sound.BACK.play();

        gamesWon = 4;
        gamesLost = 3;
        gamesTies = 2;

        gamesPlayed = gamesWon + gamesLost + gamesTies;

        if (gamesPlayed == 0) {
            System.out.println(this.playerName + ", You Need to play first.");
        } else {
            gamePercent = (double) (gamesWon) * 100 / (gamesPlayed);
            gamePercent = Math.round(gamePercent * 100) / 100.0d;    //Redondea a dos decimales
            System.out.println("Game Statics");
            System.out.println("\tGames Played: " + gamesPlayed);
            System.out.println("\tGames Won: " + gamesWon);
            System.out.println("\tGames Lost:" + gamesLost);
            System.out.println("\tGames Ties:" + gamesTies);
            System.out.println("\tPercent: " + gamePercent + "%");
        }
        //this.HelpMenuView();
    }

    public static void main(String[] args) throws IOException {
        Game myGame = new Game();   //Construye un objeto
        myGame.getName();           //Llama a la funcion getName
        myGame.displayGretting();   //Llama a la funcion displayHelp
        myGame.playMusic();
        //myGame.computeScore();      //Llama a la funcion que muestra estadistica del juego

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();

    }
}
