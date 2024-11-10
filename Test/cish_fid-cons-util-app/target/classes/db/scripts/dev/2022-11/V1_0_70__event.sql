DROP TABLE IF EXISTS cishfid.event;

CREATE SEQUENCE IF NOT EXISTS cishfid.event_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE TABLE IF NOT EXISTS cishfid.event
(
    id bigint NOT NULL,
    fid_messages    text,
    transformed_messages    text,
    event_type      character varying(255),
    event_status     boolean NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT event_pkey PRIMARY KEY(id)
);
