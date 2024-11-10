
INSERT INTO gateway.application(
    id, application_name, application_description)
VALUES (nextval('gateway.app_id_seq'), 'CustomerService', 'Customer Service');

INSERT INTO gateway.service(
    id, service_name, service_description, application_id)
VALUES (nextval('gateway.service_id_seq'), 'OfficerCodeService', 'Customer Service',
    (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'CST', 'CST' , 'CISGW1ZY',
    (select ap.id from gateway.service ap where ap.service_name = 'OfficerCodeService'));




INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '15_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '55_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '81_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '80_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '65_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '45_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '82_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '56_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));

INSERT INTO gateway.property(
    id, property_name, value, application_id)
VALUES (nextval('gateway.prop_id_seq'), '25_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from gateway.application ap where ap.application_name = 'CustomerService'));



INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 53610 , 101837,'Please enter either 1 for primary officer code, 2 for secondary or 3 for both.');


INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64097 , 101833,'Requested Customer has no assigned officer codes.');


INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64095 , 101834,'Requested Customer does not have an assigned primary officer.');


INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64096 , 101835,'Requested Customer does not have an assigned secondary officer.');


INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64098 , 101836,'Invalid channel configuration has been loaded.');

INSERT INTO gateway.response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (nextval('gateway.resp_map_id_seq'), 64159 , 101540,'Please enter a valid Customer Number.');


INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'API', 'API' , 'CISGW1ZY',
    (select ap.id from gateway.service ap where ap.service_name = 'OfficerCodeService'));


INSERT INTO gateway.channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (nextval('gateway.channel_id_seq'), 'gtwycust', 'CST' , 'CISGW1ZY',
    (select ap.id from gateway.service ap where ap.service_name = 'OfficerCodeService'));

COMMIT;