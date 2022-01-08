package com.bridgelabz;

import java.util.Scanner;

import  java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {

       // float first = 1.20f, second = 2.45f;

        Scanner sc = new  Scanner(System.in);

        int first , second;
        System.out.println("Enter First Number :");
        first =sc.nextInt();
        System.out.println("Enter Second Number :");
        second =sc.nextInt();

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        int temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
