DROP TABLE IF EXISTS cishfid.container_party_rltnp_type;

DROP SEQUENCE IF EXISTS cishfid.container_party_rltnp_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.container_party_rltnp_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.container_party_rltnp_type
(
    id bigint NOT NULL,
    stm_tp_cd  text,
    src_tbl_no text,
    src_cat    text,
    stm_tp_src text,
    cntnr_party_rltnp_src_tp_cd   text,
    cntnr_party_rltnp_src_tp_desc  text,
    tbl_nme text,
    cntnr_party_rltnp_entps_tp_cd text,
    cntnr_party_rltnp_tp_desc text,
    cntnr_party_rltnp_tp_efctv_dt text,
    cntnr_party_rltnp_tp_expry_dt text,
    CONSTRAINT container_party_rltnp_type_pkey PRIMARY KEY(id)
);



Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHS','Secondary','CNTNR_PARTY_RLTNP_TP','SCMHHDMB','Secondary of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHR','Related Party','CNTNR_PARTY_RLTNP_TP','RLPHHDMB','Related Party of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHJ','Juristic','CNTNR_PARTY_RLTNP_TP','NTEHHDMB','Non-Trading Entity of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_TP','TREHHDMB','Trading Entity of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHM','Member','CNTNR_PARTY_RLTNP_TP','MEMHHDMB','Member of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'XHC','Contact','CNTNR_PARTY_RLTNP_TP','CNTHHDMB','Contact of Household','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),'CIS',null,null,null,'RMM','Relationship Member','CNTNR_PARTY_RLTNP_TP','RMSOFENT','Relationship Hierarchy to Entity','2024-03-15',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_TP','-2','FIELD NOT APPLICABLE TO SOURCE','2022-01-01',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_TP','0','SOURCE CODE IS NOT FOUND IN LOOKUP','2022-01-01',null);
Insert into cishfid.container_party_rltnp_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_src_tp_cd,cntnr_party_rltnp_src_tp_desc,tbl_nme,cntnr_party_rltnp_entps_tp_cd,cntnr_party_rltnp_tp_desc,cntnr_party_rltnp_tp_efctv_dt,cntnr_party_rltnp_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_TP','-1','SOURCE CODE IS BLANK OR NULL','2022-01-01',null);

commit;