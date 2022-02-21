package blackjack.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private static final int BLACKJACK_SCORE = 21;
    private static final int ACE_ADDITIONAL_SCORE = 10;


    private final List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Score getScore() {
        int total = cards.stream().mapToInt(card -> card.getDenomination().getScore()).sum();
        // TODO: 에이스는 어차피 한 번만 11점으로 환산할 수 있다! 반복문 필요 없음
        int aceCount = (int) cards.stream().filter(card -> card.getDenomination().isAce()).count();
        for (int i = 0; i < aceCount; i++) {
            total = checkAceOneOrEleven(total);
        }

        return new Score(total);
    }

    private int checkAceOneOrEleven(int total) {
        if (total + ACE_ADDITIONAL_SCORE <= BLACKJACK_SCORE) {
            return total + ACE_ADDITIONAL_SCORE;
        }
        return total;
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<String> getCardNames() {
        return cards.stream()
            .map(Card::toString)
            .collect(Collectors.toList());
    }
}
