/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroy
 */
public class GameData {
    private String homeTeam;
    private String enemyTeam;
    private int homePoints;
    private int enemyPoints;
    
    public GameData (String a, String b, int c, int d){
        this.homeTeam = a;
        this.enemyTeam = b;
        this.homePoints = c;
        this.enemyPoints = d;
    }
    
    public String homeTeam(){
        return this.homeTeam;
    }
    
    public String enemyTeam(){
        return this.enemyTeam;
    }
    
    public int homePoints(){
        return this.homePoints;
    }
    
    public int enemyPoints(){
        return this.enemyPoints;
    }
}
