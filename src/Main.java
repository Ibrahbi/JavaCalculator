import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        // =========== Multiplication & Division =============

        Scanner sc= new Scanner(System.in);
        System.out.println("--- MULTIPLICATION ---");

        System.out.println("Enter the first number");
        int num90= sc.nextInt();

        System.out.println("Enter the secound number");
        int num80=sc.nextInt();

        System.out.println(" The product of the first number and secound number is :  " +num90*num80);


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


        sc.close();


    }
}