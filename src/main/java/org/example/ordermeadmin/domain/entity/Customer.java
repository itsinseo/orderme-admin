package org.example.ordermeadmin.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.ordermeadmin.enums.CustomerGrade;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;

@Entity
@Table(name = "customers", schema = "orderme")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long customerId;

    @Column
    private String customerName;

    @Column
    private int age;

    @Column
    private String phoneNumber;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    @Column
    private CustomerGrade grade;

    @Column(name = "soft_deleted")
    private boolean softDeleted;

    @CreatedDate
    @Column
    private OffsetDateTime createdAt;

    @Column
    private String createdBy;

    @LastModifiedDate
    @Column
    private OffsetDateTime updatedAt;

    @Column
    private String updatedBy;
}
