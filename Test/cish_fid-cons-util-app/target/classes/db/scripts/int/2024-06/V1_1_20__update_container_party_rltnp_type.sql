Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt)
SELECT  nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'PFM','Primary','CNTNR_PARTY_RLTNP_TP','PRMFAMMB','Primary of Family','2024-02-08',null
    WHERE NOT EXISTS (
SELECT 1 FROM cishfid.container_party_rltnp_type WHERE cntnr_party_rltnp_entps_tp_cd='PRMFAMMB'
);

Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt)
SELECT  nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'SFM','Spouse','CNTNR_PARTY_RLTNP_TP','SPPFAMMB','Spouse/Partner of Family','2024-03-15',null
    WHERE NOT EXISTS (
SELECT 1 FROM cishfid.container_party_rltnp_type WHERE cntnr_party_rltnp_entps_tp_cd='SPPFAMMB'
);

Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt)
SELECT  nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'CFM','Child ','CNTNR_PARTY_RLTNP_TP','CHDFAMMB','Child of Family','2024-03-15',null
    WHERE NOT EXISTS (
SELECT 1 FROM cishfid.container_party_rltnp_type WHERE cntnr_party_rltnp_entps_tp_cd='CHDFAMMB'
);

Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt)
SELECT  nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHP','Primary','CNTNR_PARTY_RLTNP_TP','PRMHHDMB','Primary Of Household','2024-03-15',null
    WHERE NOT EXISTS (
SELECT 1 FROM cishfid.container_party_rltnp_type WHERE cntnr_party_rltnp_entps_tp_cd='PRMHHDMB'
);
COMMIT;