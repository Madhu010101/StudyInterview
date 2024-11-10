CREATE SCHEMA IF NOT EXISTS cishfid;

DROP TABLE cishfid.country CASCADE;

DROP TABLE cishfid.jurisdiction_type CASCADE;

DROP TABLE cishfid.source_of_fund_type CASCADE;

DROP TABLE cishfid.state_type CASCADE;

DROP TABLE cishfid.organisation_type CASCADE;

DROP TABLE cishfid.party_location_relationship_type CASCADE;

CREATE SEQUENCE IF NOT EXISTS cishfid.country_id_seq
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

CREATE SEQUENCE IF NOT EXISTS cishfid.jurisdiction_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.source_of_fund_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.qualification_speciality_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.organisation_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.state_province_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.party_location_relationship_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.country
(
    id bigint NOT NULL,
    stm_tp_cd          text,
    src_tbl_no         integer,
    src_tbl_nme        text,
    src_cat            text,
    src_cd             text,
    cntry_name         text,
    tbl_nme            text,
    edw_cntry_cd       integer,
    cntry_cd           text,
    cntry_nm           text,
    iso_alpha_cntry_cd text,
    iso_num_cntry_cd   integer,
    eff_dt             text,
    exp_dt             text,
    CONSTRAINT country_pkey PRIMARY KEY(id)
);


create table cishfid.jurisdiction
(
    id bigint NOT NULL,
    stm_tp_cd            text,
    src_tbl_no           integer,
    src_tbl_nme          text,
    src_cat              text,
    jrsdctn_src_tp_cd    text,
    jrsdctn_src_tp_desc  text,
    tbl_nme              text,
    jurisdiction_id      integer,
    comp_tp_cd           integer,
    cntry_cd             text,
    jurisdiction_tp_desc text,
    eff_dt               text,
    exp_dte              text,
    CONSTRAINT jurisdiction_pkey PRIMARY KEY(id)
);

create table cishfid.highest_qualification_type
(
    id bigint NOT NULL,
    stm_tp_cd             text,
    src_tbl_no            integer,
    src_tbl_nme           text,
    src_cat               text,
    src_cd                text,
    src_desc              text,
    tbl_nme               text,
    hghst_edu_lvl_tp_cd   text,
    hghst_edu_lvl_tp_desc text,
    eff_dt                text,
    exp_dt                text,
    CONSTRAINT highest_qualification_type_pkey PRIMARY KEY (id)
);

create table cishfid.source_of_fund
(
    id bigint NOT NULL,
    stm_tp_cd              text,
    cmpny_tp_cd            integer,
    src_tbl_no             integer,
    src_tbl_nme            text,
    src_cat                text,
    party_fund_src_tp_cd   text,
    party_fund_src_tp_desc text,
    tbl_nme                text,
    party_fund_entps_tp_cd integer,
    party_fnd_tp_desc      text,
    party_fund_tp_efctv_dt text,
    party_fund_tp_expry_dt text,
    CONSTRAINT source_of_fund_pkey PRIMARY KEY(id)
);

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
    qual_spclty_tp_cd   text,
    qual_spclty_tp_desc text,
    eff_dt              text,
    exp_dt              text,
    CONSTRAINT qualification_speciality_type_pkey PRIMARY KEY(id)
);

create table cishfid.organisation_type
(
    id bigint NOT NULL,
    stm_tp_cd       text,
    cmpny_tp_cd     integer,
    src_tbl_no      integer,
    src_tbl_nme     text,
    src_cat         text,
    org_src_tp_cd   text,
    org_src_tp_desc text,
    tbl_nme         text,
    org_entps_tp_cd integer,
    org_tp_desc     text,
    org_tp_efctv_dt text,
    org_tp_expry_dt text,
    CONSTRAINT organisation_type_pkey PRIMARY KEY(id)
);

create table cishfid.state_province
(
    id bigint NOT NULL,
    stm_tp_cd         text,
    src_tbl_no        text,
    src_tbl_nme       text,
    src_cat           text,
    state_src_tp_cd   text,
    state_src_tp_desc text,
    tbl_nme           text,
    state_entps_tp_cd text,
    state_tp_desc     text,
    state_tp_efctv_dt text,
    state_tp_expry_dt text,
    CONSTRAINT state_province_pkey PRIMARY KEY(id)
);

create table cishfid.party_location_relationship
(
    id bigint NOT NULL,
    stm_tp_cd                   text,
    cmpny_tp_cd                 integer,
    src_tbl_no                  integer,
    src_tbl_nme                 text,
    src_cat                     text,
    party_loc_rltnp_src_tp_cd   text,
    party_loc_rltnp_src_tp_desc text,
    tbl_nme                     text,
    party_loc_rltnp_entps_tp_cd integer,
    party_loc_rltnp_tp_desc     text,
    party_loc_rltnp_tp_efctv_dt text,
    party_loc_rltnp_tp_expry_dt text,
    CONSTRAINT party_location_relationship_pkey PRIMARY KEY(id)
);



