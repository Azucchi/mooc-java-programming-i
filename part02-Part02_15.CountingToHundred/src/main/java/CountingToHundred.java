
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int input = Integer.valueOf(scanner.nextLine()); input <= 100; input++) {
            System.out.println(input);
        }

    }
}
