package week06;

public class Card {
	private int value; // card values from 2 to 14. (2-ace)
	private String name; // example; "Ace of Spades", "5 of Clubs"
	public Card(int value, String name) { // Constructor to initialize objects.
		this.value = value;
		this.name = name;
	}
	
	public int getValue() { // getter for value
		return value;
	}
	
	public void setValue(int value) { // setter for value
		this.value = value;
	}
	
	public String getName() { // getter for name
		return name;
	}
	
	public void setName(String name) { // setter for name
		this.name = name;
	}
	
	public void describe() { // describes the card
		System.out.println("Card: " + name + " (Value: " + value + ")");
	}
}






//end of main
