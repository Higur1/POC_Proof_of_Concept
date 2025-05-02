
#
#The names of passengers traveling at dawn (departure from 10 pm onwards)
#
SELECT c.name 
	FROM travel_db.tickets t 
	INNER JOIN travel_db.customers c 
		ON t.customer_id = c.customer_id
	INNER JOIN travel_db.flights f
		ON t.flight_id = f.flight_id
	WHERE time(f.dep_time) >= '22:00:00';
    