
import java.util.LinkedList;

public class Player { // 1c

	private LinkedList<Card> hand = new LinkedList<Card>(); // 1-c-i-1
	private int score; // 1-c-i-2
	private String name; // 1-c-i-3

	public Player(String newName) {
		name = newName;
		score = 0;
	}

//This is used to describe the entire hand for each player.
	public void describe() { // 1-c-ii-1
		System.out.printf("Player %s has the following cards: \n", name); // 1-c-ii-1
		for (Card card : hand) { // 1-c-ii-1
			card.describe(); // 1-c-ii-1
		}
	}

//Uses pop to remove and return top card in hand.        
	public Card flip() { // 1-c-ii-2
		return hand.pop(); // 1-c-ii-2
	}

//This method will add a card to the LinkedList.
	public void draw(Deck deck) { // 1-c-ii-3
		hand.add(deck.draw()); // 1-c-ii-3
	}

//Adds one to whichever player wins the hand.
	public void incrementScore() { // 1-c-ii-4
		score++; // 1-c-ii-4
	}

//This is used to display the score between the two players.
	public int getScore() {
		return score;
	}

//This is used on the Sysout to display the name of the player.
	public String getName() {
		return name;
	}
}
