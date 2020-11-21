
public class App { // 2

	public static void main(String[] args) {

//Creating the Players below of Batman and Robin
		Deck deck = new Deck(); // 3
		Player player1 = new Player("Batman");// 3
		Player player2 = new Player("Robin");// 3
		deck.shuffle(); // 3

//looping through the deck and giving each player equal amounts of card. 
		for (int i = 0; i < 52; i++) {// 4
			if (i % 2 == 0) {// 4
				player1.draw(deck);// 4
			} else {// 4
				player2.draw(deck);// 4
			}
		}
		player1.describe();
		player2.describe();

//Looping through half of the deck for each player.
//It's removing from the Player's deck and for comparison to determine who
//wins the hand.
//Player 1 and Player 2 are instantiated and the getValue method is invoked
//to get the card's value for comparison.
//This forloop is the game's comparison engine.
		int iHandNo = 1;
		for (int i = 0; i < 26; i++) {// 5
			Card player1Card = player1.flip();// 5
			Card player2Card = player2.flip();// 5
			System.out.println("Game Hand No -  " + iHandNo++);
			if (player1Card.getValue() > player2Card.getValue()) {// 5a
				System.out.println("Player 1 " + player1.getName() + " card value is " + player1Card.getValue());
				System.out.println("Player 2 " + player2.getName() + " card value is  " + player2Card.getValue());
				System.out.println("Player 1 " + player1.getName() + " won this hand " + "with card "
						+ player1Card.getName() + " to card " + player2Card.getName());
				player1.incrementScore();// 5a
				System.out.println("Player 1 running  score " + player1.getScore());
				System.out.println("Player 2 running  score " + player2.getScore());
			} else if (player1Card.getValue() < player2Card.getValue()) {// 5a
				System.out.println("Player 2 " + player2.getName() + " card value is " + player2Card.getValue());
				System.out.println("Player 1 " + player1.getName() + " card value is " + player1Card.getValue());
				System.out.println("Player 2 " + player2.getName() + " won this hand " + "with card "
						+ player2Card.getName() + " to Player 1's card " + player1Card.getName());
				player2.incrementScore();// 5a
				System.out.println("Player 2 running  score " + player2.getScore());
				System.out.println("Player 1 running  score " + player1.getScore());
			} else if (player1Card.getValue() == player2Card.getValue()) {// 5a
				System.out.println("Player 2 " + player1Card.getValue());
				System.out.println("Player 1 " + player2Card.getValue());
				System.out.println(
						"It was a draw!  Hand of " + player1.getName() + " Player 1's card of " + player1Card.getName()
								+ " & " + player2.getName() + " Player 2's card of " + player2Card.getName());
				System.out.println("Player 2 running  score " + player2.getScore());
				System.out.println("Player 1 running  score " + player1.getScore());
			}
		}

//This displays the score and who is the winner and/or a draw.

		System.out.printf("Player 1 score = %d\n", player1.getScore());// 6
		System.out.printf("Player 2 score = %d\n", player2.getScore());// 6
		if (player1.getScore() > player2.getScore()) {// 7
			System.out.println("Player 1 is victorious");// 7
		} else if (player1.getScore() < player2.getScore()) {// 7
			System.out.println("Player 2 is victorious");// 7
		} else {// 7
			System.out.println("It is a draw");// 7
		}

	}

}
