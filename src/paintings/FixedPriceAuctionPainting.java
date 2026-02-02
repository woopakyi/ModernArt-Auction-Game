package paintings;
import players.*;

public class FixedPriceAuctionPainting extends Painting{

    public FixedPriceAuctionPainting(int artist_id) {
        super(artist_id);
    }

    @Override
    public String getType() {
        return "Fixed Price Auction";
    }

    @Override
    public void auction(Player[] players) {
        currentBid = 0;
        currentBidder = null;
        int startingPlayerIndex = -1;
        int index = -1;

        for (int i = 0; i < players.length; i++) {
            if (players[i] == this.owner) {
                startingPlayerIndex = i;
                index = i;
                break;
            }
        }

        System.out.println(players[startingPlayerIndex].getName() + ", please fix a price for the auction");
        currentBid = players[startingPlayerIndex].bid(currentBid, this);
        System.out.println("The fixed price is " + currentBid);

        for (int i = 0; i < players.length - 1; i++) {
            startingPlayerIndex++;
            if (startingPlayerIndex >= players.length) {
                startingPlayerIndex = 0;
            }

            int bidAmount = players[startingPlayerIndex].bid(currentBid, this);
            if (bidAmount >= currentBid) {
                currentBidder = players[startingPlayerIndex];
                break;
            } else {
                System.out.println(players[startingPlayerIndex].getName() + " pass.");
            }
        }

        if (currentBidder == null) {
            currentBidder = players[index];
        }

        sold();
    }
}
