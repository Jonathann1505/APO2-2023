package punto_9;

public class Card {
	  private int suit;
	    private int cardType;
	    
	    public Card(int suit, int cardType) {
	        this.suit = suit;
	        this.cardType = cardType;
	    }
	    
	    public int getPoints() {
	        if (cardType == 1) {
	            return 11;
	        } else if (cardType >= 10) {
	            return 10;
	        } else {
	            return cardType;
	        }
	    }
	    
	    @Override
	    public String toString() {
	        String[] suits = {"Corazones", "Diamantes", "Trevoles", "Picas"};
	        String[] cardTypes = {"Ace", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jack", "Reina", "Rey"};
	        return cardTypes[cardType - 1] + " De " + suits[suit - 1];
	    }
	}
