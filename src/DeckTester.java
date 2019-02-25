/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		String[] ranks = {"1", "2", "3"};
		String[] suits = {"Hearts", "Spades", "Clubs", "Integrals"};
		int[] pointValues = {1,2,3};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println(d);
    }
}

