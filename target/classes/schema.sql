DROP TABLE if EXISTS classroom;
CREATE TABLE classroom
(
  name VARCHAR (55) PRIMARY KEY,
  capacity INT,
  orientation VARCHAR (255),
  plugs BIT
);


DROP TABLE if EXISTS user_lab;
CREATE TABLE user_lab(
  username VARCHAR (55) PRIMARY KEY,
  password VARCHAR(70) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1
);

DROP TABLE if EXISTS authorities;
CREATE TABLE authorities (
  authority_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (authority_id),
  UNIQUE KEY uni_username_role (role,username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES user_lab (username));

