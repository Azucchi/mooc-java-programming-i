
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class RecipeBook {
    ArrayList<Recipe> book;
    
    public RecipeBook(){
        book = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        book.add(recipe);
    }
    
    public void list(){
        System.out.println("Recipes:");
        for (Recipe each: book){
            System.out.println(each.getName() + ", cooking time: " + each.getCookingTime());
        }
    }
    
    public void findName(String search){
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for (Recipe each: this.book){
            if(each.getName().contains(search)){
                searchResults.add(each);
            }
        }
        
        list(searchResults);
    }
    
    public void list(ArrayList<Recipe> searchResults){
        System.out.println("Recipes:");
        for (Recipe each: searchResults){
            System.out.println(each.getName() + ", cooking time: " + each.getCookingTime());
        }
    }
    
    public void findCookingTime(int max){
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for (Recipe each: this.book){
            if(each.getCookingTime() <= max){
                searchResults.add(each);
            }
        }
        list(searchResults);
    }
    
    public void findIngredient(String ingredient){
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for (Recipe each: this.book){
            if(each.getIngredients().contains(ingredient)){
                searchResults.add(each);
            }
        }
        
        list(searchResults);
    }
}
