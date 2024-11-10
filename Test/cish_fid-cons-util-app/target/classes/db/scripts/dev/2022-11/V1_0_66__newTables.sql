DROP TABLE IF EXISTS cishfid.qualification_speciality_type;

DROP TABLE IF EXISTS cishfid.highest_qualification_type;

CREATE SEQUENCE IF NOT EXISTS cishfid.qualification_speciality_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.highest_qualification_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.qualification_speciality_type
(
    id bigint NOT NULL,
    stm_tp_cd           text,
    src_tbl_no          integer,
    src_tbl_nme         text,
    src_cat             text,
    src_cd              text,
    src_desc            text,
    tbl_nme             text,
    qual_spclty_tp_cd   integer,
    qual_spclty_tp_desc text,
    eff_dt              text,
    exp_dt              text,
    CONSTRAINT qualification_speciality_type_pkey PRIMARY KEY(id)
);

create table cishfid.highest_qualification_type
(
    id bigint NOT NULL,
    stm_tp_cd             text,
    sc_tbl_no             integer,
    src_tbl_nme           text,
    src_cat               text,
    src_cd                text,
    src_desc              text,
    tbl_nme               text,
    hghst_edu_lvl_tp_cd   integer,
    hghst_edu_lvl_tp_desc text,
    eff_dt                text,
    exp_dt                text,
    CONSTRAINT highest_qualification_type_pkey PRIMARY KEY (id)
);