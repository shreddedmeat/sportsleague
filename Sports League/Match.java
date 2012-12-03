import java.util.*;
import java.text.SimpleDateFormat;

public class Match
{
    private String ground;
    private Club homeTeam;
    private Club visitingTeam;
    private Calendar matchTime;
    private ArrayList<Player> whoPlayed;
    private String finalScore;
    private String result;
    
    public Match (String ground, Club homeTeam, Club visitingTeam, String time) throws Exception {
        this.ground = ground;
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        matchTime = Calendar.getInstance();
        matchTime.setTime(sdf.parse(time));
        whoPlayed = new ArrayList<Player>();
    }
    
    public String getTimeAndPlace() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ground + ", " + sdf.format(matchTime.getTime());
    }
    
    public void addPlayer(Player p) {
        whoPlayed.add(p);
    }
}
