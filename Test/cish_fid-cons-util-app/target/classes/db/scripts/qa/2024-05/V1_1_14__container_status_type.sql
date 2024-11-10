DROP TABLE IF EXISTS cishfid.container_status_type;

DROP SEQUENCE IF EXISTS cishfid.container_status_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.container_status_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.container_status_type
(
    id bigint NOT NULL,
    stm_tp_cd  text,
    src_tbl_no text,
    src_cat    text,
    stm_tp_src text,
    cntnr_stts_src_tp_cd   text,
    cntnr_stts_src_tp_desc  text,
    tbl_nme text,
    cntnr_stts_entps_tp_cd text,
    cntnr_stts_tp_desc text,
    cntnr_stts_tp_efctv_dt text,
    cntnr_stts_tp_expry_dt text,
    CONSTRAINT container_status_type_pkey PRIMARY KEY(id)
);

Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),'CIS',null,null,null,'03','ACTIVE','CNTNR_STTS_TP','1','ACTIVE','2/12/2024',null);
Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),'CIS',null,null,null,'01','INACTIVE','CNTNR_STTS_TP','2','INACTIVE','2/12/2024',null);
Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),'CIS',null,null,null,'02','INCOMPLETE','CNTNR_STTS_TP','3','INCOMPLETE','2/12/2024',null);
Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),null,null,null,null,null,null,null,'-2','FIELD NOT APPLICABLE TO SOURCE','7/30/2022',null);
Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),null,null,null,null,null,null,null,'0','SOURCE CODE IS NOT FOUND IN LOOKUP','7/30/2022',null);
Insert into cishfid.container_status_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_stts_src_tp_cd,cntnr_stts_src_tp_desc,tbl_nme,cntnr_stts_entps_tp_cd,cntnr_stts_tp_desc,cntnr_stts_tp_efctv_dt,cntnr_stts_tp_expry_dt) VALUES (nextval('cishfid.container_status_type_id_seq'),null,null,null,null,null,null,null,'-1','SOURCE CODE IS BLANK OR NULL','7/30/2022',null);

commit;