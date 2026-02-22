import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Sulaiman

        Scanner sc = new Scanner(System.in);

        // POWER
        System.out.println("\n--- POWER ---");

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        System.out.println( base + " ^ " + exponent + " = " + result);

        // SQUARE ROOT
        System.out.println("\n--- SQUARE ROOT ---");

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
            return;
        }

        double guess = 0.0;
        double increment = 0.001;

        while (guess * guess <= number) {
            guess += increment;
        }

        guess -= increment;

        System.out.println(number + " ≈ " + guess);
    }
}