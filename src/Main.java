import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // *************** Triangle Pattern & Inverted Triangle Pattern *************************
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Triangle Pattern\t");
        System.out.println("Please enter the number of rows");
        int userRows = sc.nextInt();


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

    }
}

