
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        try (Scanner readFile = new Scanner(Paths.get(file))){
            
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                String[] info = line.split(",");
                Person newInfo = new Person(info[0], Integer.valueOf(info[1]));
                persons.add(newInfo);
            }
            
        } catch (Exception e){
            System.out.println("error");
        }
        
        
        return persons;

    }
}
