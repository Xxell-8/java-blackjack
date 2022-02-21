package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hit extends Running {

    private final Cards cards;

    public Hit(final Card... cards) {
        this(Arrays.asList(cards));
    }

    public Hit(final List<Card> cards) {
        this(new Cards(new ArrayList<>(cards)));
    }

    public Hit(final Cards cards) {
        this.cards = cards;
    }

    @Override
    public State draw(Card card) {
        cards.addCard(card);

        if (cards.getScore().isBust()) {
            return new Bust();
        }
        return new Hit();

    }

    public State stay() {
        return new Stay();
    }
}
