package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards; // deck holds 52 cards
	public Deck() { // constructor that populates deck with standard 52 cards
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				int value = i + 2; // values from 2 to 14 (ace)
				cards.add(new Card(value, names[i] + " of " + suit));
			}
		}
	}
	public void shuffle() { // randomizes order of cards
		Collections.shuffle(cards);
	}
	public Card draw() { // Draw, removes and returns the top card
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			return null; // returns null if no cards left to draw
		}
	}













} //end of main
