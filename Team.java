// Task 1.b
import java.util.ArrayList;

public class Team {
    // Task 1.c
    private String name;

    // Task 1.d
    private int rank;

    // Task 1.e
    private ArrayList<String> players;

    // Task 1.f
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Task 1.h
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Task 1.l
    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    // Task 1.j & 1.m
   @Override
public String toString() {
    String result = "Hold: " + name + " Rang: " + rank + "\n";
    result += "Spillere:\n";

    // Task 1.m: Add each player on its own line
    for (String player : players) {
        result += "- " + player + "\n";
    }

    return result;

    }
}