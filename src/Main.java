import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//================================ hk start
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


    }
}