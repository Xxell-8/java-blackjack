package blackjack.domain.state;

public class Blackjack extends Finished {

    @Override
    double earningRate() {
        return 1.5;
    }
}
