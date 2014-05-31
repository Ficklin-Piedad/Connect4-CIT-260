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
public class BoardView 
{
    void ViewBoard()  
    {
        int i;
        int j;

        for (i = 0; i < 10; i++) 
        {
            for (j = 0; j < 10; j++) 
                System.out.print(i);
            System.out.print(j);
        }
    }
    
    public static void main(String[] args) 
    {
        BoardView boardview = new BoardView();
        boardview.ViewBoard();
    }
    
}
