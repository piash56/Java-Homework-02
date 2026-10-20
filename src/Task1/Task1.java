package Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;

            System.out.println("It is an Olympic year.");
            System.out.println("Olympic Games edition: " + edition);
        } else {
            System.out.println("It is not an Olympic year.");
        }

        input.close();
    }
}
