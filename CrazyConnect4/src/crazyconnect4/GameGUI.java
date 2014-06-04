package crazyconnect4;

/**
 *
 * @author Henry J. DIAZ
 */
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public final class GameGUI {

    //Declaracion de variables
    private JFrame mainFrame;
    private JFrame howtoFrame;
    private JFrame rulesFrame;
    private JFrame aboutFrame;

    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;

    double gamePercent;

    String lblStatics;
    String playerName;
    String instructions = "This is the fabulous game \"Four in a Line\".\n\n"
            + "You will be playing against the computer or against another player.\n"
            + "The objective of this game is to place four of your chips in a \n"
            + "line, either horizontally, vertically or diagonally.\n\n"
            + "Good Luck! and enjoy this fun and challenging game.\n";
    String flagMusic;
    String upperInput;

    boolean musicStatus = false;

    //Constructor
    public GameGUI() throws IOException, InterruptedException {

        getName();

    }//end Constuctor

    public void getName() throws IOException {
        //Player Name input window
        while (true){
        playerName = JOptionPane.showInputDialog(null, "Enter your name to start playing", "User Name",
                JOptionPane.QUESTION_MESSAGE);
        if (playerName == null || playerName.length() < 1) {
        } else break;
        }
        //Ejecuta la siguiente instruccion.
        displayGretting();
    }

    public void displayGretting() throws IOException {
        //show Gretting Window
        String jugador = playerName.toUpperCase();
        JOptionPane.showMessageDialog(null, instructions, "Welcome " + jugador,
                JOptionPane.PLAIN_MESSAGE);

        playMusic();
    }//end displayGretting

    public void playMusic() {
        String jugador = playerName.toUpperCase();
        String message = jugador + ", Do you want to hear music while playing this game?";

        int yesNo = JOptionPane.showConfirmDialog(null, message, "Music Play Option", JOptionPane.YES_NO_OPTION);

        //Play background music
        if (yesNo == JOptionPane.YES_OPTION) {

            try {
                musicOn();

            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        prepareGUI();
    }//end playMusic Method

    private void prepareGUI() {
        mainFrame = new JFrame("Connect Four - CIT260");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);      //en el centro del monitor
        mainFrame.setResizable(false);

        /*
         howtoFrame = new JFrame("Connect Four - How to Play");  //Titulo
         howtoFrame.setSize(300, 300);
         howtoFrame.setLocationRelativeTo(null);

         rulesFrame = new JFrame("Connect Four - Game Rules");   //Titulo
         rulesFrame.setSize(300, 300);
         rulesFrame.setLocationRelativeTo(null);

         aboutFrame = new JFrame("Connect Four - About Us");     //Titulo
         aboutFrame.setSize(300, 300);
         aboutFrame.setLocationRelativeTo(null);
         */
    }//end prpareGUI

    private void showMenu() throws InterruptedException {
        //create a menu bar
        JMenuBar menuBar = new JMenuBar();

        //create menus
        JMenu fileMenu      = new JMenu("File");
        JMenu helpMenu      = new JMenu("Help");
        JMenu optionsMenu   = new JMenu("Options");

        //create menu items
        JMenuItem newMenuItem       = new JMenuItem("New game");
        JMenuItem staticsMenuItem   = new JMenuItem("Show Staticts");
        JMenuItem exitMenuItem      = new JMenuItem("Exit");
        JMenuItem howMenuItem       = new JMenuItem("How to Play");
        JMenuItem rulesMenuItem     = new JMenuItem("Game rules");
        JMenuItem aboutMenuItem     = new JMenuItem("About");
        JMenuItem musicOnItem       = new JMenuItem("Sound On");
        JMenuItem musicOffItem      = new JMenuItem("Sound Off");

        //add menu items to menu);
        fileMenu.add(newMenuItem);
        fileMenu.add(staticsMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        helpMenu.add(howMenuItem);
        helpMenu.add(rulesMenuItem);
        helpMenu.addSeparator();
        helpMenu.add(aboutMenuItem);
        if (!musicStatus) optionsMenu.add(musicOnItem);
        else optionsMenu.remove(musicOffItem);
        
        if (musicStatus) optionsMenu.add(musicOffItem);
        else optionsMenu.remove(musicOffItem);
        
        //add menu to menubar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(optionsMenu);

        //add menubar to the frame
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setVisible(true);

        //add actions to show windows
        staticsMenuItem.addActionListener((ActionEvent e) -> {
            computeScore();
        });

        rulesMenuItem.addActionListener((ActionEvent e) -> {
            gameRulesMenu();
        });

        howMenuItem.addActionListener((ActionEvent e) -> {
            howToHelpMenu();
        });

        musicOnItem.addActionListener((ActionEvent e) -> {
            try {
                musicOn();
            } catch (InterruptedException ex) {
                Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        aboutMenuItem.addActionListener((ActionEvent e) -> {
            aboutMenu();
        });

    }//end showMenu

    public void computeScore() {
        gamesWon    = 4;
        gamesLost   = 0;
        gamesTies   = 0;
        gamesPlayed = gamesWon + gamesLost + gamesTies;

        if (gamesPlayed == 0) {
            JOptionPane.showMessageDialog(null, playerName + ", You Need to play first.", "Game Statics for "
                    + playerName, JOptionPane.PLAIN_MESSAGE);
        } else {
            gamePercent = (double) (gamesWon) * 100 / (gamesPlayed);
            gamePercent = Math.round(gamePercent * 100) / 100.0d;    //Redondea a dos decimales
            lblStatics = "Games Played: " + gamesPlayed
                    + "\nGames Won: " + gamesWon
                    + "\nGames Lost: " + gamesLost
                    + "\nGames Ties: " + gamesTies
                    + "\nPercent: " + gamePercent + "%";

            JOptionPane.showMessageDialog(null, lblStatics, "Game Statics for "
                    + playerName, JOptionPane.PLAIN_MESSAGE);
        }
    }//end computeScore

    public void howToHelpMenu() {
        JOptionPane.showMessageDialog(null, playerName + ", You Need to play first.", "COMO JUGAR ",
                JOptionPane.PLAIN_MESSAGE);

    }//end howToHelpMenu

    public void gameRulesMenu() {
        JOptionPane.showMessageDialog(null, playerName + ", Estas son las reglas a seguir", "Reglas del Juego",
                JOptionPane.INFORMATION_MESSAGE);

    }//end gameRulesMenu

    public void aboutMenu() {
        JOptionPane.showMessageDialog(null, playerName + ", Estos son los creadores del juego.", "ABOUT US ",
                JOptionPane.PLAIN_MESSAGE);

    }//end aboutMenu

    public void musicOn() throws InterruptedException {
        SoundTest soundtest = new SoundTest();
        soundtest.backgroundMusicPlay();
        musicStatus = true;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GameGUI iniciar = new GameGUI();
        iniciar.showMenu();
    }//end Main

}//end Class Main

