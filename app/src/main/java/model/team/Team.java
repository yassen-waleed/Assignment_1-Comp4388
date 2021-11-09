package model.team;

public class Team {
    private String name ;
    private int score ;
    private String group ;

    public Team(String name, int score, String group) {
        this.name = name;
        this.score = score;
        this.group = group;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScour(int score) {
        this.score = score;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
