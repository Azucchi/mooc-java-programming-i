
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int result = 0;
        
        try (Scanner getFile = new Scanner(Paths.get(file))){
            while (getFile.hasNextLine()){
                int value = Integer.valueOf(getFile.nextLine());
                if (value >= lowerBound && value <= upperBound) {
                    result++;
                }
            }
            
            
        } catch (Exception e) {
            System.out.println("error");
        }
        
        System.out.println("Numbers: " + result);

    }

}
