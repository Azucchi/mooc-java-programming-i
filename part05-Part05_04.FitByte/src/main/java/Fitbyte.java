/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class Fitbyte {
    
    private int age;
    private int heartRate;
    
    
    public Fitbyte(int x, int y){
        this.age = x;
        this.heartRate = y;

    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (206.3 - (0.711 * 1.0 * this.age) - this.heartRate) * (percentageOfMaximum) + this.heartRate;
    }
}
