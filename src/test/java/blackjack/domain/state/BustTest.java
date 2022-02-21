package blackjack.domain.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BustTest {
    @Test
    void winnings() {
        Bust bust = new Bust();
        assertThat(bust.winnings(10_000)).isEqualTo(0);

    }
}
