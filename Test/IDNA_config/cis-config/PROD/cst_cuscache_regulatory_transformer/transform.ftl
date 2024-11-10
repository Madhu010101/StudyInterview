{
"eventHeader":{
    "sourceSystemCode": "${body.eventHeader.sourceSystemCode!""}",
    "eventDateTime": "${body.eventHeader.eventDateTime!""}",
    "eventAction": "${body.eventHeader.eventAction!""}",
    "eventArchContext": "${body.eventHeader.eventArchContext!""}",
    "eventUUID": "${body.eventHeader.eventUUID!""}",
    "eventOrigin":[],
    "correlation":[]
},
"key": {
        "customerCompanyTypeCode": ${body.key.M_CIF_CUST_NO_COID_N!""},
        "customerUniqueNumber": ${body.key.M_CIF_CUST_NO?c!""}
    },
"alternateKey": null,
"customer":{
		"customerTypeCode":"${body.customer.M_CIF_CUST_TYPE_CD!""}",
		"depositTakingInstitutionTypeCode":"${body.customer.M_CIF_DTI_CODE!""}",
		"partyTypeCode":"${body.customer.partyTypeCode!""}",
		"name":"${body.customer.M_CIF_NAME_1!""}",
		"sanctionScreeningStatusTypeCode":"${body.customer.X42304_SANC_SCREEN_STATUS!""}",
		"bankExitDecisionIndicator":"${body.customer.X42304_BANK_DECISION_IND!""}",
		"placeHardHoldIndicator":"${body.customer.X42304_CRS_FREEZE!""}",
		"noForexSARBIndicator":"${body.customer.X42304_NO_FOREX_BLOCK_IND!""}",
		<#if body.customer.individual?has_content>
		"individual":{
				"debtCounsellingIndicator":"${body.customer.individual.M_CIF_DEBT_COUNSEL_IND!""}",
				"birthCityName":"${body.customer.individual.X42304_CITY_OF_BIRTH!""}",
				"employerIndustryTypeCode": null
		}
		<#else>
        "individual": null
        </#if>,
		<#if body.customer.organisation?has_content>
		"organisation":{
				"organisationStatusTypeCode":"${body.customer.organisation.M_ENTITY_STATUS!""}",
				"organisationStatusDate":<#if !body.customer.organisation.M_ENTITY_STATUS_DATE?has_content>null</#if><#if body.customer.organisation.M_ENTITY_STATUS_DATE?has_content>${body.customer.organisation.M_ENTITY_STATUS_DATE?c!""}</#if>,
				"primaryBusinessTypeCode":"${body.customer.organisation.M_PRIMARY_BUSINESS!""}",
				"industryTypeCode":${body.customer.organisation.M_CIF_SA_SIC_CODE?c!""},
				"controlVerifiedIndicator":"${body.customer.organisation.M_CIF_CONTROL_VERIFIED!""}",
				"beeAccreditorName":"${body.customer.organisation.M_ACCREDITOR_NAME!""}",
				"beePercentage":${body.customer.organisation.M_CIF_BEE_PERCENT?c!""},
				"beeStatusTypeCode":"${body.customer.organisation.M_CIF_BEE_LVL!""}",
				"beeStatusDate":<#if !body.customer.organisation.M_CIF_BEE_DATE?has_content>null</#if><#if body.customer.organisation.M_CIF_BEE_DATE?has_content>${body.customer.organisation.M_CIF_BEE_DATE?c!""}</#if>,
				"businessRescueDate":<#if !body.customer.organisation.M_CIF_BUS_RESCUE_DATE?has_content>null</#if><#if body.customer.organisation.M_CIF_BUS_RESCUE_DATE?has_content>${body.customer.organisation.M_CIF_BUS_RESCUE_DATE?c!""}</#if>,
				"distressedRestructureIndicator":"${body.customer.organisation.X42304_DISTRESSED_IND!""}",
				"distressedRestructureDate":<#if !body.customer.organisation.X42304_DISTRESSED_DTE?has_content>null</#if><#if body.customer.organisation.X42304_DISTRESSED_DTE?has_content>${body.customer.organisation.X42304_DISTRESSED_DTE?c!""}</#if>,
				"creditHighRiskIndicator":"${body.customer.organisation.X42304_CR_HIGH_RISK_IND!""}",
				"creditHighRiskDate":<#if !body.customer.organisation.X42304_CR_HIGH_RISK_DTE?has_content>null</#if><#if body.customer.organisation.X42304_CR_HIGH_RISK_DTE?has_content>${body.customer.organisation.X42304_CR_HIGH_RISK_DTE?c!""}</#if>,
				"businessRescueIndicator":null
		}
		<#else>
        "organisation": null
        </#if>,
		"regulatoryRisk":{
				"riskCategoryTypeCode":"${body.customer.M_CIF_RISK_REASON!""}",
				"riskReasonTypeCode":${body.customer.M_CIF_RISK_REASON?c!""},
				"riskRatingTypeCode":"${body.customer.X42304_RISK_RATING!""}",
				"riskRatingModelTypeCode":"${body.customer.X42304_CRO_MODEL_TYPE!""}"
		},
		"regulatoryCRS":{
				"foreignTaxLiabilityIndicator":"${body.customer.X42304_FOREIGN_TAX_IND!""}",
				"foreignTaxSelfCertificationDate":<#if !body.customer.X42304_SELF_CERT_DATE?has_content>null</#if><#if body.customer.X42304_SELF_CERT_DATE?has_content>${body.customer.X42304_SELF_CERT_DATE?c!""}</#if>,
				"foreignTaxCompliantIndicator":"${body.customer.X42304_CRS_COMPLIANT_IND!""}"
		},
		"regulatoryKYC":{
				"primaryKYCCondition":"${body.customer.M_CIF_KYC_INDICATOR!""}",
				"kycverifiedDate":<#if !body.customer.M_CIF_KYC_DATE_VERIFIED?has_content>null</#if><#if body.customer.M_CIF_KYC_DATE_VERIFIED?has_content>${body.customer.M_CIF_KYC_DATE_VERIFIED?c!""}</#if>,
				"kycrefreshReviewIndicator":"${body.customer.X42304_REVIEW_IND!""}",
				"kycrefreshReviewDate":<#if !body.customer.X42304_REFRESH_DTE?has_content>null</#if><#if body.customer.X42304_REFRESH_DTE?has_content>${body.customer.X42304_REFRESH_DTE?c!""}</#if>,
				"kycrefreshCompliantIndicator":"${body.customer.X42304_REF_COMPL_IND!""}",
				"addressVerifiedIndicator":"${body.customer.M_CIF_ADDRESS_VERIFIED!""}",
				"identificationVerifiedIndicator":"${body.customer.M_CIF_IDENTITY_VERIFIED!""}"
		},
		"foreignTaxIdentification": [],
		"partyFunds": []
    }
}