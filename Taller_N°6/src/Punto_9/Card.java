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
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] cardTypes = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	        return cardTypes[cardType - 1] + " of " + suits[suit - 1];
	    }
	}
