package org.example.ordermeadmin.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.ordermeadmin.domain.entity.Customer;
import org.example.ordermeadmin.service.CustomerService;
import org.example.ordermeadmin.service.dto.CustomerDto;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Pageable;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final static String CUSTOMERS_ATTRIBUTE_KEY = "customers";

    @GetMapping("/customers")
    public String customers(Model model) {
        List<Customer> customers = customerService.findAllByActiveCustomer();
        List<CustomerDto> customerDTOs = customers.stream()
                .map(CustomerDto::new)
                .toList();

        model.addAttribute(CUSTOMERS_ATTRIBUTE_KEY, customerDTOs);
        return "/admin/customers";
    }
}
