package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Integer> list;
    private int star_num;
    private int middle_num;
    private int last_num;

    public Player(){
        list = null;
    }

    public Player(List<Integer> list){
        this.star_num = list.get(0);
        this.middle_num = list.get(1);
        this.last_num = list.get(2);
    }

    public List<Integer> random(){
        String message = "숫자를 입력해주세요";
        try{
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            List<Integer> list = new ArrayList<>();
            for (String s : input.split("")) {
                list.add(Integer.parseInt(s));
            }
        } catch (IllegalArgumentException e){
            System.out.println("종료 됩니다.");
        }
        return list;
    }
 }
