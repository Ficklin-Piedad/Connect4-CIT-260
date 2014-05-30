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
    int count = 1;

    public void userInput() {
    }

    public void playerInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value between 1 and 10: ");
        this.usInput = input.nextLine();
        int userIn = Integer.parseInt(usInput);

        while (userIn >=1 && userIn <= 10) {
            System.out.println("This is a counter: " + userIn);
            count +=2;
            userIn += 1;
            if (userIn == 10) continue;
            
        }
        if (userIn > 10 && count == 1) {
            System.out.println("The value entered is incorrect.");
        }

    }

    public static void main(String[] args) {
        UserInput userinput = new UserInput();
        userinput.playerInput();
    }
}
