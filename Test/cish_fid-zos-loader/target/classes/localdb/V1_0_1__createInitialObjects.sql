CREATE SCHEMA IF NOT EXISTS gateway;

CREATE SEQUENCE IF NOT EXISTS gateway.app_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE SEQUENCE IF NOT EXISTS gateway.service_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE SEQUENCE IF NOT EXISTS gateway.prop_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS gateway.channel_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS gateway.resp_map_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;    
    
CREATE TABLE IF NOT EXISTS gateway.application
(
    id bigint NOT NULL,
    application_name character varying(255) COLLATE pg_catalog."default",
    application_description character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT application_pkey PRIMARY KEY (id),
    CONSTRAINT application_constraint_app_name UNIQUE (application_name)
);

CREATE TABLE IF NOT EXISTS gateway.service
(
    id bigint NOT NULL,
    service_name character varying(255) COLLATE pg_catalog."default",
    service_description character varying(255) COLLATE pg_catalog."default",
    application_id bigint NOT NULL,
    CONSTRAINT service_pkey PRIMARY KEY (id),
    CONSTRAINT service_constraint_service_name UNIQUE (service_name),
    CONSTRAINT service_service_id_fkey FOREIGN KEY (application_id)
        REFERENCES gateway.application (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS gateway.channel
(
    id bigint NOT NULL,
    channel_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    originating_channel_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    stub_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    service_id bigint NOT NULL,
    CONSTRAINT channel_pkey PRIMARY KEY (id),
    CONSTRAINT channel_constraint_all_columns UNIQUE (channel_name, originating_channel_name, stub_name, service_id),
    CONSTRAINT channel_channel_id_fkey FOREIGN KEY (service_id)
        REFERENCES gateway.service (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS gateway.property
(
    id bigint NOT NULL,
    property_name character varying(255) COLLATE pg_catalog."default",
    value character varying(255) COLLATE pg_catalog."default",
    application_id bigint NOT NULL,
    CONSTRAINT properties_pkey PRIMARY KEY (id),
    CONSTRAINT properties_constraint_prop_app_id UNIQUE (property_name, application_id),
    CONSTRAINT properties_property_id_fkey FOREIGN KEY (application_id)
        REFERENCES gateway.application (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);


CREATE TABLE IF NOT EXISTS gateway.response_mapping
(
    id bigint NOT NULL,
    zos_error_code int NOT NULL,
    cst_error_code int NOT NULL,
    cst_error_description character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT resp_mapping_pkey PRIMARY KEY (id),
    CONSTRAINT resp_mapping_constraint_all UNIQUE (zos_error_code,cst_error_code)
);