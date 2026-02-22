import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
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

        System.out.println(  number + " has " + count + " digit(s).");

        sc.close();

        //================================ hk end





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

        System.out.println( base + " ^ " + exponent + " = " + result);

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
                double result1 = (double) num40 / num50;
                System.out.println("✅ " + num40 + " ÷ " + num50 + " = " + result);
            }

            sc.close();

        }


    }
}

