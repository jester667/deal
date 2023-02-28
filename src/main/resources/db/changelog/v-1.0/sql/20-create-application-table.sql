CREATE SEQUENCE IF NOT EXISTS application_id_seq minvalue 1 increment by 1
GO

CREATE TABLE IF NOT EXISTS application (
    application_id bigserial,
    client_id bigserial,
    credit_id bigserial,
    status varchar(255),
    creation_date timestamp,
    sign_date timestamp,
    applied_offer jsonb,
    ses_code integer,
    status_history jsonb
)
GO

ALTER TABLE IF EXISTS application
    ADD CONSTRAINT application_id_pk PRIMARY KEY (application_id)
GO

ALTER TABLE IF EXISTS application
    ADD CONSTRAINT application_client_id_fk FOREIGN KEY (client_id)
        REFERENCES client(client_id) ON UPDATE CASCADE ON DELETE CASCADE
GO

ALTER TABLE IF EXISTS application
    ADD CONSTRAINT application_credit_id_fk FOREIGN KEY (credit_id)
        REFERENCES credit(credit_id) ON UPDATE CASCADE ON DELETE CASCADE
GO