package paintings;
import players.*;

public class HiddenAuctionPainting extends Painting {

    public HiddenAuctionPainting(int artist_id) {
        super(artist_id);
    }

    @Override
    public String getType() {
        return "Hidden Auction";
    }

    @Override
    public void auction(Player[] players) {
        currentBid = 0;
        currentBidder = null;
        int[] BidOfPlayers = new int[players.length];
        int startingPlayerIndex = -1;

        for (int i = 0; i < players.length; i++) {
            if (players[i] == this.owner) {
                startingPlayerIndex = i;
                break;
            }
        }

        for (int i = 0; i < players.length; i++) {
            BidOfPlayers[i] = players[i].bid(currentBid, this);
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[startingPlayerIndex].getName() + " bids " + BidOfPlayers[startingPlayerIndex]);
            startingPlayerIndex++;
            if (startingPlayerIndex >= players.length) {
                startingPlayerIndex = 0;
            }
        }

        for (int i = 0; i < players.length; i++) {
            if (BidOfPlayers[i] > currentBid) {
                currentBid = BidOfPlayers[i];
                currentBidder = players[i];
            }
        }

        sold();
    }
}
