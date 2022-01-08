package com.bridgelabz;

import java.util.Scanner;

public class QuotientandReminder {

        public static void main(String[] args) {

            Scanner sc = new  Scanner(System.in);

            int dividend , divisor;
            System.out.println("Enter Divident :");
            dividend =sc.nextInt();
            System.out.println("Enter Divisor :");
            divisor =sc.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
    }

