package Rank;

import java.util.Set;
import java.util.TreeSet;

public class Rank {
    private final Set<Player> players = new TreeSet<>(new PlayerComparator());

    public void addPlayer(String name, int score){
        players.add(new Player(name, score));
    }

    public void printRanking(){
        int pos = 1;
        for(var player: players){
            System.out.format("%02d. %-10s -> %d\n", pos++, player.name(), player.score());
        }

    }
}
