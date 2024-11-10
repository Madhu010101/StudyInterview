{
"eventHeader": {
"sourceSystemCode": "${body.eventHeader.sourceSystemCode!""}",
"eventDateTime": "${body.eventHeader.eventDateTime!""}",
"eventAction": "${body.eventHeader.eventAction!""}",
"eventArchContext": "consume+event",
"eventUUID": "${body.eventHeader.eventUUID!""}",
"eventOrigins":[
<#assign eventOriginList = body.eventHeader.eventOrigins>
<#list eventOriginList as eventOrigin>{
    "eventOriginType": "topic",
    "eventOriginName": "za.int.derived.cuscache.partymastercustomer.1",
    "eventOriginSourceSystemCode": "${eventOrigin.eventOriginSourceSystemCode!""}"
    }<#sep>,</#list>],
"correlations":[{
"correlationName": "eventUUID",
"correlationValue": "${body.eventHeader.eventUUID!""}"
}]
},
"key": {
"keyIdentifierSystemEntpsTypeCode": "${body.key.keyIdentifierSystemEntpsTypeCode!""}",
"keyIdentifierEntpsTypeCode": "${body.key.keyIdentifierEntpsTypeCode!""}",
"keyIdentifierJurisdictionId": <#if !body.key.keyIdentifierJurisdictionId?has_content>null</#if><#if body.key.keyIdentifierJurisdictionId?has_content>${body.key.keyIdentifierJurisdictionId!""}</#if>,
"keyIdentifierNumber": "${body.key.keyIdentifierNumber!""}",
"keyJurisdictionCountryEntpsCode": "${body.key.keyJurisdictionCountryEntpsCode!""}",
"keyCompanyEntpsTypeCode": "${body.key.keyCompanyEntpsTypeCode!""}"
},

"party": {
"partyEntpsTypeCode": <#if !body.party.partyEntpsTypeCode?has_content>null</#if><#if body.party.partyEntpsTypeCode?has_content>"${body.party.partyEntpsTypeCode!""}"</#if>,
"name": <#if !body.party.name?has_content>null</#if><#if body.party.name?has_content>"${body.party.name!""}"</#if>,
"profileRegistrationName": <#if !body.party.profileRegistrationName?has_content>null</#if><#if body.party.profileRegistrationName?has_content>"${body.party.profileRegistrationName!""}"</#if>,
"correspondenceLanguageEntpsTypeCode": <#if !body.party.correspondenceLanguageEntpsTypeCode?has_content>null</#if><#if body.party.correspondenceLanguageEntpsTypeCode?has_content>"${body.party.correspondenceLanguageEntpsTypeCode!""}"</#if>,
"homeLanguageEntpsTypeCode": <#if !body.party.homeLanguageEntpsTypeCode?has_content>null</#if><#if body.party.homeLanguageEntpsTypeCode?has_content>"${body.party.homeLanguageEntpsTypeCode!""}"</#if>,
"conversationLanguageEntpsTypeCode": <#if !body.party.conversationLanguageEntpsTypeCode?has_content>null</#if><#if body.party.conversationLanguageEntpsTypeCode?has_content>"${body.party.conversationLanguageEntpsTypeCode!""}"</#if>,
"partyCreatedDate": <#if !body.party.partyCreatedDate?has_content>null</#if><#if body.party.partyCreatedDate?has_content>"${body.party.partyCreatedDate!""}"</#if>,
"partyStatusEntpsTypeCode": <#if !body.party.partyStatusEntpsTypeCode?has_content>null</#if><#if body.party.partyStatusEntpsTypeCode?has_content>"${body.party.partyStatusEntpsTypeCode!""}"</#if>,
"partyStatusDate": <#if !body.party.partyStatusDate?has_content>null</#if><#if body.party.partyStatusDate?has_content>"${body.party.partyStatusDate!""}"</#if>,


"individual": <#if !body.party.individual?has_content>null</#if><#if body.party.individual?has_content>{

    "titleEntpsTypeCode": <#if !body.party.individual.titleEntpsTypeCode?has_content>null</#if><#if body.party.individual.titleEntpsTypeCode?has_content>"${body.party.individual.titleEntpsTypeCode!""}"</#if>,
    "birthDate": <#if !body.party.individual.birthDate?has_content>null</#if><#if body.party.individual.birthDate?has_content>"${body.party.individual.birthDate!""}"</#if>,
    "genderEntpsTypeCode": <#if !body.party.individual.genderEntpsTypeCode?has_content>null</#if><#if body.party.individual.genderEntpsTypeCode?has_content>"${body.party.individual.genderEntpsTypeCode!""}"</#if>,
    "deceasedDate": <#if !body.party.individual.deceasedDate?has_content>null</#if><#if body.party.individual.deceasedDate?has_content>"${body.party.individual.deceasedDate!""}"</#if>,
    "birthCityName": <#if !body.party.individual.birthCityName?has_content>null</#if><#if body.party.individual.birthCityName?has_content>"${body.party.individual.birthCityName!""}"</#if>,
    "birthCountryEntpsCode": <#if !body.party.individual.birthCountryEntpsCode?has_content>null</#if><#if body.party.individual.birthCountryEntpsCode?has_content>"${body.party.individual.birthCountryEntpsCode!""}"</#if>,
    "nationalityCountryEntpsCode": <#if !body.party.individual.nationalityCountryEntpsCode?has_content>null</#if><#if body.party.individual.nationalityCountryEntpsCode?has_content>"${body.party.individual.nationalityCountryEntpsCode!""}"</#if>,
    "permanentResidenceCountryEntpsCode": <#if !body.party.individual.permanentResidenceCountryEntpsCode?has_content>null</#if><#if body.party.individual.permanentResidenceCountryEntpsCode?has_content>"${body.party.individual.permanentResidenceCountryEntpsCode!""}"</#if>,
    "maritalStatusEntpsTypeCode": <#if !body.party.individual.maritalStatusEntpsTypeCode?has_content>null</#if><#if body.party.individual.maritalStatusEntpsTypeCode?has_content>"${body.party.individual.maritalStatusEntpsTypeCode!""}"</#if>,
    "maritalContractEntpsTypeCode": <#if !body.party.individual.maritalContractEntpsTypeCode?has_content>null</#if><#if body.party.individual.maritalContractEntpsTypeCode?has_content>"${body.party.individual.maritalContractEntpsTypeCode!""}"</#if>,
    "numberOfDependants": <#if !body.party.individual.numberOfDependants?has_content>null</#if><#if body.party.individual.numberOfDependants?has_content>${body.party.individual.numberOfDependants!""}</#if>,
    "maritalConsentIndicator": <#if !body.party.individual.maritalConsentIndicator?has_content>null</#if><#if body.party.individual.maritalConsentIndicator?has_content>"${body.party.individual.maritalConsentIndicator!""}"</#if>,


    "employments": [
<#assign  employmentsList = body.party.individual.employments>
    <#list employmentsList as employment>{
    "employerName": <#if !employment.employerName?has_content>null</#if><#if employment.employerName?has_content>"${employment.employerName!""}"</#if>,
    "occupationEntpsTypeCode": <#if !employment.occupationEntpsTypeCode?has_content>null</#if><#if employment.occupationEntpsTypeCode?has_content>"${employment.occupationEntpsTypeCode!""}"</#if>,
    "employmentStartDate": <#if !employment.employmentStartDate?has_content>null</#if><#if employment.employmentStartDate?has_content>"${employment.employmentStartDate!""}"</#if>,
    "employmentEndDate": <#if !employment.employmentEndDate?has_content>null</#if><#if employment.employmentEndDate?has_content>"${employment.employmentEndDate!""}"</#if>,
    "annualGrossIncomeAmount": <#if !employment.annualGrossIncomeAmount?has_content>null</#if><#if employment.annualGrossIncomeAmount?has_content>${employment.annualGrossIncomeAmount?c}</#if>

    }<#sep>, </#list>],
    "educations": [
<#assign  educationList = body.party.individual.educations>
    <#list educationList as education>{
    "highestQualificationEntpsTypeCode": <#if !education.highestQualificationEntpsTypeCode?has_content>null</#if><#if education.highestQualificationEntpsTypeCode?has_content>"${education.highestQualificationEntpsTypeCode!""}"</#if>,
    "qualificationSpecialityEntpsTypeCode": <#if !education.qualificationSpecialityEntpsTypeCode?has_content>null</#if><#if education.qualificationSpecialityEntpsTypeCode?has_content>"${education.qualificationSpecialityEntpsTypeCode!""}"</#if>,
    "qualificationDate": <#if !education.qualificationDate?has_content>null</#if><#if education.qualificationDate?has_content>"${education.qualificationDate!""}"</#if>,
    "qualificationProofIndicator": <#if !education.qualificationProofIndicator?has_content>null</#if><#if education.qualificationProofIndicator?has_content>"${education.qualificationProofIndicator!""}"</#if>,
    "qualificationStartDate": <#if !education.qualificationStartDate?has_content>null</#if><#if education.qualificationStartDate?has_content>"${education.qualificationStartDate!""}"</#if>


    }<#sep>, </#list>]
    }</#if>,
"organisation": <#if !body.party.organisation?has_content>null</#if><#if body.party.organisation?has_content>{
    "organisationEntpsTypeCode": <#if !body.party.organisation.organisationEntpsTypeCode?has_content>null</#if><#if body.party.organisation.organisationEntpsTypeCode?has_content>"${body.party.organisation.organisationEntpsTypeCode!""}"</#if>,
    "tradingName": <#if !body.party.organisation.tradingName?has_content>null</#if><#if body.party.organisation.tradingName?has_content>"${body.party.organisation.tradingName!""}"</#if>,
    "establishedDate": <#if !body.party.organisation.establishedDate?has_content>null</#if><#if body.party.organisation.establishedDate?has_content>"${body.party.organisation.establishedDate!""}"</#if>,
    "establishedCountryEntpsCode": <#if !body.party.organisation.establishedCountryEntpsCode?has_content>null</#if><#if body.party.organisation.establishedCountryEntpsCode?has_content>"${body.party.organisation.establishedCountryEntpsCode!""}"</#if>,
    "registeredHeadOfficeCountryEntpsCode": <#if !body.party.organisation.registeredHeadOfficeCountryEntpsCode?has_content>null</#if><#if body.party.organisation.registeredHeadOfficeCountryEntpsCode?has_content>"${body.party.organisation.registeredHeadOfficeCountryEntpsCode!""}"</#if>,
    "operationCountryEntpsCode": <#if !body.party.organisation.operationCountryEntpsCode?has_content>null</#if><#if body.party.organisation.operationCountryEntpsCode?has_content>"${body.party.organisation.operationCountryEntpsCode!""}"</#if>,
    "operationStartDate": <#if !body.party.organisation.operationStartDate?has_content>null</#if><#if body.party.organisation.operationStartDate?has_content>"${body.party.organisation.operationStartDate!""}"</#if>,
    "organisationStatusEntpsTypeCode": <#if !body.party.organisation.organisationStatusEntpsTypeCode?has_content>null</#if><#if body.party.organisation.organisationStatusEntpsTypeCode?has_content>"${body.party.organisation.organisationStatusEntpsTypeCode!""}"</#if>,
    "organisationStatusDate": <#if !body.party.organisation.organisationStatusDate?has_content>null</#if><#if body.party.organisation.organisationStatusDate?has_content>"${body.party.organisation.organisationStatusDate!""}"</#if>,
    "stateOwnedCompanyIndicator": <#if !body.party.organisation.stateOwnedCompanyIndicator?has_content>null</#if><#if body.party.organisation.stateOwnedCompanyIndicator?has_content>"${body.party.organisation.stateOwnedCompanyIndicator!""}"</#if>,
    "taxYearEndMonth": <#if !body.party.organisation.taxYearEndMonth?has_content>null</#if><#if body.party.organisation.taxYearEndMonth?has_content>${body.party.organisation.taxYearEndMonth!""}</#if>,
    "legalResponsibilityIndicator": <#if !body.party.organisation.legalResponsibilityIndicator?has_content>null</#if><#if body.party.organisation.legalResponsibilityIndicator?has_content>"${body.party.organisation.legalResponsibilityIndicator!""}"</#if>

    }</#if>,

"identifications": [
<#assign  identificationList = body.party.identifications>
<#list identificationList as identification>{
    "identificationEntpsTypeCode": <#if !identification.identificationEntpsTypeCode?has_content>null</#if><#if identification.identificationEntpsTypeCode?has_content>"${identification.identificationEntpsTypeCode!""}"</#if>,
    "identificationIssuerEntpsTypeCode": <#if !identification.identificationIssuerEntpsTypeCode?has_content>null</#if><#if identification.identificationIssuerEntpsTypeCode?has_content>"${identification.identificationIssuerEntpsTypeCode!""}"</#if>,
    "identificationIssueDate": <#if !identification.identificationIssueDate?has_content>null</#if><#if identification.identificationIssueDate?has_content>"${identification.identificationIssueDate!""}"</#if>,
    "identificationExpiryDate": <#if !identification.identificationExpiryDate?has_content>null</#if><#if identification.identificationExpiryDate?has_content>"${identification.identificationExpiryDate!""}"</#if>,
    "identificationIssuerCountryEntpsCode": <#if !identification.identificationIssuerCountryEntpsCode?has_content>null</#if><#if identification.identificationIssuerCountryEntpsCode?has_content>"${identification.identificationIssuerCountryEntpsCode!""}"</#if>,
    "identificationNumber": <#if !identification.identificationNumber?has_content>null</#if><#if identification.identificationNumber?has_content>"${identification.identificationNumber!""}"</#if>,
    "citizenshipCountryEntpsCode": <#if !identification.citizenshipCountryEntpsCode?has_content>null</#if><#if identification.citizenshipCountryEntpsCode?has_content>"${identification.citizenshipCountryEntpsCode!""}"</#if>,
    "residencyStatusEntpsTypeCode": <#if !identification.residencyStatusEntpsTypeCode?has_content>null</#if><#if identification.residencyStatusEntpsTypeCode?has_content>"${identification.residencyStatusEntpsTypeCode!""}"</#if>,
    "identificationStatusEntpsTypeCode": <#if !identification.identificationStatusEntpsTypeCode?has_content>null</#if><#if identification.identificationStatusEntpsTypeCode?has_content>"${identification.identificationStatusEntpsTypeCode!""}"</#if>,
    "identificationStatusDate": <#if !identification.identificationStatusDate?has_content>null</#if><#if identification.identificationStatusDate?has_content>"${identification.identificationStatusDate!""}"</#if>,
    "identificationReferenceNumber": <#if !identification.identificationReferenceNumber?has_content>null</#if><#if identification.identificationReferenceNumber?has_content>"${identification.identificationReferenceNumber!""}"</#if>,
    "identificationBarcodeNumber": <#if !identification.identificationBarcodeNumber?has_content>null</#if><#if identification.identificationBarcodeNumber?has_content>"${identification.identificationBarcodeNumber!""}"</#if>,

    "identificationNames": [
<#assign identificationNameList = identification.identificationNames>
    <#list identificationNameList as identificationName>{
    "nameEntpsTypeCode": <#if !identificationName.nameEntpsTypeCode?has_content>null</#if><#if identificationName.nameEntpsTypeCode?has_content>"${identificationName.nameEntpsTypeCode!""}"</#if>,
    "identificationNameValue": <#if !identificationName.identificationNameValue?has_content>null</#if><#if identificationName.identificationNameValue?has_content>"${identificationName.identificationNameValue!""}"</#if>

    }<#sep>, </#list>]
    }<#sep>, </#list>],
"identifiers": [
<#assign  identifiersList = body.party.identifiers>
<#list identifiersList as identifier>{
    "jurisdictionId": <#if !identifier.jurisdictionId?has_content>null</#if><#if identifier.jurisdictionId?has_content>${identifier.jurisdictionId!""}</#if>,
    "jurisdictionCountryEntpsCode": <#if !identifier.jurisdictionCountryEntpsCode?has_content>null</#if><#if identifier.jurisdictionCountryEntpsCode?has_content>"${identifier.jurisdictionCountryEntpsCode!""}"</#if>,
    "companyEntpsTypeCode": <#if !identifier.companyEntpsTypeCode?has_content>null</#if><#if identifier.companyEntpsTypeCode?has_content>"${identifier.companyEntpsTypeCode!""}"</#if>,
    "roleEntpsTypeCode": <#if !identifier.roleEntpsTypeCode?has_content>null</#if><#if identifier.roleEntpsTypeCode?has_content>"${identifier.roleEntpsTypeCode!""}"</#if>,
    "identifierEntpsTypeCode": <#if !identifier.identifierEntpsTypeCode?has_content>null</#if><#if identifier.identifierEntpsTypeCode?has_content>"${identifier.identifierEntpsTypeCode!""}"</#if>,
    "identifierNumber": <#if !identifier.identifierNumber?has_content>null</#if><#if identifier.identifierNumber?has_content>"${identifier.identifierNumber!""}"</#if>,
    "identifierStatusEntpsTypeCode": <#if !identifier.identifierStatusEntpsTypeCode?has_content>null</#if><#if identifier.identifierStatusEntpsTypeCode?has_content>"${identifier.identifierStatusEntpsTypeCode!""}"</#if>,
    "identifierStartDate": <#if !identifier.identifierStartDate?has_content>null</#if><#if identifier.identifierStartDate?has_content>"${identifier.identifierStartDate!""}"</#if>,
    "identifierEndDate": <#if !identifier.identifierEndDate?has_content>null</#if><#if identifier.identifierEndDate?has_content>"${identifier.identifierEndDate!""}"</#if>,
    "identifierSystemEntpsTypeCode": <#if !identifier.identifierSystemEntpsTypeCode?has_content>null</#if><#if identifier.identifierSystemEntpsTypeCode?has_content>"${identifier.identifierSystemEntpsTypeCode!""}"</#if>

    }<#sep>, </#list>],

"container": <#if !body.party.container?has_content>null</#if><#if body.party.container?has_content>{
    "containerEntpsTypeCode": <#if !body.party.container.containerEntpsTypeCode?has_content>null</#if><#if body.party.container.containerEntpsTypeCode?has_content>"${body.party.container.containerEntpsTypeCode!""}"</#if>,
    "containerStatusEntpsTypeCode": <#if !body.party.container.containerStatusEntpsTypeCode?has_content>null</#if><#if body.party.container.containerStatusEntpsTypeCode?has_content>"${body.party.container.containerStatusEntpsTypeCode!""}"</#if>

    }</#if>,

"sourcesOfFunds": [
<#assign sourceOfFundsList = body.party.sourcesOfFunds>
<#list sourceOfFundsList as sourceOfFund>{
    "sourceOfFundsEntpsTypeCode": <#if !sourceOfFund.sourceOfFundsEntpsTypeCode?has_content>null</#if><#if sourceOfFund.sourceOfFundsEntpsTypeCode?has_content>"${sourceOfFund.sourceOfFundsEntpsTypeCode!""}"</#if>,
    "sourceOfFundsDate": <#if !sourceOfFund.sourceOfFundsDate?has_content>null</#if><#if sourceOfFund.sourceOfFundsDate?has_content>"${sourceOfFund.sourceOfFundsDate!""}"</#if>,
    "sourceOfFundsAmount": <#if !sourceOfFund.sourceOfFundsAmount?has_content>null</#if><#if sourceOfFund.sourceOfFundsAmount?has_content>${sourceOfFund.sourceOfFundsAmount?c}</#if>
    }<#sep>, </#list>],

"locations": [
<#assign locationList = body.party.locations>
<#list locationList as location>{
    "locationEntpsTypeCode": <#if !location.locationEntpsTypeCode?has_content>null</#if><#if location.locationEntpsTypeCode?has_content>"${location.locationEntpsTypeCode!""}"</#if>,
    "locationUseEntpsTypeCode": <#if !location.locationUseEntpsTypeCode?has_content>null</#if><#if location.locationUseEntpsTypeCode?has_content>"${location.locationUseEntpsTypeCode!""}"</#if>,
    "locationTag": <#if !location.locationTag?has_content>null</#if><#if location.locationTag?has_content>"${location.locationTag!""}"</#if>,
    "allArrangementStatementAddressIndicator": <#if !location.allArrangementStatementAddressIndicator?has_content>null</#if><#if location.allArrangementStatementAddressIndicator?has_content>"${location.allArrangementStatementAddressIndicator!""}"</#if>,
    "geographicAddresses": [
<#assign geographicalAddressList = location.geographicAddresses>
    <#list geographicalAddressList as geographicalAddress>{
        "addressEntpsTypeCode": <#if !geographicalAddress.addressEntpsTypeCode?has_content>null</#if><#if geographicalAddress.addressEntpsTypeCode?has_content>"${geographicalAddress.addressEntpsTypeCode!""}"</#if>,
        "addressLine1": <#if !geographicalAddress.addressLine1?has_content>null</#if><#if geographicalAddress.addressLine1?has_content>"${geographicalAddress.addressLine1!""}"</#if>,
        "addressLine2": <#if !geographicalAddress.addressLine2?has_content>null</#if><#if geographicalAddress.addressLine2?has_content>"${geographicalAddress.addressLine2!""}"</#if>,
        "suburbName": <#if !geographicalAddress.suburbName?has_content>null</#if><#if geographicalAddress.suburbName?has_content>"${geographicalAddress.suburbName!""}"</#if>,
        "cityName": <#if !geographicalAddress.cityName?has_content>null</#if><#if geographicalAddress.cityName?has_content>"${geographicalAddress.cityName!""}"</#if>,
        "stateDistrictProvinceName": <#if !geographicalAddress.stateDistrictProvinceName?has_content>null</#if><#if geographicalAddress.stateDistrictProvinceName?has_content>"${geographicalAddress.stateDistrictProvinceName!""}"</#if>,
        "stateDistrictProvinceEntpsTypeCode": <#if !geographicalAddress.stateDistrictProvinceEntpsTypeCode?has_content>null</#if><#if geographicalAddress.stateDistrictProvinceEntpsTypeCode?has_content>"${geographicalAddress.stateDistrictProvinceEntpsTypeCode!""}"</#if>,
        "countryEntpsCode": <#if !geographicalAddress.countryEntpsCode?has_content>null</#if><#if geographicalAddress.countryEntpsCode?has_content>"${geographicalAddress.countryEntpsCode!""}"</#if>,
        "postalAreaNumber": <#if !geographicalAddress.postalAreaNumber?has_content>null</#if><#if geographicalAddress.postalAreaNumber?has_content>"${geographicalAddress.postalAreaNumber!""}"</#if>,
        "careOfName": <#if !geographicalAddress.careOfName?has_content>null</#if><#if geographicalAddress.careOfName?has_content>"${geographicalAddress.careOfName!""}"</#if>,
        "streetNumber": <#if !geographicalAddress.streetNumber?has_content>null</#if><#if geographicalAddress.streetNumber?has_content>"${geographicalAddress.streetNumber!""}"</#if>,
        "streetName": <#if !geographicalAddress.streetName?has_content>null</#if><#if geographicalAddress.streetName?has_content>"${geographicalAddress.streetName!""}"</#if>,
        "unitNumber": <#if !geographicalAddress.unitNumber?has_content>null</#if><#if geographicalAddress.unitNumber?has_content>"${geographicalAddress.unitNumber!""}"</#if>,
        "floorNumber": <#if !geographicalAddress.floorNumber?has_content>null</#if><#if geographicalAddress.floorNumber?has_content>"${geographicalAddress.floorNumber!""}"</#if>,
        "complexName": <#if !geographicalAddress.complexName?has_content>null</#if><#if geographicalAddress.complexName?has_content>"${geographicalAddress.complexName!""}"</#if>,
        "buildingName": <#if !geographicalAddress.buildingName?has_content>null</#if><#if geographicalAddress.buildingName?has_content>"${geographicalAddress.buildingName!""}"</#if>,
        "suiteName": <#if !geographicalAddress.suiteName?has_content>null</#if><#if geographicalAddress.suiteName?has_content>"${geographicalAddress.suiteName!""}"</#if>,
        "subAreaName": <#if !geographicalAddress.subAreaName?has_content>null</#if><#if geographicalAddress.subAreaName?has_content>"${geographicalAddress.subAreaName!""}"</#if>,
        "googlePlusCode": <#if !geographicalAddress.googlePlusCode?has_content>null</#if><#if geographicalAddress.googlePlusCode?has_content>"${geographicalAddress.googlePlusCode!""}"</#if>

        }<#sep>, </#list> ],
    "telephonicAddresses": [
<#assign telephonicAddressList = location.telephonicAddresses>
    <#list telephonicAddressList as telephonicAddress>{
        "telephoneEntpsTypeCode": <#if !telephonicAddress.telephoneEntpsTypeCode?has_content>null</#if><#if telephonicAddress.telephoneEntpsTypeCode?has_content>"${telephonicAddress.telephoneEntpsTypeCode!""}"</#if>,
        "telephoneFullNumber": <#if !telephonicAddress.telephoneFullNumber?has_content>null</#if><#if telephonicAddress.telephoneFullNumber?has_content>"${telephonicAddress.telephoneFullNumber!""}"</#if>,
        "telephoneCountryDailCode": <#if !telephonicAddress.telephoneCountryDailCode?has_content>null</#if><#if telephonicAddress.telephoneCountryDailCode?has_content>"${telephonicAddress.telephoneCountryDailCode!""}"</#if>,
        "telephoneAreaDailCode": <#if !telephonicAddress.telephoneAreaDailCode?has_content>null</#if><#if telephonicAddress.telephoneAreaDailCode?has_content>"${telephonicAddress.telephoneAreaDailCode!""}"</#if>,
        "telephoneNumber": <#if !telephonicAddress.telephoneNumber?has_content>null</#if><#if telephonicAddress.telephoneNumber?has_content>"${telephonicAddress.telephoneNumber!""}"</#if>,
        "telephoneExtensionNumber": <#if !telephonicAddress.telephoneExtensionNumber?has_content>null</#if><#if telephonicAddress.telephoneExtensionNumber?has_content>"${telephonicAddress.telephoneExtensionNumber!""}"</#if>

        }<#sep>, </#list> ],
    "emailAddresses": [
<#assign emailAddressList = location.emailAddresses>
    <#list emailAddressList as emailAddress>{
    "emailAddress": <#if !emailAddress.emailAddress?has_content>null</#if><#if emailAddress.emailAddress?has_content>"${emailAddress.emailAddress!""}"</#if>

    }<#sep>, </#list>],
    "digitalAddresses": [
<#assign digitalAddressList = location.digitalAddresses>
    <#list digitalAddressList as digitalAddress>{
        "digitalAddressEntpsTypeCode": <#if !digitalAddress.digitalAddressEntpsTypeCode?has_content>null</#if><#if digitalAddress.digitalAddressEntpsTypeCode?has_content>"${digitalAddress.digitalAddressEntpsTypeCode!""}"</#if>,
        "digitalAddress": <#if !digitalAddress.digitalAddress?has_content>null</#if><#if digitalAddress.digitalAddress?has_content>"${digitalAddress.digitalAddress!""}"</#if>

        }<#sep>, </#list> ]
    }<#sep>, </#list>],

"takeOnAttributes": [
<#assign takeOnAttributesList = body.party.takeOnAttributes>
<#list takeOnAttributesList as takeOnAttribute>{
    "attributeName": <#if !takeOnAttribute.attributeName?has_content>null</#if><#if takeOnAttribute.attributeName?has_content>"${takeOnAttribute.attributeName!""}"</#if>,
    "attributeValue": <#if !takeOnAttribute.attributeValue?has_content>null</#if><#if takeOnAttribute.attributeValue?has_content>"${takeOnAttribute.attributeValue!""}"</#if>

    }<#sep>, </#list>]
}}