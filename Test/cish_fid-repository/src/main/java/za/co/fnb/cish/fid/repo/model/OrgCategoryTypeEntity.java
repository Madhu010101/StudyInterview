package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "org_category_type")
public class OrgCategoryTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String orgCatSrcTpCd;
    private String orgCatSrcTpDesc;
    private String orgCatSrcAttrbtNm;
    private String tblNme;
    private Integer orgCatEntpsTpCd;
    private String orgCatEntpsTpDesc;
    private String orgCatEfctvDt;
    private String orgCatExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "org_category_type_id_seq")
    @SequenceGenerator(name = "org_category_type_id_seq", sequenceName = "org_category_type_id_seq", allocationSize = 1)
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
    public String getSrcTblNo() {
        return srcTblNo;
    }

    public void setSrcTblNo(String srcTblNo) {
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
    @Column(name = "org_cat_src_tp_cd")
    public String getOrgCatSrcTpCd() {
        return orgCatSrcTpCd;
    }

    public void setOrgCatSrcTpCd(String orgCatSrcTpCd) {
        this.orgCatSrcTpCd = orgCatSrcTpCd;
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
    @Column(name = "org_cat_src_tp_desc")
    public String getOrgCatSrcTpDesc() {
        return orgCatSrcTpDesc;
    }

    public void setOrgCatSrcTpDesc(String orgCatSrcTpDesc) {
        this.orgCatSrcTpDesc = orgCatSrcTpDesc;
    }

    @Basic
    @Column(name = "org_cat_src_attrbt_nm")
    public String getOrgCatSrcAttrbtNm() {
        return orgCatSrcAttrbtNm;
    }

    public void setOrgCatSrcAttrbtNm(String orgCatSrcAttrbtNm) {
        this.orgCatSrcAttrbtNm = orgCatSrcAttrbtNm;
    }

    @Basic
    @Column(name = "org_cat_entps_tp_cd")
    public Integer getOrgCatEntpsTpCd() {
        return orgCatEntpsTpCd;
    }

    public void setOrgCatEntpsTpCd(Integer orgCatEntpsTpCd) {
        this.orgCatEntpsTpCd = orgCatEntpsTpCd;
    }

    @Basic
    @Column(name = "org_cat_entps_tp_desc")
    public String getOrgCatEntpsTpDesc() {
        return orgCatEntpsTpDesc;
    }

    public void setOrgCatEntpsTpDesc(String orgCatEntpsTpDesc) {
        this.orgCatEntpsTpDesc = orgCatEntpsTpDesc;
    }

    @Basic
    @Column(name = "org_cat_efctv_dt")
    public String getOrgCatEfctvDt() {
        return orgCatEfctvDt;
    }

    public void setOrgCatEfctvDt(String orgCatEfctvDt) {
        this.orgCatEfctvDt = orgCatEfctvDt;
    }

    @Basic
    @Column(name = "org_cat_expry_dt")
    public String getOrgCatExpryDt() {
        return orgCatExpryDt;
    }

    public void setOrgCatExpryDt(String orgCatExpryDt) {
        this.orgCatExpryDt = orgCatExpryDt;
    }
}