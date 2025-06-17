CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  password varchar(100),
  role varchar(15),
  PRIMARY KEY (id)
) ;

CREATE TABLE bankcards (
  id int NOT NULL AUTO_INCREMENT,
  number varchar(16),
  holder int,
  expdate date,
  status ENUM('ACTIVE', 'BLOCKED', 'EXPIRED'),
  balance int,
  PRIMARY KEY (id)
);