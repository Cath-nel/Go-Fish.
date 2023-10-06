import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand{
  	private int playerHand; //what is this for
  	//private List<Card> cards = {"Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King"};
	
	private List<Card> cards = new ArrayList<>();
	private int numCards;
	
	//private String playerID;
	//private Player player;
	//private String playerName; //I dont think we need this cause we can pull it from the player object
	
	private boolean hasCard;

	public Hand(){
		numCards = 0;
	}

	/*public Hand(Player player){
		this.player = player;
		this.playerID = player.getPlayerID;
		this.playerName = player.getPlayerName;
		//give random or sequentially next int
	}*/

	public void setHand(List<Card> cards){
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

	public boolean checkForBook(int aquiredRank){
		int counter = 0;
		for(int i =0; i<numCards; i++){
			if(cards.get(i).getRank()==requestedRank){
				counter++;
			}
		}
		if(counter==3){
			return true;
		}
		return false;
	}

	public List<Card> getBook(int requestedRank){
		List<Card> result = new ArrayList<>();
		if(checkForCard(requestedRank)){
			for(int i =0; i<numCards; i++){
				if(cards.get(i).getRank()==requestedRank){
					Card current = cards.get(i);
					cards.remove(i);
					numCards--;
					result.add(current);
				}
			}
		}
		return result;
	}

	public void addCard(Card newCard){
		cards.add(newCard);
	}

	public int identifyCardToRequest(){
		int[] frequency = new int[13];
		for(int i = 0; i<13; i++){
			for(int j =0; j<numCards; i++){
				if(cards.get(j).getRank()==i){
					frequency[i]++;
				}
		}
		int ans = 0;
		int rank = -1;
		for(int i =0; i<13; i++){
			if(frequency[i] > ans){
				ans = frequency[i];
				rank = i+1;
			}
			if(frequency[i]<ans && frequency[i]>0 && rank == -1){
				rank = i+1;
			}
		}
		return rank;	
		
	}

	public void displayHand(){
		for(int i =0; i<numCards; i++){
			System.out.println(cards.get(i).toString());
		}
	}

	public boolean isEmpty(){
		if(cards.size()==0){
			return true;
		}
		return false;
	}
}
