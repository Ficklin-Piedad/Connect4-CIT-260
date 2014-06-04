package crazyconnect4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henrydiazlds
 */
public class SortPrinter {

    int[] arreglo;

    @SuppressWarnings("empty-statement")
    SortPrinter() {
    }
    public void caller(){

        //variables
        boolean valid = true;
        String choose = null;
        String invalidEntry = "Wrong Entry, Please try again.\n";

        while (valid) {
            //user entry
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to use \"DUMMY\" data, or do you want enter you own Array?");
            System.out.println("1. Dummy Data\t2.Your Data:");
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
            //DUMMY data
            int[] arreglo = {4, 2, 7, 1, 9, 14, 12, 42, 19, 23, 6, 16, 3, 15, 24};
            System.out.println("Using \"DUMMY\" data...");
            System.out.println("\nUnsorted Array:\n" + Arrays.toString(arreglo));

            //call the sorting class
            SortingArrays sorted = new SortingArrays();
            sorted.AlgorithmQuickSort(arreglo);

            //print the sorted array
            System.out.println("\nSorted Array:\n" + Arrays.toString(arreglo));

            //option 2  
        } else if (choose.equals("2")) {
            //user array
            Scanner scan = new Scanner(System.in);
            System.out.print("How many integer would you like to enter? : ");
            int longArray = scan.nextInt();

            //declare a new variable array
            int[] arreglo = new int[longArray];

            //ask for the array size
            System.out.println("\nEnter in " + longArray + " integers:");

            //create a new array with user input
            for (int i = 0; i < arreglo.length; i++) {

                System.out.print("Integer[" + (i + 1) + "] : ");
                arreglo[i] = scan.nextInt();
            }

            System.out.println("\n\nThis is what you entered:\n" + Arrays.toString(arreglo));

            SortingArrays sorted = new SortingArrays();
            sorted.AlgorithmQuickSort(arreglo);

            //print the sorted array
            System.out.println("\nand this is what I did:\n" + Arrays.toString(arreglo));
        }
    }
}
