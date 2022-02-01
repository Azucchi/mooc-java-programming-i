/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item (String a, String b){
        this.identifier = a;
        this.name = b;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item x = (Item) compared;
        
        return (this.identifier.equals(x.identifier));
    }
    
    
    
    
    
    
    
    
}
