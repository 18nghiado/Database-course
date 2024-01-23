import java.sql.Connection;
import java.util.Scanner;

public class FrontEnd {
   static Connection connection;

   public FrontEnd(){

   }

   public static void main(String[] backend) throws Exception {
      runConsole(new BackEnd());
      System.out.println("Exiting...");
   }

   public static void runConsole(BackEnd backend) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("db > ");
      String string = scanner.nextLine();


for(String arg = ""; string != null && !string.equalsIgnoreCase("q"); string = scanner.nextLine()) {
    String[] input = string.split("\\s+");
    if (string.indexOf(" ") > 0) {
       arg = string.substring(string.indexOf(" ")).trim();
    }

    //print help
    if (input[0].equalsIgnoreCase("h")) {
       printHelp();
    }
    //print show Table
    else if (input[0].equalsIgnoreCase("employee")) {
        backend.showEmployee();
    }
    else if (input[0].equalsIgnoreCase("team")) {
        backend.showTeam();
    }
    else if (input[0].equalsIgnoreCase("city")) {
        backend.showCity();
    }
    else if (input[0].equalsIgnoreCase("award")) {
        backend.showAward();
    }
    else if (input[0].equalsIgnoreCase("stadium")) {
        backend.showStadium();
    }
    else if (input[0].equalsIgnoreCase("mainsponsorship")) {
        backend.showMainSponsorship();
    }
    else if (input[0].equalsIgnoreCase("HeadReferee")) {
        backend.showHeadReferee();
    }
    else if (input[0].equalsIgnoreCase("Matches")) {
        backend.showMatches();
    }
    else if (input[0].equalsIgnoreCase("Score")) {
        backend.showScore();;
    }
    else if (input[0].equalsIgnoreCase("GetAward")) {
        backend.showGetAward();
    }
    else if (input[0].equalsIgnoreCase("GetSponsor")) {
        backend.showGetSponsor();
    }
    else if (input[0].equalsIgnoreCase("GoalDiff")) {
        backend.showGoalDiff();
    }
    else if (input[0].equalsIgnoreCase("TeamPoint")) {
        backend.showTeamPoint();
    }
    else if (input[0].equalsIgnoreCase("HomeStadium")) {
        backend.showHomeStadium();
    }
    else if (input[0].equalsIgnoreCase("Play")) {
        backend.showPlay();
    }
    // show Queries
    else if (input[0].equalsIgnoreCase("ec")) {
        try {
            if (input.length >= 2) {
                backend.employeeByString(arg);                                      
            } else {
               System.out.println("Require an argument for this command");
            }
         } catch (Exception notString) {
            System.out.println("name must be a string");
         }
    }
    else if (input[0].equalsIgnoreCase("eid")) {
        try {
            if (input.length >= 2) {
                backend.emplyeeByID(Integer.valueOf(arg));                                        
            } else {
               System.out.println("Require an argument for this command");
            }
         } catch (Exception notInteger) {
            System.out.println("id must be an integer");
         }
       
    }
    else if (input[0].equalsIgnoreCase("mrid")) {
        try {
            if (input.length >= 2) {
                backend.matchByRid(Integer.valueOf(arg));                                     
            } else {
               System.out.println("Require an argument for this command");
            }
         } catch (Exception notInteger) {
            System.out.println("id must be an integer");
         }
    }
    else if (input[0].equalsIgnoreCase("gpo")) {
       backend.GPosition();
    }
    else if (input[0].equalsIgnoreCase("aat")) {
        backend.Aattendance();
    }
    else if (input[0].equalsIgnoreCase("apl")) {
        backend.AplayerAge();
    }
    else if (input[0].equalsIgnoreCase("taw")) {
        backend.Tawards();
    }
    else if (input[0].equalsIgnoreCase("mbsc")) {
        backend.matchBySameCity();
    }
    else if (input[0].equalsIgnoreCase("phs")) {
        backend.PHSponsorship();
    }
    else if (input[0].equalsIgnoreCase("tah")) {
        backend.TattendanceHome();
    }
    else if (input[0].equalsIgnoreCase("ref5")) {
        backend.Referee50000();
    }
    else if (input[0].equalsIgnoreCase("tops")) {
        backend.TopScorers();
    }
    else if (input[0].equalsIgnoreCase("cct")) {
        backend.CityCnT();
    }
    else if (input[0].equalsIgnoreCase("cll")) {
        backend.CityLargenLowest();
    }
    else {
      System.out.println("Read the help with h, or find help somewhere else.");
   }

   System.out.print("db > ");
}

scanner.close();
}

private static void printHelp() {    
    System.out.println("Premier League Season 2018/2019");
    System.out.println("Commands:");
    System.out.println("h - Get help");
    System.out.println("====Tables====");
    System.out.println("EMPLOYEE - Print Employee Table");
    System.out.println("TEAM - Print Team Table");
    System.out.println("CITY - Print City Table");
    System.out.println("AWARD - Print Award Table");
    System.out.println("STADIUM - Print Stadium Table");
    System.out.println("MAINSPONSORSHIP - Print MainSponsorship Table");
    System.out.println("HEADREFEREE - Print Head Referee Table");
    System.out.println("MATCHES - Print Matches Table");
    System.out.println("SCORE - Print Score Table");
    System.out.println("GETAWARD - Print GetAward Table");
    System.out.println("GETSPONSOR - Print GetSponsor Table");
    System.out.println("GOALDIFF - Print GoalDiff Table");
    System.out.println("TEAMPOINT - Print TeamPoint Table");
    System.out.println("HOMESTADIUM - Print HomeStadium Table");
    System.out.println("PLAY - Print Play Table");
    System.out.println("====Queries====");
    System.out.println("ec - Print Employee name by 'character'");
    System.out.println("eid - Print Employee name by 'employee ID'");
    System.out.println("mrid - Print Match controlled by Referee 'ID'");
    System.out.println("gpo - Print employees by their position (like midfielder, defender, etc.) and calculates total goals, assists, and appearances");
    System.out.println("aat - the average attendance for each match day");
    System.out.println("apl - Print average player Age per Team");
    System.out.println("taw - Print the number of awards won by each team");
    System.out.println("mbsc - Print a list of matches played by 2 teams from the same city ");
    System.out.println("phs - Print Players with Most Awards in Teams with High Sponsorships(Over 100 millions)");
    System.out.println("tah - Print Total Attendance in Home Matches of every team ");
    System.out.println("ref5 - print Referees Who Have Officiated the Most Matches with Over 50,000 Attendance");
    System.out.println("tops - Print Top Goal Scorers in Teams with Negative Goal Difference");
    System.out.println("cct - Print List of Cities with Their Total Stadium Capacities and Number of Teams");
    System.out.println("cll - cities with their Largest Stadiums capacity and Lowest Team Points");
    System.out.println("q - Exit the program");
    System.out.println("---- end help ----- ");
 }
}
