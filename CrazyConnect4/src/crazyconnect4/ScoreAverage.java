/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kylugo
 */
public class ScoreAverage {
    
    int[] array;
    int sum;
    String greeting = "Welcome to the Statistics Menu!\n "
            + "Choose what you would like to view!\n";
    
    @SuppressWarnings("empty-statement")
            
    public ScoreAverage() 
    {
    }
    
    public void scoreoption()
    {
        System.out.println(this.greeting);

        //variables
        boolean valid = true;
        String choose = null;
        String invalidEntry = "\nWrong Entry, Please try again.\n";

        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many scores are there? ");
        int longArray = scan.nextInt();

            //declare a new variable array
        int[] array = new int[longArray];

            //ask for the array size
        System.out.println("\nEnter in " + longArray + " scores:");

            //create a new array with user input
        for (int i = 0; i < array.length; i++) 
        {

            System.out.print("Score " + (i + 1) +": ");
            array[i] = scan.nextInt();
        }
                
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

            //print the sorted array
            System.out.println("\nThis is the average of the scores:\n" + average);
    }
            
    
    public static void main(String[] args) throws IOException {
        
        ScoreAverage scoreaverage = new ScoreAverage();
        scoreaverage.scoreoption();
    }
}
