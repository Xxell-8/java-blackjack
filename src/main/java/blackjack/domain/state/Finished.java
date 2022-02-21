package blackjack.domain.state;

import blackjack.domain.Card;

public abstract class Finished implements State {
    @Override
    public State draw(final Card card) {
        throw new UnsupportedOperationException("[ERROR] 더 이상 카드를 받을 수 없습니다.");
    }

    public final double winnings(int money) {
        return money * earningRate();
    };

    abstract double earningRate();
}
