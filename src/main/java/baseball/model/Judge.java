package baseball.model;

import java.util.List;

public class Judge {
    public String judge(List<Integer> player, List<Integer> computer){
        Count count = new Count(player, computer);
        int ball = count.getBall();
        int strike = count.getStrike();
        int total = count.countAll(player,computer);

        if(total == 0){
            return "낫싱";
        }else if(strike == 0){
            return ball + "볼";
        }else if(ball == 0){
            return strike + "스트라이크";
        }
        return ball + "볼 " + strike + "스트라이크";
    }
}
