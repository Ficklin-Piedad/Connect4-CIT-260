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
public class SortScores 
{
    int[] array;
    String greeting = "Welcome! We will display your scores from lowest to highest.\n";

    @SuppressWarnings("empty-statement")
    SortScores() 
    {
    }
    
    public void caller()
    {
        System.out.println(this.greeting);

        //variables
        boolean valid = true;
        String choose = null;
        String invalidEntry = "\nWrong Entry, Please try again.\n";

        while (valid) {
            //user entry
            Scanner input = new Scanner(System.in);
            System.out.println("Do you know your scores?");
            System.out.println("1. Yes\t2. No\n");
            choose = input.nextLine();

            //validating user entry
            if (choose == null || choose.length() < 1) {
                System.out.println(invalidEntry);
            } else {
                if (choose.equals("1") || choose.equals("2")) {
                    break;
                } else {

                    System.out.println(invalidEntry);
                }
            }
        }
        //option 1
        if (choose.equals("1")) {
            //user array
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
                
            System.out.println("\n\nThis is what you entered:\n" + Arrays.toString(array));

            SortingArrays sorted = new SortingArrays();
            sorted.AlgorithmQuickSort(array);

            //print the sorted array
            System.out.println("\nThese are your scores from lowest to highest!:\n" + Arrays.toString(array));
            }
            //option 2  
            else if (choose.equals("2")) {
            //user array
            System.out.println("\nCome back when you know your scores!\n");
            
            }

        }
    
        public static void main(String[] args) throws IOException {
        
        SortScores sortscores = new SortScores();
        sortscores.caller();
    }
}
