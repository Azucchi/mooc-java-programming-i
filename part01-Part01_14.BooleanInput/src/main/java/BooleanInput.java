
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean statement = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + statement);

        // write your program here

    }
}
