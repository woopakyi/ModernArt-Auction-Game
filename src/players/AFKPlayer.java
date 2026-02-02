package players;
import paintings.*;

public class AFKPlayer extends Player {
    public AFKPlayer(int money) {
        super(money, "AFK " + totalPlayers++);
    }

    @Override
    public Painting playPainting() {
        if (!handPaintings.isEmpty()) {
            return handPaintings.get(0);
        }
        return null;
    }

    @Override
    public int bid(int currentBid, Painting p) {
        return 0;
    }
}