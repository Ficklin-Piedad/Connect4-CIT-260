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
public class Winner {

    public static String checkWinner(String[][] f) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j += 2) {
                if (       (f[i][j + 1] != " ")
                        && (f[i][j + 3] != " ")
                        && (f[i][j + 5] != " ")
                        && (f[i][j + 7] != " ")
                        && ((f[i][j + 1] == f[i][j + 3])
                        &&  (f[i][j + 3] == f[i][j + 5])
                        &&  (f[i][j + 5] == f[i][j + 7]))) //If we found a same-colored pattern, we'll return
                //the color so that we will know who won
                {
                    return f[i][j + 1];
                }
            }
        }

        for (int i = 1; i < 15; i += 2) {
            for (int j = 0; j < 3; j++) {
                if (       (f[j + 0][i] != " ")
                        && (f[j + 1][i] != " ")
                        && (f[j + 2][i] != " ")
                        && (f[j + 3][i] != " ")
                        && ((f[j + 0][i] == f[j + 1][i])
                        &&  (f[j + 1][i] == f[j + 2][i])
                        &&  (f[j + 2][i] == f[j + 3][i]))) {

                    return f[j][i];
                }
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 9; j += 2) {
                if (        (f[i + 0][j + 0] != " ")
                        &&  (f[i + 1][j + 2] != " ")
                        &&  (f[i + 2][j + 4] != " ")
                        &&  (f[i + 3][j + 6] != " ")
                        && ((f[i + 0][j + 0] == f[i + 1][j + 2])
                        &&  (f[i + 1][j + 2] == f[i + 2][j + 4])
                        &&  (f[i + 2][j + 4] == f[i + 3][j + 6]))) {
                    
                    return f[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 7; j < 15; j += 2) {
                if (        (f[i + 0][j - 0] != " ")
                        &&  (f[i + 1][j - 2] != " ")
                        &&  (f[i + 2][j - 4] != " ")
                        &&  (f[i + 3][j - 6] != " ")
                        && ((f[i + 0][j - 0] == f[i + 1][j - 2])
                        &&  (f[i + 1][j - 2] == f[i + 2][j - 4])
                        &&  (f[i + 2][j - 4] == f[i + 3][j - 6]))) {
                    
                    return f[i][j];
                }
            }
        }

        return null;
    }
}
