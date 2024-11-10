DROP TABLE IF EXISTS cishfid.turnover_type;

DROP SEQUENCE IF EXISTS cishfid.turnover_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.turnover_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

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
	tbl_nme text,
	tnvr_entps_tp_cd integer,
	tnvr_entps_tp_desc text,
	tnvr_amt_from text,
	tnvr_amt_to text,
	eff_dte text,
	exp_dte text,
	CONSTRAINT turnover_type_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '01', 'R0 - R999,999 - BUS BANKING', 'TNVR_TP', '1', 'R0 TO R999 999', '0', '999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '02', 'R1,000,000-R4,999,999 BUS BANK', 'TNVR_TP', '2', 'R1 000 000 TO R4 999 999', '1000000', '4999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '13', 'BB R5,000,000 - R7,499,999', 'TNVR_TP', '3', 'R5 000 000 TO R7 499 999', '5000000', '7499999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '14', 'BB R7,500,000 - R9,999,999', 'TNVR_TP', '4', 'R7 500 000 TO R9 999 999', '7499999', '9999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '03', 'R10,000,000-R59,999,999 - COMM', 'TNVR_TP', '5', 'R10 000 000 TO R59 999 999', '10000000', '59999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '04', 'R60,000,000-R149,999,999 -COMM', 'TNVR_TP', '6', 'R60 000 000 TO R149 999 999', '60000000', '149999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '06', 'R150,000,000-R599,999,999-COMM', 'TNVR_TP', '7', 'R150 000 000 TO R599 999 999', '150000000', '599999999', null, null);
INSERT INTO cishfid.turnover_type (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, tnvr_src_tp_cd, tnvr_src_tp_desc, tbl_nme, tnvr_entps_tp_cd, tnvr_entps_tp_desc,tnvr_amt_from,tnvr_amt_to,eff_dte, exp_dte) VALUES (nextval('cishfid.turnover_type_id_seq'), 'CIS', '15', '50062345', 'COMMERCIAL TURNOVER CODES', 'TURNOVER', '07', 'LRGE CORP ACC OPN > 600 MIL', 'TNVR_TP', '8', '> R600 MILLION', '600000000', '999999999999999999', null, null);

COMMIT;