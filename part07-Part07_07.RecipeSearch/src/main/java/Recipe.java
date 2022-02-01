
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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
      
    public Recipe(ArrayList<String> info){
        this.name = info.get(0);
        this.cookingTime = Integer.valueOf(info.get(1));
        this.ingredients = new ArrayList<>();
        
        for (int i = 2; i < info.size(); i++){
            this.ingredients.add(info.get(i));
        }
    }
    
    public void addName(String name){
        this.name = name;
    }
    
    public void cookingTime(int time){
        this.cookingTime = time;
    }
    
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    
    
    
    
    
    
    
    
}
