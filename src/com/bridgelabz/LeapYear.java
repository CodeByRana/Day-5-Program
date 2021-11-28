package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Welcome to java Program");

        int year;
        System.out.println("Enter an Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("a leap year");
        else
            System.out.println("not a leap year");

    }
}
