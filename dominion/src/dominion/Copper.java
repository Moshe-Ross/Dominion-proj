package dominion;

public class Copper extends Treasure {
	public Copper(){
		cost = 0;
		value = 1;

		img = "/dominion/src/dominion.images/copper.png";
		//			private File srcImg = new File("/dominion/src/dominion.images/copper.png");
		//			private Image img = new ImageIO.read(srcImg);	

		victoryPoint = 0;
	}
}
