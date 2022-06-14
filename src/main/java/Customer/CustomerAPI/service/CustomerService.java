package Customer.CustomerAPI.service;

import Customer.CustomerAPI.model.Customer;

import java.util.List;

public interface CustomerService {
   Customer createCustomer(Customer customer);
   Customer updateCustomer(Customer customer);
   List<Customer> getAllCustomer();
   Customer getCustomerById(long id);
   void deleteCustomer(long id);

}
