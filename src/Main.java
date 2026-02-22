import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //Number Staircase function.
        Scanner sc = new Scanner(System.in);
        System.out.println("--- NUMBER STAIRCASE PATTERN ---");
        System.out.print("Enter number of rows: ");
        int indexStaircase = Integer.parseInt(sc.nextLine());
        if (indexStaircase>=0){

            //upper indexes
            ArrayList<Integer> ladder = new ArrayList<Integer>();
            for (int column = 1;column<=indexStaircase;column++){
                ladder.add(column);
                System.out.println(ladder);
            }
        }
        else {
            System.out.println("Error: Number of rows must be a positive integer.");
        }

        //Multiplication table function
        System.out.println("--- MULTIPLICATION TABLE ---");
        System.out.print("Enter a number : ");
        int indexMultiplication = Integer.parseInt(sc.nextLine());
        for (int count = 1 ;count<=indexMultiplication;count++){
            int Process = indexMultiplication * count;
            System.out.printf("%d   x   %d  = %d\n",indexMultiplication, count, Process );
        }
    }
}