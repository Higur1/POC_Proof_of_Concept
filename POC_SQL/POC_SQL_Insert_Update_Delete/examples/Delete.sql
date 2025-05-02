#It is not possible to delete records with foreign keys in other tables - without ON DELETE CASCADE
#Unsafe DELETE FROM `travel.db`.`customers` WHERE name = 'Pedro' - more than one record can be deleted
DELETE FROM travel_db.customers
	WHERE customer_id = 2;
