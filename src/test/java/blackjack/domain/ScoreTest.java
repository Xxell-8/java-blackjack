package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ScoreTest {

    @Test
    void score_21() {
        final Score score = new Score(21);
        assertThat(score.isBlackjack()).isTrue();
    }

    @Test
    void score_bust() {
        final Score score = new Score(30);
        assertThat(score.isBlackjack()).isFalse();
    }

    @Test
    void plus_ace_score() {
        Score score = new Score(10);
        assertThat(score.plusAceScore()).isEqualTo(new Score(20));
    }

    @Test
    void equals() {
        assertThat(new Score(21)).isEqualTo(new Score(21));
    }
}
