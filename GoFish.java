public class GoFish{
	//comment just for visilisations sake - this will control an individual game, so needs stuff for one single game and the game play

	public static int GOFISH_DECKSIZE = 7;
	private Hand mainDeck; //using a Hand object to store the remaining cards in the deck

	//Player1
	private Player user; //needs to be instantiated in Program class
	private int userBooks;

	//Player2 i.e. the computer
	private Player computer; //instantiated in Program class??? or here????
	private int computerBooks;

	private boolean isGameDone;
	
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
	}

	public boolean isGameOver(){
		return isGameOver;
		
	}
	
	public void allocateCards(){

	}

	public void askCard(Card askedCard){ //I've used a card obeject here as presumably we'd be able to get that from GUI?
		int selectedRank = askedCard.getRank();
	}
	
	public void runGameLoop(){

	}
}
