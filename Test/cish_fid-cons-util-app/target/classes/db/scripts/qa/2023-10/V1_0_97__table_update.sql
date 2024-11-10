UPDATE cishfid.bic_type SET indstry_cat_tp_id = '2';
COMMIT;

UPDATE cishfid.sic_type SET indstry_cat_tp_id = '1';
COMMIT;

UPDATE cishfid.marital_contract_type SET exp_dte = '2023-09-29' where mrtl_cntrct_entps_tp_cd = '4';
COMMIT;