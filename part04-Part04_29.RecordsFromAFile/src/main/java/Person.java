/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class Person {
    
    private String name;
    private int age;
    private boolean oneYear;
    
    public Person (String name, int age){
        this.name = name;
        this.age = age;
        if(age == 1){
            this.oneYear = true;
        } else {
            this.oneYear = false;
        }
    }
    
    public String toString(){
        if(oneYear){
            return this.name + ", age: " + this.age + " year"; 
        } else {
            return this.name + ", age: " + this.age + " years"; 
        }
    }
    
}
