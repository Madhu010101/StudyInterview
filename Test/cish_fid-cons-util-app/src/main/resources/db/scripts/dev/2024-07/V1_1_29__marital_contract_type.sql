DROP TABLE IF EXISTS cishfid.marital_contract_type;

DROP SEQUENCE IF EXISTS cishfid.marital_contract_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.marital_contract_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

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
    cntry_cd text,
    eff_dte text,
    exp_dte text,
    CONSTRAINT marital_contract_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'ZA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'ZA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP', '3', 'COMMUNITY OF PROPERTY', 'ZA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROPERTY', '3', 'COMMUNITY OF PROPERTY', 'ZA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'OCP', 'OUT OF COMM OF PROP', '4', 'OUT OF COMMUNITY OF PROPERTY', 'ZA', null, '2023/09/29');
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '15', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'CUSTOMARY', '10', 'CUSTOMARY', 'ZA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '80', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'LS', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '80', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'LS', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '80', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'LS', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '80', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'OCP', 'OUT OF COMM OF PROP', '4', 'OUT OF COMMUNITY OF PROPERTY', 'LS', null, '2023/09/29');
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '80', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '5', 'TRIBAL', 'LS', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '45', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'NA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '45', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'NA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '45', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'NA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '45', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'OCP', 'OUT OF COMM OF PROP', '4', 'OUT OF COMMUNITY OF PROPERTY', 'NA', null, '2023/09/29');
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '45', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '5', 'TRIBAL', 'NA', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '55', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'BW', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '55', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'BW', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '55', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'BW', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '55', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'OCP', 'OUT OF COMM OF PROP', '4', 'OUT OF COMMUNITY OF PROPERTY', 'BW', null, '2023/09/29');
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '55', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '5', 'TRIBAL', 'BW', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '25', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'GG', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '25', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'GG', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '25', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'GG', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '25', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '10', 'CUSTOMARY', 'GG', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'CUS', 'CUSTOMARY (ZAMBIA)', '10', 'CUSTOMARY', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'STA', 'STATUTORY/CIVIL (ZAMBIA)', '11', 'STATUTORY/CIVIL', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '81', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '5', 'TRIBAL', 'ZM', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '56', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'CIV', 'CIVIL', '11', 'STATUTORY/CIVIL', 'GH', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '56', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'CUS', 'CUSTOMARY', '10', 'CUSTOMARY', 'GH', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '56', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'MUS', 'MUSLIM MARRIAGE', '8', 'MUSLIM MARRIAGE', 'GH', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '65', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ACC', 'ANC WITH ACCRUAL', '1', 'ANC WITH ACCRUAL', 'SZ', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '65', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'ANC', 'ANC WITHOUT ACCRUAL', '2', 'ANC WITHOUT ACCRUAL', 'SZ', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '65', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'COP', 'COMMUNITY OF PROP.', '3', 'COMMUNITY OF PROPERTY', 'SZ', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '65', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'OCP', 'OUT OF COMMUNITY OF PROPERTY', '4', 'OUT OF COMMUNITY OF PROPERTY', 'SZ', null, '2023/09/29');
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), 'CIS', '65', '77004', 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', 'MARITAL CONTRACT', 'TRI', 'TRIBAL', '5', 'TRIBAL', 'SZ', null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), null, null, null, 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', null, null, null, '-2', 'FIELD NOT APPLICABLE TO SOURCE', null, null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), null, null, null, 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', null, null, null, '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', null, null, null);
INSERT INTO cishfid.marital_contract_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, mrtl_cntrct_src_tp_cd, mrtl_cntrct_src_tp_desc, mrtl_cntrct_entps_tp_cd, mrtl_cntrct_tp_desc, cntry_cd, eff_dte, exp_dte) VALUES (nextval('cishfid.marital_contract_type_id_seq'), null, null, null, 'CUSTOMER USER DESCRIPTION PCD (DIMENSION-ID = MCN)', null, null, null, '-1', 'SOURCE CODE IS BLANK OR NULL', null, null, null);
commit;