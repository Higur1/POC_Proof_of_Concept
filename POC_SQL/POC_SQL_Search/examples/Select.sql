SELECT * 
	FROM travel_db.customers;
    
SELECT customer_id, name 
	FROM travel_db.customers;

SELECT * 
	FROM travel_db.addresses;
    
SELECT customer_id AS 'Client id', city AS 'City' 
	FROM travel_db.addresses;

SELECT * 
	FROM travel_db.flights;

SELECT * 
	FROM travel_db.flights
	WHERE price < 600;

SELECT * 
	FROM travel_db.flights
	WHERE price < 800 AND dep_airport_iata_code = 'GRU';

SELECT flight_id
	FROM travel_db.flights
	WHERE price < 800  AND dep_airport_iata_code = 'GRU';

SELECT sum(price) 
	FROM travel_db.flights;

SELECT dep_airport_iata_code, sum(price) 
	FROM travel_db.flights 
	GROUP BY dep_airport_iata_code;

SELECT dep_airport_iata_code, sum(price), avg(price), max(price), min(price), count(price) 
	FROM travel_db.flights
	GROUP BY dep_airport_iata_code;

SELECT dep_airport_iata_code, sum(price), avg(price), max(price), min(price), count(price) 
	FROM travel_db.flights
	WHERE dep_airport_iata_code = 'GRU' 
	GROUP BY dep_airport_iata_code; 

SELECT * 
	FROM travel_db.tickets;

SELECT * 
	FROM travel_db.tickets
	ORDER BY purchase_date ASC;

SELECT seat 
	FROM  travel_db.tickets
	WHERE customer_id = 1 
	ORDER BY purchase_date;

SELECT * 
	FROM travel_db.tickets
	WHERE customer_id = 1 
	ORDER BY 
		purchase_date ASC, 
		flight_id DESC;

SELECT * 
	FROM travel_db.airports;

SELECT country, count(*) 
	FROM travel_db.airports
	GROUP BY country; 

