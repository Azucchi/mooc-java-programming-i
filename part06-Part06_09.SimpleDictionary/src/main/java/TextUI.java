
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary words;
    
    public TextUI(Scanner scanner, SimpleDictionary words){
        this.scanner = scanner;
        this.words = words;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                words.add(word,translation);
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                String translated = scanner.nextLine();
                if (words.translate(translated) == null){
                    System.out.println("Word " + translated + " was not found");
                } else
                System.out.println("Translation:" + words.translate(translated));
            }
            
            else {
                System.out.println("Unknown command");
            }
                        
        }
    }
}
