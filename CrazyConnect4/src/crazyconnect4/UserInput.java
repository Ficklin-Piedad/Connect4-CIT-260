/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyconnect4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kylugo
 */
public class UserInput {

    String usInput;

    public void userInput() {
    }

    public void playerInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        this.usInput = input.nextLine();
        int userIn = Integer.parseInt(usInput);

        while (userIn < 11 && userIn > 0) {
            System.out.println("The value entered is: " + userIn);
            userIn += 1;

            if (userIn < 11) {
                
            }
        }
        if (userIn > 10) {
            System.out.println("The value entered is incorrect. Try again");
        }

    }

    public static void main(String[] args) {
        UserInput userinput = new UserInput();
        userinput.playerInput();
    }
}
