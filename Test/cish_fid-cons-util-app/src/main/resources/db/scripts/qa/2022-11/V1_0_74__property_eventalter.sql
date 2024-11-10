DROP TABLE IF EXISTS cishfid.property;

CREATE SEQUENCE IF NOT EXISTS cishfid.prop_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;



CREATE TABLE IF NOT EXISTS cishfid.property
(
    id bigint NOT NULL,
    service_name  character varying(255) ,
    stand_in bigint NOT NULL ,
    CONSTRAINT property_pkey PRIMARY KEY(id)
);

CREATE SEQUENCE IF NOT EXISTS cishfid.reglogs_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;


CREATE TABLE IF NOT EXISTS cishfid.Regulatorylogs
(
    id bigint NOT NULL,
    keyidentifiernumber    character varying(255),
    request         text,
    response    text,
    status     boolean NOT NULL,
    event_id bigint NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT relulatorylogs_pkey PRIMARY KEY(id)
);

INSERT INTO cishfid.property(
    id, service_name, stand_in)
VALUES (1, 'cre-customer-core-maintain',15);
INSERT INTO cishfid.property(
    id, service_name, stand_in)
VALUES (2,'cre-customer-regulatory-maintain',15);


ALTER TABLE cishfid.event
    Add COLUMN service_ids character varying(255) ;
commit;
-- ALTER TABLE cishfid.event
--     Add COLUMN procces_date timestamp  without time zone ;
-- commit ;
