DROP TABLE IF EXISTS cishfid.org_classification_type;

DROP SEQUENCE IF EXISTS cishfid.org_classification_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.org_classification_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.org_classification_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    org_class_src_tp_cd text,
    org_class_src_tp_desc text,
    org_class_src_attrbt_nm text,
    tbl_nme text,
    org_class_entps_tp_cd integer,
    org_class_entps_tp_desc text,
    org_class_tp_attrbt_nm text,
    org_class_efctv_dt text,
    org_class_expry_dt text,
    CONSTRAINT org_classification_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.org_classification_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_class_src_tp_cd, org_class_src_tp_desc, org_class_src_attrbt_nm, tbl_nme, org_class_entps_tp_cd, org_class_entps_tp_desc, org_class_tp_attrbt_nm, org_class_efctv_dt, org_class_expry_dt) VALUES (nextval('cishfid.org_classification_type_id_seq'), null, null, null, 'ORG_CLASS_TP', null, '1', 'Standard Industry Classification', 'standardIndustryEntpsTypeCode', 'ORG_CLASS_TP', '1', 'Standard Industry Classification', 'standardIndustryEntpsTypeCode', '2023-03-01', null);
INSERT INTO cishfid.org_classification_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, org_class_src_tp_cd, org_class_src_tp_desc, org_class_src_attrbt_nm, tbl_nme, org_class_entps_tp_cd, org_class_entps_tp_desc, org_class_tp_attrbt_nm, org_class_efctv_dt, org_class_expry_dt) VALUES (nextval('cishfid.org_classification_type_id_seq'), null, null, null, 'ORG_CLASS_TP', null, '2', 'Business Industry Classification', 'businessIndustryEntpsTypeCode', 'ORG_CLASS_TP', '2', 'Business Industry Classification', 'businessIndustryEntpsTypeCode', '2023-03-01', null);
commit;
