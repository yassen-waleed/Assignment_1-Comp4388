package model.team;

import java.util.ArrayList;

public class TeamData {
    ArrayList<Team> teams = new ArrayList<Team>();
    public TeamData()
    {
        this.teams.add(new Team("Bayern" , 16 ,"A")) ;
        this.teams.add(new Team("Athletic Madrid" , 9 ,"A")) ;
        this.teams.add(new Team("Salzburg" , 4 ,"A")) ;
        this.teams.add(new Team("Moscow" , 3 ,"A")) ;

        this.teams.add(new Team("Real Madrid" , 10,"B")) ;
        this.teams.add(new Team("Monchengladbakh" , 8 ,"B")) ;
        this.teams.add(new Team("Shakhtar" , 8 ,"B")) ;
        this.teams.add(new Team("Inter" , 6 ,"B")) ;

        this.teams.add(new Team("Man City" , 16,"C")) ;
        this.teams.add(new Team("Porto" , 13 ,"C")) ;
        this.teams.add(new Team("Olympics" , 3 ,"C")) ;
        this.teams.add(new Team("Marseille" , 3,"C")) ;

        this.teams.add(new Team("Liverpool" , 13,"D")) ;
        this.teams.add(new Team("Atalanta" , 11 ,"D")) ;
        this.teams.add(new Team("Ajax" , 7 ,"D")) ;
        this.teams.add(new Team("Midtjylland" , 2,"D")) ;

        this.teams.add(new Team("Chelsea" , 14,"E")) ;
        this.teams.add(new Team("Seville" , 13 ,"E")) ;
        this.teams.add(new Team("Krasnodar" , 5,"E")) ;
        this.teams.add(new Team("Renews" , 1,"E")) ;

        this.teams.add(new Team("Dortmund" , 13,"F")) ;
        this.teams.add(new Team("Lazio" , 10 ,"F")) ;
        this.teams.add(new Team("Club Brugge" , 8,"F")) ;
        this.teams.add(new Team("Zenith" , 1,"F")) ;

        this.teams.add(new Team("Juventus" , 15,"G")) ;
        this.teams.add(new Team("Barcelona" , 15 ,"G")) ;
        this.teams.add(new Team("Dynamo Kiev" , 4,"G")) ;
        this.teams.add(new Team("Ferencvaros" , 1,"G")) ;

        this.teams.add(new Team("PSG" , 12,"H")) ;
        this.teams.add(new Team("RB Leipzig" , 12 ,"H")) ;
        this.teams.add(new Team("Man United" , 9,"H")) ;
        this.teams.add(new Team("Basaksehir" , 3,"H")) ;
    }
    ArrayList<Team> getTeams(String groupName)
    {
        ArrayList<Team> result = new ArrayList<Team>();

        for (Team team : this.teams)
            if (team.getGroup().equals(groupName))
                result.add(team);

        return result;
    }

    public ArrayList<Team> getTeams() {
        return this.teams;
    }
}
