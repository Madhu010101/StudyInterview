package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Party {
    @JsonProperty
    private Container container;
    @JsonProperty
    private String conversationLanguageEntpsTypeCode;
    @JsonProperty
    private String correspondenceLanguageEntpsTypeCode;
    @JsonProperty
    private String homeLanguageEntpsTypeCode;
    @JsonProperty
    private List<Identification> identifications;
    @JsonProperty
    private List<Identifier> identifiers;
    @JsonProperty
    private Individual individual;
    @JsonProperty
    private List<Location> locations;
    @JsonProperty
    private String name;
    @JsonProperty
    private Organisation organisation;
    @JsonProperty
    private String partyCreatedDate;
    @JsonProperty
    private String partyEntpsTypeCode;
    @JsonProperty
    private String partyStatusDate;
    @JsonProperty
    private String partyStatusEntpsTypeCode;
    @JsonProperty
    private String profileRegistrationName;
    @JsonProperty
    private List<SourceOfFunds> sourcesOfFunds;
    @JsonProperty
    private List<TakeOnAttribute> takeOnAttributes;

    @JsonProperty
    private List<PartyClassification> partyClassifications;

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public String getConversationLanguageEntpsTypeCode() {
        return conversationLanguageEntpsTypeCode;
    }

    public void setConversationLanguageEntpsTypeCode(String conversationLanguageEntpsTypeCode) {
        this.conversationLanguageEntpsTypeCode = conversationLanguageEntpsTypeCode;
    }

    public String getCorrespondenceLanguageEntpsTypeCode() {
        return correspondenceLanguageEntpsTypeCode;
    }

    public void setCorrespondenceLanguageEntpsTypeCode(String correspondenceLanguageEntpsTypeCode) {
        this.correspondenceLanguageEntpsTypeCode = correspondenceLanguageEntpsTypeCode;
    }

    public String getHomeLanguageEntpsTypeCode() {
        return homeLanguageEntpsTypeCode;
    }

    public void setHomeLanguageEntpsTypeCode(String homeLanguageEntpsTypeCode) {
        this.homeLanguageEntpsTypeCode = homeLanguageEntpsTypeCode;
    }

    public List<Identification> getIdentifications() {
        return identifications;
    }

    public void setIdentifications(List<Identification> identifications) {
        this.identifications = identifications;
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public String getPartyCreatedDate() {
        return partyCreatedDate;
    }

    public void setPartyCreatedDate(String partyCreatedDate) {
        this.partyCreatedDate = partyCreatedDate;
    }

    public String getPartyEntpsTypeCode() {
        return partyEntpsTypeCode;
    }

    public void setPartyEntpsTypeCode(String partyEntpsTypeCode) {
        this.partyEntpsTypeCode = partyEntpsTypeCode;
    }

    public String getPartyStatusDate() {
        return partyStatusDate;
    }

    public void setPartyStatusDate(String partyStatusDate) {
        this.partyStatusDate = partyStatusDate;
    }

    public String getPartyStatusEntpsTypeCode() {
        return partyStatusEntpsTypeCode;
    }

    public void setPartyStatusEntpsTypeCode(String partyStatusEntpsTypeCode) {
        this.partyStatusEntpsTypeCode = partyStatusEntpsTypeCode;
    }

    public String getProfileRegistrationName() {
        return profileRegistrationName;
    }

    public void setProfileRegistrationName(String profileRegistrationName) {
        this.profileRegistrationName = profileRegistrationName;
    }

    public List<SourceOfFunds> getSourcesOfFunds() {
        return sourcesOfFunds;
    }

    public void setSourcesOfFunds(List<SourceOfFunds> sourcesOfFunds) {
        this.sourcesOfFunds = sourcesOfFunds;
    }

    public List<TakeOnAttribute> getTakeOnAttributes() {
        return takeOnAttributes;
    }

    public void setTakeOnAttributes(List<TakeOnAttribute> takeOnAttributes) {
        this.takeOnAttributes = takeOnAttributes;
    }

    public List<PartyClassification> getPartyClassification() {
        return partyClassifications;
    }

    public void setPartyClassification(List<PartyClassification> partyClassification) {
        this.partyClassifications = partyClassification;
    }
}
