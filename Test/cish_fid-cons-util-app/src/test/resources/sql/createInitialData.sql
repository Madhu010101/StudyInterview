INSERT INTO application(
    id, application_name, application_description)
VALUES (1, 'CustomerService', 'CustomerService');

INSERT INTO service(
    id, service_name, service_description, application_id)
VALUES (1, 'OfficerCodeService', 'Customer Service',
    (select ap.id from application ap where ap.application_name = 'CustomerService'));

INSERT INTO channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (1, 'CST', 'CST' , 'CISGW1ZY',
    (select ap.id from service ap where ap.service_name = 'OfficerCodeService'));

INSERT INTO property(
    id, property_name, value, application_id)
VALUES (1, '15_OfficerCodeService_v1_resource_path', '/cis/customer/officer-code-details-enquiry/v1',
        (select ap.id from application ap where ap.application_name = 'CustomerService'));

INSERT INTO response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (1, 53610 , 101837,'Please enter either 1 for primary officer code, 2 for secondary or 3 for both.');




COMMIT;