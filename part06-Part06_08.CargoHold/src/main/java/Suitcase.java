
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max){
        items = new ArrayList<>();
        maxWeight = max;
    }
    
    public void addItem(Item item){
        //this.items.add(item);
        if(item.getWeight() > this.maxWeight - getWeight()){
            
        } else {
            this.items.add(item);
        }
    }
    
    public int getWeight(){
        int returnWeight = 0;
        for(Item each: this.items){
            returnWeight += each.getWeight();
        }
        return returnWeight;
    }

    @Override
    public String toString() {
        if (items.isEmpty()){
            return "no items (0 kg)";
        } else if (items.size() == 1){
            return this.items.size() + " item " + "(" + getWeight() + " kg)";
        } else
        return this.items.size() + " items " + "(" + getWeight() + " kg)";
    }
    
    public void printItems(){
        for (Item  each: this.items){
            System.out.println(each.toString());
        }
    }
    
    public int totalWeight(){
        int a = 0;
        for (Item each:this.items){
            a += each.getWeight();
        }
        return a;
    }
    
    public Item heaviestItem(){
        
        if(items.size() == 0){
            return null;
        }
        Item returnedObject = items.get(0);
        
        for(Item each: this.items){
            if(each.getWeight() > returnedObject.getWeight()){
                returnedObject = each;
            }
        }
        
        return returnedObject;
    }
    
    
    
}
