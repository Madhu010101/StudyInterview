DROP TABLE IF EXISTS cishfid.system;

DROP SEQUENCE IF EXISTS cishfid.system_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.system_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table system
(
    id bigint NOT NULL,
    src_tbl_no        text,
    src_tbl_nme       text,
    src_cat           text,
    stm_src_tp_cd     text,
    stm_src_tp_desc   text,
    tbl_nme           text,
    stm_tp_cd         text,
    stm_tp_long_desc  text,
    stm_tp_short_desc text,
    stm_efctv_dt      text,
    stm_expry_dt      text,
    CONSTRAINT system_pkey PRIMARY KEY(id)
);

INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'CIS', 'HOGAN CIS', 'STM_TP', 'CIS', 'HOGAN CIS', 'CIS', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'FID', 'CST FIRST ID', 'STM_TP', 'FID', 'FIRST ID', 'FID', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'CUSCACHE', 'CST CUSTOMER CACHE', 'STM_TP', 'CUSCACHE', 'DATA CACHE', 'CACHE', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'OPM', 'OPERATIONAL FIRST ID MASTER', 'STM_TP', 'OPM', 'OPERATIONAL FIRST ID MASTER', 'OPM', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'GSCC', 'GOLDENSOURCE-GS1 CLIENT', 'STM_TP', 'GSCC', 'GOLDEN SOURCE', 'GS', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'ORM', 'OPERATIONAL RELATIONSHIP MASTER', 'STM_TP', 'ORM', 'OPERATIONAL RELATIONSHIP MASTER', 'ORM', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'CRE', 'CUSTOMER RULES ENGINE', 'STM_TP', 'CRE', 'CUSTOMER RULES ENGINE', 'CRE', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'OCM', 'COMPLIANCE MASTER', 'STM_TP', 'OCM', 'OPERATIONAL COMPLIANCE MASTER', 'OCM', '2023-06-30', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, 'SOURCE SYSTEM', 'DCTM', 'DOCUMENTUM', 'STM_TP', 'DCTM', 'DOCUMENTUM', 'DCTM', '2022-01-11', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, null, null, null, 'STM_TP', '-2', 'FIELD NOT APPLICABLE TO SOURCE', 'NOT APPLICABLE', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, null, null, null, 'STM_TP', '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', 'NOT FOUND', '2022-01-01', null);
INSERT INTO cishfid.system (id, src_tbl_no, src_tbl_nme, src_cat, stm_src_tp_cd, stm_src_tp_desc, tbl_nme, stm_tp_cd, stm_tp_long_desc, stm_tp_short_desc, stm_efctv_dt, stm_expry_dt) VALUES (nextval('cishfid.system_id_seq') , null, null, null, null, null, 'STM_TP', '-1', 'SOURCE CODE IS BLANK OR NULL', 'BLANK', '2022-01-01', null);
commit;