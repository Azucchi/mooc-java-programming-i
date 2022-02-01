
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
public class PointsRoster {
    
    private ArrayList<Integer> points;
    private int sum;
    private int count;
    private int five;
    private int four;
    private int three;
    private int two;
    private int one;
    private int failed;
    
    
    public PointsRoster(){
        this.points = new ArrayList<>();
        this.sum = 0;
        this.count = 0;
        this.five = 0;
        this.four = 0;
        this.three = 0;
        this.two = 0;
        this.one = 0;
        this.failed = 0;

    }
    
    public void addPoints(int point){
        this.points.add(point);
        
        this.sum += point;
        this.count ++;
        
        if (point >= 90){
            five++;
        } else if (point >= 80 && point < 90){
            four++;
        } else if (point >= 70 && point < 80){
            three++;
        } else if (point >= 60 && point < 70){
            two++;
        } else if (point >= 50 && point < 60){
            one++;
        } else if (point < 50 && point >= 0){
            failed++;
        }
        
    }
    
    public double getAverage(){
        return 1.0 * sum / count;
    }
    
    public void getAveragePassing(){
        int count = 0;
        int sum = 0;
        for (int each: this.points){
            if (each >= 50){
                count++;
                sum += each;
            }
        }
        
        if(count == 0){
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: " + 0.0);
        } else {
            System.out.println("Point average (passing):" + 1.0 * sum / count);
            System.out.println("Pass percentage: " + 1.0 * count / this.count * 100);
        }
    }
    
    public void printStars(){
        System.out.print("5: ");
        for(int i = 0; i < this.five; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("4: ");
        for(int i = 0; i < this.four; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("3: ");
        for(int i = 0; i < this.three; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("2: ");
        for(int i = 0; i < this.two; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("1: ");
        for(int i = 0; i < this.one; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("0: ");
        for(int i = 0; i < this.failed; i++){
            System.out.print("*");
        }
    }
    
    
    
}
