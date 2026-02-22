import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        // *************** Triangle Pattern & Inverted Triangle Pattern *************************
        Scanner sc = new Scanner(System.in);
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
            }
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
                    double result = (double) num40 / num50;
                    System.out.println("✅ " + num40 + " ÷ " + num50 + " = " + result);
                }

                sc.close();

            }
            // =========== Absolute Value =============
            System.out.println("Absolute Value");
            System.out.println("Enter Number:");
            int number = scanner.nextInt();

            int absoluteValue;
            if (number < 0) {
                absoluteValue = -number;
            } else {
                absoluteValue = number;
                System.out.println("|" + number + "| = " + absoluteValue);


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

                        }
                    }
                }
            }
        }
    }
}

