package blackjack.domain.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StayTest {
    @Test
    void winnings() {
        Stay stay = new Stay();
        assertThat(stay.winnings(10_000)).isEqualTo(10_000);

    }
}
