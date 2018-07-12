
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (players.size() < this.maxSize) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int goals = 0;
        for (Player player : this.players) {
            goals += player.goals();
        }
        return goals;
    }
}
