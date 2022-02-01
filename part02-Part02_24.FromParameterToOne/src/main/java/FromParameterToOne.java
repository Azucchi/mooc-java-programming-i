import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.valueOf(input.nextLine());
        printFromNumberToOne(8);
    }
    
    public static void printFromNumberToOne(int num) {
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }

}
