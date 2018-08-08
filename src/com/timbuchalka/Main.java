package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Initial number:");
        boolean validNumber = input.hasNextInt();
        while (validNumber) {
            int firstNumber = input.nextInt();
            input.nextLine();
            System.out.println("Enter number");
            validNumber = input.hasNextInt();
            int secondNumber = input.nextInt();
            input.nextLine();
            if (firstNumber > secondNumber) {
                System.out.println("Maximum is " + firstNumber);
            } else {
                System.out.println("Maximum is " + secondNumber);
            }
            input.nextLine();
        }
        input.close();
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
