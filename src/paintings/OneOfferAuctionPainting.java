package paintings;
import players.*;

public class OneOfferAuctionPainting extends Painting{

    public OneOfferAuctionPainting(int artist_id) {
        super(artist_id);
    }

    @Override
    public String getType() {
        return "One Offer Auction";
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

        for (int i = 0; i < players.length - 1; i++) {
            startingPlayerIndex++;
            if (startingPlayerIndex >= players.length) {
                startingPlayerIndex = 0;
            }

            int bidAmount1 = players[startingPlayerIndex].bid(currentBid, this);
            System.out.println(players[startingPlayerIndex].getName() + " bids " + bidAmount1);
            if (bidAmount1 > currentBid) {
                currentBid = bidAmount1;
                currentBidder = players[startingPlayerIndex];
            }
        }

        if (currentBid > 0) {
            int bidAmount2 = players[index].bid(currentBid, this);
            System.out.println(players[index].getName() + " bids " + bidAmount2);
            if (bidAmount2 > currentBid) {
                currentBid = bidAmount2;
                currentBidder = players[index];
            }
        } else {
            currentBidder = players[index];
        }

        sold();
    }
}
