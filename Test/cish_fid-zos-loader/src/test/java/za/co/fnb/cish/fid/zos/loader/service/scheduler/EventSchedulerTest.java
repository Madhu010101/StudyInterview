package za.co.fnb.cish.fid.zos.loader.service.scheduler;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import za.co.fnb.cish.fid.common.api.cis1358.cis1358output.Cis1358ZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362input.Cis1362rZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.zos.loader.zos.client.ZosServiceClient;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EventSchedulerTest {

    @InjectMocks
    EventScheduler eventScheduler;
    @Autowired
    ZosServiceClient zosServiceClient;
    @MockBean
    private RestTemplate restTemplate;
    @Autowired
    private EventLogsRepository eventLogsRepository;
    @MockBean
    private EventRepository eventRepository;

    @MockBean
    FirstIdMasterEntity firstIdMasterEntity;

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private static String getMessage(String fileName) throws IOException {
        File file = new File(fileName);
        byte[] bytes = Files.readAllBytes(file.toPath());
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Test
    public void testEvents() throws Exception {
        ResponseEntity<Object> responseCis1362 = createCIS1362Response();
        ResponseEntity<Object> responseCis1358 = createCIS1358Response();
        Mockito.when(eventRepository.findById(1L)).thenReturn(getLine());
        //  Mockito.when(eventRepository.findBySatus(Boolean.FALSE)).thenReturn((List<Event>) getLine());
        Mockito.when(restTemplate.postForEntity(Mockito.contains("/cis/customer/customer-core-inquiry-by-ucn/v1"), Mockito.any(), Mockito.any())).thenReturn(responseCis1362);

        Mockito.when(restTemplate.postForEntity(Mockito.contains("/cis/customer/cre-customer-core-maintain/v1"), Mockito.any(), Mockito.any()))
                .thenReturn(responseCis1358);


        //processAddressReconEvents.processAddressReconEvents(lineItem);
    }

    private Optional<Event> getLine() {
        Event line = new Event();
        line.setId(1L);
        line.setEvent_status(Boolean.FALSE);
        line.setTransformed_messages("{\"eventHeader\": {\"correlations\": [{\"correlationName\": \"eventUUID\", \"correlationValue\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\"}], \"eventAction\": \"r\", \"eventArchContext\": \"ingest+raw\", \"eventDateTime\": \"2022-09-02T05:52:30.463639+02:00\", \"eventOrigins\": [{\"eventOriginName\": \"OPM\", \"eventOriginType\": \"sourceSystem\"}], \"eventUUID\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\", \"sourceSystemCode\": \"OPM\"}, \"key\": {\"keyCompanyEntpsTypeCode\": \"0\", \"keyIdentifierEntpsTypeCode\": \"UCN\", \"keyIdentifierJurisdictionId\": 15, \"keyIdentifierNumber\": \"bb9db114-33f5-4e39-b11d-689725fcbd47\", \"keyIdentifierSystemEntpsTypeCode\": null, \"keyIdentifierSystemTypeCode\": null, \"keyJurisdictionCountryEntpsCode\": \"15\"}, \"party\": {\"container\": {\"containerEntpsTypeCode\": null, \"containerStatusEntpsTypeCode\": null}, \"conversationLanguageEntpsTypeCode\": null, \"correspondenceLanguageEntpsTypeCode\": \"ENG\", \"homeLanguageEntpsTypeCode\": null, \"identifications\": [{\"citizenshipCountryEntpsCode\": null, \"identificationEntpsTypeCode\": \"NAMID\", \"identificationExpiryDate\": \"20991231\", \"identificationIssueDate\": \"19000101\", \"identificationIssuerCountryEntpsCode\": \"ZA\", \"identificationIssuerEntpsTypeCode\": null, \"identificationNames\": [], \"identificationNumber\": \"9801020269082\", \"identificationReferenceNumber\": null, \"identificationStatusDate\": null, \"identificationStatusEntpsTypeCode\": null, \"residencyStatusEntpsTypeCode\": null}], \"identifiers\": [{\"companyEntpsTypeCode\": \"1\", \"identifierEndDate\": null, \"identifierEntpsTypeCode\": null, \"identifierNumber\": \"150\", \"identifierStartDate\": \"20160216\", \"identifierStatusEntpsTypeCode\": \"1\", \"identifierSystemEntpsTypeCode\": \"CIS\", \"jurisdictionCountryEntpsCode\": \"15\", \"jurisdictionId\": 1, \"roleEntpsTypeCode\": \"1\"}], \"individual\": {\"birthCityName\": null, \"birthCountryEntpsCode\": null, \"birthDate\": \"19980102\", \"deceasedDate\": null, \"educations\": [], \"employments\": [{\"employerName\": null, \"employmentEndDate\": null, \"employmentStartDate\": null, \"occupationEntpsTypeCode\": \"SU\"}], \"genderEntpsTypeCode\": \"F\", \"maritalContractEntpsTypeCode\": \"-1\", \"maritalStatusEntpsTypeCode\": \"U\", \"nationalityCountryEntpsCode\": \"0\", \"numberOfDependants\": null, \"permanentResidenceCountryEntpsCode\": \"ZA\", \"titleEntpsTypeCode\": \"MS\"}, \"locations\": [{\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CM\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"MOSELEY\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"NOORDHOEK\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CM\", \"telephonicAddresses\": []}, {\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CR\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"ESCOMBE\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"ASHDOWN\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CR\", \"telephonicAddresses\": []}], \"name\": null, \"organisation\": null, \"partyCreatedDate\": null, \"partyEntpsTypeCode\": \"0\", \"partyStatusDate\": null, \"partyStatusEntpsTypeCode\": null, \"profileRegistrationName\": null, \"sourcesOfFunds\": [], \"takeOnAttributes\": []}}");
        line.setFid_messages("{\"eventHeader\": {\"correlations\": [{\"correlationName\": \"eventUUID\", \"correlationValue\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\"}], \"eventAction\": \"r\", \"eventArchContext\": \"ingest+raw\", \"eventDateTime\": \"2022-09-02T05:52:30.463639+02:00\", \"eventOrigins\": [{\"eventOriginName\": \"OPM\", \"eventOriginType\": \"sourceSystem\"}], \"eventUUID\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\", \"sourceSystemCode\": \"OPM\"}, \"key\": {\"keyCompanyEntpsTypeCode\": \"0\", \"keyIdentifierEntpsTypeCode\": \"UCN\", \"keyIdentifierJurisdictionId\": 15, \"keyIdentifierNumber\": \"bb9db114-33f5-4e39-b11d-689725fcbd47\", \"keyIdentifierSystemEntpsTypeCode\": null, \"keyIdentifierSystemTypeCode\": null, \"keyJurisdictionCountryEntpsCode\": \"15\"}, \"party\": {\"container\": {\"containerEntpsTypeCode\": null, \"containerStatusEntpsTypeCode\": null}, \"conversationLanguageEntpsTypeCode\": null, \"correspondenceLanguageEntpsTypeCode\": \"ENG\", \"homeLanguageEntpsTypeCode\": null, \"identifications\": [{\"citizenshipCountryEntpsCode\": null, \"identificationEntpsTypeCode\": \"NAMID\", \"identificationExpiryDate\": \"20991231\", \"identificationIssueDate\": \"19000101\", \"identificationIssuerCountryEntpsCode\": \"ZA\", \"identificationIssuerEntpsTypeCode\": null, \"identificationNames\": [], \"identificationNumber\": \"9801020269082\", \"identificationReferenceNumber\": null, \"identificationStatusDate\": null, \"identificationStatusEntpsTypeCode\": null, \"residencyStatusEntpsTypeCode\": null}], \"identifiers\": [{\"companyEntpsTypeCode\": \"1\", \"identifierEndDate\": null, \"identifierEntpsTypeCode\": null, \"identifierNumber\": \"150\", \"identifierStartDate\": \"20160216\", \"identifierStatusEntpsTypeCode\": \"1\", \"identifierSystemEntpsTypeCode\": \"CIS\", \"jurisdictionCountryEntpsCode\": \"15\", \"jurisdictionId\": 1, \"roleEntpsTypeCode\": \"1\"}], \"individual\": {\"birthCityName\": null, \"birthCountryEntpsCode\": null, \"birthDate\": \"19980102\", \"deceasedDate\": null, \"educations\": [], \"employments\": [{\"employerName\": null, \"employmentEndDate\": null, \"employmentStartDate\": null, \"occupationEntpsTypeCode\": \"SU\"}], \"genderEntpsTypeCode\": \"F\", \"maritalContractEntpsTypeCode\": \"-1\", \"maritalStatusEntpsTypeCode\": \"U\", \"nationalityCountryEntpsCode\": \"0\", \"numberOfDependants\": null, \"permanentResidenceCountryEntpsCode\": \"ZA\", \"titleEntpsTypeCode\": \"MS\"}, \"locations\": [{\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CM\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"MOSELEY\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"NOORDHOEK\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CM\", \"telephonicAddresses\": []}, {\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CR\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"ESCOMBE\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"ASHDOWN\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CR\", \"telephonicAddresses\": []}], \"name\": null, \"organisation\": null, \"partyCreatedDate\": null, \"partyEntpsTypeCode\": \"0\", \"partyStatusDate\": null, \"partyStatusEntpsTypeCode\": null, \"profileRegistrationName\": null, \"sourcesOfFunds\": [], \"takeOnAttributes\": []}}");
        return Optional.of(line);
    }

    private ResponseEntity<Object> createCIS1362Response() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String message = getMessage("src/test/resources/cis1362.json");
        return ResponseEntity.ok(mapper.readValue(message, Cis1362rZosPayloadResponse.class));
    }

    private ResponseEntity<Object> createCIS1358Response() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String message = getMessage("src/test/resources/cis1358.json");
        return new ResponseEntity<>(mapper.readValue(message, Cis1358ZosPayloadResponse.class), HttpStatus.OK);
    }

   /* @Test
    @Sql(scripts = {"classpath:sql/createInitialData.sql"})
    public void testEvents_success() throws Exception {
        ResponseEntity<Object> responseCis1362 = createCIS1362Response();
        ResponseEntity<Object> responseCis1358 = createCIS1358Response();
        // Mockito.when(eventRepository.findById(1L)).thenReturn(getLine());
        String fidMesg = "{\"eventHeader\": {\"correlations\": [{\"correlationName\": \"eventUUID\", \"correlationValue\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\"}], \"eventAction\": \"r\", \"eventArchContext\": \"ingest+raw\", \"eventDateTime\": \"2022-09-02T05:52:30.463639+02:00\", \"eventOrigins\": [{\"eventOriginName\": \"OPM\", \"eventOriginType\": \"sourceSystem\"}], \"eventUUID\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\", \"sourceSystemCode\": \"OPM\"}, \"key\": {\"keyCompanyEntpsTypeCode\": \"0\", \"keyIdentifierEntpsTypeCode\": \"UCN\", \"keyIdentifierJurisdictionId\": 15, \"keyIdentifierNumber\": \"bb9db114-33f5-4e39-b11d-689725fcbd47\", \"keyIdentifierSystemEntpsTypeCode\": null, \"keyIdentifierSystemTypeCode\": null, \"keyJurisdictionCountryEntpsCode\": \"15\"}, \"party\": {\"container\": {\"containerEntpsTypeCode\": null, \"containerStatusEntpsTypeCode\": null}, \"conversationLanguageEntpsTypeCode\": null, \"correspondenceLanguageEntpsTypeCode\": \"ENG\", \"homeLanguageEntpsTypeCode\": null, \"identifications\": [{\"citizenshipCountryEntpsCode\": null, \"identificationEntpsTypeCode\": \"NAMID\", \"identificationExpiryDate\": \"20991231\", \"identificationIssueDate\": \"19000101\", \"identificationIssuerCountryEntpsCode\": \"ZA\", \"identificationIssuerEntpsTypeCode\": null, \"identificationNames\": [], \"identificationNumber\": \"9801020269082\", \"identificationReferenceNumber\": null, \"identificationStatusDate\": null, \"identificationStatusEntpsTypeCode\": null, \"residencyStatusEntpsTypeCode\": null}], \"identifiers\": [{\"companyEntpsTypeCode\": \"1\", \"identifierEndDate\": null, \"identifierEntpsTypeCode\": null, \"identifierNumber\": \"150\", \"identifierStartDate\": \"20160216\", \"identifierStatusEntpsTypeCode\": \"1\", \"identifierSystemEntpsTypeCode\": \"CIS\", \"jurisdictionCountryEntpsCode\": \"15\", \"jurisdictionId\": 1, \"roleEntpsTypeCode\": \"1\"}], \"individual\": {\"birthCityName\": null, \"birthCountryEntpsCode\": null, \"birthDate\": \"19980102\", \"deceasedDate\": null, \"educations\": [], \"employments\": [{\"employerName\": null, \"employmentEndDate\": null, \"employmentStartDate\": null, \"occupationEntpsTypeCode\": \"SU\"}], \"genderEntpsTypeCode\": \"F\", \"maritalContractEntpsTypeCode\": \"-1\", \"maritalStatusEntpsTypeCode\": \"U\", \"nationalityCountryEntpsCode\": \"0\", \"numberOfDependants\": null, \"permanentResidenceCountryEntpsCode\": \"ZA\", \"titleEntpsTypeCode\": \"MS\"}, \"locations\": [{\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CM\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"MOSELEY\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"NOORDHOEK\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CM\", \"telephonicAddresses\": []}, {\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CR\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"ESCOMBE\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"ASHDOWN\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CR\", \"telephonicAddresses\": []}], \"name\": null, \"organisation\": null, \"partyCreatedDate\": null, \"partyEntpsTypeCode\": \"0\", \"partyStatusDate\": null, \"partyStatusEntpsTypeCode\": null, \"profileRegistrationName\": null, \"sourcesOfFunds\": [], \"takeOnAttributes\": []}}\n";
        when(eventRepository.findBySatus(Boolean.FALSE)).thenReturn(getEvenet());
        // FirstIdMasterEntity firstIdMasterEntity = when(mapper.readValue(fidMesg, FirstIdMasterEntity.class)).thenReturn(FirstIdMasterEntity.class);
        FirstIdMasterEntity firstIdMasterEntity = (FirstIdMasterEntity) when(mapper.readValue(fidMesg, FirstIdMasterEntity.class));
        //  Mockito.when(eventRepository.findBySatus(Boolean.FALSE)).thenReturn((List<Event>) getLine());
        Mockito.when(restTemplate.postForEntity(Mockito.contains("/cis/customer/customer-core-inquiry-by-ucn/v1"), Mockito.any(), Mockito.any())).thenReturn(responseCis1362);

        Mockito.when(restTemplate.postForEntity(Mockito.contains("/cis/customer/cre-customer-core-maintain/v1"), Mockito.any(), Mockito.any()))
                .thenReturn(responseCis1358);
        Mockito.when(zosServiceClient.callZosConnectAPIService(15, Mockito.contains("/cis/customer/cre-customer-core-maintain/v1"), Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any()))
                .thenReturn(cis1362GoodRs());
        Mockito.when(zosServiceClient.callZosConnectAPIService(15, Mockito.contains("/cis/customer/cre-customer-core-maintain/v1"), Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any()))
                .thenReturn(cis1358GoodRs());


    }*/

    private List<Event> getEvenet() {
        List<Event> e = new ArrayList<>();
        Event event = new Event();
        event.setId(1);
        event.setEvent_status(Boolean.FALSE);
        event.setFid_messages("123");
        event.setTransformed_messages("{\"eventHeader\": {\"correlations\": [{\"correlationName\": \"eventUUID\", \"correlationValue\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\"}], \"eventAction\": \"r\", \"eventArchContext\": \"ingest+raw\", \"eventDateTime\": \"2022-09-02T05:52:30.463639+02:00\", \"eventOrigins\": [{\"eventOriginName\": \"OPM\", \"eventOriginType\": \"sourceSystem\"}], \"eventUUID\": \"c545ec18-1b4c-404d-a3f8-091b076e842b\", \"sourceSystemCode\": \"OPM\"}, \"key\": {\"keyCompanyEntpsTypeCode\": \"0\", \"keyIdentifierEntpsTypeCode\": \"UCN\", \"keyIdentifierJurisdictionId\": 15, \"keyIdentifierNumber\": \"bb9db114-33f5-4e39-b11d-689725fcbd47\", \"keyIdentifierSystemEntpsTypeCode\": null, \"keyIdentifierSystemTypeCode\": null, \"keyJurisdictionCountryEntpsCode\": \"15\"}, \"party\": {\"container\": {\"containerEntpsTypeCode\": null, \"containerStatusEntpsTypeCode\": null}, \"conversationLanguageEntpsTypeCode\": null, \"correspondenceLanguageEntpsTypeCode\": \"ENG\", \"homeLanguageEntpsTypeCode\": null, \"identifications\": [{\"citizenshipCountryEntpsCode\": null, \"identificationEntpsTypeCode\": \"NAMID\", \"identificationExpiryDate\": \"20991231\", \"identificationIssueDate\": \"19000101\", \"identificationIssuerCountryEntpsCode\": \"ZA\", \"identificationIssuerEntpsTypeCode\": null, \"identificationNames\": [], \"identificationNumber\": \"9801020269082\", \"identificationReferenceNumber\": null, \"identificationStatusDate\": null, \"identificationStatusEntpsTypeCode\": null, \"residencyStatusEntpsTypeCode\": null}], \"identifiers\": [{\"companyEntpsTypeCode\": \"1\", \"identifierEndDate\": null, \"identifierEntpsTypeCode\": null, \"identifierNumber\": \"150\", \"identifierStartDate\": \"20160216\", \"identifierStatusEntpsTypeCode\": \"1\", \"identifierSystemEntpsTypeCode\": \"CIS\", \"jurisdictionCountryEntpsCode\": \"15\", \"jurisdictionId\": 1, \"roleEntpsTypeCode\": \"1\"}], \"individual\": {\"birthCityName\": null, \"birthCountryEntpsCode\": null, \"birthDate\": \"19980102\", \"deceasedDate\": null, \"educations\": [], \"employments\": [{\"employerName\": null, \"employmentEndDate\": null, \"employmentStartDate\": null, \"occupationEntpsTypeCode\": \"SU\"}], \"genderEntpsTypeCode\": \"F\", \"maritalContractEntpsTypeCode\": \"-1\", \"maritalStatusEntpsTypeCode\": \"U\", \"nationalityCountryEntpsCode\": \"0\", \"numberOfDependants\": null, \"permanentResidenceCountryEntpsCode\": \"ZA\", \"titleEntpsTypeCode\": \"MS\"}, \"locations\": [{\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CM\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"MOSELEY\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"NOORDHOEK\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CM\", \"telephonicAddresses\": []}, {\"digitalAddresses\": [], \"emailAddresses\": [], \"geographicAddresses\": [{\"addressEntpsTypeCode\": \"CR\", \"addressLine1\": null, \"addressLine2\": \"1HASLAMROAD\", \"buildingName\": null, \"careOfName\": null, \"cityName\": \"ESCOMBE\", \"complexName\": null, \"countryEntpsCode\": \"ZA\", \"floorNumber\": null, \"postalAreaNumber\": \"4093\", \"stateDistrictProvinceEntpsTypeCode\": \"0\", \"stateDistrictProvinceName\": \"EASTERNCAPE\", \"streetName\": null, \"streetNumber\": null, \"subAreaName\": null, \"suburbName\": \"ASHDOWN\", \"suiteName\": null, \"unitNumber\": null}], \"locationEntpsTypeCode\": \"1\", \"locationTag\": null, \"locationUseEntpsTypeCode\": \"CR\", \"telephonicAddresses\": []}], \"name\": null, \"organisation\": null, \"partyCreatedDate\": null, \"partyEntpsTypeCode\": \"0\", \"partyStatusDate\": null, \"partyStatusEntpsTypeCode\": null, \"profileRegistrationName\": null, \"sourcesOfFunds\": [], \"takeOnAttributes\": []}}");
        event.setDate(Timestamp.valueOf(LocalDateTime.now()));
        e.add(event);
        return e;
    }

    private Cis1362rZosPayloadResponse cis1362GoodRs() {

        Cis1362rZosPayloadResponse cis1362rZosPayloadResponse = null;

        return cis1362rZosPayloadResponse;
    }

    private Cis1358ZosPayloadResponse cis1358GoodRs() {

        Cis1358ZosPayloadResponse cis1358ZosPayloadResponse = null;
        return cis1358ZosPayloadResponse;
    }
}