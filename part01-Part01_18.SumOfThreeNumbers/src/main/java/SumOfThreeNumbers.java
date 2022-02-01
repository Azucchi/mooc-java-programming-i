
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int sum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        sum = Integer.valueOf(scanner.nextLine()) + sum;
        System.out.println("Give the third number:");
        sum = Integer.valueOf(scanner.nextLine()) + sum;
        System.out.println("The sum of the numbers is " + sum);

    }
}
