package crazyconnect4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piedad
 */

   

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class Menu {

  String userInput;
  Scanner inFile = new Scanner(System.in);

  Menu() {

  }

  public void getInput() {
  this.displayMenu();

  // get commaned entered
  userInput = inFile.nextLine();
  userInput = userInput.trim().toUpperCase();

  }

  // displays the help menu
  public final void displayMenu() {
  System.out.println("\tEnter the letter associated with one of the following commands:");

  for (String[] menuItem : MainMenu.mainMenuItems) {
  System.out.println("\t " + menuItem[0] + "\t" + menuItem[1]);
  }
  }
}
 

