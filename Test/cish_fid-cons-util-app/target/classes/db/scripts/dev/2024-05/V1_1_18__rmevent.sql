DROP TABLE IF EXISTS cishfid.rmevent;

CREATE SEQUENCE IF NOT EXISTS cishfid.rmevent_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.rmeventlogs_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;


CREATE TABLE IF NOT EXISTS cishfid.rmevent
(
    id bigint NOT NULL,
    rm_messages    text,
    transformed_messages    text,
    keyidentifiernumber character varying(255),
    event_type      character varying(255),
    event_status     boolean NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT rmevent_pkey PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS cishfid.rmeventlogs
(
    id bigint NOT NULL,
    keyidentifiernumber    character varying(255),
    request         text,
    response    text,
    status     boolean NOT NULL,
    event_id bigint NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT rmeventlogs_pkey PRIMARY KEY(id)
    );