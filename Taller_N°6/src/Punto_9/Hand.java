package punto_9;

public class Hand {

	Card[] cards = new Card[5];
    int cardCount = 0;
    
    public void addCard(Card card) {
        cards[cardCount] = card;
        cardCount++;
    }
    public int getTotalPoints() {
        int totalPoints = 0;
        int aceCount = 0;
        
        for (int i = 0; i < cardCount; i++) {
            Card card = cards[i];
            totalPoints += card.getPoints();
            if (card.getPoints() == 11) {
                aceCount++;
            }
        }
        
        while (totalPoints > 21 && aceCount > 0) {
            totalPoints -= 10;
            aceCount--;
        }
        
        return totalPoints;
    }
    
    public void showCards() {
        System.out.println("Cards in hand:");
        for (int i = 0; i < cardCount; i++) {
            System.out.println(cards[i]);
        }
        System.out.println("Total points: " + getTotalPoints());
    }
}
