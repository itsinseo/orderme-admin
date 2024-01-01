package org.example.ordermeadmin.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.ordermeadmin.domain.entity.Customer;
import org.example.ordermeadmin.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public List<Customer> findAllByActiveCustomer() {
        return customerRepository.findAllBySoftDeletedIsFalse();
    }
}
