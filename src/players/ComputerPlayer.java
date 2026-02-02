package players;
import paintings.*;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer extends Player{
    private int[][] scoreboard;
    public ComputerPlayer(int money, int[][] scoreboard) {
        super(money, "Computer " + totalPlayers++);
        this.scoreboard = scoreboard;
    }

    public Painting playPainting() {
        if (!handPaintings.isEmpty()) {
            return handPaintings.get(ThreadLocalRandom.current().nextInt(0, handPaintings.size()));
        }
        return null;
    }

    @Override
    public int bid(int currentBid, Painting p) {
        int artistId = p.getArtistId();
        int potentialValue = 30;
        int maximumBid;

        for (int round = 0; round < scoreboard.length; round++) {
            potentialValue += scoreboard[round][artistId];
        }

        if (getMoney() < potentialValue) {
            maximumBid = getMoney();
        } else {
            maximumBid = potentialValue;
        }

        if (getMoney() == 0) {
            return 0;
        } else if (p.getOwner() == this) {
            return ThreadLocalRandom.current().nextInt(0, maximumBid / 2);
        }
        return ThreadLocalRandom.current().nextInt(0, maximumBid);
    }
}