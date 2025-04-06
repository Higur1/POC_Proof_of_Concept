package Rank;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return -Integer.compare(o1.score(), o2.score());
    }
}
