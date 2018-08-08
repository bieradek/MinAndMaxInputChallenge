package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Initial number:");
//        boolean validNumber = input.hasNextInt();
//        while (validNumber) {
//            int firstNumber = input.nextInt();
//            input.nextLine();
//            System.out.println("Enter number");
//            validNumber = input.hasNextInt();
//            int secondNumber = input.nextInt();
//            input.nextLine();
//            if (firstNumber > secondNumber) {
//                System.out.println("Maximum is " + firstNumber);
//            } else {
//                System.out.println("Maximum is " + secondNumber);
//            }
//            input.nextLine();
//        }
//        input.close();

// *********************************************** TIMS CODE ********************************************
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean validNumber = scanner.hasNextInt();
            if (validNumber) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                //after first iteration the code below won't be executed
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min=" + min + ", max= " + max);
        scanner.close();
    }
}

/*
7
2
3
4
6
1
2
 */
