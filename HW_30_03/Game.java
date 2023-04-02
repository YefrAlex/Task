package Tasks.HW_30_03;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    static int totalPlayers;
    private static final List<League> leages = Arrays.asList(League.values());
    List<Player> playersList = GeneratorLeague.getPlayers(totalPlayers);

    protected static final List<Player> getScore (int totalPlayers) {
        List<Player> playersList = GeneratorLeague.getPlayers(totalPlayers);
        for (int i=0; i < leages.size(); i++) {
            for (int j=0 + 5*i; j < (totalPlayers / leages.size()) + 5*i; j++) {
              for (int k=j + 1; k < (totalPlayers / leages.size()) + 5*i; k++) {
                playGames(playersList.get(j), playersList.get(k));
                }
            }

        }
        return playersList;
    }
    protected static final List<Player> getSecondScore (int totalPlayers) {
        List<Player> playersList = Game.getScore(totalPlayers);
        for (int i=0; i < leages.size(); i++) {
            for (int j=0 + 5*i; j < (totalPlayers / leages.size()) + 5*i; j++) {
                for (int k=j + 1; k < (totalPlayers / leages.size()) + 5*i; k++) {
                    if (playersList.get(j).getScore() == playersList.get(k).getScore()) {
                        playSecondGames(playersList.get(j), playersList.get(k));
                    }
                }
            }

        }
        return playersList;
    }

    private static void playGames(Player player1, Player player2) {
        Random random = new Random();
        int w =random.nextInt(3);
        if (w == 0  ){                // первый выиграл
            player1.setScore(player1.getScore()+1);
        }
        if (w == 1  ){                // ничья
            player1.setScore(player1.getScore()+0.5);
            player2.setScore(player2.getScore()+0.5);
        }
        if (w == 2  ){                // второй выиграл
            player2.setScore(player2.getScore()+1);
        }

    }

    private static void playSecondGames(Player player1, Player player2) {
        Random random = new Random();
        int w =random.nextInt(3);
        if (w == 0  ){                // первый выиграл
            player1.setSecondScore(player1.getSecondScore()+1);
        }
        if (w == 1  ){                // ничья
            player1.setSecondScore(player1.getSecondScore()+0.5);
            player2.setSecondScore(player2.getSecondScore()+0.5);
        }
        if (w == 2  ){                // второй выиграл
            player2.setSecondScore(player2.getSecondScore()+1);
        }

    }


}
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        // Заполнение ArrayList'a данными игроков
        for (int i = 0; i < 20; i++) {
            League league = League.values()[i / 5]; // Вычисляем лигу по номеру игрока
            Player player = new Player("Name" + i, "SecondName" + i, 0, 0, league);
            players.add(player);
        }

        // Проведение матчей каждого с каждым в рамках одной лиги
        for (League league : League.values()) {
            ArrayList<Player> leaguePlayers = getPlayersByLeague(players, league);
            int size = leaguePlayers.size();
            for (int i = 0; i < size; i++) {
                Player player1 = leaguePlayers.get(i);
                for (int j = i + 1; j < size; j++) {
                    Player player2 = leaguePlayers.get(j);
                    playMatch(player1, player2);
                }
            }
        }

        // Вывод результатов игры
        System.out.println("Результаты игры:");
        for (Player player : players) {
            System.out.printf("%s %s, лига %s, счет: %d - %d, баллы: %.1f%n",
                    player.getName(), player.getSecondName(), player.getLeague(), player.getScore(), player.getSecondScore(), player.getPoints());
        }
    }
 */