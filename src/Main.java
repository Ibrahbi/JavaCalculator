import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Reverse a Number
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a digit: ");
        int digit = scan.nextInt();
        scan.nextLine();
        System.out.printf("The reversed number of (%d) is: %d \n",digit,reverse(digit));
        
        // Palindrome Check
        if (reverse(digit) == digit){
            System.out.println("The number is Palindrome");
        }
        else {
            System.out.println("The number is not Palindrome");
        }
        

    }

    // Function to reverse the number
    static int reverse(int n){
        // reversed number
        int rev = 0;
        // remainder
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }
}