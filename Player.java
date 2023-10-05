public class Player{
	private String playerID; 
	private String playerName; 
	private Hand hand;

	public Player(String playerID, String playerName, Hand hand){
		this.playerID = playerID;
		this.player = playerName;
		this.hand = hand;
	}
	public String getPlayerIDe(){
		return playerID;
	}
	public String getPlayerName(){
		return playerName;
	}
}
