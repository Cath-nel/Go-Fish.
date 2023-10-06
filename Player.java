public class Player{
	private String playerID; 
	private String playerName; 
	private Hand hand;
	private int numBooks;
	private List<List<Card>> books;
	

	public Player(String playerID, String playerName, Hand hand){
		this.playerID = playerID;
		this.player = playerName;
		this.hand = hand;
	}
	public String getPlayerID(){
		return playerID;
	}
	public String getPlayerName(){
		return playerName;
	}

	public int getBooks(){
		return numBooks;
	}

	public void allocateHand(Hand hand){
		this.hand = hand;
	}

	public Card giveCard(int requestedRank){
		return hand.getCard(requestedRank);
	}

	public void takeCard(Card newCard){
		hand.addCard(newCard);
	}
		
	public void addBook(List<Card> book){
		books.add(book);
		numBooks++;
	}
}
