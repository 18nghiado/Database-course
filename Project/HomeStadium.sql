CREATE TABLE HomeStadium(
   Home_team VARCHAR NOT NULL REFERENCES Matches(HomeTeam)
  ,StaID     INTEGER NOT NULL
  ,PRIMARY KEY(HomeTeam)
);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Bournemouth',450);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Arsenal',372);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Brighton',349);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Burnley',443);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Cardiff',1816);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Chelsea',432);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Crystal Palace',422);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Everton',224);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Fulham',367);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Huddersfield',386);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Leicester',391);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Liverpool',350);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Man City',373);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Man United',407);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Newcastle',428);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Southampton',429);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Tottenham',451);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Watford',446);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('West Ham',356);
INSERT INTO HomeStadium(Home_team,StaID) VALUES ('Wolves',401);
