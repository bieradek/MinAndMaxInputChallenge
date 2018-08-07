package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int previous;
        int next;


        while (true) {
            System.out.println("Enter number:");
            boolean validNumber = input.hasNextInt();
            int number = input.nextInt();
            if (validNumber) {
                previous = number;
                if (previous < number) {
                    System.out.println("Minimum is equal to " + previous);
                    System.out.println("Maximum is equal to " + number);
                } else {
                    System.out.println("Minimum is equal to " + number);
                    System.out.println("Maximum is equal to " + previous);
                }
            } else {
                break;
            }
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
