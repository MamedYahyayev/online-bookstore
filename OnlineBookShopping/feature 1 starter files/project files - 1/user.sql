-- create user with name bookstore
CREATE USER 'bookstoredev'@'localhost' IDENTIFIED BY 'bookstoredev';

-- provide all the permission
GRANT ALL PRIVILEGES ON * . * TO 'bookstoredev'@'localhost';

-- create password bookstore
ALTER USER 'bookstoredev'@'localhost' IDENTIFIED WITH mysql_native_password BY 'bookstoredev';