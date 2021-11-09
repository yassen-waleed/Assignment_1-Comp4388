package model;

import java.util.Date;

public class Match {
    private String team_1_name ;
    private String team_2_name ;
    private int team_1_score;
    private int team_2_score;
    private String match_date ;
    private String stadium_name ;
    private String time ;
    private String status ;

    public Match(String team_1_name, String team_2_name, int team_1_score, int team_2_score,
                 String match_date, String stadium_name, String time,String status) {
        this.team_1_name = team_1_name;
        this.team_2_name = team_2_name;
        this.team_1_score = team_1_score;
        this.team_2_score = team_2_score;
        this.match_date = match_date;
        this.stadium_name = stadium_name;
        this.time = time;
        this.status = status ;

    }
    public Match(String team_1_name, String team_2_name, int team_1_score, int team_2_score,
                 String match_date, String stadium_name) {
        this.team_1_name = team_1_name;
        this.team_2_name = team_2_name;
        this.team_1_score = team_1_score;
        this.team_2_score = team_2_score;
        this.match_date = match_date;
        this.stadium_name = stadium_name;

    }

    public String getTeam_1_name() {
        return team_1_name;
    }

    public void setTeam_1_name(String team_1_name) {
        this.team_1_name = team_1_name;
    }

    public String getTeam_2_name() {
        return team_2_name;
    }

    public void setTeam_2_name(String team_2_name) {
        this.team_2_name = team_2_name;
    }

    public int getTeam_1_score() {
        return team_1_score;
    }

    public void setTeam_1_score(int team_1_score) {
        this.team_1_score = team_1_score;
    }

    public int getTeam_2_score() {
        return team_2_score;
    }

    public void setTeam_2_score(int team_2_score) {
        this.team_2_score = team_2_score;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
