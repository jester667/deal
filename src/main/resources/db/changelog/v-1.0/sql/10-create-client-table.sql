CREATE SEQUENCE IF NOT EXISTS client_id_seq minvalue 1 increment by 1
GO

CREATE TABLE IF NOT EXISTS client (
    client_id bigserial,
    last_name varchar(255),
    first_name varchar(255),
    middle_name varchar(255),
    birth_date date,
    email varchar (255),
    gender varchar (255),
    marital_status varchar (255),
    dependent_amount integer,
    passport jsonb,
    employment jsonb,
    account varchar(255)
)
GO

ALTER TABLE IF EXISTS client
    ADD CONSTRAINT client_id_pk PRIMARY KEY (client_id)
GO
