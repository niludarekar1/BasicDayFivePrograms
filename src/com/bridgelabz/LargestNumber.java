package com.bridgelabz;

import  java.util.Scanner;
public class LargestNumber {

        public static void main(String[] args) {

           // double n1 = -4.5, n2 = 3.9, n3 = 2.5;

            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a First Number: ");
            int n1 = reader.nextInt();

            System.out.print("Enter a Second Number: ");
            int n2 = reader.nextInt();

            System.out.print("Enter a Third Number: ");
            int n3 = reader.nextInt();

            if( n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number.");

            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number.");

            else
                System.out.println(n3 + " is the largest number.");
        }
    }

