DROP TABLE IF EXISTS personaldetails;

CREATE TABLE personaldetails (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_Name VARCHAR(250) NOT NULL,
  last_Name VARCHAR(250) NOT NULL,
  phonenumber long(11) NOT NULL
);

INSERT INTO personaldetails (first_Name, last_Name, phonenumber) VALUES
  ('Aliko', 'Dangote', 1234567890),
  ('Bill', 'Gates', 0987654321),
  ('Folrunsho', 'Alakija', 1234509876);