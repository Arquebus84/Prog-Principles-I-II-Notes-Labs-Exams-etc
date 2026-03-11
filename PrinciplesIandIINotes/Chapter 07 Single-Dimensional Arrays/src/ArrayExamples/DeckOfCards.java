package ArrayExamples;

public class DeckOfCards {

	public static void main(String[] args) {
		//There are 52 cards in a single deck
		int deck[] = new int[52];
		//Suits
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		//Ranks from Ace to King
	    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
	      "10", "Jack", "Queen", "King"};
	        
	    // Initialize cards
	    for (int i = 0; i < deck.length; i++)
	      deck[i] = i;
	    
	    
	    // Shuffle the cards
	    for (int i = 0; i < deck.length; i++) {
	      // Generate an index randomly
	      int index = (int)(Math.random() * deck.length);
	      int temp = deck[i];
	      deck[i] = deck[index]; 
	      deck[index] = temp;
	    }

	    // Display the first four cards
	    for (int i = 0; i < 4; i++) {
	      String suit = suits[deck[i] / 13];
	      String rank = ranks[deck[i] % 13];
	      System.out.println("Card number " + deck[i] + ": " 
	        + rank + " of " + suit);
	    }

	}

}
