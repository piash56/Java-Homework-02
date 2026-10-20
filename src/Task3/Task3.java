package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year.");
        } else if (year % 400 == 0) {
            System.out.println("It is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println("It is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }

        input.close();
    }
}

