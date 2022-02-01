/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class Book {
    private String name;
    private int pages;
    private int pub;
    
    public Book (String name, int pages, int pub){
        this.name = name;
        this.pages = pages;
        this.pub = pub;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.pub;
    }
    
    public void decision(String decision){
        if(decision.equals("name")){
            printName();
        } else {
            printEverything();
        }
    }
    
    private void printName(){
        System.out.println(this.name);
    }
    
    private void printEverything(){
        System.out.println(this.name + ", " + this.pages + " pages, " + this.pub);
    }
        
}
