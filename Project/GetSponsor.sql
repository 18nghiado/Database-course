CREATE TABLE GetSponsor(
   SponsorshipID INTEGER  NOT NULL REFERENCES MainSponsorship(SponsorshipID)
  ,Team_name     VARCHAR NOT NULL REFERENCES Team(Name)
  ,amount        INTEGER NOT NULL
  ,PRIMARY KEY(SponsorshipID, TeamName)
);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (1,'Arsenal', 200000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (2,'Bournemouth', 8000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (3,'Burnley', 5000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (4,'Brighton', 1500000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (5,'Cardiff', 3000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (6,'Chelsea', 200000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (7,'Crystal Palace', 6500000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (8,'Everton', 48000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (9,'Fulham', 6000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (10,'Huddersfield', 1500000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (11,'Leicester', 4000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (12,'Liverpool', 160000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (13,'Man City', 400000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (14,'Man United', 371000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (15,'Newcastle', 19500000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (16,'Southampton', 16000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (17,'Tottenham', 175000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (18,'Watford', 9000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (19,'West Ham', 40000000);
INSERT INTO GetSponsor(SponsorshipID,Team_name,amount) VALUES (20,'Wolves', 10000000);