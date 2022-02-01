
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
    private Scanner scanner;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        Birds birds = new Birds();
        
        
        while(true){
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")){
                break;
            }
            
            switch(command){
                
                
                
                case "Add":
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin:");
                    String latin = scanner.nextLine();
                    Bird newBird = new Bird(name, latin);
                    birds.addBird(newBird);
                    break;
                    
                case "Observation":
                    System.out.println("Bird?");
                    String observedBird = scanner.nextLine();
                    birds.observe(observedBird);
                    break;
                    
                case "All":
                    birds.all();
                    break;
                    
                case "One":
                    System.out.println("Bird?");
                    String one = scanner.nextLine();
                    birds.one(one);
                    break;
                                                   
            }
            
        }
        
    }
}
