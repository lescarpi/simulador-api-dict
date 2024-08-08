CREATE TYPE key_type_upper AS ENUM (
    'CPF',
    'CNPJ',
    'PHONE',
    'EMAIL'
);

ALTER TABLE keys ALTER COLUMN key_type TYPE key_type_upper USING key_type::text::key_type_upper;

DROP TYPE key_type;

ALTER TYPE key_type_upper RENAME TO key_type;