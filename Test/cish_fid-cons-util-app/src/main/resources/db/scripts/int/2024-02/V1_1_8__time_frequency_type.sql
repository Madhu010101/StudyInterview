DROP TABLE IF EXISTS cishfid.time_frequency_type;

DROP SEQUENCE IF EXISTS cishfid.time_frequency_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.time_frequency_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.time_frequency_type
(
    id bigint NOT NULL,
    stm_tp_cd           	  	 text,
    cmpny_tp_cd               	 integer,
    src_tbl_no            	  	 text,
    src_tbl_nme           		 text,
    src_cat               		 text,
    time_frequency_src_tp_cd     text,
	time_frequency_src_tp_desc   text,
    tbl_nme               		 text,
    time_frequency_entps_tp_cd   text,
    time_frequency_entps_tp_desc text,
    time_frequency_cat_tp_id     text,
    time_frequency_tp_efctv_dt   text,
    time_frequency_tp_expry_dt   text,
    CONSTRAINT time_frequency_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '1', 'Monthly', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '2', 'Quaterly', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '3', 'Bi-annually', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '4', 'Annual', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '5', 'Daily', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '6', 'Weekly', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '-2', 'FIELD NOT APPLICABLE TO SOURCE', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', null, null, null);
INSERT INTO cishfid.time_frequency_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, time_frequency_src_tp_cd, time_frequency_src_tp_desc, tbl_nme, time_frequency_entps_tp_cd, time_frequency_entps_tp_desc, time_frequency_cat_tp_id, time_frequency_tp_efctv_dt, time_frequency_tp_expry_dt) VALUES (nextval('cishfid.time_frequency_type_id_seq'), null, null, null, null, null, null, null, 'LKP_FREQ_TP', '-1', 'SOURCE CODE IS BLANK OR NULL', null, null, null);
commit;