delete from cishfid.identification_type where stm_tp_cd ='GSCC' and idfctn_src_tp_cd = 'SWIFT';
INSERT INTO cishfid.identification_type (id,stm_tp_cd, cmpny_tp_cd, src_tbl_no, src_cat, idfctn_src_tp_cd, idfctn_src_tp_desc, idfctn_entps_tp_cd, id_tp_desc, eff_dte, exp_dte) VALUES (nextval('cishfid.identification_type_id_seq'),'GSCC', null, null, 'ID TYPE', 'SWIFT', 'SWIFT ADDRESS NUMBER', 13, 'SWIFT ADDRESS NUMBER', null, null);