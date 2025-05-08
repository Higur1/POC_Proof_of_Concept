package applications;

import core.ConnectionFactory;
import core.DBConn;

import java.util.List;

public class ProcessCustomers {
    public static void main(String[] args) {

        try (DBConn dbConn = ConnectionFactory.getConnection()) {
            CustomerDAO customerDAO = new CustomerDAO(dbConn);

            Customer customer = new Customer("Jonh", "Jonh@email.com", 35);
            //System.out.format("Customer id: %d", insert(customerDAO, customer));

            list(customerDAO).stream().toList().forEach(System.out::println);

            delete(customerDAO, 255);
        }
    }

    public static Integer insert(CustomerDAO customerDAO, Customer customer) {
        return customerDAO.insert(customer);
    }

    public static List<Customer> list(CustomerDAO customerDAO) {
        return customerDAO.list();
    }

    public static void delete(CustomerDAO customerDAO, Integer id){
        customerDAO.deleteById(id);
    }
}
