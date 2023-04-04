package Tasks.HW_30_03;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = Game.getSecondScore(20);
        Collections.sort(players);
        for (Player player : players){
            System.out.println(player);
        }
    }

}
/*
Вы мне так и не ответили по поводу сортировки (
 */
