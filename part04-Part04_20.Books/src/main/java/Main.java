import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            } else{
                System.out.println("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.println("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());
                book.add(new Book(title, pages, year));
            }
        }
        
        System.out.println("What information will be printed?");
        String decision = scanner.nextLine();
        
        for(Book each: book){
            each.decision(decision);
        }
        
        
       /* if(decision.equals("name")){
            for(Book each: book){
                System.out.println(each.getName());
            }
        } else {
            for(Book each: book){
                System.out.println(each);
            }
        }
*/
    }
}
