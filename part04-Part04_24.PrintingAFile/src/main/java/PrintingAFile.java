
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
      try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

    // we read the file until all lines have been read
    while (scanner.hasNextLine()) {
        // we read one line
        // we print the line that we read
        System.out.println(scanner.nextLine());
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
    }
}
