INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (5, 'dbCleanUpDays', '30');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (6, 'dlqCleanUpDays', '30');
UPDATE cishfid.scheduler_config set scheduler_value = '0 0 7 * * ?' where id in (1,2,3);
UPDATE cishfid.scheduler_config set scheduler_value = '0 0 10 * * ?' where id in (4);
COMMIT;