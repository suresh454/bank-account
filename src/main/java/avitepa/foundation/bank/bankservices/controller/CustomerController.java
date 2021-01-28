package avitepa.foundation.bank.bankservices.controller;

import avitepa.foundation.bank.bankservices.model.Account;
import avitepa.foundation.bank.bankservices.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/")
    public List<Customer> getCustomers(){

        return null;
    }

    @GetMapping ("/{id}")
    public Customer getCustomer(@PathVariable int id){

        return null;
    }


    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer){
        return null;
    }

    @PutMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer){
        return null;
    }




}
