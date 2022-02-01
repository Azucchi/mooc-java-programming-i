
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
    
    private Scanner scanner;
    private PointsRoster points;
    
    public UserInterface(Scanner scanner, PointsRoster points){
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input < -1 || input > 100){
                
            }
            else if (input == -1){
                printAverage();
                points.getAveragePassing();
                points.printStars();
                break;
            } else {
                points.addPoints(input);                
            }
        }
    }
    
    public void printAverage(){
        System.out.println("Point average (all): " + points.getAverage() );
    }
    
}
