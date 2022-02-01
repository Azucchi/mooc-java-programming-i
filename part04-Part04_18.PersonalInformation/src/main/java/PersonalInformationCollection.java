
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name:");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            } else{
                System.out.println("Last name: ");
                String last = scanner.nextLine();
                System.out.println("Identification number: ");
                String id = scanner.nextLine();
                infoCollection.add(new PersonalInformation(name, last, id));
            }
            
        }
        
        for (PersonalInformation each: infoCollection){
            System.out.println(each.getFirstName() + " " + each.getLastName());
        }

    }
}
