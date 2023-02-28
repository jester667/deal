ALTER TABLE IF EXISTS application
    DROP IF EXISTS CONSTRAINT application_id_pk
GO

ALTER TABLE IF EXISTS application
DROP IF EXISTS CONSTRAINT application_client_id_fk
GO

ALTER TABLE IF EXISTS application
DROP IF EXISTS CONSTRAINT application_credit_id_fk
GO

DROP TABLE IF EXISTS application
GO

DROP SEQUENCE IF EXISTS application_id_seq
GO