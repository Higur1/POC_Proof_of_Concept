#
#Total amount spent by each customer, grouped by customer name
#
SELECT name, sum(f.price)
	FROM travel_db.tickets t
    INNER JOIN travel_db.customers c 
		ON t.customer_id = c.customer_id
	INNER JOIN travel_db.flights f
		ON t.flight_id = f.flight_id
	GROUP BY c.name