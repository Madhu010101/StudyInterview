DROP TABLE IF EXISTS cishfid.name_type;

DROP SEQUENCE IF EXISTS cishfid.name_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.name_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.name_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    src_cd text,
    src_desc text,
    tbl_nme text,
    nm_tp_cd integer,
    nm_tp_desc text,
    nm_tp_attrbt_nm text,
    nm_tp_efctv_dt text,
    nm_tp_expry_dt text,
    CONSTRAINT name_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '1', 'FIRST NAME', 'firstName', '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '2', 'SURNAME', 'surname', '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '3', 'MIDDLE NAMES', 'middleNames', '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '4', 'ORGANISATION NAME', 'organisationName', '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '5', 'MAIDEN NAME', 'maidenName', '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '-2', 'FIELD NOT APPLICABLE TO SOURCE', null, '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', null, '2022-07-30', null);
INSERT INTO cishfid.name_type (id, stm_tp_cd, src_tbl_no, src_tbl_nme, src_cat, src_cd, src_desc, tbl_nme, nm_tp_cd, nm_tp_desc, nm_tp_attrbt_nm, nm_tp_efctv_dt, nm_tp_expry_dt) VALUES (nextval('cishfid.name_type_id_seq'), null, null, null, null, null, null, 'NM_TP', '-1', 'SOURCE CODE IS BLANK OR NULL', null, '2022-07-30', null);
commit;