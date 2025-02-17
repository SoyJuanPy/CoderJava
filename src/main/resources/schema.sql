CREATE TABLE clients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    lastname VARCHAR(75) NOT NULL,
    docnumber VARCHAR(11) NOT NULL UNIQUE
);

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(150) NOT NULL,
    code VARCHAR(50) NOT NULL UNIQUE,
    stock INT NOT NULL,
    price DOUBLE NOT NULL
);

CREATE TABLE invoice (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DOUBLE NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);

CREATE TABLE invoice_details (
    invoice_id INT NOT NULL,
    invoice_detail_id INT AUTO_INCREMENT,
    amount INT NOT NULL,
    product_id INT NOT NULL,
    price DOUBLE NOT NULL,
    PRIMARY KEY (invoice_id, invoice_detail_id),
    FOREIGN KEY (invoice_id) REFERENCES invoice(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

