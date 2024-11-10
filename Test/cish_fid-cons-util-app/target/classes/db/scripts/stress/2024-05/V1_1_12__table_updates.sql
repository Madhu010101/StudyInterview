--20240201:  Add code 3 Description changed to CONTAINER
INSERT INTO cishfid.partytype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_src_tp_cd, party_src_tp_desc, party_entps_tp_cd, pt_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partytype_id_seq'),null, null, null, null, null, null, null, 4, 'ORGANISATIONAL UNIT', null, null);
INSERT INTO cishfid.partytype (id, stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_tbl_nme, src_cat, party_src_tp_cd, party_src_tp_desc, party_entps_tp_cd, pt_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.partytype_id_seq'),null, null, null, null, null, null, null, 3, 'CONTAINER', null, null);


--20240215:  Caption of description column INDSTRY_SUB_TYPE_DESC changed to sentence case
UPDATE cishfid.bic_type SET indstry_entps_tp_sub_desc = INITCAP(indstry_entps_tp_sub_desc);

--20240201:  Add Code 5 CIS CONTAINER NUMBER;
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'),'OPM', null, 'IDENTIFIER_TYPE', 'SOURCE IDENTIFIER', 'FID', 'FIRST ID','IDFR_TP', 4, 'FIRST ID', null, null);
INSERT INTO cishfid.identifier_type (id, stm_tp_cd, src_tbl_no, src_cat, stm_tp_src_cd, idfr_src_tp_cd, idfr_src_tp_desc, tbl_nme, idfr_tp_cd, idfr_tp_desc, idfr_efctv_dt, idfr_expry_dt) VALUES (nextval('cishfid.identifier_type_id_seq'),'CIS', null, 'IDENTIFIER_TYPE', 'SOURCE IDENTIFIER', 'CONTAINER ID', 'CONTAINER ID','IDFR_TP', 5, 'CIS CONTAINER NUMBER', null, null);
update cishfid.identifier_type SET STM_TP_CD='CRE' where idfr_src_tp_cd= 'SSOID';

--20240215:  Expiry date for Codes I21, I23 & I24 and E21 & E23 Populated with 2024-02-15
Update cishfid.source_of_fund
set party_fund_tp_expry_dt='2024-02-15'
where party_fund_src_tp_cd in('I21','I23','I24','E21','E23');

update cishfid.occupation_type set exp_dte = '2024-02-29' where ocptn_entps_tp_cd between '1' and '82';
commit;