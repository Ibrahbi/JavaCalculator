import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("WELCOME TO THE CALCULATOR");

        while (true) {

            printMenu();

            System.out.print("Enter your choice (0-18): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 0 and 18.");
                scanner.next(); // clear invalid input
                continue;
            }

            int choice = scanner.nextInt();

            if (choice < 0 || choice > 18) {
                System.out.println("Invalid choice! Please select a number between 0 and 18.");
                continue;
            }

            if (choice == 0) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            // Route to correct method
            switch (choice) {
                case 1: addition(); break;
                case 2: subtraction(); break;
                case 3: multiplication(); break;
                case 4: division(); break;
                case 5: modulus(); break;
                case 6: absoluteValue(); break;
                case 7: power(); break;
                case 8: squareRoot(); break;
                case 9: factorial(); break;
                case 10: evenOddCheck(); break;
                case 11: reverseNumber(); break;
                case 12: palindromeCheck(); break;
                case 13: sumOfDigits(); break;
                case 14: countDigits(); break;
                case 15: trianglePattern(); break;
                case 16: invertedTrianglePattern(); break;
                case 17: numberStaircasePattern(); break;
                case 18: multiplicationTable(); break;
            }
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\n----------------------------------------");
        System.out.println(" 1  - Addition");
        System.out.println(" 2  - Subtraction");
        System.out.println(" 3  - Multiplication");
        System.out.println(" 4  - Division");
        System.out.println(" 5  - Modulus");
        System.out.println(" 6  - Absolute Value");
        System.out.println(" 7  - Power");
        System.out.println(" 8  - Square Root");
        System.out.println(" 9  - Factorial");
        System.out.println("10  - Even / Odd Check");
        System.out.println("11  - Reverse a Number");
        System.out.println("12  - Palindrome Check");
        System.out.println("13  - Sum of Digits");
        System.out.println("14  - Count Digits");
        System.out.println("15  - Triangle Pattern");
        System.out.println("16  - Inverted Triangle Pattern");
        System.out.println("17  - Number Staircase Pattern");
        System.out.println("18  - Multiplication Table");
        System.out.println(" 0  - Exit");
        System.out.println("----------------------------------------");
    }

    // Stub Methods
    public static void addition() { System.out.println("Addition selected."); }
    public static void subtraction() { System.out.println("Subtraction selected."); }
    public static void multiplication() { System.out.println("Multiplication selected."); }
    public static void division() { System.out.println("Division selected."); }
    public static void modulus() { System.out.println("Modulus selected."); }
    public static void absoluteValue() { System.out.println("Absolute Value selected."); }
    public static void power() { System.out.println("Power selected."); }
    public static void squareRoot() { System.out.println("Square Root selected."); }
    public static void factorial() { System.out.println("Factorial selected."); }
    public static void evenOddCheck() { System.out.println("Even / Odd Check selected."); }
    public static void reverseNumber() { System.out.println("Reverse Number selected."); }
    public static void palindromeCheck() { System.out.println("Palindrome Check selected."); }
    public static void sumOfDigits() { System.out.println("Sum of Digits selected."); }
    public static void countDigits() { System.out.println("Count Digits selected."); }
    public static void trianglePattern() { System.out.println("Triangle Pattern selected."); }
    public static void invertedTrianglePattern() { System.out.println("Inverted Triangle Pattern selected."); }
    public static void numberStaircasePattern() { System.out.println("Number Staircase Pattern selected."); }
    public static void multiplicationTable() { System.out.println("Multiplication Table selected."); }
}