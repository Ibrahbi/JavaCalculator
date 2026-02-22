import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        // Even/Odd Check
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}