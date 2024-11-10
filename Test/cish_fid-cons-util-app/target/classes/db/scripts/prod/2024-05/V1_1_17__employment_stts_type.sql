DROP TABLE IF EXISTS cishfid.employment_stts_type;

DROP SEQUENCE IF EXISTS cishfid.employment_stts_type_id_seq;

CREATE SEQUENCE IF NOT EXISTS cishfid.employment_stts_type_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 250;

create table cishfid.employment_stts_type
(
    id bigint NOT NULL,
    stm_tp_cd  text,
    hgn_cmpny_cd  text,
    src_tbl_no text,
    src_tbl_name text,
    src_cat    text,
    emplmnt_stts_src_tp_cd   text,
    emplmnt_stts_src_tp_desc   text,
    tbl_nme text,
    emplmnt_stts_entps_tp_cd text,
    emplmnt_stts_tp_desc text,
    emplmnt_stts_tp_efctv_dt text,
    emplmnt_stts_tp_expry_dt text,
    CONSTRAINT employment_stts_type_pkey PRIMARY KEY(id)
);



Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),'CIS',null,'24182','CIS NON-RELATIONSHIP CODES (CODE TYPE = OCCD)','OCCUPATION','SU','STUDENT','EMPLMNT_STTS_TP','1','STUDENT','2/27/2024',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),null,null,null,null,null,null,null,'EMPLMNT_STTS_TP','2','EMPLOYED','2/27/2024',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),null,null,null,null,null,null,null,'EMPLMNT_STTS_TP','3','SELF EMPLOYED','2/27/2024',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),'CIS',null,'24182','CIS NON-RELATIONSHIP CODES (CODE TYPE = OCCD)','OCCUPATION','RT','RETIRED','EMPLMNT_STTS_TP','4','RETIRED','2/27/2024',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),'CIS',null,'24182','CIS NON-RELATIONSHIP CODES (CODE TYPE = OCCD)','OCCUPATION','UN','UNEMPLOYED','EMPLMNT_STTS_TP','5','UNEMPLOYED','2/27/2024',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),'CIS',null,'24182','CIS NON-RELATIONSHIP CODES (CODE TYPE = OCCD)','OCCUPATION','PE','PENSIONER','EMPLMNT_STTS_TP','4','RETIRED',null,null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),null,null,null,null,null,null,null,null,'-2','FIELD NOT APPLICABLE TO SOURCE','7/30/2022',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),null,null,null,null,null,null,null,null,'0','SOURCE CODE IS NOT FOUND IN LOOKUP','7/30/2022',null);
Insert into cishfid.employment_stts_type (id,stm_tp_cd,hgn_cmpny_cd,src_tbl_no,src_tbl_name,src_cat,emplmnt_stts_src_tp_cd,emplmnt_stts_src_tp_desc,tbl_nme,emplmnt_stts_entps_tp_cd,emplmnt_stts_tp_desc,emplmnt_stts_tp_efctv_dt,emplmnt_stts_tp_expry_dt) VALUES (nextval('cishfid.employment_stts_type_id_seq'),null,null,null,null,null,null,null,null,'-1','SOURCE CODE IS BLANK OR NULL','7/30/2022',null);

commit;