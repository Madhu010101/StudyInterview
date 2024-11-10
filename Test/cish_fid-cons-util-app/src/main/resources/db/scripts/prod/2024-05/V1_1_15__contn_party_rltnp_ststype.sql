DROP TABLE IF EXISTS cishfid.container_party_rltnp_status_type;

DROP SEQUENCE IF EXISTS cishfid.container_party_rltnp_status_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.container_party_rltnp_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.container_party_rltnp_status_type
(
    id bigint NOT NULL,
    stm_tp_cd  text,
    src_tbl_no text,
    src_cat    text,
    stm_tp_src text,
    cntnr_party_rltnp_stts_src_tp_cd   text,
    cntnr_party_rltnp_stts_src_tp_desc  text,
    tbl_nme text,
    cntnr_party_rltnp_stts_entps_tp_cd text,
    cntnr_party_rltnp_stts_tp_desc text,
    cntnr_party_rltnp_stts_tp_efctv_dt text,
    cntnr_party_rltnp_stts_tp_expry_dt text,
    CONSTRAINT container_party_rltnp_status_type_pkey PRIMARY KEY(id)
);

Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),'CIS',null,'CONTAINER RELATIONSHIP STATUS',null,'P','Pending','CNTNR_PARTY_RLTNP_STTS_TP','PENDING','Pending','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),'CIS',null,'CONTAINER RELATIONSHIP STATUS',null,'V','Verified','CNTNR_PARTY_RLTNP_STTS_TP','VERIFIED','Verified','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','EXPIRED','Expired','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','INACTIVE','Inactive','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','ACTIVE','Active','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','PENDING AUTHORISATION','Pending Authorisation','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','PENDING UPDATE','Pending Update','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'CNTNR_PARTY_RLTNP_STTS_TP','PENDING FULFILMENT','Pending Fulfilment','2024-02-02',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'IDFR_TP','-2','FIELD NOT APPLICABLE TO SOURCE','2022-01-01',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'IDFR_TP','0','SOURCE CODE IS NOT FOUND IN LOOKUP','2022-01-01',null);
Insert into cishfid.container_party_rltnp_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_party_rltnp_stts_src_tp_cd,cntnr_party_rltnp_stts_src_tp_desc,tbl_nme,cntnr_party_rltnp_stts_entps_tp_cd,cntnr_party_rltnp_stts_tp_desc,cntnr_party_rltnp_stts_tp_efctv_dt,cntnr_party_rltnp_stts_tp_expry_dt) VALUES (nextval('cishfid.container_party_rltnp_status_type_id_seq'),null,null,null,null,null,null,'IDFR_TP','-1','SOURCE CODE IS BLANK OR NULL','2022-01-01',null);

commit;