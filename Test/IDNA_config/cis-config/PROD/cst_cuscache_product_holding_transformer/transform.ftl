{
"eventHeader":{
    "sourceSystemCode": "${body.EventHeader.sourceSystemCode!""}",
    "eventDateTime": "${body.EventHeader.eventDateTime!""}",
    "eventAction": "${body.EventHeader.eventAction!""}",
    "eventArchContext": "${body.EventHeader.eventArchContext!""}",
    "eventUUID": "${body.EventHeader.eventUUID!""}",
    "eventOrigin":[],
    "correlation":[]
},
"key": {
        "customerCompanyTypeCode": ${body.Key.M_CIF_CUST_NO_COID_N!""},
        "customerUniqueNumber": ${body.Key.M_CIF_CUST_NO?c!""},
		"accountProductTypeCode": "${body.Key.M_CIF_CUST_TO_ACT_PRDCT!""}",
		"accountHistoryIndicator": "${body.Key.accountHistoryIndicator!""}",
		"accountNumber": "${body.Key.M_CIF_CUST_TO_ACT_ACT_ID!""}"
      },
"customerAccountRelationship": {
       "relationshipTypeCode":"${body.CustomerAccountRelationship.M_CIF_CUST_TO_ACT_REL_CODE!""}",
       "primaryOwnerIndicator":"${body.CustomerAccountRelationship.M_CIF_CUST_TO_ACT_PRIM_IND!""}"
    }
}