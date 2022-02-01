
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double tax = 0;
        double base = 0;
        double rate = 0;
        double lower = 0;
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        
        
        if (value >=5000 && value < 25000) {
            base = 100;
            rate = 0.08;
            lower = 5000;
        } else if (value >=25000 && value < 55000) {
            base = 1700;
            rate = 0.10;
            lower = 25000;
        } else if (value >=55000 && value < 200000) {
            base = 4700;
            rate = 0.12;
            lower = 55000;
        } else if (value >=200000 && value < 1000000) {
            base = 22100;
            rate = 0.15;
            lower = 200000;
        } else if (value >1000000) {
            base = 142100;
            rate = 0.17;
            lower = 1000000;
        }
        
        if (lower == 0) {
            System.out.println("No tax!");
        } else {
            tax = base + (value - lower)*rate;
            System.out.println("Tax: " + tax);
        }

    }
}
