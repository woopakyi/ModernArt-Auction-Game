package paintings;
import players.*;

public class OpenAuctionPainting extends Painting{

    public OpenAuctionPainting(int artist_id) {
        super(artist_id);
    }

    @Override
    public String getType() {
        return "Open Auction";
    }

    @Override
    public void auction(Player[] players) {
        currentBid = 0;
        currentBidder = null;
        int index = 0;
        boolean start = true;

        for (int i = 0; ; i++) {
            if (i >= players.length) {
                i = 0;
            }
            if (i == index & !start) {
                break;
            }
            start = false;

            int bidAmount = players[i].bid(currentBid, this);
            if (bidAmount > currentBid) {
                currentBid = bidAmount;
                currentBidder = players[i];
                index = i;
                System.out.println(players[i].getName() + " bids $" + bidAmount);
            }
        }

        sold();
    }

}
