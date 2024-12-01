package student;

//Bilal Ahmed
public final class Hand {
    /**
     * All hand cards are drawn from this Deck object.
     */
    private final Deck deck;
    /**
     * The list of cards in the hand.
     */
    private final Card[] listOfCards;
    /**
     * The size of the hand.
     */
    private final int sizeOfHand;

    /**
     * Initializes the representation of a hand of cards.
     *
     * @param deck a Deck object where all cards will be drawn from.
     * @param size an int representing the size of the hand.
     */
    public Hand(Deck deck, int size) {

        this.listOfCards = new Card[size];
        this.deck = deck;
        this.sizeOfHand = size;

        for (int i = 0; i < this.listOfCards.length; i++) {
            this.listOfCards[i] = this.deck.draw();
        }

    }

    /**
     * Get the size of the hand.
     *
     * @return an int representing the size of the hand
     */
    public int getSize() {
        return this.sizeOfHand;
    }

    /**
     * Get the card at the given index in this hand
     * If index out of bounds, prints an error.
     *
     * @param i int representing the index, where 0 is the first card in the hand.
     * @return return a card representation of the card at the specific index
     */
    public Card get(int i) {
        //Index 0 is the first card
        if ((i < 0) || (i > listOfCards.length - 1)) {
            System.out.println("Invalid hand index!");
            return listOfCards[0];
        } else {
            return listOfCards[i];
        }
    }

    /**
     * This function removes a given card from the hand.
     * if the card is found in the hand.
     *
     * @param card card object that will be removed from the hand.
     * @return boolean value representing whether the card was removed or not.
     */
    public boolean remove(Card card) {

        // If the card is found in the hand it should be removed,
        // and a replacement card should be drawn from the deck
        // and should return false
        // If the card is not found in the hand it should return false.

        //Works with null as well
        if (card != null) {
            for (int i = 0; i < listOfCards.length; i++) {
                if (listOfCards[i].equals(card)) {
                    listOfCards[i] = this.deck.draw();
                    return true;
                }
            }
            return false;
        }
        return false;
    }


}
