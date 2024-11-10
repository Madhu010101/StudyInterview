CREATE SCHEMA IF NOT EXISTS cishfid;

CREATE SEQUENCE IF NOT EXISTS cishfid.bank_decision_indicator_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.business_rescue_indicator_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.debt_counselling_indicator_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.deposit_taking_institution_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.industry_category_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.sic_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.location_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.method_of_contact_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.source_of_fund_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.geo_address_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.party_location_relationship_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.state_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.telephone_address_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.party_stature_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.sanction_screening_status_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.property_ownership_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.property_bonded_indicator_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.identity_class_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.identity_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.bic_type_id_seq
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

create table cishfid.bank_decision_indicator
(
    id bigint NOT NULL,
    stm_tp_cd                text,
    cmpny_tp_cd              integer,
    src_tbl_no               integer,
    src_tbl_nme              text,
    src_cat                  text,
    bnk_dcsn_src_tp_cd       text,
    bnk_dcsn_src_tp_desc     text,
    tbl_nme                  text,
    bnk_dcsn_src_entps_tp_cd integer,
    bnk_dcsn_tp_src_tp_desc  text,
    bnk_dcsn_tp_efctv_dt     text,
    bnk_dcsn_tp_expry_dt     text,
    CONSTRAINT bank_decision_indicator_pkey PRIMARY KEY (id)
);

create table cishfid.business_rescue_indicator
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    fin_stts_src_tp_cd text,
    fin_stts_src_tp_desc text,
    tbl_nme text,
    fin_stts_entps_tp_cd integer,
    fin_stts_entps_tp_desc text,
    fin_stts_tp_efctv_dt text,
    fin_stts_tp_expry_dt text,
    CONSTRAINT business_rescue_indicator_pkey PRIMARY KEY (id)
);

create table cishfid.debt_counselling_indicator
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    fin_stts_src_tp_cd text,
    fin_stts_src_tp_desc text,
    tble_nme text,
    fin_stts_entps_tp_cd integer,
    fin_stts_entps_tp_desc text,
    fin_stts_tp_efctv_dte text,
    fin_stts_tp_expry_dte text,
    CONSTRAINT debt_counselling_indicator_pkey PRIMARY KEY (id)
);

create table cishfid.deposit_taking_institution_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    dti_tp_src_tp_cd text,
    dti_tp_src_tp_desc text,
    tbl_nme text,
    dti_entps_tp_cd integer,
    dti_entps_tp_desc text,
    dti_tp_efctv_dt text,
    dti_tp_expry_dt text,
    CONSTRAINT deposit_taking_institution_type_pkey PRIMARY KEY (id)
);


create table cishfid.industry_category_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tl_nme text,
    src_cat text,
    indstry_cat_src_tp_cd text,
    indstry_cat_src_tp_desc text,
    tbl_nme text,
    indstry_cat_entps_tp_cd integer,
    indstry_cat_entps_tp_desc text,
    indstry_cat_tp_efctv_dt text,
    indstry_cat_tp_expry_dt text,
    CONSTRAINT industry_category_type_pkey PRIMARY KEY (id)
);


create table cishfid.sic_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    indstry_src_tp_cd integer,
    indstry_src_tp_desc text,
    tbl_nme text,
    indstry_entps_tp_cd integer,
    indstry_entps_tp_desc text,
    indstry_cat_tp_id integer,
    indstry_tp_eff_dte text,
    indstry_tp_exp_dte text,
    CONSTRAINT sic_type_pkey PRIMARY KEY (id)
);

create table cishfid.location_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    loc_src_tp_cd text,
    loc_src_tp_desc text,
    tbl_nme text,
    loc_entps_tp_cd integer,
    loc_entps_tp_desc text,
    loc_tp_efctv_dte text,
    loc_tp_expry_dte text,
    CONSTRAINT location_type_pkey PRIMARY KEY (id)
);

create table cishfid.method_of_contact
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_np integer,
    src_tbl_nme text,
    src_cat text,
    mthd_of_cntct_src_tp_cd text,
    mthd_of_cntct_src_tp_desc text,
    tbl_nme text,
    mthd_of_cntct_entps_tp_cd integer,
    mthd_of_cntct_entps_tp_desc text,
    mthd_of_cntct_tp_efctv_dt text,
    mthd_of_cntct_tp_expry_dt text,
    CONSTRAINT  method_of_contact_pkey PRIMARY KEY (id)
);

create table cishfid.source_of_fund_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    "src_cat" text,
    party_fund_src_tp_cd text,
    party_fund_src_tp_desc text,
    tbl_nme text,
    party_fund_entps_tp_cd integer,
    party_fund_entps_tp_desc text,
    party_fund_tp_efctv_dte text,
    party_fund_tp_expry_dte text,
    CONSTRAINT source_of_fund_type_pkey PRIMARY KEY (id)
);

create table cishfid.geo_address_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    geo_addr_src_tp_cd text,
    geo_addr_src_tp_desc text,
    tbl_nme text,
    geo_addr_entps_tp_cd integer,
    geo_addr_entps_tp_desc text,
    geo_addr_tp_efctv_dt text,
    geo_addr_tp_expry_dt text,
    CONSTRAINT geo_address_type_pkey PRIMARY KEY (id)
);

create table cishfid.party_location_relationship_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    scr_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    party_loc_rltnp_tp_src_tp_cd text,
    party_loc_rltnp_tp_src_tp_desc text,
    tbl_nme text,
    party_loc_rltnp_entps_tp_cd integer,
    party_loc_rltnp_entps_tp_desc text,
    party_loc_rltnp_tp_efctv_dte text,
    party_loc_rltnp_tp_expry_dte text,
    CONSTRAINT party_location_relationship_type_pkey PRIMARY KEY (id)
);

create table cishfid.state_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    state_src_tp_cd text,
    state_src_tp_desc text,
    tbl_nme text,
    state_entps_tp_cd text,
    state_entps_tp_desc text,
    state_tp_efctv_dte text,
    state_tp_expry_dte text,
    CONSTRAINT state_type_pkey PRIMARY KEY (id)
);

create table cishfid.telephone_address_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    tel_addr_tp_src_tp_cd text,
    tel_addr_tp_src_tp_desc text,
    tbl_nme text,
    tel_addr_entps_tp_cd integer,
    tel_addr_entps_tp_desc text,
    tel_addr_tp_efctv_dte text,
    tel_addr_tp_expry_dte text,
    CONSTRAINT telephone_address_type_pkey PRIMARY KEY (id)
);


create table cishfid.party_stature_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    party_statr_src_tp_cd text,
    party_statr_src_tp_desc text,
    tbl_nme text,
    party_statr_entps_tp_cd integer,
    party_statr_tp_desc text,
    party_statr_tp_efctv_dte text,
    party_statr_tp_expry_dte text,
    CONSTRAINT party_stature_type_pkey PRIMARY KEY (id)
);

create table cishfid.sanction_screening_status
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no integer,
    src_tbl_nme text,
    src_cat text,
    sanctn_src_tp_cd integer,
    sanctn_src_tp_desc text,
    tbl_nme text,
    sanctn_entps_tp_cd integer,
    sanctn_src_entps_tp_desc text,
    sanctn_tp_efctv_dte text,
    sanctn_tp_expry_dte text,
    CONSTRAINT sanction_screening_status_pkey PRIMARY KEY (id)
);

create table cishfid.property_ownership_type
(
    id bigint NOT NULL,
    stm_tp_cd text,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    prop_ownrshp_src_tp_cd text,
    prop_ownrshp_src_tp_desc text,
    tbl_nme text,
    prop_ownrshp_entps_tp_cd integer,
    prop_ownrshp_entps_tp_dec text,
    prop_ownrshp_efctv_dte text,
    prop_ownrshp_expry_dte text,
    CONSTRAINT property_ownership_type_pkey PRIMARY KEY (id)
);

create table cishfid.property_bonded_indicator
(
    id bigint NOT NULL,
    stm_tp_cd text,
    cmpny_tp_cd integer,
    src_tbl_no text,
    src_tbl_nme text,
    src_cat text,
    prop_bnd_src_tp_cd text,
    prop_bnd_src_tp_desc text,
    tbl_nme text,
    prop_bnd_entps_tp_cd integer,
    prop_bnd_entps_tp_desc text,
    prop_bnd_src_efctv_dte text,
    prop_bnd_src_expry_dte text,
    CONSTRAINT property_bonded_indicator_pkey PRIMARY KEY (id)
);

create table cishfid.identity_class_type
(
    id bigint NOT NULL,
    stm_tp_cd                  text,
    cmpny_tp_cd                integer,
    src_tbl_no                 integer,
    src_tbl_nme                text,
    src_cat                    text,
    idfctn_class_src_tp_cd     integer,
    idfctn_class_src_tp_desc   text,
    tbl_nme                    text,
    idfctn_class_entps_tp_cd   integer,
    idfctn_class_entps_tp_desc text,
    idfctn_class_efctv_dt      text,
    idfctn_class_expry_dt      text,
    CONSTRAINT identity_class_type_pkey PRIMARY KEY (id)
);

create table cishfid.identity_status_type
(
    id bigint NOT NULL,
    stm_tp_cd                 text,
    cmpny_tp_cd               integer,
    src_tbl_no                integer,
    src_tbl_nme               text,
    idfctn_stts_src_prty_ind  text,
    src_cat                   text,
    idfctn_stts_src_tp_cd     integer,
    idfctn_stts_src_tp_desc   text,
    tbl_nme                   text,
    idfctn_stts_entps_tp_cd   integer,
    idfctn_stts_entps_tp_desc text,
    idfctn_stts_efctv_dt      text,
    idfctn_stts_expry_dt      text,
    CONSTRAINT identity_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.bic_type
(
    id bigint NOT NULL,
    stm_tp_cd             text,
    cmpny_tp_cd           integer,
    src_tbl_no            text,
    src_tbl_nme           text,
    src_cat               text,
    indstry_src_tp_cd     integer,
    indstry_src_tp_desc   text,
    tbl_nme               text,
    indstry_entps_tp_cd   integer,
    indstry_entps_tp_desc text,
    indstry_cat_tp_id     integer,
    indstry_tp_efctv_dt   text,
    indstry_tp_expry_dt   text,
    CONSTRAINT bic_type_pkey PRIMARY KEY (id)
);

create table cishfid.organisation_type
(
    id bigint NOT NULL,
    stm_tp_cd         text,
    cmpny_tp_cd       integer,
    src_tbl_no        integer,
    src_tbl_nme       text,
    src_cat           text,
    org_src_tp_cd     text,
    org_src_tp_desc   text,
    tbl_nme           text,
    org_entps_tp_cd   integer,
    org_entps_tp_desc text,
    org_tp_efctv_dt   text,
    org_tp_expry_dt   text,
    CONSTRAINT organisation_type_pkey PRIMARY KEY (id)
);