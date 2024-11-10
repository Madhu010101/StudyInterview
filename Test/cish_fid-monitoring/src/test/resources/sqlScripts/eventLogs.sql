DROP TABLE IF EXISTS eventlogs;

CREATE TABLE IF NOT EXISTS eventlogs
(
    id bigint NOT NULL,
    keyidentifiernumber    character varying(255),
    error_description      character varying(255),
    status     boolean NOT NULL,
    event_id bigint NOT NULL,
    date  timestamp  without time zone,
    CONSTRAINT eventlogs_pkey PRIMARY KEY(id)
    );

INSERT INTO cishfid.eventlogs (id, keyidentifiernumber, error_description, status, event_id, date) VALUES (1002, '7f218950-271f-4a57-af73-b92a9f6e8db0', '403 Forbidden: [{
  "message":"You cannot consume this service"
}]', false, 2505, '2022-12-08 12:58:31.106676');