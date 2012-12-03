import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
    private String clubName;
    private ArrayList<Player> squad;
    private int clubGoalsScored;
    private int clubGoalsConceded;
    private int goalDifference;
    private int totalPoints;
    private int averageAge;
    private int averageHeight;
    
   
    public Club(String name) {
       clubName = name;
       squad = new ArrayList<Player>();
    }
    
    public void setName(String name) {
        clubName = name;
    }
    
    public String getName() {
        return clubName;
    }
    
    public void addPlayer(Player p) {
        squad.add(p);
    }
    
    public boolean checkPlayer(Player p) {
        if (squad.contains(p)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setClubGoalsScored() {
        int totalGoals = 0;
        for(Player p : squad) {
            int found = p.getGoals();
            totalGoals += found; 
        }
        clubGoalsScored = totalGoals;
    }
    
    public int getGoalDifference() {
        goalDifference = clubGoalsScored - clubGoalsConceded;
        return goalDifference;
    }
    
    public int getAverageAge() {
        int totalAge = 0;
        for(Player p : squad) {
            int found = p.getAge();
            totalAge += found; 
        }
        averageAge = totalAge / squad.size();
        return averageAge;
        
    }
    
    public int getAverageHeight() {
        int totalHeight = 0;
        for(Player p : squad) {
            int found = p.getHeight();
            totalHeight += found; 
        }
        averageHeight = totalHeight / squad.size();
        return averageHeight;
    }
   
}
        
        
   

   



