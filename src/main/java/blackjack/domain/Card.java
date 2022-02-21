package blackjack.domain;

public class Card {
    private final Suit suit;
    private final Denomination denomination;

    public Card(Suit suit, Denomination denomination) {
        this.suit = suit;
        this.denomination = denomination;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public int getScore() {
        return denomination.getScore();
    }

    @Override
    public String toString() {
        return denomination.getAlias() + suit.getName();
    }
}
