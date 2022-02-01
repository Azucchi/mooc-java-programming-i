
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                add();
            } else if(command.equals("list")){
                list();
            } else if(command.equals("remove")){
               remove();
            }
        }
    }
    
    public void add(){
        System.out.println("To add:");
        String toAdd = scanner.nextLine();
        list.add(toAdd);
    }
    
    public void list(){
        list.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        list.remove(Integer.valueOf(scanner.nextLine()));
    }
    
}
