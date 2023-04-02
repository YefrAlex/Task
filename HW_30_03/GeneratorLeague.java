package Tasks.HW_30_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratorLeague {
    private static final List<String> firstNamesList=new ArrayList<>(Arrays.asList("Alex", "Boris", "Corvin", "Denis", "Erik", "Faris",
            "Joana", "Lana", "Jams", "Andrew", "Irina", "Sanjida", "Hussein", "Ansarula", "Cristian", "Napoleon" , "Otto" , "Prapor" , "Melman" , "Sheldon"));
    private static final List<String> secondNamesList=new ArrayList<>(Arrays.asList("Prozit", "Roaling", "Tolkien", "Moor", "Ford", "Didro",
            "Volter", "Sult", "Ivanov", "Chernenko", "Andropov", "Smirnoff", "Wilson", "Shumaher", "Haus", "vonBulov", "deSantis", "O'Hara", "MacNamara", "Kutrapali"));
    
    private static final List<League> leages = Arrays.asList(League.values());
    int totalPlayers;



    protected static final List<Player>  getPlayers (int totalPlayers){
        int playersInLeague = totalPlayers/leages.size();
        List<Player> playersList = new ArrayList<>();

        for (int i=0; i < leages.size(); i++){
        for (int j=0; j < totalPlayers/leages.size() ; j++) {
                playersList.add(new Player(firstNamesList.get((int) (Math.random() * 21 -1)),secondNamesList.get((int) (Math.random() * 21 -1)),0,0, leages.get(i)));

                }
            }

        return playersList;
    }


}
/*
protected static final List<Player>  getPlayers (int totalPlayers){
        int playersInLeague = totalPlayers/leages.size();
        List<Player> playersList = new ArrayList<>();
        int i = 0;
        int count = 0;
        for (int j=0; j < totalPlayers ; j++) {
                playersList.add(new Player(firstNamesList.get((int) (Math.random() * 21 -1)),secondNamesList.get((int) (Math.random() * 21 -1)),0,0, leages.get(i)));
                count ++;
                if (count == playersInLeague ) {
                    i++;
                }
            }

        return playersList;
    }
 */