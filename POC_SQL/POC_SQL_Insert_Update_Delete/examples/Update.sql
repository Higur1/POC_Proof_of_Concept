UPDATE travel_db.customers
	SET 
		email = 'carlos@a.com', 
        name = 'Carlos Tosin'
    WHERE customer_id = 1;
    
UPDATE travel_db.flights
	SET 
		price = 410.0 
    WHERE flight_id = 1;