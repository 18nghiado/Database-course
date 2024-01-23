CREATE TABLE GoalDifference(
   Goal            INTEGER  NOT NULL REFERENCES Team(Goal)  
  ,Concede         INTEGER  NOT NULL REFERENCES Team(Concede)
  ,Goal_Difference INTEGER  NOT NULL
  ,PRIMARY KEY(Goal, Concede)
);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (56,70,-14);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (73,51,22);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (35,60,-25);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (45,68,-23);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (34,69,-35);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (63,39,24);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (51,53,-2);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (54,46,8);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (34,81,-47);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (22,76,-54);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (51,48,3);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (89,22,67);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (95,23,72);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (65,54,11);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (42,48,-6);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (45,65,-20);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (67,39,28);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (52,59,-7);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (52,55,-3);
INSERT INTO GoalDifference(Goal,Concede,Goal_Difference) VALUES (47,46,1);
