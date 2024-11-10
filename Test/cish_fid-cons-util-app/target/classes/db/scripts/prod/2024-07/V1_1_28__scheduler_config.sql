INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (7, 'rmDlqScheduler', '0 0 7 * * ?');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (8, 'rmEventLogsScheduler', '0 0 7 * * ?');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (9, 'rmdbCleanUpDays', '30');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (10, 'rmdlqCleanUpDays', '30');
INSERT INTO cishfid.scheduler_config (id, scheduler_name, scheduler_value) VALUES (11, 'rmCleanupScheduler', '0 0 10 * * ?');


COMMIT;