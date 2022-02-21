package blackjack.domain.state;

public class Stay extends Finished {

    @Override
    double earningRate() {
        return 1;
    }
}
