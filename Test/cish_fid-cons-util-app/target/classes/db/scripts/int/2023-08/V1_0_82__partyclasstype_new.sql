DROP TABLE IF EXISTS cishfid.party_classification_type;

DROP SEQUENCE IF EXISTS cishfid.party_classification_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.party_classification_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.party_classification_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    party_class_src_tp_cd text,
    party_class_src_tp_desc text,
    party_class_src_attrbt_nm text,
    tbl_nme text,
    party_class_entps_tp_cd integer,
    party_class_entps_tp_desc text,
    party_class_tp_attrbt_nm text,
    party_class_efctv_dt text,
    party_class_expry_dt text,
    CONSTRAINT party_classification_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.party_classification_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_class_src_tp_cd, party_class_src_tp_desc, party_class_src_attrbt_nm, tbl_nme, party_class_entps_tp_cd, party_class_entps_tp_desc, party_class_tp_attrbt_nm, party_class_efctv_dt, party_class_expry_dt) VALUES (nextval('cishfid.party_classification_type_id_seq'), null, null, null, 'PARTY_CLASS_TP', null, '1', 'Deposit Taking Insitution', 'depositTakingInstitutionEntpsTypeCode', 'PARTY_CLASS_TP', '1', 'Deposit Taking Insitution', 'depositTakingInstitutionEntpsTypeCode', '2023-03-01', null);
commit;