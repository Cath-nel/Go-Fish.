public class Hand{
  private int playerHand; //what is this for
  private List<Card> cards;
	private int numCards;
	private String playerID;
	private Player player;
	private String playerName; //I dont think we need this cause we can pull it from the player object
	private boolean hasCard;

	public Hand(Player player){
		this.player = player;
		this.playerID = player.getPlayerID;
		this.playerName = player.getPlayerName;
		//give random or sequentially next int
	}

	public void setHand(Card cards){
		this.cards = cards;
		numCards = card.size();
	}

	public boolean checkForCard(int requestedRank){
		for(int i =0; i<numCards; i++){
			if(cards.get(i).getRank()==requestedRank){
				return true;
			}
		}
		return false;
	}

	public Card getCard(int requestedRank){
	//returns the requested card object, first one that matches rank
	//remove said card for the list of cards
		if(checkForCard(requestedRank)){
			for(int i =0; i<numCards; i++){
				if(cards.get(i).getRank()==requestedRank){
					Card result = cards.get(i);
					cards.remove(i);
					numCards--;
					return result;
				}
			}
		}
		return null;
	}

	public boolean isEmpty(){
		if(cards.size==0){
			return true;
		}
		return false;
	}
}
