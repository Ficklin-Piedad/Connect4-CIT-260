package ConnectFour.Boardpackage;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kylugo
 */
public class PlayerMove {

    public static void dropRedPattern(String[][] f) {

        System.out.println("Drop a red chip in column (1–7): ");

        Scanner scan = new Scanner(System.in);

        int c = 2 * scan.nextInt() + 1;

        for (int i = 5; i >= 0; i--) {
            if (f[i][c] == " ") {
                f[i][c] = "R";
                break;
            }

        }
    }

    public static void dropBlackPattern(String[][] f) {
        System.out.println("Drop a black chip in column (1–7): ");

        Scanner scan = new Scanner(System.in);

        int c = 2 * scan.nextInt() + 1;

        for (int i = 5; i >= 0; i--) {
            if (f[i][c] == " ") {
                f[i][c] = "B";
                break;
            }

        }
    }

}
