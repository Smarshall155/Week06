package week06;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck(); // Instantiate deck and players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		deck.shuffle(); // Shuffles deck
		for (int i = 0; i < 52; i++) { // Distributes all 52 cards. Alternates players
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
		}
	}
	for (int i = 0; i < 26; i++) { // Flip 26 rounds of cards and compare values
		Card card1 = player1.flip(); // retrieves and removes top card from Player 1's hand
		Card card2 = player2.flip(); // retrieves and removes top card from Player 2's hand
		
		if (card1 != null && card2 != null) {
			System.out.println("Round " + (i + 1) + ": "); // Higher value wins. Equal value, no point awarded.
			card1.describe();
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				System.out.println("Player 1 wins this round!");
				player1.incrementScore(); // for player who wins the round
			} else if (card2.getValue() > card1.getValue()) {
				System.out.println("Player 2 wins this round!");
				player2.incrementScore(); // for player who wins the round
			} else {
				System.out.println("It's a tie! No points awarded.");
			}
			System.out.println();
		}
	}
		System.out.println("Final Scores:"); // displays final scores
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) { // Determines winner
			System.out.println("Player 1 wins the game!");
		} else if (player2 .getScore() > player1.getScore()) {
			System.out.println("Player 2 wins the game!");
		} else {
			System.out.println("It's a draw!");
			}
		}



















}//end of main
