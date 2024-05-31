package baseball;

import baseball.model.Computer;
import baseball.model.Judge;
import baseball.model.Playagain;
import baseball.model.Player;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        while (again){
            System.out.println("숫자 야구 게임을 시작합니다.");
            List<Integer> computers = computer.numlist();
            String result = "";
            while (!result.equals("3스트라이크")){
                result = judge.judge(player.insert(),computers);
                System.out.println(result);
            }
            again = playagain.playagain();
        }
    }

}
