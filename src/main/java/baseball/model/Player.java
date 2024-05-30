package baseball.model;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private List<Integer> players;

    public Player() {

    }

    public List<Integer> getPlayers() {
        return players;
    }


    public List<Integer> insert() {
        System.out.print("숫자를 입력해주세요: ");
        String input = Console.readLine();
        List<Integer> list = new ArrayList<>();
        boolean current = true;
       // while(current){
            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("숫자X"); // 숫자 입력이 아닐경우
                }
                list.add(Character.getNumericValue(c));
            }
            if (input.length() != 3) {
                throw new IllegalArgumentException("3자리가 아님");
            }
        if(vaildate(list)){
            throw new IllegalArgumentException("sssss");
        }
            //current = vaildate(list);
       // }
        return list;
    }

    // 중복 숫자 확인
    public boolean vaildate(List<Integer> players) {
        Set<Integer> set = new HashSet<>(players);

        if (set.size() < players.size()) {
            return true;//중복
        } else {
            return false;
        }
    }
}
