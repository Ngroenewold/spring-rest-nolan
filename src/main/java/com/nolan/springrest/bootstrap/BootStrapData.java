package com.nolan.springrest.bootstrap;

import com.nolan.springrest.domain.Customer;
import com.nolan.springrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;


    // implements command line runner that runs on startup that injects the customers on runtime that persists to a h2 database on startup

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading our customers");

        Customer c1 = new Customer();
        c1.setFirstName("Nolan");
        c1.setLastName("Groenewold");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Jacqui");
        c2.setLastName("Matznick");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Zora");
        c3.setLastName("Lynn");
        customerRepository.save(c3);

        System.out.println("Cust saved: " + customerRepository.count());
    }
}
