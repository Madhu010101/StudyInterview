DROP TABLE IF EXISTS cishfid.container_type;

DROP SEQUENCE IF EXISTS cishfid.container_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.container_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.container_type
(
    id bigint NOT NULL,
    stm_tp_cd  text,
    src_tbl_no text,
    src_cat    text,
    stm_tp_src text,
    cntnr_src_tp_cd   text,
    cntnr_src_tp_desc  text,
    tbl_nme text,
    cntnr_entps_tp_cd text,
    cntnr_tp_desc text,
    cntnr_tp_efctv_dt text,
    cntnr_tp_expry_dt text,
    CONSTRAINT container_type_pkey PRIMARY KEY(id)
);

Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),'CIS',null,null,'CNTNR_TP','FAM','FNB FAMILY BANKING','CNTNR_TP','1','FAMILY','2/12/2024',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),null,null,null,null,null,null,'CNTNR_TP','2','EMPLOYEE SOLUTIONS','2/12/2024',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),null,null,null,null,null,null,'CNTNR_TP','3','PORTFOLIO','2/12/2024',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),'CIS',null,null,'CNTNR_TP','HHD','FNB PREMIUM HOUSEHOLD','CNTNR_TP','4','HOUSEHOLD','2/12/2024',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),'CIS',null,null,'CNTNR_TP','RMS','RELATIONSHIP MANAGEMENT STRUCTURE','CNTNR_TP','5','RELATIONSHIP MANAGEMENT STRUCTURE','2/12/2024',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),null,null,null,null,null,null,'CNTNR_TP','-2','FIELD NOT APPLICABLE TO SOURCE','7/30/2022',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),null,null,null,null,null,null,'CNTNR_TP','0','SOURCE CODE IS NOT FOUND IN LOOKUP','7/30/2022',null);
Insert into cishfid.container_type (id,stm_tp_cd,src_tbl_no,src_cat,stm_tp_src,cntnr_src_tp_cd,cntnr_src_tp_desc,tbl_nme,cntnr_entps_tp_cd,cntnr_tp_desc,cntnr_tp_efctv_dt,cntnr_tp_expry_dt) VALUES (nextval('cishfid.container_type_id_seq'),null,null,null,null,null,null,'CNTNR_TP','-1','SOURCE CODE IS BLANK OR NULL','7/30/2022',null);

commit;