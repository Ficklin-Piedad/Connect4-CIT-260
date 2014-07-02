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
public class BoardView {

    public static String[][] boardView() {

        String[][] f = new String[7][15];

        for (int i = 0; i < f.length; i++) {

            for (int j = 0; j < f[i].length; j++) {

                if (j % 2 == 0) {
                    f[i][j] = "|";
                } else {
                    f[i][j] = " ";
                }

                if (i == 6) {
                    f[i][j] = "-";
                }
            }

        }
        return f;
    }

    public static void printBoard(String[][] f) {
        String header = " 1 2 3 4 5 6 7";
        
        System.out.println(header);
        
        System.out.println("---------------");
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
        System.out.println(header);
    }

}
