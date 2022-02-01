
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
public class Birds {
    
    private ArrayList<Bird> birds;
    
    public Birds(){
        birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        birds.add(bird);
    }
    
    public void observe(String bird){
        boolean found = false;
        for (Bird each: birds){
            if (each.getName().equals(bird)){
                each.observeBird();
                found = true;
            }
        }
        if(!found){
            System.out.println("Not a bird!");
        }
    }
    
    public void all(){
        for (Bird each:birds){
            System.out.println(each.getName() + " (" + each.getLatin() + "): " + each.getObservation() + " observations");
        }
    }
    
    public void one(String bird){
        boolean found = false;
        for (Bird each: birds){
            if (each.getName().equals(bird)){
                System.out.println(each.getName() + " (" + each.getLatin() + "): " + each.getObservation() + " observations");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not a bird!");
        }
    }
    
}
