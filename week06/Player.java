package week06;

import java.util.ArrayList;
import java.util.List;
public class Player {
	private List<Card> hand; // Cards in the player's hands
	private int score; // Player's score formatted to 0
	private String name; // Player's name
	public Player(String name) { // Constructor
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
	}
	public void describe() { // Describe method. Prints player details and calls describe on each card in hand
		System.out.println("Player: " + name + " (Score: " + score + ")");
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
		public Card flip() { // Flip method. Removes and returns top card of the hand
			if (!hand.isEmpty()) {
				return hand.remove(0);
			} else {
				return null; // No cards left to flip
			}
		}
		public void draw(Deck deck) { // Draw method. Takes deck and adds a drawn card to the hand
			Card drawnCard = deck.draw();
			if (drawnCard != null) {
				hand.add(drawnCard);
			}
		}
		public void incrementScore() { // Adds 1 to the score
			score++;
		}
		public int getScore() {
			return score;
		}
		
		
	
	
	
	
	
	
	
	
	
}//end of main
