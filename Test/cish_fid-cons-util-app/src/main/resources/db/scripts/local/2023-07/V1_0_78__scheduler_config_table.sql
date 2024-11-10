DROP TABLE IF EXISTS cishfid.scheduler_config CASCADE;
Drop sequence IF EXISTS cishfid.scheduler_config_seq;
CREATE SEQUENCE IF NOT EXISTS cishfid.scheduler_config_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.scheduler_config
(
    id bigint NOT NULL,
    scheduler_name text,
    scheduler_value text,
    CONSTRAINT scheduler_config_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (1, 'dlqScheduler', '0 0 7 * * *');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (2, 'eventScheduler', '0 0 7 * * *');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (3, 'regScheduler', '0 0 7 * * *');

COMMIT;