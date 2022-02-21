package blackjack.domain.state;

import org.junit.jupiter.api.Test;

import static blackjack.domain.Fixtures.*;
import static org.assertj.core.api.Assertions.*;

class FirstTurnTest {
    public

    @Test
    void blackjack() {
        final FirstTurn firstTurn = new FirstTurn();
        final State state = firstTurn.draw(CLUBS_ACE, CLUBS_KING);
        assertThat(state).isInstanceOf(Blackjack.class);

    }

    @Test
    void hit() {
        final FirstTurn firstTurn = new FirstTurn();
        final State state = firstTurn.draw(CLUBS_ACE, CLUBS_THREE);
        assertThat(state).isInstanceOf(Hit.class);

    }
}
