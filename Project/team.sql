CREATE TABLE Team(
   Name          VARCHAR NOT NULL PRIMARY KEY
  ,Win           INTEGER  NOT NULL
  ,Draw          INTEGER  NOT NULL
  ,Lost          INTEGER  NOT NULL
  ,Goal          INTEGER  NOT NULL
  ,Concede       INTEGER  NOT NULL
  ,City_Name     VARCHAR NOT NULL REFERENCES City(Name)
  ,SponsorshipID INTEGER  NOT NULL REFERENCES MainSponsorship(SponsorshipID)
);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Bournemouth',13,6,19,56,70,'Bournemouth',2);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Arsenal',21,7,10,73,51,'London',1);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Brighton',9,9,20,35,60,'Brighton',4);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Burnley',11,7,20,45,68,'Burnley',3);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Cardiff',10,4,24,34,69,'Cardiff',5);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Chelsea',21,9,8,63,39,'London',6);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Crystal Palace',14,7,17,51,53,'London',7);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Everton',15,9,14,54,46,'Liverpool',8);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Fulham',7,5,26,34,81,'London',9);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Huddersfield',3,7,28,22,76,'Huddersfield',10);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Leicester',15,7,16,51,48,'Leicester',11);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Liverpool',30,7,1,89,22,'Liverpool',12);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Man City',32,2,4,95,23,'Manchester',13);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Man United',19,9,10,65,54,'Manchester',14);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Newcastle',12,9,17,42,48,'Newcastle',15);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Southampton',9,12,17,45,65,'Southampton',16);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Tottenham',23,2,13,67,39,'London',17);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Watford',14,8,16,52,59,'Watford',18);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('West Ham',15,7,16,52,55,'London',19);
INSERT INTO Team(Name,Win,Draw,Lost,Goal,Concede,City_Name,SponsorshipID) VALUES ('Wolves',16,9,13,47,46,'Wolverhampton',20);
