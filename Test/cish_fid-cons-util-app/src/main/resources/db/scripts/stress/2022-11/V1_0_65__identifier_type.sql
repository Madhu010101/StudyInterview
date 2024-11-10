DROP TABLE IF EXISTS cishfid.identifier_type;

CREATE SEQUENCE IF NOT EXISTS cishfid.identifier_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.identifier_type
(
    id bigint NOT NULL,
    stm_tp_cd        text,
    src_tbl_no       text,
    src_cat          text,
    stm_tp_src_cd    text,
    idfr_src_tp_cd   text,
    idfr_src_tp_desc text,
    tbl_nme          text,
    idfr_tp_cd       integer,
    idfr_tp_desc     text,
    idfr_efctv_dt    text,
    idfr_expry_dt    text,
    CONSTRAINT identifier_type_pkey PRIMARY KEY(id)
);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), 'GSCC', null, 'IDENTIFIER_TYPE', 'SOURCE IDENTIFIER', 'gsId', 'GOLDEN SOURCE ID', 'IDFR_TP', 1, 'GOLDEN SOURCE ID', '2022-01-01', null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), 'CIS', null, 'IDENTIFIER_TYPE', 'SOURCE IDENTIFIER', 'UCN', 'UNIQUE CUSTOMER NUMBER', 'IDFR_TP', 2, 'UNIQUE CUSTOMER NUMBER', '2022-01-01', null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), 'FID', null, 'IDENTIFIER_TYPE', 'SOURCE IDENTIFIER', 'SSOID', 'SSO IDENTIFIER', 'IDFR_TP', 3, 'SSO IDENTIFIER', '2022-01-01', null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), null, null, null, null, null, null, 'IDFR_TP', -2, 'FIELD NOT APPLICABLE TO SOURCE', '2022-01-01', null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), null, null, null, null, null, null, 'IDFR_TP', 0, 'SOURCE CODE IS NOT FOUND IN LOOKUP', '2022-01-01', null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'), null, null, null, null, null, null, 'IDFR_TP', -1, 'SOURCE CODE IS BLANK OR NULL', '2022-01-01', null);