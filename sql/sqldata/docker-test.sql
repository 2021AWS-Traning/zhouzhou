CREATE DATABASE IF NOT EXISTS company;
USE company;
CREATE TABLE employees
(
    first_name varchar(25),
    last_name  varchar(25),
    department varchar(15),
    email      varchar(50)
);
INSERT INTO employees (first_name, last_name, department, email)
VALUES ('Lorenz', 'Vanthillo', 'IT', 'lvthillo@mail.com');

CREATE USER 'test'@'172.17.0.1' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'test'@'172.17.0.1' WITH GRANT OPTION;
