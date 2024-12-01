package student;

import java.util.Random;
//Bilal Ahmed

public final class Deck {
    /**
     * An array representation of a 52 card deck.
     */
    private final Card[] deckOfCards = new Card[52];
    /**
     * The integer index used to determine which card to draw from the deck, avoiding repeat draws.
     */
    private int toDraw;

    /**
     * Initializes a representation of a shuffled 52 card deck.
     */
    public Deck() {

        int initialSuit = 0;
        //O(1) loop
        for (int i = 0; i < 52; i++) {
            //Transforms number from 0-52 to 1-13
            int rank = (i + 1) - (13 * initialSuit);
            this.deckOfCards[i] = new Card(rank, initialSuit + 1);
            if (rank == 13) {
                //Changes suit to go from 1-4
                initialSuit = (i + 1) / 13;
            }
        }
        shuffle();
        this.toDraw = 0;
    }

    /**
     * Shuffles the current deck using the Durstenfeld-Fisher-Yates algorithm.
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = deckOfCards.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            Card temp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[j];
            deckOfCards[j] = temp;
        }
    }

    /**
     * Function simulates draw function of a card from the deck.
     * After a card is drawn, it can not be drawn again.
     *
     * @return a card object representing the card that is drawn from the deck
     */
    public Card draw() {
        if (isEmpty()) {
            shuffle();
            toDraw = 0;
        }
        toDraw += 1;
        //Drawing from the start of the deck.
        return deckOfCards[toDraw - 1];

    }

    /**
     * Get the number of cards remaining in the deck.
     *
     * @return int representing the number of cards in the deck
     */

    public int cardsRemaining() {
        //52 is the length of a standard deck.
        return 52 - toDraw;
    }

    /**
     * Returns whether the deck is empty.
     *
     * @return boolean representing whether the deck is empty or not
     */
    public boolean isEmpty() {
        if (cardsRemaining() == 0) {
            return true;
        }
        return false;
    }

}
