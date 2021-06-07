package ex11;

import java.util.Scanner;

/*
Example Output
How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.38 U.S. dollars.
Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
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
