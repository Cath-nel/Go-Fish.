public class Hand{
  private int playerHand; //what is this for
  private Card[] cards;
	private String playerName; //I dont think we need this casue we can pull it from the player object
	private boolean hasCard;

	public Hand(String playerName){
		this.playerName = playerName;
		//give random or sequentially next int
	}

	public boolean isEmpty(){
		return hasCard();
	}
}
