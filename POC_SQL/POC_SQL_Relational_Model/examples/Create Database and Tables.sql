CREATE TABLE travel_db.customers (
	`customer_id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(45) NOT NULL,
    `email` varchar(45) NOT NULL,
    
    PRIMARY KEY (`customer_id`)
);

CREATE TABLE travel_db.addresses(
    `customer_id` INT NOT NULL,
    `line_one` VARCHAR(45) NOT NULL,
    `line_two` VARCHAR(45), 
    `city` VARCHAR(45) NOT NULL,
    `country` VARCHAR(45) NOT NULL,
    
	PRIMARY KEY (`customer_id`),
    
	CONSTRAINT fk_addresses_customer_id_customers_customer_id 
		FOREIGN KEY (`customer_id`) 
        REFERENCES `travel_db`.`customers` (`customer_id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);

CREATE TABLE travel_db.airports(
	`iata_code` CHAR(3) NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    `country` VARCHAR(45) NOT NULL,
    
    PRIMARY KEY (`iata_code`)
);

CREATE TABLE travel_db.flights(
	`flight_id` INT NOT NULL AUTO_INCREMENT,
    `dep_airport_iata_code` CHAR(3) NOT NULL,
    `arr_airport_iata_code` CHAR(3) NOT NULL,
    `dep_time` DATETIME NOT NULL,
    `arr_time` DATETIME NOT NULL,
    `price` DECIMAL(8,2) NOT NULL,
    
    PRIMARY KEY (`flight_id`),
    
    CONSTRAINT fk_flights_dep_airport_iata_code_airports_iata_code
		FOREIGN KEY (`dep_airport_iata_code`)
		REFERENCES `travel_db`.`airports` (`iata_code`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
	
    CONSTRAINT fk_flights_arr_airport_iata_code_airports_iata_code
		FOREIGN KEY (`arr_airport_iata_code`)
        REFERENCES `travel_db`.`airports` (`iata_code`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);

CREATE TABLE travel_db.tickets(
	`ticket_id` INT NOT NULL AUTO_INCREMENT,
    `customer_id` INT NOT NULL, 
    `flight_id` INT NOT NULL,
    `seat` INT NOT NULL, 
    `purchase_date`DATETIME,
    
    PRIMARY KEY (`ticket_id`),
    
    CONSTRAINT fk_tickets_customer_id_customers_customer_id
		FOREIGN KEY (`customer_id`) 
		REFERENCES `travel_db`.`customers` (`customer_id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
        
    CONSTRAINT fk_tickets_flight_id_flights_flight_id
		FOREIGN KEY (`flight_id`)
        REFERENCES `travel_db`.`flights` (`flight_id`)
		ON DELETE NO ACTION
        ON UPDATE NO ACTION
);





