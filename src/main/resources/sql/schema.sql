CREATE TABLE IF NOT EXISTS orderme.customers
(
    customer_id   BIGINT AUTO_INCREMENT,
    customer_name VARCHAR(255),
    age           INT,
    phone_number  VARCHAR(255),
    address       VARCHAR(255),
    grade         VARCHAR(255),
    soft_deleted  BOOLEAN,
    created_at    TIMESTAMP,
    created_by    VARCHAR(255),
    updated_at    TIMESTAMP,
    updated_by    VARCHAR(255),
    PRIMARY KEY (customer_id)
);
