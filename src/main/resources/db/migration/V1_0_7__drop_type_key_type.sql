DROP TABLE keys;

DROP TYPE key_type;

CREATE TABLE keys (
    id SERIAL PRIMARY KEY,
    uuid UUID UNIQUE NOT NULL,
    key_value VARCHAR(255) UNIQUE,
    key_type VARCHAR(255) NOT NULL,
    bank_id INTEGER NOT NULL,
    account_branch VARCHAR(5) NOT NULL,
    account_number VARCHAR(8) NOT NULL,
    account_opening_date TIMESTAMP NOT NULL,
    owner_name VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    FOREIGN KEY (bank_id) REFERENCES banks(id)
);