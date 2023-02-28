CREATE SEQUENCE IF NOT EXISTS credit_id_seq minvalue 1 increment by 1
GO

CREATE TABLE IF NOT EXISTS credit (
    credit_id bigserial,
    amount numeric(19, 2),
    term integer,
    monthly_payment numeric(19, 2),
    rate numeric(19, 2),
    psk numeric(19, 2),
    payment_schedule jsonb,
    insurance_enable bool,
    salary_client bool,
    credit_status varchar(255)
)
GO

ALTER TABLE IF EXISTS credit
    ADD CONSTRAINT credit_id_pk PRIMARY KEY (credit_id)
GO