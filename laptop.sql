CREATE DATABASE laptop;
USE laptop;

CREATE TABLE laptop_details(
  ID INT,
  BRAND VARCHAR(20),
  PRIZE VARCHAR(35),
  GENERATION VARCHAR(35),
  STORAGE INT
  );
DESCRIBE laptop_details;

	INSERT INTO laptop_details value(1,'DELL',35000,'CORE I5',500);
	INSERT INTO laptop_details value(2,'HP',50000,'CORE I7',600);
    INSERT INTO laptop_details value(3,'LENOVA',45000,'CORE I7',700);
    INSERT INTO laptop_details value(4,'HP',95000,'CORE I3',600);
	INSERT INTO laptop_details value(5,'ACER',65000,'CORE I5',500);

    UPDATE Laptop.laptop_details SET BRAND='MACBOOK' WHERE ID=4;
    DELETE FROM Laptop.laptop_details WHERE ID=5;

    SELECT *FROM laptop_details WHERE ID=1;

	SELECT*FROM laptop_details;


