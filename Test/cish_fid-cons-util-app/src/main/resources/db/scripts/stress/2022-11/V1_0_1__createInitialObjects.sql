CREATE SCHEMA IF NOT EXISTS cishfid;

CREATE SEQUENCE IF NOT EXISTS cishfid.partystatustype_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.country_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.ethnic_group_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.foreign_tax_identity_class_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.foreign_tax_identity_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.foreign_tax_liability_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.gender_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.identification_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.identifier_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.identifier_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.jurisdiction_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.kyc_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.language_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.marital_contract_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.marital_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.occupation_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.organisation_size_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.organisation_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.partytype_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.residency_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.roletype_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.segmentation_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.system_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.title_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

CREATE SEQUENCE IF NOT EXISTS cishfid.turnover_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.partystatustype
(
    id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	party_stts_src_tp_cd text,
	party_stts_src_tp_desc text,
	party_stts_entps_tp_cd integer,
	rl_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT partystatustype_pkey PRIMARY KEY (id)
);

create table cishfid.country
(
	id bigint NOT NULL,
    stm_tp_cd text,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	cntry_cd text,
	cntry_name text,
	cntry_entps_cd text,
	ctry_nme text,
	ctry_alp_3_cd text,
	ctry_num_cd integer,
	eff_dte text,
	exp_dte text,
	CONSTRAINT country_pkey PRIMARY KEY (id)
);

create table cishfid.ethnic_group_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	ethnic_grp_src_tp_cd integer,
	ethnic_grp_src_tp_desc text,
	ethnic_grp_entps_tp_cd integer,
	ethnic_grp_tp_desc text,
	CONSTRAINT ethnic_group_type_pkey PRIMARY KEY (id)
);

create table cishfid.foreign_tax_identity_class_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	idfctn_class_src_tp_cd integer,
	idfctn_class_src_tp_desc text,
	idfctn_class_entps_tp_cd integer,
	idfctn_class_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT foreign_tax_identity_class_type_pkey PRIMARY KEY (id)
);

create table cishfid.foreign_tax_identity_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	idfctn_stts_src_tp_cd integer,
	idfctn_stts_src_tp_desc text,
	idfctn_stts_entps_tp_cd integer,
	idfctn_stts_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT foreign_tax_identity_status_type_pkey PRIMARY KEY (id)

);


create table cishfid.foreign_tax_liability_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no text,
	src_tbl_nme text,
	src_cat text,
	frgn_tax_lblty_src_tp_cd text,
	frgn_tax_lblty_src_tp_desc text,
	frgn_tax_lblty_entps_tp_cd integer,
	frgn_tax_lblty_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT foreign_tax_liability_type_pkey PRIMARY KEY (id)
);

create table cishfid.gender_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	src_tbl_no text,
	src_tbl_nme text,
	src_cat text,
	gndr_src_tp_cd text,
	gndr_src_tp_desc text,
	gndr_entps_tp_cd integer,
	gndr_tp_desc text,
	CONSTRAINT gender_type_pkey PRIMARY KEY (id)
);

create table cishfid.identification_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_cat text,
	idfctn_src_tp_cd text,
	idfctn_src_tp_desc text,
	idfctn_entps_tp_cd integer,
	id_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT identification_type_pkey PRIMARY KEY (id)
);

create table cishfid.identifier_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	src_tbl_no text,
	src_cat text,
	idfr_stts_src_tp_cd integer,
	idfr_stts_src_tp_desc text,
	idfr_stts_entps_tp_cd integer,
	id_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT identifier_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.identifier_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	src_tbl_no text,
	src_tbl_nme text,
	src_cat text,
	idfr_src_tp_cd text,
	idfr_src_tp_desc text,
	idfr_entps_tp_cd integer,
	ed_tp_desc text,
	eff_dte text,
	exp_dte text,
	sys_tp_code text,
	CONSTRAINT identifier_type_pkey PRIMARY KEY (id)
);

create table cishfid.jurisdiction_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_nme text,
	src_cat text,
	src_cd text,
	jrsdctn_src_tp_cd text,
	jrsdctn_src_tp_desc text,
	jrsdctn_entps_id integer,
	ctry_cd text,
	cmpny_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT jurisdiction_type_pkey PRIMARY KEY (id)
);

create table cishfid.kyc_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	kyc_stts_src_tp_cd text,
	kyc_stts_src_tp_desc text,
	kyc_stts_entps_tp_cd integer,
	kyc_stts_tp_desc text,
	prm_ind text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT kyc_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.language_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	ctry_cd text,
	lng_src_tp_cd text,
	lng_src_tp_desc text,
	lng_entps_tp_cd integer,
	lng_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT language_type_pkey PRIMARY KEY (id)
);

create table cishfid.marital_contract_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	mrtl_cntrct_src_tp_cd text,
	mrtl_cntrct_src_tp_desc text,
	mrtl_cntrct_entps_tp_cd integer,
	mrtl_cntrct_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT marital_contract_type_pkey PRIMARY KEY (id)
);

create table cishfid.marital_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	mrtl_stts_src_tp_cd text,
	mrtl_stts_src_tp_desc text,
	mrtl_stts_entps_tp_cd integer,
	mrtl_stts_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT marital_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.occupation_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	ocptn_src_tp_cd text,
	ocptn_src_tp_desc text,
	ocptn_entps_tp_cd integer,
	ocptn_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT occupation_type_pkey PRIMARY KEY (id)
);

create table cishfid.organisation_size_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	org_size_src_tp_cd text,
	org_size_src_tp_desc text,
	org_size_entps_tp_cd integer,
	org_size_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT organisation_size_type_pkey PRIMARY KEY (id)
);


create table cishfid.organisation_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	org_stts_src_tp_cd text,
	org_stts_src_tp_desc text,
	org_stts_entps_tp_cd integer,
	org_stts_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT organisation_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.partytype
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	party_src_tp_cd integer,
	party_src_tp_desc text,
	party_entps_tp_cd integer,
	pt_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT partytype_pkey PRIMARY KEY (id)
);

create table cishfid.residency_status_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	rsdncy_stts_src_tp_cd text,
	rsdncy_stts_src_tp_desc text,
	rsdncy_stts_entps_tp_cd integer,
	rsdncy_stts_tp_cd text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT residency_status_type_pkey PRIMARY KEY (id)
);

create table cishfid.roletype
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	party_role_src_tp_cd text,
	party_role_src_tp_desc text,
	party_role_entps_tp_cd integer,
	rl_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT roletype_pkey PRIMARY KEY (id)
);


create table cishfid.segmentation_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	prnt_src_cd text,
	sgmtn_src_tp_cd text,
	sgmtn_src_tp_desc text,
	prnt_sgmtn_tp_cd integer,
	sgmtn_entps_tp_cd integer,
	sgmtn_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT segmentation_type_pkey PRIMARY KEY (id)
);

create table cishfid.system_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	src_tbl_no text,
	src_tbl_nme text,
	src_cat text,
	stm_src_tp_cd text,
	stm_src_tp_desc text,
	stm_entps_tp_cd text,
	sys_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT system_type_pkey PRIMARY KEY (id)
);

create table cishfid.title_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	src_tbl_no text,
	src_tbl_nme text,
	src_cat text,
	ttle_src_tp_cd text,
	ttle_src_tp_desc text,
	ttle_entps_tp_cd integer,
	ttle_tp_desc text,
	CONSTRAINT title_type_pkey PRIMARY KEY (id)
);

create table cishfid.turnover_type
(
	id bigint NOT NULL,
	stm_tp_cd text,
	cmpny_tp_cd integer,
	src_tbl_no integer,
	src_tbl_nme text,
	src_cat text,
	tnvr_src_tp_cd integer,
	tnvr_src_tp_desc text,
	tnvr_entps_tp_cd integer,
	tnvr_tp_desc text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT turnover_type_pkey PRIMARY KEY (id)
);











































