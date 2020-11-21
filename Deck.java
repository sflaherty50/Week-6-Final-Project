
import java.util.Collections;
import java.util.LinkedList;

//For Steps 1-b-i-1 I am creating the deck below.  Using the list Card
//created in the Card class I'm having 13 cards created off each of the suit names.

public class Deck { // 1b

//Establishing a Linked List called cards
	LinkedList<Card> cards = new LinkedList<Card>(); // 1-b-i-1

//This is where the 52 cards are instantiated.  The card constructor
//will derive the card name based on passed values.
	public Deck() {
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i, "Diamonds")); // 1-b-ii-3
			cards.add(new Card(i, "Hearts")); // 1-b-ii-3
			cards.add(new Card(i, "Clubs")); // 1-b-ii-3
			cards.add(new Card(i, "Spades")); // 1-b-ii-3
		}

	}

//The shuffle method is used to randomly interchange 
//the list of cards.
	public void shuffle() { // 1-b-ii-1
		Collections.shuffle(cards); // 1-b-ii-1
	}

//The draw method to deal out half the deck to each player.
	public Card draw() { // 1-b-ii-2
		return cards.pop(); // 1-b-ii-2

	}
}