package baseball.model;

import java.util.List;

public class Count {
    private int ball;
    private int strike;


    public Count(List<Integer> player, List<Integer> computer) {
        this.ball = ball(player, computer);
        this.strike = strike(player, computer);
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public int strike(List<Integer> player, List<Integer> computer) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (player.get(i) == computer.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int countAll(List<Integer> player, List<Integer> computer) {
        int countAll = 0;
        for (int i = 0; i < 3; i++) {
            if (computer.contains(player.get(i))) {
                countAll++;
            }
        }
        return countAll;
    }

    public int ball(List<Integer> player, List<Integer> computer) {
        int countAll = countAll(player, computer);
        int strike = strike(player, computer);
        return countAll - strike;
    }

}
