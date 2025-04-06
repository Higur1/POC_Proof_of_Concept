package Rank;

public class Result {
    public static void main(String[] args) {
        Rank rank = new Rank();

        rank.addPlayer("Player 1", 600);
        rank.addPlayer("Player 2", 100);
        rank.addPlayer("Player 3", 200);
        rank.addPlayer("Player 4", 500);
        rank.addPlayer("Player 5", 300);

        rank.printRanking();
    }
}
