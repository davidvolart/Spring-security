INSERT INTO classroom VALUES ('100', 60, 'Sea', 0);
INSERT INTO classroom VALUES ('101', 20, 'North', 0);
INSERT INTO classroom VALUES ('102', 70, 'South', 1);
INSERT INTO classroom VALUES ('103', 80, 'West', 0);
INSERT INTO classroom VALUES ('104', 50, 'East', 1);
INSERT INTO classroom VALUES ('Sala Juntes', 90, 'Sea', 1);



INSERT INTO user_lab VALUES ('roure', '{bcrypt}$2a$10$0VGzG8lfiDXBnFTE98lfiOLtP4uh62wnE6iWs5.2AMrJ3G9k7XZqu', 1);
INSERT INTO user_lab VALUES ('alvarez', '{bcrypt}$2a$10$7PFxXn4TQRiut9jNcAl7AubQZUWWck/eML3TDaQtoZiWNEN6o.Ig6', 1);
INSERT INTO user_lab VALUES ('castells', '{bcrypt}$2a$10$vvAubuSVVGFBx0I39N6EQeU4Z9rVcXadAyANbSfsuvdJ5VaVOfURS', 1);
INSERT INTO user_lab VALUES ('riera', '{bcrypt}$2a$10$wnw4VWrWAnFZmqPdWS5b1OtJxLyblMMNLImfbuFIm0hTUDp3q0SJy', 1);
INSERT INTO user_lab VALUES ('garcia', '{bcrypt}$2a$10$ljdVKsjPBx.P61hjFNFVHOGsUe76QpRxxGBLG5WCgnPNlNhxr0thG', 1);
INSERT INTO user_lab VALUES ('lecina', '{bcrypt}$2a$10$8J6t9dJ7KCU1KGBd7E2/2enlG1tyNkzoswFbckO01Efwp6wF6MH7u', 1);



INSERT INTO authorities (username, role) VALUES ('roure', 'ROLE_ADMIN');
INSERT INTO authorities (username, role) VALUES ('alvarez', 'ROLE_USER');
INSERT INTO authorities (username, role) VALUES ('castells', 'ROLE_USER');
INSERT INTO authorities (username, role) VALUES ('riera', 'ROLE_USER');
INSERT INTO authorities (username, role) VALUES ('garcia', 'ROLE_USER');
INSERT INTO authorities (username, role) VALUES ('lecina', 'ROLE_USER');
