
CREATE TABLE IF NOT EXISTS cishfid.temp
(
    id bigint NOT NULL,
    channel_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    originating_channel_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    stub_name character varying(15) COLLATE pg_catalog."default" NOT NULL,
    service_id bigint NOT NULL

);

