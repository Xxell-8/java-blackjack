package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

import java.util.Arrays;

public class FirstTurn {

    public State draw(Card card1, Card card2) {
        Cards cards = new Cards(Arrays.asList(card1, card2));

        if (cards.getScore().isBlackjack()) {
            return new Blackjack();
        }
        return new Hit();
    }
}
