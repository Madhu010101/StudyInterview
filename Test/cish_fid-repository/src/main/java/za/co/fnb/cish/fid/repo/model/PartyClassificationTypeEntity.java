package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "party_classification_type")
public class PartyClassificationTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partyClassSrcTpCd;
    private String partyClassSrcTpDesc;
    private String partyClassSrcAttrbtNm;
    private String tblNme;
    private Integer partyClassEntpsTpCd;
    private String partyClassEntpsTpDesc;
    private String partyClassTpAttrbtNm;
    private String partyClassEfctvDt;
    private String partyClassExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_classification_type_id_seq")
    @SequenceGenerator(name = "party_classification_type_id_seq", sequenceName = "party_classification_type_id_seq", allocationSize = 1)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stm_tp_cd")
    public String getStmTpCd() {
        return stmTpCd;
    }

    public void setStmTpCd(String stmTpCd) {
        this.stmTpCd = stmTpCd;
    }

    @Basic
    @Column(name = "cmpny_tp_cd")
    public Integer getCmpnyTpCd() {
        return cmpnyTpCd;
    }

    public void setCmpnyTpCd(Integer cmpnyTpCd) {
        this.cmpnyTpCd = cmpnyTpCd;
    }

    @Basic
    @Column(name = "src_tbl_no")
    public Integer getSrcTblNo() {
        return srcTblNo;
    }

    public void setSrcTblNo(Integer srcTblNo) {
        this.srcTblNo = srcTblNo;
    }

    @Basic
    @Column(name = "src_tbl_nme")
    public String getSrcTblNme() {
        return srcTblNme;
    }

    public void setSrcTblNme(String srcTblNme) {
        this.srcTblNme = srcTblNme;
    }

    @Basic
    @Column(name = "src_cat")
    public String getSrcCat() {
        return srcCat;
    }

    public void setSrcCat(String srcCat) {
        this.srcCat = srcCat;
    }

    @Basic
    @Column(name = "party_class_src_tp_cd")
    public String getPartyClassSrcTpCd() {
        return partyClassSrcTpCd;
    }

    public void setPartyClassSrcTpCd(String partyClassSrcTpCd) {
        this.partyClassSrcTpCd = partyClassSrcTpCd;
    }

    @Basic
    @Column(name = "tbl_nme")
    public String getTblNme() {
        return tblNme;
    }

    public void setTblNme(String tblNme) {
        this.tblNme = tblNme;
    }

    @Basic
    @Column(name = "party_class_src_tp_desc")
    public String getPartyClassSrcTpDesc() {
        return partyClassSrcTpDesc;
    }

    public void setPartyClassSrcTpDesc(String partyClassSrcTpDesc) {
        this.partyClassSrcTpDesc = partyClassSrcTpDesc;
    }

    @Basic
    @Column(name = "party_class_src_attrbt_nm")
    public String getPartyClassSrcAttrbtNm() {
        return partyClassSrcAttrbtNm;
    }

    public void setPartyClassSrcAttrbtNm(String partyClassSrcAttrbtNm) {
        this.partyClassSrcAttrbtNm = partyClassSrcAttrbtNm;
    }

    @Basic
    @Column(name = "party_class_entps_tp_cd")
    public Integer getPartyClassEntpsTpCd() {
        return partyClassEntpsTpCd;
    }

    public void setPartyClassEntpsTpCd(Integer partyClassEntpsTpCd) {
        this.partyClassEntpsTpCd = partyClassEntpsTpCd;
    }

    @Basic
    @Column(name = "party_class_entps_tp_desc")
    public String getPartyClassEntpsTpDesc() {
        return partyClassEntpsTpDesc;
    }

    public void setPartyClassEntpsTpDesc(String partyClassEntpsTpDesc) {
        this.partyClassEntpsTpDesc = partyClassEntpsTpDesc;
    }

    @Basic
    @Column(name = "party_class_tp_attrbt_nm")
    public String getPartyClassTpAttrbtNm() {
        return partyClassTpAttrbtNm;
    }

    public void setPartyClassTpAttrbtNm(String partyClassTpAttrbtNm) {
        this.partyClassTpAttrbtNm = partyClassTpAttrbtNm;
    }

    @Basic
    @Column(name = "party_class_efctv_dt")
    public String getPartyClassEfctvDt() {
        return partyClassEfctvDt;
    }

    public void setPartyClassEfctvDt(String partyClassEfctvDt) {
        this.partyClassEfctvDt = partyClassEfctvDt;
    }

    @Basic
    @Column(name = "party_class_expry_dt")
    public String getPartyClassExpryDt() {
        return partyClassExpryDt;
    }

    public void setPartyClassExpryDt(String partyClassExpryDt) {
        this.partyClassExpryDt = partyClassExpryDt;
    }
}