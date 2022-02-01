
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int a){
        this.maxWeight = a;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        //this.suitcases.add(suitcase);
        if (totalWeight() + suitcase.getWeight() > this.maxWeight){
            
        } else 
            this.suitcases.add(suitcase);
    }
    
    public int totalWeight(){
        int sum = 0;
        for (Suitcase each: suitcases){
            sum += each.getWeight();
        }
        return sum;
    }
    
    @Override
    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Suitcase each: suitcases){
            each.printItems();
        }
    }
    
    
    
}
