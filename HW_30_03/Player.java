package Tasks.HW_30_03;

import org.jetbrains.annotations.NotNull;

public class Player implements Comparable <Player> {
    private String name;
    private String secondName;
    private double score;
    private double secondScore;
    private League league;

    public Player(String name, String secondName, int score, int secondScore, League league) {
        this.name=name;
        this.secondName=secondName;
        this.score=score;
        this.secondScore=secondScore;
        this.league=league;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName=secondName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score=score;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore=secondScore;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league=league;
    }
    @Override
    public String toString(){
        return "Player{" +
                "player='" + name + " " + secondName +'\'' +
                ", points = " + score +  "  extra points = " + secondScore +
                ", league=" + league +
                '}';
    }

      @Override
    public int compareTo(@NotNull Player player) {
        if (this.getLeague().compareTo(player.getLeague()) == 0) {
            if (player.getScore() == this.getScore() ) {
              return ((int)(player.getSecondScore() - this.getSecondScore()));
            }
             return ((int)((player.getScore() - this.getScore())));
        }else return (this.getLeague().compareTo(player.getLeague()));
    }
}
/*

  */