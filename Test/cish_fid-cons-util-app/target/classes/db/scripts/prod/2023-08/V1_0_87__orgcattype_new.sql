DROP TABLE IF EXISTS cishfid.org_category_type;

DROP SEQUENCE IF EXISTS cishfid.org_category_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.org_category_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.org_category_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    org_cat_src_tp_cd text,
    org_cat_src_tp_desc text,
    org_cat_src_attrbt_nm text,
    tbl_nme text,
    org_cat_entps_tp_cd integer,
    org_cat_entps_tp_desc text,
    org_cat_efctv_dt text,
    org_cat_expry_dt text,
    CONSTRAINT org_category_type_pkey PRIMARY KEY (id)
);


INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '1', 'SOLE PROPRIETORSHIP', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '2', 'PARTNERSHIP', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '3', 'CIPC ENTITY', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '4', 'TRUST', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '5', 'FOUNDATION', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '6', 'GOVERNMENT', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '7', 'STOKVEL', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '8', 'FRIENDLY SOCIETIES', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '9', 'OTHER ORGANISATION', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '-2', 'FIELD NOT APPLICABLE TO SOURCE', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', null, null);
INSERT INTO cishfid.org_category_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_cat_src_tp_cd, org_cat_src_tp_desc, org_cat_src_attrbt_nm, tbl_nme, org_cat_entps_tp_cd, org_cat_entps_tp_desc, org_cat_efctv_dt, org_cat_expry_dt) VALUES (nextval('cishfid.org_category_type_id_seq'), null, null, null, null, null, null, null, null, 'ORG_CAT_TP', '-1', 'SOURCE CODE IS BLANK OR NULL', null, null);
commit;