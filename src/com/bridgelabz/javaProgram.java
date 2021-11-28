package com.bridgelabz;
import java.util.Scanner;

public class javaProgram {

    public static void main(String[] args) {

        System.out.println("Welcome to java Program");

        int b, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        b = sc.nextInt();
        System.out.print("Enter the exponent: ");
        e = sc.nextInt();
        //invokes the pow() method of the Math class
        double power = Math.pow(b, e);
        //prints result
        System.out.println(b +" to the power " +e + " is: "+power);
    }
}
