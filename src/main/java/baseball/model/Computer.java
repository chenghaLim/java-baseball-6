package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private List<Integer> computer;
    private int start_num;
    private int middle_num;
    private int last_num;

    public Computer(List<Integer> list){
        this.start_num = list.get(0);
        this.middle_num = list.get(1);
        this.last_num = list.get(2);
    }

    public List<Integer> random(){
        computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }
}
