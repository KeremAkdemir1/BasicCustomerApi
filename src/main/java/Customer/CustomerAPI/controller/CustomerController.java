package Customer.CustomerAPI.controller;

import Customer.CustomerAPI.model.Customer;
import Customer.CustomerAPI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
   public ResponseEntity<List<Customer>> getAllCustomer(){

       return ResponseEntity.ok().body(customerService.getAllCustomer());

    }
    @GetMapping("/all/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){

        return ResponseEntity.ok().body(customerService.getCustomerById(id));

    }

    @PostMapping
        public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){

       return ResponseEntity.ok().body(this.customerService.createCustomer(customer));

        }

        @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id,Customer customer){

        customer.setId(id);
            return ResponseEntity.ok().body(this.customerService.updateCustomer(customer));
        }

        @DeleteMapping("/delete/{id}")
        public HttpStatus deleteCustomer(@PathVariable long id){

        this.customerService.deleteCustomer(id);
        return HttpStatus.OK;
        }
}
