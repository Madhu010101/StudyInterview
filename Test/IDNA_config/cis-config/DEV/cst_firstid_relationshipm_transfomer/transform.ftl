{
"eventUUID": "${body.eventHeader.eventUUID!""}",
"eventHeader":{
"eventUUID": "${body.eventHeader.eventUUID!""}",
"eventAction": "${body.eventHeader.eventAction!""}",
"eventArchContext": "${body.eventHeader.eventArchContext!""}",
"eventUUID": "${body.eventHeader.eventUUID!""}",
"eventDateTime": "${body.eventHeader.eventDateTime!""}",
"sourceSystemCode": "${body.eventHeader.sourceSystemCode!""}",
"eventOrigins":[
<#assign eventOriginList = body.eventHeader.eventOrigins>
<#list eventOriginList as eventOrigin>{
    "eventOriginType": "topic",
    "eventOriginName": "za.dev.raw.opm.ormdb.partytopartyrelationship.1"
    }<#sep>,</#list>],
"correlations":[
<#assign correlationList = body.eventHeader.correlations>
<#list correlationList as correlation>{
    "correlationName": <#if !correlation.correlationName?has_content>null</#if><#if correlation.correlationName?has_content>"${correlation.correlationName!""}"</#if>,
    "correlationValue": <#if !correlation.correlationValue?has_content>null</#if><#if correlation.correlationValue?has_content>"${correlation.correlationValue!""}"</#if>
    }<#sep>,</#list>]
}
"key":{
"partyUniqueNumber": "${body.key.partyUniqueNumber!""}"
}
"relationship":{
"relatedPartyUniqueNumber": "${body.relationship.relatedPartyUniqueNumber!""}",
"relationshipEndDate": "<#if !body.relationship.relationshipEndDate?has_content>null</#if><#if body.relationship.relationshipEndDate?has_content>${body.relationship.relationshipEndDate!""}</#if>,
"relationshipEntpsTypeCode": ${body.relationship.relationshipEntpsTypeCode!""}",
"relationshipStartDate": "<#if !body.relationship.relationshipStartDate?has_content>.now</#if><#if body.relationship.relationshipStartDate?has_content>${body.relationship.relationshipEndDate!""}</#if>,
<#assign attributesList = body.relationship.attributes>
<#list attributesList as attributes>{
    "attributeEndDate": "<#if !body.relationship.attributes.attributeEndDate?has_content>.now</#if><#if body.relationship.attributes.attributeEndDate?has_content>${body.relationship.attributes.attributeEndDate!"}</#if>,
    "attributeEntpsTypeCode": "<#if !body.relationship.attributes.attributeEntpsTypeCode?has_content>null</#if><#if body.relationship.attributes.attributeEntpsTypeCode?has_content>${body.relationship.attributes.attributeEntpsTypeCode!"}</#if>,
	"attributeStartDate": "<#if !body.relationship.attributes.attributeStartDate?has_content>null</#if><#if body.relationship.attributes.attributeStartDate?has_content>${body.relationship.attributes.attributeStartDate!"}</#if>,
	"attributeValue":  "<#if !body.relationship.attributes.attributeValue?has_content>null</#if><#if body.relationship.attributes.attributeValue?has_content>${body.relationship.attributes.attributeValue!"}</#if>
    }<#sep>,</#list>],
}
}