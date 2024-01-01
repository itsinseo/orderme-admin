package org.example.ordermeadmin.service.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.ordermeadmin.domain.entity.Customer;
import org.example.ordermeadmin.enums.CustomerGrade;

@Getter
@Setter
public class CustomerDto {

    private Long customerId;

    private String customerName;

    private int age;

    private String phoneNumber;

    private String address;

    private CustomerGrade grade;

    public CustomerDto(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.customerName = customer.getCustomerName();
        this.age = customer.getAge();
        this.phoneNumber = customer.getPhoneNumber();
        this.address = customer.getAddress();
        this.grade = customer.getGrade();
    }
}
