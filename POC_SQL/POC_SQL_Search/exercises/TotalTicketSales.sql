#
# total ticket value on flights departing from US airports
#
SELECT sum(f.price)
	FROM travel_db.flights f 
	INNER JOIN travel_db.airports a 
		ON f.dep_airport_iata_code = a.iata_code 
    INNER JOIN travel_db.tickets t 
		ON t.flight_id = f.flight_id 
	WHERE a.country = 'EUA'; 
