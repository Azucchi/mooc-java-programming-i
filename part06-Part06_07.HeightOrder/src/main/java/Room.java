
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
public class Room {
    
    private ArrayList<Person> room;
    
    public Room(){
        room = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        return room.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return room;
    }
    
    public Person shortest(){
        if (room.isEmpty()){
            return null;
        }
        
        Person shortest = room.get(0);
        
        for(Person each: room){
            if(each.getHeight()< shortest.getHeight()){
                shortest = each;
            }
        }
        
        return shortest;
        
        
    }
    
    public Person take(){
        if (room.isEmpty()){
            return null;
        }
        
        Person takenAway = this.shortest();
        this.room.remove(this.shortest());
        return takenAway;
    }
    
}
