DROP TABLE IF EXISTS cishfid.lease;

create table cishfid.lease
(
    service_name varchar(255),
    locked_at timestamp,
    locked_by varchar(255),
    locked_until timestamp
);
create unique index lease_service_name_uindex
    on lease (service_name);


COMMIT;