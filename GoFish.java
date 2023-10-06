import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GoFish{
	//private List<Card> cards = {"Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King"};

	private List<Card> cards = new ArrayList<>();
	private int remainingInDeck;
	//public static int GOFISH_DECKSIZE = 7;
	//private Hand mainDeck; //using a Hand object to store the remaining cards in the deck
	
	//Player1
	private Player user; //needs to be instantiated in Program class
	private int userBooks;

	//Player2 i.e. the computer
	private Player computer; //instantiated in Program class??? or here????
	private int computerBooks;
	
	private int totalBooks;
	private boolean continueGame;
	
	/*public static int DECKSIZE;
	private boolean isGameDone;
	public static int DECK;
	private int askedCard;
	private int books;
	private int cardsAmount;*/

	public GoFish(Player user, Player computer){
		this.user = user;
		userBooks = 0;
		this.computer = computer;
		userBooks = 0;

		totalBooks = 0;
		continueGame = true;

		for(int i = 0; i<4; i++){
			for(int j = 0; j < 13; j++){
				String cardID = Suite.getSuite(i+1) + (j+1);
				Card current = new Card(cardID , i+1, j+1);
				cards.add(current);
			}
		}
		
		 Collections.shuffle(cards);

		remainingInDeck = cards.size();
	}

	public boolean continueGame(){
		return continueGame;
	}

	public void updateBooks(){
		totalBooks = user.getBooks() + computer.getBooks();
		if(totalBooks == 13){
			continueGame = false;
		}
	}
	
	public void allocateCards(){
		List<Card> playerCards = new ArrayList<>();
		List<Card> compCards = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			if(i%2==0){
				Card current = cards.get(i);
				cards.remove(i);
				remainingInDeck--;
				playerCards.add(current);
			}else{
				Card current = cards.get(i);
				cards.remove(i);
				remainingInDeck--;
				compCards.add(current);
			}
		}
		Hand userHand = new Hand(playerCards);
		user.allocateHand(userHand);
		Hand compHand = new Hand(compCards);
		computer.allocateHand(compHand);
	}

	public void askCard(int selectedRank, int playerToAsk){ 
		//int selectedRank = askedCard.getRank();

		switch(playerToAsk){
			case 1:
				Card current = user.giveCard(selectedRank);
				if(current!=null){
					computer.takeCard(current);
				}else{
					Random rnd = new Random();
					int num = rnd.nextInt(remainingInDeck);
					computer.takeCard(cards.get(num));
				}
				break;
			case 2:
				Card current2 = computer.giveCard(selectedRank);
				if(current2!=null){
					user.takeCard(current2);
				}else{
					Random rnd = new Random();
					int num = rnd.nextInt(remainingInDeck);
					user.takeCard(cards.get(num));
				}
				break;
		}
	}
	
	public void runGameLoop(){
		allocateCards();
		int currentPlayer = 1;
		while(continueGame){
			if(currentPlayer==1){
				user.getHand().displayHand();
				Scanner sc = new Scanner(System.in);
				System.out.println("What rank of card do you want to request?");
				int requestedRank = Integer.parseInt(sc.next());
				//get user card request
				//Card request;
				//askCard(request, 2);
				askCard(requestedRank, 2);
				currentPlayer = 2;
			}else if(currentPlayer==2){
				//algorithm to decide which card to ask for
				//Card request;
				//askCard(request, 1);
				int requestedRank = computer.getHand().identifyCardToRequest();
				askCard(requestedRank, 1);
				currentPlayer = 1;
			}
			updateBooks();
		}
		
	}
}
