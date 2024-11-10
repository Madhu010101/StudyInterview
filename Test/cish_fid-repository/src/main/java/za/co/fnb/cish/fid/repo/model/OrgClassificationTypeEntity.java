package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "org_classification_type")
public class OrgClassificationTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String orgClassSrcTpCd;
    private String orgClassSrcTpDesc;
    private String orgClassSrcAttrbtNm;
    private String tblNme;
    private Integer orgClassEntpsTpCd;
    private String orgClassEntpsTpDesc;
    private String orgClassTpAttrbtNm;
    private String orgClassEfctvDt;
    private String orgClassExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "org_classification_type_id_seq")
    @SequenceGenerator(name = "org_classification_type_id_seq", sequenceName = "org_classification_type_id_seq", allocationSize = 1)
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
    @Column(name = "org_class_src_tp_cd")
    public String getOrgClassSrcTpCd() {
        return orgClassSrcTpCd;
    }

    public void setOrgClassSrcTpCd(String orgClassSrcTpCd) {
        this.orgClassSrcTpCd = orgClassSrcTpCd;
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
    @Column(name = "org_class_src_tp_desc")
    public String getOrgClassSrcTpDesc() {
        return orgClassSrcTpDesc;
    }

    public void setOrgClassSrcTpDesc(String orgClassSrcTpDesc) {
        this.orgClassSrcTpDesc = orgClassSrcTpDesc;
    }

    @Basic
    @Column(name = "org_class_src_attrbt_nm")
    public String getOrgClassSrcAttrbtNm() {
        return orgClassSrcAttrbtNm;
    }

    public void setOrgClassSrcAttrbtNm(String orgClassSrcAttrbtNm) {
        this.orgClassSrcAttrbtNm = orgClassSrcAttrbtNm;
    }

    @Basic
    @Column(name = "org_class_entps_tp_cd")
    public Integer getOrgClassEntpsTpCd() {
        return orgClassEntpsTpCd;
    }

    public void setOrgClassEntpsTpCd(Integer orgClassEntpsTpCd) {
        this.orgClassEntpsTpCd = orgClassEntpsTpCd;
    }

    @Basic
    @Column(name = "org_class_entps_tp_desc")
    public String getOrgClassEntpsTpDesc() {
        return orgClassEntpsTpDesc;
    }

    public void setOrgClassEntpsTpDesc(String orgClassEntpsTpDesc) {
        this.orgClassEntpsTpDesc = orgClassEntpsTpDesc;
    }

    @Basic
    @Column(name = "org_class_tp_attrbt_nm")
    public String getOrgClassTpAttrbtNm() {
        return orgClassTpAttrbtNm;
    }

    public void setOrgClassTpAttrbtNm(String orgClassTpAttrbtNm) {
        this.orgClassTpAttrbtNm = orgClassTpAttrbtNm;
    }

    @Basic
    @Column(name = "org_class_efctv_dt")
    public String getOrgClassEfctvDt() {
        return orgClassEfctvDt;
    }

    public void setOrgClassEfctvDt(String orgClassEfctvDt) {
        this.orgClassEfctvDt = orgClassEfctvDt;
    }

    @Basic
    @Column(name = "org_class_expry_dt")
    public String getOrgClassExpryDt() {
        return orgClassExpryDt;
    }

    public void setOrgClassExpryDt(String orgClassExpryDt) {
        this.orgClassExpryDt = orgClassExpryDt;
    }
}
