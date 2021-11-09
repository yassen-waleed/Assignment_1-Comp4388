package model;

import java.util.ArrayList;

public class MatchData{

  private  ArrayList<Match> matches = new ArrayList<>() ;
  public ArrayList<Match> getMatches (){
      matches.clear();

      matches.add(new Match("PSG","RB Leipzig",2,2,
            "2021-11-3","Red Bull Arena ","22:00","Recently Matches")) ;

    /* ************************************************************************************************** */

      matches.add(new Match("Man City","Club Brugge",4,1,
              "2021-11-3","City of Manchester Stadium","22:00","Recently Matches")) ;

    /* **************************************************************************************************** */

      matches.add(new Match("Liverpool","Atletico Madrid",2,0,
              "2021-11-3","Anfield","22:00","Recently Matches")) ;

    /* ***************************************************************************************************** */

      matches.add(new Match("Milan","Porto",1,1,
              "2021-11-3","San siro","22:00","Recently Matches")) ;

    /* ****************************************************************************************************** */

    matches.add(new Match("Villarreal","Man United",0,0,
            "2021-11-5","El Madfigal","22:00","matches")) ;

    /* ******************************************************************************************************* */

    matches.add(new Match("Man United","Young Boys",0,0,
            "2021-12-8","Old Trafford","22:00","matches")) ;

    /* ******************************************************************************************************* */
      matches.add(new Match("Chelsea","Juventus",2,1,
              "2021-11-5","Stamford Bridge","21:00","Recently Matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Atalnta","Villarreal",0,0,
              "2021-12-8","A. Azzurri d'ltalia","22:00","matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Bayern","Barcelona",1,3,
              "2021-11-2","Arena Munich","16:00","Recently Matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Benfica","Dynamo Kiev",0,0,
              "2021-12-8","da Luz Lisbon","22:00","matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("VfL Wolfsburg","Lile",0,0,
              "2021-12-8","Volkwagen Arena","22:00","matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Juventus","Malmo",2,5,
              "2021-10-31","Allianz Stadium","18:00","Recently Matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Real Madrid","Internazionale",0,0,
              "2021-12-8","Santiago Bernabeu","16:00","matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Ajax","Sporting Cp",0,0,
              "2021-12-8"," Amsterdam","22:00","matches")) ;

      /* ******************************************************************************************************* */
      matches.add(new Match("Milan","Liverpool",0,0,
              "2021-12-8","San Siro","18:00","matches")) ;

      /* ******************************************************************************************************* */

      return matches ;
  }


  public ArrayList<Match> getMatchbystatus(String status) {
    ArrayList<Match> matchess = getMatches();
    ArrayList<Match> result = new ArrayList<>()  ;
    for (Match m : matchess) {
      if (m.getStatus().equals((status))) {
        result.add(m);
      }
    }
    return result;
  }


  public String[] getStatusType() {
      String[] statusTypes = new String[]{"matches", "Recently Matches"};
      return statusTypes;
  }

}
