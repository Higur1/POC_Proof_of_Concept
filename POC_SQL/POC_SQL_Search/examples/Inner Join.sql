#INNER JOIN
SELECT * 
	FROM travel_db.customers
	INNER JOIN travel_db.addresses
	ON customers.customer_id = addresses.customer_id;

SELECT * 
	FROM travel_db.customers AS c 
	INNER JOIN travel_db.addresses AS a 
	ON c.customer_id = a.customer_id;

SELECT c.name, a.city 
	FROM travel_db.customers AS c 
	INNER JOIN travel_db.addresses AS a 
	ON c.customer_id = a.customer_id;

SELECT c.name, a.city 
	FROM travel_db.customers AS c 
	INNER JOIN travel_db.addresses AS a 
	ON c.customer_id = a.customer_id 
	WHERE city = 'Melbourne';

SELECT * 
	FROM travel_db.tickets t 
	INNER JOIN travel_db.flights f 
	ON t.flight_id = t.flight_id;

SELECT * 
	FROM travel_db.tickets t 
	INNER JOIN travel_db.flights f 
	ON t.flight_id = t.flight_id 
	WHERE dep_airport_iata_code = 'GRU';

SELECT f.flight_id, t.seat, f.dep_airport_iata_code, f.arr_airport_iata_code 
	FROM travel_db.tickets t 
	INNER JOIN travel_db.flights f 
	ON t.flight_id = t.flight_id 
	WHERE dep_airport_iata_code = 'GRU';

#OUTER JOIN - Customer Left Address Right
SELECT * 
FROM travel_db.customers c 
	LEFT JOIN travel_db.addresses a 
	ON c.customer_id = a.customer_id;

SELECT * 
	FROM travel_db.customers c 
	RIGHT JOIN travel_db.addresses a 
	ON c.customer_id = a.customer_id;