INSERT INTO gateway.application(
    id, application_name, application_description)
VALUES (nextval('gateway.app_id_seq'), 'CustomerAccount', 'Customer Account Gateway');

INSERT INTO gateway.service(
    id, service_name, service_description, application_id)
VALUES (nextval('gateway.service_id_seq'), 'AcCuService', 'Customer Relation Account To Customer',
    (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'CST', 'CST' , 'CISGW1ZY', 
    (select ap.id from gateway.service ap where ap.service_name = 'AcCuService'));
    
INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'gtwycuac', 'CST' , 'CISGW1ZY', 
    (select ap.id from gateway.service ap where ap.service_name = 'AcCuService'));    

INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'CRE', 'CRE' , 'CISGW1ZY', 
    (select ap.id from gateway.service ap where ap.service_name = 'AcCuService')); 

INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'PLXFULMT', 'FULFILMENT' , 'CISGW1ZY', 
    (select ap.id from gateway.service ap where ap.service_name = 'AcCuService')); 

INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'PLXFULMT', 'PLXFULMT' , 'CISGW1ZY', 
    (select ap.id from gateway.service ap where ap.service_name = 'AcCuService'));     
    
INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '15_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '55_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '81_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '80_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '65_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '45_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '82_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '56_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '25_AcCuService_v1_resource_path', '/cis/customer-list/by-account/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerAccount'));

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64018 , 101507,'Please provide a valid relationship counter.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64094 , 101827,'Channel is not authorised on CIS to use this service.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 8519, 502,'Bad Gateway.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 853 , 502,'Bad Gateway.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64091 , 101624,'Please enter a valid relationship code.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64110 , 10140,'The Account was not found on file.');

COMMIT;