package com.Santhosh;//Write a program to print whether a number is even or odd, also take input from the user.


import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check whether number is even or odd : ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("The number " + num + " is Even .");
        }
        else
        {
            System.out.println("The number " + num + " is Odd .");
        }
    }
}
