package blackjack.domain;

import java.util.Objects;

public class Score {
    private static final int BLACKJACK_SCORE = 21;
    private static final int ACE_ADDITIONAL_SCORE = 10;

    private final int value;

    public Score(int value) {
        this.value = value;
    }

    public boolean isBlackjack() {
        return value == BLACKJACK_SCORE;
    }

    public boolean isBust() {
        return value > BLACKJACK_SCORE;
    }

    public Score plusAceScore() {
        return new Score(value + ACE_ADDITIONAL_SCORE);
    }

    public int get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return value == score.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
