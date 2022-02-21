package blackjack.domain.state;

import static blackjack.domain.Fixtures.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HitTest {
    @Test
    void hit() {
        final Hit hit = new Hit(CLUBS_TWO, CLUBS_THREE);
        final State state = hit.draw(CLUBS_ACE);
        assertThat(state).isInstanceOf(Hit.class);
    }

    @Test
    void bust() {
        final Hit hit = new Hit(CLUBS_KING, CLUBS_TEN);
        final State state = hit.draw(CLUBS_THREE);
        assertThat(state).isInstanceOf(Bust.class);

    }

    @Test
    void stay() {
        final Hit hit = new Hit(CLUBS_TWO, CLUBS_THREE);
        final State state = hit.stay();
        assertThat(state).isInstanceOf(Stay.class);
    }
}
