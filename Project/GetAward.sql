CREATE TABLE GetAward(
   AwardID    INTEGER  NOT NULL REFERENCES Award(AwardID)
  ,EmployeeID INTEGER  NOT NULL REFERENCES Employee(EmployeeID)
  ,PRIMARY KEY(AwardID, EmployeeID)
);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,351);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,168);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,454);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,458);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,551);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,370);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,503);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,488);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (1,251);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (2,551);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (3,49);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (4,551);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (5,458);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (6,458);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (7,168);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,169);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,537);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,68);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,551);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,46);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,84);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,190);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,442);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,458);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,503);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (8,488);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (9,37);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (10,454);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (10,488);
INSERT INTO GetAward(AwardID,EmployeeID) VALUES (10,411);
