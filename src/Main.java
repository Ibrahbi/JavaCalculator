import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("╔══════════════════════════════╗\n"
                             + "║    \uD83E\uDDEE CLI Java Calculator    ║\n"
                             + "╚══════════════════════════════╝");

            System.out.println("1.  Addition              10. Even / Odd Check\n"
                    + "2.  Subtraction           11. Reverse a Number\n"
                    + "3.  Multiplication        12. Palindrome Check\n"
                    + "4.  Division              13. Sum of Digits\n"
                    + "5.  Modulus               14. Count Digits\n"
                    + "6.  Absolute Value        15. Triangle Pattern\n"
                    + "7.  Power                 16. Inverted Triangle Pattern\n"
                    + "8.  Square Root           17. Number Staircase Pattern\n"
                    + "9.  Factorial             18. Multiplication Table\n"
                    + "0.  Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // 1. Addition
            if (choice == 1) {}

            // 2. Subtraction
            else if (choice == 2) {}

            // 3. Multiplication
            else if (choice == 3) {
                System.out.println("\n--- MULTIPLICATION ---");
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the Second number: ");
                int num2 = sc.nextInt();
                System.out.println("The product of " + num1 + " X " +  num2 + " = " + num1 * num2);
            }

            // 4. Division
            else if (choice == 4) {
                System.out.println("\n--- DIVISION ---");
                System.out.print("Enter first number: ");
                int num40 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num50 = sc.nextInt();
                if (num50 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                }
                else {
                    double result = (double) num40 / num50;
                    System.out.println("✅ " + num40 + " ÷ " + num50 + " = " + result);
                }
            }

            // 5. Modulus
            else if (choice == 5) {}

            // 6. Absolute Value
            else if (choice == 6) {}

            // 7. Power
            else if (choice == 7) {}

            // 8. Square Root
            else if (choice == 8) {}

            // 9. Factorial
            else if (choice == 9) {
                System.out.println("\n--- Factorial ---");
                System.out.print("Enter a non-negative integer: ");
                int num = sc.nextInt();
                // Factorial
                if (num < 0) {
                    System.out.println("Factorial not defined for negative.");
                }
                else {
                    int result = 1;
                    for (int i = 1; i <= num; i++) {
                        result = result * i;
                    }
                    System.out.println("Factorial of " + num + " = " + result);
                }
            }

            // 10. Even / Odd Check
            else if (choice == 10) {
                System.out.println("\n--- Even / Odd Check ---");
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is Even");
                }
                else {
                    System.out.println(number + " is Odd");
                    }
            }

            // 11. Reverse a Number
            else if (choice == 11) {}

            // 12. Palindrome Check
            else if (choice == 12) {}

            // 13. Sum of Digits
            else if (choice == 13) {}

            // 14. Count Digits
            else if (choice == 14) {}

            // 15. Triangle Pattern
            else if (choice == 15) {}

            // 16. Inverted Triangle Pattern
            else if (choice == 16) {}

            // 17.Number Staircase Pattern
            else if (choice == 17) {}

            // 18. Multiplication Table
            else if (choice == 18) {}

            // 0. Exit
            else if (choice == 0) {
                System.out.println("\uD83D\uDC4B Goodbye! Thanks for using the calculator.\n");
                running = false;
            }

            // Invalid choice
            else {
                System.out.println("⚠\uFE0F Invalid choice. Please enter a number between 0 and 18.\n");
            }
        }
    }
}