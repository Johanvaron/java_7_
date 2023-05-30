CREATE DATABASE db_boards;
USE db_boards;

CREATE TABLE users_tbl (
                         user_id INT PRIMARY KEY,
                         user_firstname VARCHAR(40) NOT NULL,
                         user_lastname VARCHAR(40) NOT NULL,
                         user_email VARCHAR(60) NOT NULL,
                         user_password VARBINARY(256),
                         product_id INT,
                         category_id INT,
                         FOREIGN KEY (product_id) REFERENCES products_tbl(product_id),
                         FOREIGN KEY (category_id) REFERENCES categories_tbl(category_id)
);

INSERT INTO users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('JOHAN'), UPPER('VARON'), 'JohanVaron@Varon.com', AES_ENCRYPT('!sbqjI393tUt','$2a$12$YDZbqlsHT3gWBDDqISjhouN9ZbCZfa/T4cSSY.BDRsIE9O7Gtq3H2'));

CREATE TABLE categories_tbl (
                              category_id INT PRIMARY KEY,
                              category_name VARCHAR(50) NOT NULL
);

CREATE TABLE products_tbl (
                            product_id INT PRIMARY KEY,
                            product_name VARCHAR(100) NOT NULL,
                            product_value DECIMAL(10,2) NOT NULL,
                            category_id INT,
                            FOREIGN KEY (category_id) REFERENCES categories_tbl(category_id)
);
