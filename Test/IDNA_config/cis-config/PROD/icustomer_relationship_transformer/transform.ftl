{
"eventHeader":{
    "eventDateTime": "${body.A_TIMSTAMP!""}",
    "eventAction": "${body.A_ENTTYP!""}",
    "eventOrigin":{
	"eventOriginType": "${body.A_CCID!""}",
    "eventOriginName": "${body.A_CCID!""}"
	},
    "correlation":{
	"correlationName": "${body.A_CCID!""}",
    "correlationValue": "${body.A_CCID!""}"
	}
},
"partyToPartyRelationshipKey": {
        "partyCompanyTypeCode": ${body.afterImage.Y95746_CONTAINER_COID_N?c},
        "partyUniqueNumber": ${body.afterImage.Y95746_CONTAINER_ID?c},
		"relatedPartyCompanyTypeCode": ${body.afterImage.Y95749_CNCU_NO_COID_N?c},
		"relatedPartyUniqueNumber": ${body.afterImage.Y95749_CONT_CUST_ID?c},
		"partyToPartyRelationshipTypeCode": "${body.afterImage.Y95749_CONT_CUST_REL!""}",
		"partyToPartyRelationshipCategoryTypeCode": "${body.afterImage.Y95749_CONT_CUST_REL!""}",
		"partyToPartyRelationshipStatusTypeCode": "${body.afterImage.Y95749_CONTAINER_REL_STATUS!""}"
      },

"partyToPartyRelationshipDetail": {
	"partyToPartyRelationshipStatusTypeCode": "${body.afterImage.Y95749_CONTAINER_REL_STATUS!""}"
}

}
