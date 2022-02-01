/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class Cube {
    
    private int x;
    
    public Cube (int edgeLength){
        this.x = edgeLength;
    }
    
    public int volume() {
        return this.x * this.x * this.x;
    }
    
    public String toString(){
        return "The length of the edge is " + x + " and the volume " + this.volume();
    }
    
}
