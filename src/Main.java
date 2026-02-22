import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
        }
    }

    }

