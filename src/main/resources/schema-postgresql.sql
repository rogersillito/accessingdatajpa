DROP TABLE IF EXISTS customer;
DROP SEQUENCE IF EXISTS customer_id_seq;
CREATE TABLE customer(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);
