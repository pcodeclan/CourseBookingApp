package pcodeclan.com.github.cousebooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pcodeclan.com.github.cousebooking.models.Customer;
import pcodeclan.com.github.cousebooking.repositories.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getOneCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id).get(), HttpStatus.OK);
    }

//    @GetMapping(value="")
//    public ResponseEntity<List<Customer>> getAllCustomers

}
