
CREATE SEQUENCE IF NOT EXISTS cishfid.eventlogs_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;


CREATE TABLE IF NOT EXISTS cishfid.eventlogs
(
    id bigint NOT NULL,
    keyidentifiernumber    character varying(255),
    error_description      character varying(255),
    status     boolean NOT NULL,
    event_id bigint NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT eventlogs_pkey PRIMARY KEY(id)
);