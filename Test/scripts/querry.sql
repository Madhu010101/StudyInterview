update  cishfid.event  set event_status = true  ;
commit ;

select  party_loc_rltnp_entps_tp_cd ,party_loc_rltnp_src_tp_cd  from cishfid.party_location_relationship
where stm_tp_cd = 'CIS' and  party_loc_rltnp_entps_tp_cd in(4,5)   ;

select  lng_src_tp_cd  from cishfid.language_type  where   LNG_ENTPS_TP_CD = '1';
select idfctn_entps_tp_cd,idfctn_src_tp_cd from cishfid.identification_type;

select party_fund_entps_tp_cd,party_fund_src_tp_cd from cishfid.source_of_fund where    stm_tp_cd = 'CIS' and party_tp_cd
    in ('2') and  party_fund_entps_tp_cd in ('7','1','20','3','18')and cmpny_tp_cd = 15
    limit 2;
select * from cishfid.partytype where party_entps_tp_cd in ('1','2');

select stm_tp_cd,cmpny_tp_cd,idfctn_src_tp_cd,idfctn_entps_tp_cd from cishfid.identification_type where idfctn_entps_tp_cd in (9)and cmpny_tp_cd = 15 and stm_tp_cd = 'CIS';

select org_src_tp_cd ,org_entps_tp_cd, *from cishfid.organisation_type where cmpny_tp_cd = '15' and stm_tp_cd = 'CIS';

select party_class_src_tp_cd,* from cishfid.party_classification_type where party_class_entps_tp_cd = 1
                                                                        and cmpny_tp_cd = '15' and stm_tp_cd = 'CIS';

-- DROP TABLE  cishfid.organisation_classification_type;

select * from   cishfid.identification_type  where  cmpny_tp_cd = 15  and idfctn_entps_tp_cd in ('9',12,43)  and idfctn_issur_cntry_cd = 'ZA';
-- ALTER TABLE event Drop COLUMN service_ids ;comp_tp_cd
select jrsdctn_src_tp_cd, jurisdiction_id, comp_tp_cd from cishfid.jurisdiction
where cntry_cd = 'NA'  and stm_tp_cd = 'CIS' and comp_tp_cd = 1;



select jurisdiction_id,jrsdctn_src_tp_cd  from cishfid.jurisdiction where jurisdiction_id =9;

select rsdncy_stts_src_tp_cd,rsdncy_stts_entps_tp_cd   from cishfid.residency_status_type
where cmpny_tp_cd =15 and stm_tp_cd = 'CIS' and rsdncy_stts_entps_tp_cd = 3;

select rsdncy_stts_src_tp_cd,rsdncy_stts_entps_tp_cd   from cishfid.residency_status_type
where cmpny_tp_cd =15 and stm_tp_cd = 'CIS' and rsdncy_stts_entps_tp_cd = 3;

where jrsdctn_src_tp_cd = 'NA'
select * from cishfid.occupation_type where  cmpny_tp_cd = 15 and ocptn_src_tp_cd = 'D3';

select org_cat_entps_tp_cd ,org_cat_src_tp_cd, *from cishfid.org_category_type
where  stm_tp_cd = 'CIS' and org_cat_entps_tp_cd = 4;

select org_src_tp_cd ,org_entps_tp_cd, *from cishfid.organisation_type
where cmpny_tp_cd = '15' and stm_tp_cd = 'CIS' and org_entps_tp_cd = 1;


select indstry_src_tp_cd ,indstry_entps_tp_cd, *from cishfid.bic_type
where cmpny_tp_cd = '15' and stm_tp_cd = 'CIS' and indstry_entps_tp_cd = 11211001;


select org_cat_tp_cd ,org_src_tp_cd,org_entps_tp_cd,* from cishfid.organisation_type where org_entps_tp_cd  in (04,33,40,36,26,14,54,06)
                                                                                       and stm_tp_cd = 'CIS' and cmpny_tp_cd = 15;

select org_cat_entps_tp_cd ,org_cat_src_tp_cd, *from cishfid.org_category_type
where  stm_tp_cd = 'CIS' and org_cat_entps_tp_cd in (select org_cat_tp_cd from cishfid.organisation_type where org_entps_tp_cd  in (45,46,12));

select org_cat_entps_tp_cd ,org_cat_src_tp_cd, *from cishfid.org_category_type
where  stm_tp_cd = 'CIS' and org_cat_entps_tp_cd in (select org_cat_tp_cd from cishfid.organisation_type where org_entps_tp_cd  in (9,12,35));


select org_entps_tp_cd,org_src_tp_cd ,* from cishfid.organisation_type where org_entps_tp_cd  in (9,12,35)
                                                                         and stm_tp_cd = 'CIS' and cmpny_tp_cd = 15;

select * from cishfid.organisation_type where org_entps_tp_cd  in (9);
select * from cishfid.org_category_type where org_category_type.org_cat_entps_tp_cd  in (9); (17,6,4)

select idfctn_entps_tp_cd,* from   cishfid.identification_type  where  idfctn_entps_tp_cd in (17) and stm_tp_cd = 'CIS' and cmpny_tp_cd = 15   and idfctn_issur_cntry_cd = 'ZA';