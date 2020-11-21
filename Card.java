
public class Card {// 1a

// assigns descriptive text to the field name by passed card value
	private int value; // 1-a-i-1
	private String name; // 1-a-i-2

//Card value and string are passed in when the deck class is instantiated.
	public Card(int cardValue, String suit) {// 1-b-ii-3

		value = cardValue;// 1-b-ii-3

		if (cardValue == 2)// 1-b-ii-3
		{
			name = "Two";// 1-b-ii-3
		}
		if (cardValue == 3)// 1-b-ii-3
		{
			name = "Three";// 1-b-ii-3
		}
		if (cardValue == 4)// 1-b-ii-3
		{
			name = "Three";// 1-b-ii-3
		}
		if (cardValue == 5)// 1-b-ii-3
		{
			name = "Five";// 1-b-ii-3
		}
		if (cardValue == 6)// 1-b-ii-3
		{
			name = "Six";// 1-b-ii-3
		}
		if (cardValue == 7)// 1-b-ii-3
		{
			name = "Seven";// 1-b-ii-3
		}
		if (cardValue == 8)// 1-b-ii-3
		{
			name = "Eight";// 1-b-ii-3
		}
		if (cardValue == 9)// 1-b-ii-3
		{
			name = "Nine";// 1-b-ii-3
		}
		if (cardValue == 10)// 1-b-ii-3
		{
			name = "Ten";// 1-b-ii-3
		}
		if (cardValue == 11)// 1-b-ii-3
		{
			name = "Jack";// 1-b-ii-3
		}
		if (cardValue == 12)// 1-b-ii-3
		{
			name = "Queen";// 1-b-ii-3
		}
		if (cardValue == 13)// 1-b-ii-3
		{
			name = "King";// 1-b-ii-3
		}
		if (cardValue == 14)// 1-b-ii-3
		{
			name = "Ace";// 1-b-ii-3

		} // 1-b-ii-3

		name += " of " + suit;// 1-b-ii-3

	}

//This method being called by the App to determine the winner of each hand.
	public int getValue() {
		return value;
	}

//It's used for descriptive Sysout to provide information about the status of the game.
	public String getName() {
		return name;
	}

//This method being called by each instantiation of the class player.
	public void describe() { // 1-a-ii-2
		System.out.printf("Card: %s with value of %d\n", name, value); // 1-a-ii-2
	}
}