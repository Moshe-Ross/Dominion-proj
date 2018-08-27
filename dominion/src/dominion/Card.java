package dominion;

//parent class called card has universal vars and methods across all card types
public abstract class Card {
	private String img;
	private int cost;

	public String getImg() {
		return img;
	}
	
	public int getCost() {
		return cost;
	}
	
}
