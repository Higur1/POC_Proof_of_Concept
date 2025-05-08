package applications;

import core.ConnectionFactory;
import core.DBConn;

public class ProcessCustomerWithPhone {
    public static void main(String[] args) {
        try (DBConn dbConn = ConnectionFactory.getConnection()) {
            dbConn.beginTransaction();

            CustomerDAO customerDAO = new CustomerDAO(dbConn);
            Customer customer = new Customer("Maria", "a@a.com", 53);
            Integer customerId = customerDAO.insert(customer);

            PhoneDAO phoneDAO = new PhoneDAO(dbConn);
            Phone phone = new Phone(customerId, "Phone", "3123132131");
            phoneDAO.insert(phone);

            dbConn.commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
