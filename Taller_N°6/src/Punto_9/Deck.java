package punto_9;

import java.util.Random;

public class Deck {
	static Card[] cardArray = new Card[52];

	Deck() { // constructor
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++) {
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
		}
	}

	public void print() {
		for (int i = 0; i < cardArray.length; i++) {
			System.out.println(cardArray[i]);
		}
	}

	 public void shuffle() {
	        Random random = new Random();

	        for (int i = cardArray.length - 1; i > 0; i--) {
	            int index = random.nextInt(i + 1);
	            Card temp = cardArray[index];
	            cardArray[index] = cardArray[i];
	            cardArray[i] = temp;
		}
	}

}
