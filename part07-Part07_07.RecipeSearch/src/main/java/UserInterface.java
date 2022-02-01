
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private Scanner input;
    private Scanner read;
    private RecipeBook book;
    
    public UserInterface(){
        this.input = new Scanner(System.in);
        this.book = new RecipeBook();
    }
    
    public void start(){
        System.out.println("File to read:");
        String fileToRead = this.input.nextLine();        
        try {
            this.read = new Scanner(Paths.get(fileToRead));
            readFile(read);
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        System.out.println("Enter command: ");
        String command = this.input.nextLine();
        
        switch (command) {
            case "list":
                book.list();
                break;
            case "stop":
                break;
            case "find name":
                System.out.println("Searched word: ");
                String query = input.nextLine();
                book.findName(query);
                break;
            case "find cooking time":
                System.out.println("Max cooking time: ");
                int max = Integer.valueOf(input.nextLine());
                book.findCookingTime(max);
            case "find ingredient":
                System.out.println("Ingredient:");
                String ingredient = input.nextLine();
                book.findIngredient(ingredient);
            default:
                break;
        }
        
    }
    
    public void readFile(Scanner read){
        ArrayList<String> info = new ArrayList<>();
        while(read.hasNextLine()){ // while the file still has content
            String line = read.nextLine();
            
            if(line.isEmpty()){
                Recipe recipe = new Recipe(info);
                book.addRecipe(recipe);
                info.clear();
                continue;                
            }
            
            info.add(line);
                           
                      
        }
        Recipe recipe = new Recipe(info);
        book.addRecipe(recipe);
        
    }
    
    
    
}
