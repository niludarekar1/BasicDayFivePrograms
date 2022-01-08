package com.bridgelabz;

import java.util.Scanner;

import  java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {


        Scanner sc = new  Scanner(System.in);

        int first , second;
        System.out.println("Enter First Number :");
        first =sc.nextInt();
        System.out.println("Enter Second Number :");
        second =sc.nextInt();

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        int temporary = first;

        first = second;

        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
