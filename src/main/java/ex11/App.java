package ex11;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */


public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("How many euros are you exchanging? ");
        int euros = input.nextInt();
        System.out.print("What is the exchange rate? ");
        float rate = input.nextFloat();

        float dollars = euros * rate;

        System.out.printf("%d euros at an exchange rate of %f is\n%.2f U.S. dollars.", euros, rate, dollars);

    }
}
