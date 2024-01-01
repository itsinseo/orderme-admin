package org.example.ordermeadmin.repository;

import org.example.ordermeadmin.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllBySoftDeletedIsFalse();

    List<Customer> findAllByCustomerName(String customerName);
}
