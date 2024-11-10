delete from response_mapping;
DELETE FROM property;
DELETE FROM channel;
DELETE FROM service;
DELETE FROM application;

  INSERT INTO application(
     id, application_name, application_description)
  VALUES (2, 'CustomerService', 'CustomerService');

INSERT INTO service(
    id, service_name, service_description, application_id)
VALUES (2, 'CoreEnquireService', 'Customer Service',
    (select ap.id from application ap where ap.application_name = 'CustomerService'));

INSERT INTO channel(
    id, channel_name, originating_channel_name, stub_name, service_id)
VALUES (2, 'CST', 'CST' , 'CISGW1ZY',
    (select ap.id from service ap where ap.service_name = 'CoreEnquireService'));

INSERT INTO property(
    id, property_name, value, application_id)
VALUES (2, '15_CoreEnquireService_v1_resource_path', '/cis/customer/customer-core-inquiry-by-ucn/v1',
        (select ap.id from application ap where ap.application_name = 'CustomerService'));

INSERT INTO response_mapping(
    id, zos_error_code, cst_error_code, cst_error_description)
VALUES (2, 64159 , 101344,'Customer Not Found On File');




COMMIT;