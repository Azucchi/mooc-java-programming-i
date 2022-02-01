
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String who = "";
        int years = 0;
        int tally = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String info[] = input.split(",");
            if(info[0].length() > length){
                length = info[0].length();
                who = info[0];
            }
            years += Integer.valueOf(info[1]);
            tally++;                       
        }
        
        System.out.println("Longest name: " + who);
        System.out.println("Average of the birth years:" + (1.0 * years / tally));


    }
}
