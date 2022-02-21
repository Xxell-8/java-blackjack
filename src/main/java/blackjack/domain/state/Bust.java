package blackjack.domain.state;

public class Bust extends Finished {

    @Override
    double earningRate() {
        return 0;
    }
}
