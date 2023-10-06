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

	public void addBook(List<Card> book){
		books.add(book);
		numBooks++;
	}
}
