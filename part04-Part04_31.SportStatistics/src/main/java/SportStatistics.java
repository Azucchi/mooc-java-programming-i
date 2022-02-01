
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        boolean teamGame = false;
        ArrayList<GameData> array = new ArrayList<>();
        
        try (Scanner getFile = new Scanner(Paths.get(file))){
            
            while(getFile.hasNextLine()){
                String line = getFile.nextLine();
                String[] parts = line.split(",");
                array.add(new GameData(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
                
            }
            
            
        } catch (Exception e){
            System.out.println("error");
        }
        
                
        for (GameData each: array){
            
            if(each.homeTeam().equals(team)){
                games++;
                if (each.homePoints() > each.enemyPoints()) {
                    wins++;
                } else {
                    losses++;
                }
                
            } else if (each.enemyTeam().equals(team)){
                games++;
                if (each.enemyPoints() > each.homePoints()) {
                    wins++;
                } else {
                    losses++;
                }
            }       
           
            
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
            

    }

}
