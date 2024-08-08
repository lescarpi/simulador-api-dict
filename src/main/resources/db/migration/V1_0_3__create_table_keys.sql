CREATE TABLE keys (
    id SERIAL PRIMARY KEY,
    key_value VARCHAR(255) UNIQUE,
    key_type key_type NOT NULL,
    bank_id INTEGER NOT NULL,
    account_branch VARCHAR(5) NOT NULL,
    account_number VARCHAR(8) NOT NULL,
    account_opening_date TIMESTAMP NOT NULL,
    owner_name VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    FOREIGN KEY (bank_id) REFERENCES banks(id)
);