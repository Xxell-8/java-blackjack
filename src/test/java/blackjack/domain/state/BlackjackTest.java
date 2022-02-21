package blackjack.domain.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BlackjackTest {
    @Test
    void winnings() {
        Blackjack blackjack = new Blackjack();
        assertThat(blackjack.winnings(10_000)).isEqualTo(15_000);

    }
}
