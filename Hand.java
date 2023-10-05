public class Hand{
  private int playerHand; //what is this for
  private List<Card> cards;
	private String playerID;
	private Player player;
	private String playerName; //I dont think we need this cause we can pull it from the player object
	private boolean hasCard;

	public Hand(Player player){
		this.player = player;
		//give random or sequentially next int
	}

	public boolean isEmpty(){
		if(cards.size==0){
			return true;
		}
		return false;
	}
}
