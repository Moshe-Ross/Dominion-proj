package dominion;

//parent class called card has universal vars and methods across all card types
public abstract class Card {
	protected String img;
	protected int cost;
	protected int value;
	protected int victoryPoint;



	public String getImg() {
		return img;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getVictoryPoint(){
		return victoryPoint;
	}
	
}
