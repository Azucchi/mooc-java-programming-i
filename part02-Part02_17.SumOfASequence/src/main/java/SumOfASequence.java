
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int initial = 1; initial <= last; initial++){
            sum += initial;
        }        
        System.out.println("The sum is " + sum);

    }
}
