
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(a,b);

    }
    
    public static void divisibleByThreeInRange(int first, int second) {
        while (first <= second) {
            if (first % 3 == 0){
                System.out.println(first);
            }
            first++;
        }
    }

}
