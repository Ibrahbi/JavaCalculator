import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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


        // Addition & subtraction
        Scanner inputBufferObj = new Scanner(System.in);
        int addition = 0;
        int subtraction = 0;

        System.out.println("please enter 2 numbers: ");
        int firstNumber = inputBufferObj.nextInt();
        int secondNumber = inputBufferObj.nextInt();

        addition = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;

        System.out.printf("the sum of %s and %s is %s", firstNumber , secondNumber, addition);
        System.out.printf("\nthe differene of %d and %d is %s", firstNumber, secondNumber, subtraction);



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

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//================================ hk start  TASK 8
            Scanner sc = new Scanner(System.in);

            System.out.println("--- SUM OF DIGITS ---");
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int temp = Math.abs(number);
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            System.out.println(" Sum of digits of " + number + " = " + sum);

            System.out.println("\n--- COUNT DIGITS ---");
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            temp = Math.abs(number);
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

            sc.close();

            //================================ hk end

            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");
            // *************** Triangle Pattern & Inverted Triangle Pattern *************************
            // Sulaiman


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

            System.out.println(base + " ^ " + exponent + " = " + result);

            // SQUARE ROOT
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


            // *************** Triangle Pattern & Inverted Triangle Pattern *************************
            System.out.println("\t Triangle Pattern\t");
            System.out.println("Please enter the number of rows");
            int userRows = sc.nextInt();

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
                // =========== Modulus =============
                System.out.println("Modulus");
                System.out.println("Enter First Number:");
                int firstNumber = scanner.nextInt();

                System.out.println("Enter Second Number:");
                int secondNumber = scanner.nextInt();

                int remainder = 0;
                if (secondNumber == 0) {
                    System.out.println("Error!! Cannot divide by zero.");
                } else {
                    remainder = firstNumber % secondNumber;
                    double result1 = (double) firstNumber / secondNumber;
                    System.out.println("✅ " + number + " ÷ " + number + " = " + result);

                    System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);

                    if (userRows <= 0) {
                        System.out.println("Error, entered number is negative ");
                    } else {
                        System.out.println("--- TRIANGLE PATTERN ---");
                        for (int rows = 1; rows <= userRows; rows++) {
                            for (int repeatRow = 1; repeatRow <= rows; repeatRow++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        System.out.println("--- INVERTED TRIANGLE PATTERN ---");
                        for (int rows = userRows; rows >= 1; rows--) {
                            for (int repeatRow = 1; repeatRow <= rows; repeatRow++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        // =========== Multiplication & Division =============

                        System.out.println("--- MULTIPLICATION ---");

                        System.out.println("Enter the first number");
                        int num90 = sc.nextInt();

                        System.out.println("Enter the secound number");
                        int num80 = sc.nextInt();

                        System.out.println(" The product of the first number and secound number is :  " + num90 * num80);


                        // ================= DIVISION =================

                        System.out.println("\n--- DIVISION ---");
                        System.out.print("Enter first number: ");
                        int num40 = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int num50 = sc.nextInt();

                        if (num50 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            double result2;
                            result2 = (double) num40 / num50;
                            System.out.println("✅ " + num40 + " ÷ " + num50 + " = " + result);
                        }

                        sc.close();

                    }
                    // =========== Absolute Value =============
                    System.out.println("Absolute Value");
                    System.out.println("Enter Number:");
                    int valueNumber = scanner.nextInt();

                    int absoluteValue;
                    if (valueNumber < 0) {
                        absoluteValue = -valueNumber;
                    } else {
                        absoluteValue = valueNumber;
                        System.out.println("|" + valueNumber + "| = " + absoluteValue);


                        class main {
                            public static void main(String[] args) {


                                // =========== Multiplication & Division =============

                                Scanner sc = new Scanner(System.in);
                                System.out.println("--- MULTIPLICATION ---");

                                System.out.println("Enter the first number");
                                int num90 = sc.nextInt();

                                System.out.println("Enter the secound number");
                                int num80 = sc.nextInt();

                                System.out.println(" The product of the first number and secound number is :  " + num90 * num80);


                                // ================= DIVISION =================

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



                                    //==== Addition & subtraction
                                    Scanner inputBufferObj = new Scanner(System.in);
                                    int addition = 0;
                                    int subtraction = 0;

                                    System.out.println("please enter 2 numbers: ");
                                    int firstNumber = inputBufferObj.nextInt();
                                    int secondNumber = inputBufferObj.nextInt();

                                    addition = firstNumber + secondNumber;
                                    subtraction = firstNumber - secondNumber;

                                    System.out.printf("the sum of %s and %s is %s", firstNumber , secondNumber, addition);
                                    System.out.printf("\nthe differene of %d and %d is %s", firstNumber, secondNumber, subtraction);


                                }
                            }
                        }
                    }
                }
            }
        }
    }

