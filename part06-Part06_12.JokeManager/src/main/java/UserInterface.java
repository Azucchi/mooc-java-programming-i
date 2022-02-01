
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
public class UserInterface {
    
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
           
           String input = scanner.nextLine();
           if (input.equals("X")){
               break;
           }
           switch(input){
               
               case "1" :
                   System.out.println("Write the joke to be added:");
                   String newJoke = scanner.nextLine();
                   this.jokes.addJoke(newJoke);
                   break;
               case "2" :
                   System.out.println(this.jokes.drawJoke());
                   break;
               case "3" :
                   System.out.println("Printing the jokes.");
                   this.jokes.printJokes();
                   break;
           }
        }
    }
    
}
