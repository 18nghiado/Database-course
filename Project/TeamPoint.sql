CREATE TABLE TeamPoint(
   Win   INTEGER  NOT NULL REFERENCES Team(Win)
  ,Draw  INTEGER  NOT NULL REFERENCES Team(Draw)
  ,Lost  INTEGER  NOT NULL REFERENCES Team(Lost)
  ,Point INTEGER  NOT NULL
  ,PRIMARY KEY(Win,Draw,Lost)
);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (13,6,19,45);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (21,7,10,70);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (9,9,20,36);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (11,7,20,40);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (10,4,24,34);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (21,9,8,72);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (14,7,17,49);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (15,9,14,54);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (7,5,26,26);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (3,7,28,16);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (15,7,16,52);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (30,7,1,97);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (32,2,4,98);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (19,9,10,66);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (12,9,17,45);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (9,12,17,39);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (23,2,13,71);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (14,8,16,50);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (15,7,16,52);
INSERT INTO TeamPoint(Win,Draw,Lost,Point) VALUES (16,9,13,57);
