package student;

//Bilal Ahmed
public final class Card {
    /**
     * Integer representing the rank number of the card.
     */
    private final int rank;
    /**
     * Integer representing the suit of the card.
     */
    private final int suit;

    /**
     * Initializes a card objects given a rank and suit.
     * Automatically checks for valid inputs.
     * If input is not valid, prints an error message,
     * and sets card to Ace of Spades.
     *
     * @param rank int representing the rank of the card
     * @param suit int indicates the suits of the card
     */
    public Card(int rank, int suit) {
        //1 = Ace, 2 = Two, ..., 11 = Jack, 12 = Queen, 13 = King
        //1 = Spades, 2 = Hearts, 3 = Clubs, 4 = Diamonds

        //Validate input
        if ((rank >= 1 && rank <= 13) && (suit >= 1 && suit <= 4)) {
            this.rank = rank;
            this.suit = suit;
        } else {
            System.out.println("Invalid Card");
            this.rank = 1;
            this.suit = 1;
            //Set invalid card to Ace of Spades
        }

    }

    /**
     * Get the card rank number.
     *
     * @return an int representing the card rank number
     */
    public int getRankNum() {
        return this.rank;
    }

    /**
     * Get the suite representation of the card.
     *
     * @return the int representing the suite of the card
     */
    public int getSuitNum() {
        return this.suit;
    }


    /**
     * Get the string representation of the rank of the card.
     *
     * @return a string representing the rank name
     */
    public String getRankName() {
        //Switch faster than if
        return switch (this.rank) {
            case 1 -> "Ace";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> null;
        };
    }

    /**
     * Get the string representation of the suit of the card.
     *
     * @return a string representing the suit name of the card.
     */
    public String getSuitName() {
        return switch (this.suit) {
            case 1 -> "Spades";
            case 2 -> "Hearts";
            case 3 -> "Clubs";
            case 4 -> "Diamonds";
            default -> null;
        };
    }

    /**
     * Get a human-readable name for the card.
     *
     * @return a human-readable string for the card, which includes rank name and suit name
     */
    @Override
    public String toString() {
        return getRankName() + " of " + getSuitName();

    }

    /**
     * Checks whether a given card is equal to the current card, provided they have the same rank and suit.
     *
     * @param obj a java generic object representing the card object (if valid)
     * @return a boolean value indicating whether the cards are the same or not.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card card) {
            return ((this.rank == card.getRankNum()) && (this.suit == card.getSuitNum()));
        }
        return false;
    }

}
