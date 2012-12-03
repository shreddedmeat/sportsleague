import java.util.*;
import java.text.SimpleDateFormat;

public class Player
{
    private String playerName;
    private Calendar dateOfBirth;
    private int playerHeight;
    private int goalsScored;

    public Player(String name, String birthDateString, int height) throws Exception {
        playerName = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTime(sdf.parse(birthDateString));
        playerHeight = height;
        goalsScored = 0;    
    }
    
    public void setName(String name){
        playerName = name;         
    }
    
    public void setDob (String birthDateString) throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTime(sdf.parse(birthDateString));
    }

    public void setHeight (int height){
        playerHeight = height;
    }
    
    public String getName(){
        return playerName;
    }
    
    public String getDob(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dateOfBirth.getTime());
    }
       
    public int getHeight(){
        return playerHeight;
    }
    
    public void addGoal(int scored){
        goalsScored = goalsScored + scored;
    }
    
    public int getGoals(){
        return goalsScored;
    }
    
    public int getAge(){
        Calendar now = Calendar.getInstance();
        int result = now.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) <= dateOfBirth.get(Calendar.DAY_OF_YEAR)){
            result--;
         }
        return result;
    }
    
    public String toString() {
        return playerName;
    }
}
