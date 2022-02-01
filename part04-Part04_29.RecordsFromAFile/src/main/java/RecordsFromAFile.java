
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> info = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try (Scanner getFile = new Scanner(Paths.get(fileName))){
            while (getFile.hasNextLine()){
                String line = getFile.nextLine();
                String[] parts = line.split(",");
                Person newInfo = new Person(parts[0], Integer.valueOf(parts[1]));
                info.add(newInfo);
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        for(Person each : info){
            System.out.println(each);
        }
        

    }
}
