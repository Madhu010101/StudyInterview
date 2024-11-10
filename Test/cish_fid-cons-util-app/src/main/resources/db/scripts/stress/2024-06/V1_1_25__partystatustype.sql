DROP TABLE IF EXISTS cishfid.partystatustype;

DROP SEQUENCE IF EXISTS cishfid.partystatustype_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.partystatustype_id_seq
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
    tbl_nme text,
    party_stts_entps_tp_cd integer,
    rl_tp_desc text,
    eff_dte text,
    exp_dte text,
    CONSTRAINT partystatustype_pkey PRIMARY KEY (id)
);

INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '1', 'ACTIVE', '2022-01-01', null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '2', 'INACTIVE', '2022-01-01', null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '3', 'MASKED', '2022-01-01', null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '4', 'MERGED', '2022-01-01', null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '-2', 'FIELD NOT APPLICABLE TO SOURCE', null, null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '0', 'SOURCE CODE IS NOT FOUND IN LOOKUP', null, null);
INSERT INTO cishfid.partystatustype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_stts_src_tp_cd, party_stts_src_tp_desc, tbl_nme, party_stts_entps_tp_cd, rl_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partystatustype_id_seq'), null, null, null, null, null, null, null, 'PARTY_STTS_TP', '-1', 'SOURCE CODE IS BLANK OR NULL', null, null);

commit;