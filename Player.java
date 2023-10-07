import java.util.List;
import java.util.ArrayList;

public class Player{
	private String playerID; 
	private String playerName; 
	private Hand hand;
	private int numBooks;
	private List<List<Card>> books;
	
	public Player(String playerID, String playerName){
		this.playerID = playerID;
		this.playerName = playerName;
	}
	/*public Player(String playerID, String playerName, Hand hand){
		this.playerID = playerID;
		this.playerName = playerName;
		this.hand = hand;
	}*/
	
	public String getPlayerID(){
		return playerID;
	}
	public String getPlayerName(){
		return playerName;
	}

	public int getBooks(){
		return numBooks;
	}

	public Hand getHand(){
		return hand;
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

	public List<List<Card>> getBooks(){
		return books;
	}
	
	public List<List<Card>> checkRoNewBooks(){
		List<List<Card>> newBooks = new ArrayList<>();
		newBooks = hand.getBook();
		for(int i = 0; i < newBooks.size(); i++){
			books.add(newBooks.get(i));
			numBooks++;
		}
		return newBooks;
	}
}
