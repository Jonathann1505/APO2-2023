package punto_9;

import java.util.Scanner;

public class Main {

	   public static void main(String args[]) {
	        Deck d = new Deck();
	        d.print();
	        System.out.println("Barajando...");
	        d.shuffle();
	        d.print();
	        Hand hand = new Hand();
	        hand.addCard(Deck.cardArray[0]);
	        hand.addCard(Deck.cardArray[1]);
	        
	        int totalPoints = hand.cards[0].getPoints() + hand.cards[1].getPoints();
	        System.out.println("Total P: " + totalPoints);
	        hand.showCards();
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while (hand.cardCount < 5 && totalPoints <= 21) {
	            System.out.println("Quieres otra carta? (Y/N)");
	            String answer = scanner.nextLine();
	            
	            if (answer.equalsIgnoreCase("Y")) {
	                Card newCard = Deck.cardArray[hand.cardCount + 1];
	                hand.addCard(newCard);
	                totalPoints += newCard.getPoints();
	                System.out.println("Total P: " + totalPoints);
	                hand.showCards();
	            } else {
	                break;
	            }
	        }
	        
	        if (totalPoints > 21) {
	            System.out.println("Perdiste.");
	        } else {
	            System.out.println("Ganaste!");
	        }
	    }
}