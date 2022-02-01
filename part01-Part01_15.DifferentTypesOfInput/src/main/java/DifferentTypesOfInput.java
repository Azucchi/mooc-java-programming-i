
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String firstInput = scanner.nextLine();
        System.out.println("Give an integer:");
        int secondInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double thirdInput = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean fourthInput = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + firstInput);
        System.out.println("You gave the integer " + secondInput);
        System.out.println("You gave the double " + thirdInput);
        System.out.println("You gave the boolean " + fourthInput);
        
        
        
        // Write your program here

    }
}
