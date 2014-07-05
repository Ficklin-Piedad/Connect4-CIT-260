/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectFour.Boardpackage;

import ConnectFour.viewpackage.BoardView;
import crazyconnect4.Score;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kylugo
 */
public class Board {

    Board() {

    }

    // displays the help menu
    public void displayBoardView() {
        BoardView boardview = new BoardView();
        boardview.boardView();
        
    }

    public final void displayPlayerMove() {
        PlayerMove playermove = new PlayerMove();
        playermove.PlayerMove();
    }

    public void displayScore() {
        Score score = new Score();
        score.Score();
        
    }

}
