{
"eventHeader": {
    "sourceSystemCode": "${body.eventHeader.sourceSystemCode!""}",
    "eventDateTime": "${body.eventHeader.eventDateTime!""}",
    "eventAction": "${body.eventHeader.eventAction!""}",
    "eventArchContext": "${body.eventHeader.eventArchContext!""}",
    "eventUUID": "${body.eventHeader.eventUUID!""}",
    "eventOrigin":[
    <#assign eventOriginList = body.eventHeader.eventOrigin>
    <#list eventOriginList as eventOrigin>{
        "eventOriginType": "${eventOrigin.eventOriginType!""}",
        "eventOriginName": "${eventOrigin.eventOriginName!""}"
    }<#sep>,</#list>],
    "correlation":[
    <#assign correlationList = body.eventHeader.correlation>
    <#list correlationList as correlation>{
        "correlationName": "${correlation.correlationName!""}",
        "correlationValue": "${correlation.correlationValue!""}
    }<#sep>,</#list>]
},
"key": {
        "customerCompanyTypeCode": ${body.key.M_CIF_CUST_NO_COID_N!""},
        "customerUniqueNumber": ${body.key.M_CIF_CUST_NO?c!""}
    },
"alternateKey": [
    <#assign  alternateKeyList = body.alternateKey>
    <#list alternateKeyList as alternateKey>
    {
        "customerCompanyTypeCode": ${alternateKey.X77030_PRIM_CUSTNO_COID_N!""},
        "customerUniqueNumber": ${alternateKey.X77030_PRIM_CUST_NO?c!""}
    }<#sep>, </#list>],
"customer": {
        "customerTypeCode": "${body.customer.M_CIF_CUST_TYPE_CD!""}",
        "customerStatusTypeCode": "${body.customer.M_CIF_CUST_STATUS!""}",
        "customerCreatedDate": <#if !body.customer.M_CIF_DATE_CUST_OPENED?has_content>null</#if><#if body.customer.M_CIF_DATE_CUST_OPENED?has_content>${body.customer.M_CIF_DATE_CUST_OPENED?c!""}</#if>,
        "customerEndDate": <#if !body.customer.M_CIF_DATE_CUST_CLOSED?has_content>null</#if><#if body.customer.M_CIF_DATE_CUST_CLOSED?has_content>${body.customer.M_CIF_DATE_CUST_CLOSED?c!""}</#if>,
        "customerLastMaintainedDate": <#if !body.customer.M_CIF_DATE_LAST_MAINT?has_content>null</#if><#if body.customer.M_CIF_DATE_LAST_MAINT?has_content>${body.customer.M_CIF_DATE_LAST_MAINT?c!""}</#if>,
        "domicileBranchCode": <#if !body.customer.M_CIF_BRN?has_content>null</#if><#if body.customer.M_CIF_BRN?has_content>${body.customer.M_CIF_BRN?c!""}</#if>,
        "vipindicator": "${body.customer.VIPIndicator!""}",
        "vippartyStatureTypeCode": "${body.customer.M_CIF_BK_REL_vip!""}",
        "riskCategoryTypeCode": "${body.customer.M_CIF_RISK_INDICATOR!""}",
        "depositTakingInstitutionTypeCode": "${body.customer.M_CIF_DTI_CODE!""}",
        "depositTakingInstitutionStatementIndicator": "${body.customer.M_CIF_DTI_STMT_IND!""}",
        "partyTypeCode": "${body.customer.partyTypeCode!""}",
        "name": "${body.customer.M_CIF_NAME_1!""}",
        "languageTypeCode": "${body.customer.M_CIF_CUST_LANG_CD!""}",
        "identificationVerifiedIndicator": "${body.customer.M_CIF_IDENTITY_VERIFIED!""}",
        "primaryKYCCondition": "${body.customer.M_CIF_KYC_INDICATOR!""}",
        "bankruptDate": <#if !body.customer.M_CIF_DATE_BANKRUPT?has_content>null</#if><#if body.customer.M_CIF_DATE_BANKRUPT?has_content>${body.customer.M_CIF_DATE_BANKRUPT?c!""}</#if>,
        "propertyOwnershipTypeCode": "${body.customer.M_CIF_PROPERTY_OWNERSHIP!""}",
        "propertyBondedIndicator": "${body.customer.M_CIF_PROPERTY_BOND!""}",
        "sensitiveCustomerIndicator": "${body.customer.sensitiveCustomerIndicator!""}",
        "addressVerifiedIndicator": "${body.customer.M_CIF_ADDRESS_VERIFIED!""}",
        "kycverifiedDate": <#if !body.customer.M_CIF_KYC_DATE_VERIFIED?has_content>null</#if><#if body.customer.M_CIF_KYC_DATE_VERIFIED?has_content>${body.customer.M_CIF_KYC_DATE_VERIFIED?c!""}</#if>,
        "riskReasonTypeCode": "${body.customer.M_CIF_RISK_REASON!""}",
        <#if body.customer.individual?has_content>
      "individual": {

            "titleTypeCode": "${body.customer.individual.M_CIF_CUST_TITLE!""}",
            "initials": "${body.customer.individual.M_CIF_CUST_INITIALS!""}",
            "firstName": "${body.customer.individual.M_CIF_FIRST_NAME!""}",
            "middleName1": "${body.customer.individual.M_CIF_MIDDLE_NAME_1!""}",
            "middleName2": "${body.customer.individual.M_CIF_MIDDLE_NAME_2!""}",
            "middleName3": "${body.customer.individual.M_CIF_MIDDLE_NAME_3!""}",
            "middleName4": "${body.customer.individual.M_CIF_MIDDLE_NAME_4!""}",
            "surname": "${body.customer.individual.M_CIF_SURNAME!""}",
            "birthDate": <#if !body.customer.individual.M_CIF_CUST_DATE_OF_BIRTH?has_content>null</#if><#if body.customer.individual.M_CIF_CUST_DATE_OF_BIRTH?has_content>${body.customer.individual.M_CIF_CUST_DATE_OF_BIRTH?c!""}</#if>,
            "deceasedDate": <#if !body.customer.individual.M_CIF_CUST_DATE_DECEASED?has_content>null</#if><#if body.customer.individual.M_CIF_CUST_DATE_DECEASED?has_content>${body.customer.individual.M_CIF_CUST_DATE_DECEASED?c!""}</#if>,
            "birthCountryCode": "${body.customer.individual.M_CIF_CNTRY_OF_BIRTH!""}",
            "citizenshipCountryCode": "${body.customer.individual.M_CIF_CNTRY_CITIZENSHIP!""}",
            "nationalityCountryCode": "${body.customer.individual.M_CIF_CNTRY_NATIONALITY!""}",
            "permanentResidenceCountryCode": "${body.customer.individual.M_CIF_CNTRY_PERM_RESIDENCE!""}",
            "residencyStatusTypeCode": "${body.customer.individual.M_CIF_RESIDENCE_STATUS!""}",
            "genderTypeCode": "${body.customer.individual.M_CIF_CUST_SEX!""}",
            "ethnicGroupTypeCode": "${body.customer.individual.M_CIF_ETHNIC_GROUP!""}",
            "maritalStatusTypeCode": "${body.customer.individual.M_CIF_CUST_MARITAL_STATUS!""}",
            "maritalContractTypeCode": "${body.customer.individual.M_CIF_MARITAL_CONTRACT!""}",
            "maritalAssistanceRequiredIndicator": "${body.customer.individual.M_CIF_MARITAL_ASST_REQ!""}",
            "numberOfDependants": <#if !body.customer.individual.M_CIF_NO_OF_CHILDREN?has_content>null</#if><#if body.customer.individual.M_CIF_NO_OF_CHILDREN?has_content>"${body.customer.individual.M_CIF_NO_OF_CHILDREN!""}"</#if>,
            "annualGrossIncomeAmount": <#if !body.customer.individual.M_CIF_INCOME_AMOUNT?has_content>null</#if><#if body.customer.individual.M_CIF_INCOME_AMOUNT?has_content>${body.customer.individual.M_CIF_INCOME_AMOUNT?c!""}</#if>,
            "debtCounsellingIndicator": "${body.customer.individual.M_CIF_DEBT_COUNSEL_IND!""}",
            "groupSchemeTypeCode": "${body.customer.individual.M_CIF_GROUP_SCHEME!""}",
            "occupationTypeCode": "${body.customer.individual.M_CIF_OCCUPATION_CODE!""}",
            <#if body.customer.individual.employment?has_content>
            "employment": {
                "firstRandEmployeeIndicator": "${body.customer.individual.employment.M_CIF_EMPLOYEE_IND!""}",
                "employeeNumber": "${body.customer.individual.employment.M_CIF_EMPLOYEE_NUMBER!""}",
                "employerName": "${body.customer.individual.employment.M_CIF_PLACE_OF_WORK!""}",
                "employerIndustryTypeCode": <#if !body.customer.individual.employment.M_CIF_EMP_SIC_CODE?has_content>null</#if><#if body.customer.individual.employment.M_CIF_EMP_SIC_CODE?has_content>${body.customer.individual.employment.M_CIF_EMP_SIC_CODE?c!""}</#if>,
                "employmentDurationMonths": <#if !body.customer.individual.employment.M_CIF_EMP_DURATION?has_content>0</#if><#if body.customer.individual.employment.M_CIF_EMP_DURATION?has_content>${body.customer.individual.employment.M_CIF_EMP_DURATION!0}</#if>

            }<#else>
            "employment": null
            </#if>,
            <#if body.customer.individual.education?has_content>
            "education": {
                "highestEducationLevelTypeCode": "${body.customer.individual.education.M_CIF_QUAL_HIGH_ED_LEVEL!""}",
                "proofOfHighestEducationObtained": "${body.customer.individual.education.M_CIF_PROOF_OF_DEGREE!""}",
                "qualificationSpecialityTypeCode": "${body.customer.individual.education.M_CIF_QUAL_SPECIALITY!""}",
                "graduatedIndicator": "${body.customer.individual.education.M_CIF_GRAD_IND!""}",
                "graduationTypeCode": "${body.customer.individual.education.M_CIF_GRAD_TYPE!""}",
                "graduationDate": <#if !body.customer.individual.education.M_CIF_GRAD_DATE?has_content>null</#if><#if body.customer.individual.education.M_CIF_GRAD_DATE?has_content>${body.customer.individual.education.M_CIF_GRAD_DATE?c!""}</#if>

            }
            <#else>
            "education": null
        </#if>}
        <#else>
        "individual": null
        </#if>,
        <#if body.customer.organisation?has_content>
        "organisation": {
            "tradingName": "${body.customer.organisation.M_TRADING_AS_NAME!""}",
            "establishedDate": <#if !body.customer.organisation.M_CIF_DATE_BUS_EST?has_content>null</#if><#if body.customer.organisation.M_CIF_DATE_BUS_EST?has_content>${body.customer.organisation.M_CIF_DATE_BUS_EST?c!""}</#if>,
            "establishedCountryCode": "${body.customer.organisation.M_CIF_CNTRY_ESTABLISHED!""}",
            "operationCountryCode": "${body.customer.organisation.M_CIF_CNTRY_OPERATIONS!""}",
            "registeredHeadOfficeCountryCode": "${body.customer.organisation.M_CIF_CNTRY_REGISTERED!""}",
            "organisationStatusTypeCode": "${body.customer.organisation.M_ENTITY_STATUS!""}",
            "organisationStatusDate": <#if !body.customer.organisation.M_ENTITY_STATUS_DATE?has_content>null</#if><#if body.customer.organisation.M_ENTITY_STATUS_DATE?has_content>${body.customer.organisation.M_ENTITY_STATUS_DATE?c!""}</#if>,
            "primaryBusinessTypeCode": "${body.customer.organisation.M_PRIMARY_BUSINESS!""}",
            "industryTypeCode": <#if !body.customer.organisation.M_CIF_SA_SIC_CODE?has_content>0</#if><#if body.customer.organisation.M_CIF_SA_SIC_CODE?has_content>${body.customer.organisation.M_CIF_SA_SIC_CODE?c!0}</#if>,
            "stateOwnedCompanyIndicator": "${body.customer.organisation.M_CIF_SOC_IND!""}",
            "taxYearEndMonth": <#if !body.customer.organisation.M_CIF_MONTH_OF_TAX_YEAR_END?has_content>0</#if><#if body.customer.organisation.M_CIF_MONTH_OF_TAX_YEAR_END?has_content>${body.customer.organisation.M_CIF_MONTH_OF_TAX_YEAR_END!0}</#if>,
            "turnoverRangeTypeCode": "${body.customer.organisation.M_CIF_TURNOVER!""}",
            "organisationSizeRangeTypeCode": "${body.customer.organisation.M_CIF_NO_OF_EMPLOYEES!""}",
            "beeStatusTypeCode": "${body.customer.organisation.M_CIF_BEE_LVL!""}",
            "beePercentage": <#if !body.customer.organisation.M_CIF_BEE_PERCENT?has_content>0</#if><#if body.customer.organisation.M_CIF_BEE_PERCENT?has_content>${body.customer.organisation.M_CIF_BEE_PERCENT!0}</#if>,
            "beeStatusDate": <#if !body.customer.organisation.M_CIF_BEE_DATE?has_content>null</#if><#if body.customer.organisation.M_CIF_BEE_DATE?has_content>${body.customer.organisation.M_CIF_BEE_DATE?c!""}</#if>,
            "businessRescueIndicator": "${body.customer.organisation.M_CIF_BUS_RESCUE_IND!""}",
            "businessRescueDate": <#if !body.customer.organisation.M_CIF_BUS_RESCUE_DATE?has_content>null</#if><#if body.customer.organisation.M_CIF_BUS_RESCUE_DATE?has_content>${body.customer.organisation.M_CIF_BUS_RESCUE_DATE?c!""}</#if>,
            "controlVerifiedIndicator": "${body.customer.organisation.M_CIF_CONTROL_VERIFIED!""}",
            "corporateCustomerIndicator": "${body.customer.organisation.M_CIF_CORP_CUST!""}",
            "corporateInvestmentBankIndicator": "${body.customer.organisation.M_CIF_CIB_IND!""}",
            "turnoverProjectedAmount": <#if !body.customer.organisation.M_TURNOVER_AMT?has_content>0</#if><#if body.customer.organisation.M_TURNOVER_AMT?has_content>${body.customer.organisation.M_TURNOVER_AMT?c!0}</#if>,
            "beeAccreditorName": <#if !body.customer.organisation.M_CIF_BEE_DATE?has_content>null</#if><#if body.customer.organisation.M_CIF_BEE_DATE?has_content>"${body.customer.organisation.M_CIF_BEE_DATE?c!""}""</#if>,
            "organisationOperationDate": <#if !body.customer.organisation.M_CIF_DATE_OPERATION?has_content>null</#if><#if body.customer.organisation.M_CIF_DATE_OPERATION?has_content>${body.customer.organisation.M_CIF_DATE_OPERATION?c!""}</#if>,
            "businessIndustryClassificationTypeCode": "${body.customer.organisation.M_CIF_BIC_CODE!""}",
            "organisationContact":[
                <#assign organisationContactList =  body.customer.organisation.organisationContact>
                <#list organisationContactList as organisationContact>{
                    "contactSequence": "${organisationContact.M_CIF_CONTACT_OCC_NBR!""}",
                    "contactName": "${organisationContact.M_CIF_CONTACT_NAME!""}",
                    "positionHeld": "${organisationContact.M_CIF_CONTACT_TITLE!""}",
                    "telephoneCountryCode": "${organisationContact.M_CIF_CONTACT_PHONE_INT_CODE!""}",
                    "telephoneNumber": "${organisationContact.M_CIF_CONTACT_PHONE!""}",
                    "faxCountryCode": "${organisationContact.M_CIF_CONTACT_FAX_INT_CODE!""}",
                    "faxNumber": "${organisationContact.M_CIF_CONTACT_FAX_NBR!""}"
                    }<#sep>, </#list>]

        }<#else>
        "organisation": null
        </#if>,
        <#if body.customer.contact?has_content>
        "contact": {
            "preferredContactMethodTypeCode": "${body.customer.contact.M_CIF_PREF_METH_OF_CONT!""}",
            "emailAddress": "${body.customer.contact.M_CIF_EMAIL_ADR!""}"

        }<#else>
        "contact": null
        </#if>,
        <#if body.customer.feature?has_content>
        "feature": {
            "inContactIndicator": "${body.customer.feature.M_CIF_INCONTACT_IND!""}",
            "onlineBankingIndicator": "${body.customer.feature.M_CIF_ONLINE_BANKING_IND!""}",
            "eBucksIndicator": "${body.customer.feature.M_CIF_EBUCKS_IND!""}",
            "emailStatementsIndicator": "${body.customer.feature.M_CIF_EMAIL_STATEMENTS_IND!""}",
            "cellPhoneBankingIndicator": "${body.customer.feature.M_CIF_CELLPHONE_BANKING_IND!""}",
            "fnbconnectIndicator": "${body.customer.feature.M_CIF_FNB_CONNECT_IND!""}",
            "rewardIndicator": "${body.customer.feature.M_CIF_REWARD_IND!""}"
        }<#else>
        "feature": null
        </#if>,
        "relationshipManager":[
        <#assign  relationshipManagerList = body.customer.relationshipManager>
        <#list relationshipManagerList as relationshipManager >{
            "relationshipManagerHierarchy": "${relationshipManager.relationshipManagerHierarchy}",
            "relationshipManagerTypeCode": "${relationshipManager.M_CIF_OFF}"
        }<#sep>, </#list>],
        "segmentation": [
        <#assign  segmentationList = body.customer.segmentation>
        <#list segmentationList as segmentation>{
            "segmentationHierarchy": "${segmentation.M_CIF_SEGM_DIMENSION!""}",
            "segmentationTypeCode": "${segmentation.M_CIF_SEGM_CATG!""}"
        }<#sep>, </#list>],
        "partyStature": [
        <#assign  partyStatureList = body.customer.partyStature>
        <#list partyStatureList as partyStature>{
            "partyStatureSequence": "${partyStature.M_CIF_BK_REL_seq!""}",
            "partyStatureTypeCode": "${partyStature.M_CIF_BK_REL!""}"
        }<#sep>, </#list>],
        "serviceOffering": [
        <#assign  serviceOfferingList = body.customer.serviceOffering>
        <#list serviceOfferingList as serviceOffering>{
            "serviceOfferingSequence": "${serviceOffering.M_CIF_BK_SER_seq!""}",
            "serviceOfferingTypeCode": "${serviceOffering.M_CIF_BK_SER!""}"
        }<#sep>, </#list>],
        "identification": [
        <#assign  identificationList = body.customer.identification>
        <#list identificationList as identification>{
            "identificationTypeCode": "${identification.M_CIF_ID_TYPE!""}",
            "identificationSequence": "${identification.M_CIF_ID_OCCUR!""}",
            "identificationPrimaryIndicator": "${identification.primaryIdentificationIndicator!""}",
            "identificationIssueDate": <#if !identification.M_CIF_ID_EFF_DATE?has_content>null</#if><#if identification.M_CIF_ID_EFF_DATE?has_content>${identification.M_CIF_ID_EFF_DATE?c!""}</#if>,
            "identificationExpiryDate": <#if !identification.M_CIF_ID_EXP_DATE?has_content>null</#if><#if identification.M_CIF_ID_EXP_DATE?has_content>${identification.M_CIF_ID_EXP_DATE?c!""}</#if>,
            "identificationIssuerCountryCode": "${identification.M_CIF_ID_ISSUER!""}",
            "identificationNumber": "${identification.M_CIF_ID_DESCRIPTION!""}"
        }<#sep>, </#list>],
        "phone": [
        <#assign  phoneList = body.customer.phone>
        <#list phoneList as phone>{
            "telephoneTypeCode": "${phone.M_CIF_PHONE_TYPE!""}",
            "telephoneSequence": "${phone.M_CIF_PHONE_OCCUR!""}",
            "telephoneCountryCode": "${phone.M_CIF_PHONE_INT_CODE!""}",
            "telephoneNumber": "${phone.M_CIF_PHONE_NUMBER!""}"
        }<#sep>, </#list>],
        "address": <#if body.customer.address?has_content>[
        <#assign  addressList = body.customer.address>
        <#list addressList as address>{
            "addressTypeCode": "${address.M_CIF_CUST_TO_ADR_USE_CODE!""}",
            "addressTypeCodeSeq": "${address.M_CIF_CUST_TO_ADR_USE_OCC_NO!""}",
            "addressLine1": "${address.M_ADF_ADR_0_BYTE!""}",
            "addressLine2": "${address.M_ADF_ADR_1_BYTE!""}",
            "suburb": "${address.M_ADF_ADR_2_BYTE!""}",
            "city": "${address.M_ADF_CITY!""}",
            "districtProvince": "${address.M_ADF_STATE!""}",
            "postalCode": "${address.M_ADF_ZIP_CODE_1_4!""}",
            "zipCode": "${address.M_ADF_ZIP_CODE_5_9!""}",
            "countryCode": "${address.M_ADF_COUNTRY_CODE!""}"
        }<#sep>, </#list>]</#if><#if !body.customer.address?has_content>[]</#if>
}}
