UPDATE cishfid.scheduler_config SET scheduler_value = '0 0 10 * * *' where
        scheduler_value  = '0 */5  *  *  *  *';

COMMIT;