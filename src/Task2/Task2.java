package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = input.nextInt();

        System.out.print("Enter minutes: ");
        int m = input.nextInt();

        System.out.print("Enter seconds: ");
        int s = input.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Invalid time.");
        } else {
            s = s + 1;

            if (s == 60) {
                s = 0;
                m = m + 1;
            }

            if (m == 60) {
                m = 0;
                h = h + 1;
            }

            if (h == 24) {
                h = 0;
            }

            System.out.printf("Time after one second: %02d:%02d:%02d%n", h, m, s);
        }

        input.close();
    }
}
