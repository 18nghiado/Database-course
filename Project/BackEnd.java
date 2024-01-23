import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BackEnd {


   private Connection connection;

   public BackEnd() {
      try{
         // set up connection to the database
         Properties prop = new Properties();
         String fileName = "auth.cfg"; //
        try {
            FileInputStream configFile = new FileInputStream(fileName);
            prop.load(configFile);
            configFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find config file.");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Error reading config file.");
            System.exit(1);
        }
        String username = (prop.getProperty("username"));
        String password = (prop.getProperty("password"));

        if (username == null || password == null){
            System.out.println("Username or password not provided.");
            System.exit(1);
        }

        String connectionUrl =
                "jdbc:sqlserver://uranium.cs.umanitoba.ca:1433;"
                + "database=cs3380;"
                + "user=" + username + ";"
                + "password="+ password +";"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
         System.out.println("Successfully connected to the database");

          connection = DriverManager.getConnection(connectionUrl);
     }
     catch(Exception e){
         e.printStackTrace();
     }
     
 
   }  
 

// Show Tables
public void showTeam( ) {                            
      try {
         String sqlString ="SELECT Name, Win, Draw, Lost, Goal, Concede, City_Name, SponsorshipID FROM Team" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Name");
            output.println("" + output_1 + " - " + 
            " Win: " +  resultSet.getInt("Win") + 
            " Draw: " + resultSet.getInt("Draw") +
            " Lost: " + resultSet.getInt("Lost") +
            " Goal: " + resultSet.getInt("Goal") +
            " Concede: " + resultSet.getInt("Concede") +
            " City_Name: " + resultSet.getString("City_Name") +
            " SponsorshipID " + resultSet.getInt("SponsorshipID") 
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }


   public void showEmployee( ) {
      try {
         String sqlString ="SELECT EmployeeID, nationality, name, age, Team_name, Employee_Type, position, appearances, goals, assists, minutes_play FROM Employee" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("EmployeeID");
            output.println("" + output_1 + " - " + 
            " nationality: " +  resultSet.getString("nationality") + 
            " name: " + resultSet.getString("name") +
            " age: " + resultSet.getInt("age") +
            " Team_name: " + resultSet.getString("Team_name") +
            " Employee_Type: " + resultSet.getString("Employee_Type") +
            " position: " + resultSet.getString("position") +
            " appearances: " + resultSet.getInt("appearances") +
            " goals: " + resultSet.getInt("goals") +
            " assists: " + resultSet.getInt("assists") +
            " minutes_play: " + resultSet.getInt("minutes_play")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

      // show all city
      public void showCity( ) {    
         try {
            String sqlString ="SELECT city, Population, Number_of_Premier_league_team FROM City;" ;
   
            PreparedStatement statement = connection.prepareStatement(sqlString);
   
            ResultSet resultSet = statement.executeQuery();
   
            while(resultSet.next()) {
               PrintStream output = System.out;
               String output_1 = resultSet.getString("city");
               output.println("" + output_1 + " - " + 
               " Population: " +  resultSet.getInt("Population") + 
               " Number_of_Premier_league_team: " + resultSet.getInt("Number_of_Premier_league_team") 
            );
         }
            statement.close();
            resultSet.close();
         } catch (SQLException e) {
            e.printStackTrace(System.out);
         }
   
      }

         // show all Award
   public void showAward( ) {    //need Award
      try {
         String sqlString ="SELECT AwardID, AwardName from Award;" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("AwardID");
            output.println("" + output_1 + " - " + 
               " AwardName: " +  resultSet.getString("AwardName") 
               );
            }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }



         // show all stadium
         public void showStadium( ) {    
            try {
               String sqlString ="SELECT Stadium_ID, Team_Name, Capacity, City, Confederation FROM Stadium" ;
      
               PreparedStatement statement = connection.prepareStatement(sqlString);
      
               ResultSet resultSet = statement.executeQuery();
      
               while(resultSet.next()) {
                  PrintStream output = System.out;
                  int output_1 = resultSet.getInt("Stadium_ID");
                  output.println("" + output_1 + " - " +
                  " Team_Name: " +  resultSet.getString("Team_Name") +
                  " Capacity: " +  resultSet.getInt("Capacity") +
                  " City: " +  resultSet.getString("City") +
                  " Confederation: " +  resultSet.getString("Confederation")
                  );
               }
               statement.close();
               resultSet.close();
            } catch (SQLException e) {
               e.printStackTrace(System.out);
            }
      
         }
         

          // show all main sponsorship
   public void showMainSponsorship( ) {   
      try {
         String sqlString ="Select SponsorshipID, Sponsor_Name from Main_SponsorShip" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("SponsorshipID");
                  output.println("" + output_1 + " - " +
                  " Sponsor_Name: " +  resultSet.getString("Sponsor_Name") 
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

     // show all HeadReferee
     public void showHeadReferee( ) {    
      try {
         String sqlString ="SELECT RefereeID, Name, Date_of_birth, Nationality, Number_of_Matches, red, yellow FROM HeadReferee;" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("RefereeID");
            output.println("" + output_1 + " - " +
            " Name: " +  resultSet.getString("Name") +
            " Date_of_birth: " +  resultSet.getString("Date_of_birth") +
            " Nationality: " +  resultSet.getString("Nationality") +
            " Number_of_Matches: " +  resultSet.getInt("Number_of_Matches") +
            " red: " +  resultSet.getInt("red") +
            " yellow: " +  resultSet.getInt("yellow") 
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

         // show all Matches
         public void showMatches( ) {    
            try {
               String sqlString ="SELECT MatchID, Match_Day_Number, Home_Team, AwayTeam, RefID, Attendance FROM Matches;" ;
      
               PreparedStatement statement = connection.prepareStatement(sqlString);
      
               ResultSet resultSet = statement.executeQuery();
      
               while(resultSet.next()) {
                  PrintStream output = System.out;
                  int output_1 = resultSet.getInt("MatchID");
                  output.println("" + output_1 + " - " +
                  " Match_Day_Number: " +  resultSet.getInt("Match_Day_Number") +
                  " Home_Team: " +  resultSet.getString("Home_Team") +
                  " AwayTeam: " +  resultSet.getString("AwayTeam") +
                  " RefID: " +  resultSet.getInt("RefID") +
                  " Attendance: " +  resultSet.getInt("Attendance") 
                  );
               }
               statement.close();
               resultSet.close();
            } catch (SQLException e) {
               e.printStackTrace(System.out);
            }
      
         }


   public void showScore( ) {  
      try {
         String sqlString ="SELECT Home_Team, AwayTeam, Score from Score" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Home_Team");
                  output.println("Home_Team " + output_1 +
                  " AwayTeam: " +  resultSet.getString("AwayTeam") +
                  " Score: " +  resultSet.getString("Score")
                  );
               }



         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

         // show all GetAward
         public void showGetAward( ) {    
            try {
               String sqlString ="SELECT AwardID, EmployeeID from GetAward" ;
      
               PreparedStatement statement = connection.prepareStatement(sqlString);
      
               ResultSet resultSet = statement.executeQuery();
      
               while(resultSet.next()) {
                  PrintStream output = System.out;
                  int output_1 = resultSet.getInt("AwardID");
                  output.println("AwardID: " + output_1 + " - " +
                  " EmployeeID: " +  resultSet.getString("EmployeeID") 
                  );
               }     
               statement.close();
               resultSet.close();
            } catch (SQLException e) {
               e.printStackTrace(System.out);
            }
      
         }

         
      // show all getSponsor
   public void showGetSponsor( ) {   
      try {
         String sqlString ="SELECT SponsorshipID, Team_name, amount from GetSponsor" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("SponsorshipID");
            output.println("" + output_1 + " - " +
            " Team_name: " +  resultSet.getString("Team_name") +
            " amount: " +  resultSet.getInt("amount")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

   

      // show all GoalDiff
      public void showGoalDiff( ) {    
         try {
            String sqlString ="SELECT Goal, Concede, Goal_Difference from GoalDifference" ;
   
            PreparedStatement statement = connection.prepareStatement(sqlString);
   
            ResultSet resultSet = statement.executeQuery();
   
            while(resultSet.next()) {
               PrintStream output = System.out;
               int output_1 = resultSet.getInt("Goal");
                  output.println(" Goal: " + output_1 + 
                  " Concede: " +  resultSet.getInt("Concede") +
                  " Goal_Difference: " +  resultSet.getInt("Goal_Difference") 
                  );
               }
            statement.close();
            resultSet.close();
         } catch (SQLException e) {
            e.printStackTrace(System.out);
         }
   
      }  

      // show all TeamPoint
   public void showTeamPoint( ) {    
      try {
         String sqlString ="SELECT Win, Draw, Lost, Point from TeamPoint" ;

         PreparedStatement statement = connection.prepareStatement(sqlString);

         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("Win");
            output.println(" Win: " + output_1  +
            " Draw: " +  resultSet.getInt("Draw") +
            " Lost: " +  resultSet.getInt("Lost") +
            " Point: " +  resultSet.getInt("Point") 
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

      // show all HomeStadium
      public void showHomeStadium( ) {  
         try {
            String sqlString ="SELECT Home_Team, StaID from HomeStadium" ;
   
            PreparedStatement statement = connection.prepareStatement(sqlString);
   
            ResultSet resultSet = statement.executeQuery();
   
            while(resultSet.next()) {
               PrintStream output = System.out;
               String output_1 = resultSet.getString("Home_Team");
               output.println("" + output_1 + " - " +
               " StaID: " +  resultSet.getString("StaID") 
               );
            }
            statement.close();
            resultSet.close();
         } catch (SQLException e) {
            e.printStackTrace(System.out);
         }
   
      }
   
      // show all Play
      public void showPlay( ) {  
         try {
            String sqlString ="SELECT MatchID, Team_name from Play" ;
   
            PreparedStatement statement = connection.prepareStatement(sqlString);
   
            ResultSet resultSet = statement.executeQuery();
   
            while(resultSet.next()) {
               PrintStream output = System.out;
               int output_1 = resultSet.getInt("MatchID");
               output.println("" + output_1 + " - " +
               " Team_name: " +  resultSet.getString("Team_name") 
               );
            }
   
   
   
            statement.close();
            resultSet.close();
         } catch (SQLException e) {
            e.printStackTrace(System.out);
         }
   
      }
      
   // Queries
   //1. Search the name of the employee given a string.
   public void employeeByString(String name) {
      try {
         String sqlString ="SELECT EmployeeID, nationality, name, age, Team_name, Employee_Type, position, appearances, goals, assists, minutes_play FROM Employee WHERE LOWER(name) LIKE ?";

         PreparedStatement statement = connection.prepareStatement(sqlString);
         statement.setString(1, "%"+name.toLowerCase()+"%");
         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("name");
            output.println("" + output_1 + " - " + 
            " nationality: " +  resultSet.getString("nationality") + 
            " EmployeeID: " + resultSet.getInt("EmployeeID") +
            " age: " + resultSet.getInt("age") +
            " Team_name: " + resultSet.getString("Team_name") +
            " Employee_Type: " + resultSet.getString("Employee_Type") +
            " position: " + resultSet.getString("position") +
            " appearances: " + resultSet.getInt("appearances") +
            " goals: " + resultSet.getInt("goals") +
            " assists: " + resultSet.getInt("assists") +
            " minutes_play: " + resultSet.getInt("minutes_play"));
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

   //2. Search the name of the employee given an ID.  
   public void emplyeeByID(int id) {
      try {
         String sqlString ="SELECT EmployeeID, nationality, name, age, Team_name, Employee_Type, position, appearances, goals, assists, minutes_play "+
         "FROM Employee"+
         " WHERE EmployeeID = ?";

         PreparedStatement statement = connection.prepareStatement(sqlString);
         statement.setInt(1, id);
         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("EmployeeID");
            output.println("" + output_1 + " - " + 
            " nationality: " +  resultSet.getString("nationality") + 
            " name: " + resultSet.getString("name") +
            " age: " + resultSet.getInt("age") +
            " Team_name: " + resultSet.getString("Team_name") +
            " Employee_Type: " + resultSet.getString("Employee_Type") +
            " position: " + resultSet.getString("position") +
            " appearances: " + resultSet.getInt("appearances") +
            " goals: " + resultSet.getInt("goals") +
            " assists: " + resultSet.getInt("assists") +
            " minutes_play: " + resultSet.getInt("minutes_play")
            );
         }
         
         
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }




   //This query groups employees by their position (like midfielder, defender, etc.) and calculates total goals, assists, and appearances:
   public void GPosition () {
      try {
         String sqlString  = "SELECT position, SUM(goals) AS Total_Goals, SUM(assists) AS Total_Assists, SUM(appearances) AS Total_Appearances"+
         " FROM Employee "+
         "WHERE position IS NOT NULL "+
         "GROUP BY position";
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("position");
            output.println("" + output_1 + " - Toal Goals: " + resultSet.getInt("Total_Goals")+
            " Total Assists: "+ resultSet.getInt("Total_Assists")+
            " Total Appearances: "+ resultSet.getInt("Total_Appearances")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Calculates the average attendance for each match day:
   public void Aattendance () {
      try {
         String sqlString  = "SELECT Match_Day_Number, AVG(Attendance) AS Average_Attendance"+
         " FROM Matches "+
         "GROUP BY Match_Day_Number";
	 PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Match_Day_Number");
            output.println(" Match Day Number: " + output_1 + 
            " - Avg Attendance: " + resultSet.getInt("Average_Attendance")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Average Player Age per Team
   public void AplayerAge () {
      try {
         String sqlString  = "Select Team_name, AVG(age) AS Average_Player_Age"+
         " FROM Employee "+
         "WHERE Employee_Type = 'Player' "+
         "GROUP BY Team_name";
         PreparedStatement statement = connection.prepareStatement(sqlString);
	 ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Team_name");
            output.println(" Team name: " + output_1 + 
            " - Average_Player_Age: " + resultSet.getInt("Average_Player_Age")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Counts the number of awards won by each team:
   public void Tawards () {
      try {
         String sqlString  = "SELECT Employee.Team_name, COUNT(GetAward.AwardID) AS Awards_Count"+
         " FROM GetAward "+
         "JOIN Employee ON GetAward.EmployeeID = Employee.EmployeeID "+
         "GROUP BY Employee.Team_name ";
         PreparedStatement statement = connection.prepareStatement(sqlString);
	 ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Team_name");
            output.println(" Team name: " + output_1 + 
            " - Awards_Count: " + resultSet.getInt("Awards_Count")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Matches Controlled by a Referee, Using the Referee’s ID
   public void matchByRid(int rid) {
      try {
         String sqlString  =  "SELECT Matches.MatchID, Matches.Match_Day_Number, Matches.Home_Team, Matches.Attendance " + //
               "FROM Matches " + //
               "JOIN HeadReferee ON Matches.RefID = HeadReferee.RefereeID " + 
               "WHERE HeadReferee.RefereeID = ?";
         PreparedStatement statement = connection.prepareStatement(sqlString);
         statement.setInt(1, rid);
         ResultSet resultSet = statement.executeQuery();

         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("MatchID");
            output.println(" ID: " + output_1 +
            " Match Day Number: "+resultSet.getString("Match_Day_Number")+
            " Home_Team: "+resultSet.getString("Home_Team")+
            " Attendance: "+ resultSet.getInt("Attendance"));
         }
         

         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

   //List of Matches Played by 2 Teams from the Same City
   public void matchBySameCity() {
      try {
         String sqlString = "SELECT Matches.MatchID, Matches.Home_Team, Matches.AwayTeam, Score.Score, City.city" +
	       " FROM Matches" +
	       " JOIN Team AS HomeTeam ON Matches.Home_Team = HomeTeam.Name" +
	       " JOIN Team AS AwayTeam ON Matches.AwayTeam = AwayTeam.Name" +
	       " JOIN City ON HomeTeam.City_Name = City.city AND AwayTeam.City_Name = City.city" +
	       " LEFT JOIN Score ON Matches.Home_Team = Score.Home_Team AND Matches.AwayTeam = Score.AwayTeam" +
	       " WHERE HomeTeam.City_Name = AwayTeam.City_Name";
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            int output_1 = resultSet.getInt("MatchID");
            output.println(" ID: " + output_1 + 
            " - Home Team: "+resultSet.getString("Home_Team")+
            " Away Team: "+ resultSet.getString("AwayTeam")+
            " Score: "+ resultSet.getString("Score")+
            " City: "+ resultSet.getString("City"));
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }

   }

   //Players with Most Awards in Teams with High Sponsorships(Over 100 millions)
   public void PHSponsorship() {
      try {
         String sqlString = "SELECT Employee.name, COUNT(GetAward.AwardID) AS NumberOfAwards" + 
               " FROM Employee" + 
               " JOIN GetAward ON Employee.EmployeeID = GetAward.EmployeeID" +
               " JOIN GetSponsor ON Employee.Team_name = GetSponsor.Team_name" + 
               " GROUP BY Employee.name" + 
               " HAVING SUM(GetSponsor.amount) > 100000000" + 
               " ORDER BY NumberOfAwards DESC";
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("name");
            output.println(" Name: " + output_1 + 
            " - NumberOfAwards: "+resultSet.getInt("NumberOfAwards")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Total Attendance in Home Matches of every team
   public void TattendanceHome() {
      try {
         String sqlString = "SELECT Team.Name, SUM(Matches.Attendance) AS Total_Attendances" + 
               " FROM Team" + 
               " JOIN Play ON Team.Name = Play.Team_name" +
               " JOIN Matches ON Play.MatchID = Matches.MatchID" + 
               " WHERE Team.Name = Matches.Home_Team" + 
               " GROUP BY Team.Name" + 
               " ORDER BY Total_Attendances DESC";
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Name");
            output.println(" Name: " + output_1 + 
            " - Total Attendances: "+resultSet.getInt("Total_Attendances")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }


   //Referees Who Have Officiated the Most Matches with Over 50,000 Attendance
   public void Referee50000() {
      try {
         String sqlString = "SELECT HeadReferee.Name, COUNT(Number_of_Matches) AS Matches_Officiated" + 
               " FROM HeadReferee" + 
               " JOIN Matches ON HeadReferee.RefereeID = Matches.RefID" +
               " WHERE Matches.Attendance > 50000" + 
               " GROUP BY HeadReferee.Name" + 
               " ORDER BY Matches_Officiated DESC" ;
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("Name");
            output.println(" Name: " + output_1 + 
            " - Matches Officiated: "+resultSet.getInt("Matches_Officiated")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //Top Goal Scorers in Teams with Negative Goal Difference
   public void TopScorers() {
      try {
         String sqlString = "WITH TeamGoalDifference AS ("+
            "SELECT Name, Goal_Difference"+
            " FROM Team"+
            " Join GoalDifference ON Team.Goal = GoalDifference.Goal AND Team.Concede = GoalDifference.Concede"+
            ")"+
            "SELECT E.name, E.goals, E.Team_name"+
            " FROM Employee E"+
            " INNER JOIN ("+
            " SELECT Team_name, MAX(goals) AS MaxGoals"+
            " FROM Employee"+
            " WHERE Team_name IN ("+
            "    SELECT Name FROM TeamGoalDifference WHERE Goal_Difference < 0 "+
            ")"+
            " GROUP BY Team_name"+
            ") AS TopScorers ON E.Team_name = TopScorers.Team_name AND E.goals = TopScorers.MaxGoals"+
            " JOIN Team T ON E.Team_name = T.Name"+
            " ORDER By goals DESC;" ;
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("name");
            output.println(" Name: " + output_1 + 
            " - goals: "+resultSet.getInt("goals")+
            " Team: "+resultSet.getString("Team_name")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

   //List of Cities with Their Total Stadium Capacities and Number of Teams
   public void CityCnT() {
      try {
         String sqlString = "SELECT City.city, SUM(Stadium.Capacity) AS Total_Stadium_Capacity, COUNT(DISTINCT Team.Name) AS Number_of_Teams" + 
               " FROM City" + 
               " JOIN Team ON City.city = Team.City_Name" +
               " LEFT JOIN Stadium ON Team.Name = Stadium.Team_Name" + 
               " GROUP BY City.city" + 
               " ORDER BY Total_Stadium_Capacity DESC, Number_of_Teams DESC" ;
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("city");
            output.println(" City: " + output_1 + 
            " -  Total Stadium Capacity: "+resultSet.getInt("Total_Stadium_Capacity")+
            " Number of Teams: "+resultSet.getInt("Number_of_Teams")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }


   //Show cities with their Largest Stadiums capacity and Lowest Team Points
   public void CityLargenLowest() {
      try {
         String sqlString = "SELECT City.city, MAX(Stadium.Capacity) AS Largest_Stadium_Capacity, MIN(TP.Point) AS Lowest_Team_Points" + 
               " FROM City" + 
               " JOIN Stadium ON City.city = Stadium.City" +
               " JOIN Team ON Stadium.Team_Name = Team.Name" + 
               " JOIN TeamPoint AS TP ON Team.Win = TP.Win AND Team.Draw = TP.Draw AND Team.Lost = TP.Lost" + 
               " GROUP BY City.city"+
               " ORDER BY Largest_Stadium_Capacity DESC, Lowest_Team_Points ASC" ;
         PreparedStatement statement = connection.prepareStatement(sqlString);
         ResultSet resultSet = statement.executeQuery();
         while(resultSet.next()) {
            PrintStream output = System.out;
            String output_1 = resultSet.getString("city");
            output.println(" City: " + output_1 + 
            " -  Largest Stadium Capacity: "+resultSet.getInt("Largest_Stadium_Capacity")+
            " Lowest_Team_Points: "+resultSet.getInt("Lowest_Team_Points")
            );
         }
         statement.close();
         resultSet.close();
      } catch (SQLException e) {
         e.printStackTrace(System.out);
      }
   }

}


