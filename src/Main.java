import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

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
        }

        System.out.println("Absolute Value");
        System.out.println("Enter Number:");
        int number = scanner.nextInt();

        int absoluteValue;
        if (number < 0) {
            absoluteValue = -number;
        } else {
            absoluteValue = number;
        System.out.println("|" + number + "| = " + absoluteValue);

        }
    }
}