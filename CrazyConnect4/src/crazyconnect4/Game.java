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
    boolean musicStatus = false;
    String flagMusic;
    String upperInput;

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
                + this.playerName + "!\n");        //Welcome Message
        System.out.println(this.welcomeGretting);

    }

    public void playMusic() {
        String jugador = playerName.toUpperCase();
        while (true) {
            // prompt for input
            Scanner input = new Scanner(System.in);
            System.out.println("\n" + jugador
                    + ", do you want to hear music while playing this game? "
                    + "\nPlease, press Y or N to continue.");
            this.flagMusic = input.nextLine(); //assing the input to variable

            // no input entered?
            if (flagMusic == null || flagMusic.length() < 1) {
                continue;
            } 
            else {
                upperInput = flagMusic.substring(0, 1).toUpperCase(); //UpperCase
                    if (upperInput.equals("Y") || upperInput.equals("N")) {
                        break;
                }
            }
        }
        //Play background music
        if (upperInput.equalsIgnoreCase("Y")) {
            SoundTest soundtest = new SoundTest();
            try {
                System.out.println("Enabling Music...\n");
                soundtest.backgroundMusicPlay();
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//end WHILE 
    }//end playMusic Method
    
    public static void createBoard() {
        String[][] pattern = new String[8][17];

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                if (j % 2 == 0) 
                {
                    pattern[i][j] = "|";
                } 
                else {
                    pattern[i][j] = " ";
                }

                if (i == 7) {
                    pattern[i][j] = "-";
                }
            } 
        }printBoard(pattern);
        //return pattern;
       
    }

    public static void printBoard(String[][] pattern) {
        String header = " 0 1 2 3 4 5 6 7";
        
        System.out.println(header);
        System.out.println("----------------- ");
        
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
        System.out.println(header);
    }

    public void computeScore() {

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
        //String[][] pattern = createBoard();
        createBoard();
        //printBoard(pattern);
        //MainMenuView mainMenu = new MainMenuView();
        //mainMenu.getInput();
        //SortPrinter sortprinter = new SortPrinter();
        //sortprinter.caller();
        
        //SortScores sortscores = new SortScores();
        //sortscores.caller();
    }
}
