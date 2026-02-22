import java.util.Scanner;

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
// ---------------------------------------------------------------------------------------------------------------------
            // 1. Addition
            if (choice == 1) {
                System.out.println("\n--- Addition ---");
                int addition = 0;
                System.out.println("please enter 2 numbers: ");
                int firstNumber = sc.nextInt();
                int secondNumber = sc.nextInt();
                addition = firstNumber + secondNumber;
                System.out.printf("the sum of %s and %s is %s", firstNumber , secondNumber, addition);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 2. Subtraction
            else if (choice == 2) {
                System.out.println("\n--- Subtraction ---");
                int subtraction = 0;
                System.out.println("please enter 2 numbers: ");
                int firstNumber = sc.nextInt();
                int secondNumber = sc.nextInt();
                subtraction = firstNumber - secondNumber;
                System.out.printf("\nthe differene of %d and %d is %s", firstNumber, secondNumber, subtraction);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 3. Multiplication
            else if (choice == 3) {
                System.out.println("\n--- MULTIPLICATION ---");
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the Second number: ");
                int num2 = sc.nextInt();
                System.out.println("The product of " + num1 + " X " + num2 + " = " + num1 * num2);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 4. Division
            else if (choice == 4) {
                System.out.println("\n--- DIVISION ---");
                System.out.print("Enter first number: ");
                int num40 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num50 = sc.nextInt();
                if (num50 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    double result = (double) num40 / num50;
                    System.out.println("✅ " + num40 + " ÷ " + num50 + " = " + result);
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 5. Modulus
            else if (choice == 5) {
                System.out.println("\n--- Modulus ---");
                System.out.println("Enter First Number:");
                int firstNumber = sc.nextInt();

                System.out.println("Enter Second Number:");
                int secondNumber = sc.nextInt();

                int remainder = 0;
                if (secondNumber == 0) {
                    System.out.println("Error!! Cannot divide by zero.");
                } else {
                    remainder = firstNumber % secondNumber;
                    double result = (double) firstNumber / secondNumber;
                    System.out.println("✅ " + firstNumber + " ÷ " + secondNumber + " = " + result);
                    System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 6. Absolute Value
            else if (choice == 6) {
                System.out.println("\n--- Absolute Value ---");
                System.out.println("Enter Number: ");
                int valueNumber = sc.nextInt();
                int absoluteValue;
                if (valueNumber < 0) {
                    absoluteValue = -valueNumber;
                } else {
                    absoluteValue = valueNumber;
                    System.out.println("|" + valueNumber + "| = " + absoluteValue);
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 7. Power
            else if (choice == 7) {
                System.out.println("\n--- POWER ---");
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                System.out.print("Enter exponent: ");
                int exponent = sc.nextInt();
                int result = 1;
                for (int i = 0; i < exponent; i++) {
                    result = result * base;
                }
                System.out.println(base + " ^ " + exponent + " = " + result);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 8. Square Root
            else if (choice == 8) {
                System.out.println("\n--- SQUARE ROOT ---");
                System.out.print("Enter a number: ");
                double number1 = sc.nextDouble();
                if (number1 < 0) {
                    System.out.println("Error: Cannot compute square root of a negative number.");
                    return;
                }
                double guess = 0.0;
                double increment = 0.001;
                while (guess * guess <= number1) {
                    guess += increment;
                }
                guess -= increment;

                System.out.println(number1 + " ≈ " + guess);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 9. Factorial
            else if (choice == 9) {
                System.out.println("\n--- Factorial ---");
                System.out.print("Enter a non-negative integer: ");
                int num = sc.nextInt();
                // Factorial
                if (num < 0) {
                    System.out.println("Factorial not defined for negative.");
                } else {
                    int result = 1;
                    for (int i = 1; i <= num; i++) {
                        result = result * i;
                    }
                    System.out.println("Factorial of " + num + " = " + result);
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 10. Even / Odd Check
            else if (choice == 10) {
                System.out.println("\n--- Even / Odd Check ---");
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is Even");
                } else {
                    System.out.println(number + " is Odd");
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 11. Reverse a Number
            else if (choice == 11) {}
// ---------------------------------------------------------------------------------------------------------------------
            // 12. Palindrome Check
            else if (choice == 12) {}
// ---------------------------------------------------------------------------------------------------------------------
            // 13. Sum of Digits
            else if (choice == 13) {
                System.out.println("\n--- SUM OF DIGITS ---");
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                int temp = Math.abs(number);
                int sum = 0;

                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }

                System.out.println(" Sum of digits of " + number + " = " + sum);
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 14. Count Digits
            else if (choice == 14) {
                System.out.println("\n--- COUNT DIGITS ---");
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                int temp = Math.abs(number);
                int count = 0;
                if (temp == 0) {
                    count = 1;
                } else {
                    while (temp > 0) {
                        temp /= 10;
                        count++;
                    }
                }
                System.out.println(number + " has " + count + " digit(s).");
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 15. Triangle Pattern
            else if (choice == 15) {
                System.out.println("\n--- Triangle Pattern ---");
                System.out.print("Please enter the number of rows: ");
                int userRows = sc.nextInt();

                if (userRows <= 0) {
                    System.out.println("Error, entered number is negative ");
                }
                else {
                    for (int rows = 1; rows <= userRows; rows++) {
                        for (int repeatRow = 1; repeatRow <= rows; repeatRow++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 16. Inverted Triangle Pattern
            else if (choice == 16) {
                System.out.println("\n--- Triangle Pattern ---");
                System.out.print("Please enter the number of rows: ");
                int userRows = sc.nextInt();
                    if (userRows <= 0) {
                        System.out.println("Error, entered number is negative ");
                    }
                for (int rows = userRows; rows >= 1; rows--) {
                    for (int repeatRow = 1; repeatRow <= rows; repeatRow++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
// ---------------------------------------------------------------------------------------------------------------------
            // 17.Number Staircase Pattern
            else if (choice == 17) {}
// ---------------------------------------------------------------------------------------------------------------------
            // 18. Multiplication Table
            else if (choice == 18) {}
// ---------------------------------------------------------------------------------------------------------------------
            // 0. Exit
            else if (choice == 0) {
                System.out.println("\uD83D\uDC4B Goodbye! Thanks for using the calculator.\n");
                running = false;
            }
// ---------------------------------------------------------------------------------------------------------------------
            // Invalid choice
            else {
                System.out.println("⚠\uFE0F Invalid choice. Please enter a number between 0 and 18.\n");
            }
        }
    }
}