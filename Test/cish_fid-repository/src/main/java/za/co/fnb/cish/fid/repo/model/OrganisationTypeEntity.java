package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "organisation_type")
public class OrganisationTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String orgSrcTpCd;
    private String orgSrcTpDesc;
    private String tblNme;
    private Integer orgEntpsTpCd;
    private String orgTpDesc;
    private Integer orgCatTpCd;
    private String orgTpEfctvDt;
    private String orgTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_type_id_seq")
    @SequenceGenerator(name = "organisation_type_id_seq", sequenceName = "organisation_type_id_seq", allocationSize = 1)
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
    @Column(name = "org_src_tp_cd")
    public String getOrgSrcTpCd() {
        return orgSrcTpCd;
    }

    public void setOrgSrcTpCd(String orgSrcTpCd) {
        this.orgSrcTpCd = orgSrcTpCd;
    }

    @Basic
    @Column(name = "org_src_tp_desc")
    public String getOrgSrcTpDesc() {
        return orgSrcTpDesc;
    }

    public void setOrgSrcTpDesc(String orgSrcTpDesc) {
        this.orgSrcTpDesc = orgSrcTpDesc;
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
    @Column(name = "org_entps_tp_cd")
    public Integer getOrgEntpsTpCd() {
        return orgEntpsTpCd;
    }

    public void setOrgEntpsTpCd(Integer orgEntpsTpCd) {
        this.orgEntpsTpCd = orgEntpsTpCd;
    }

    @Basic
    @Column(name = "org_tp_desc")
    public String getOrgTpDesc() {
        return orgTpDesc;
    }

    public void setOrgTpDesc(String orgTpDesc) {
        this.orgTpDesc = orgTpDesc;
    }




    @Basic
    @Column(name = "org_tp_efctv_dt")
    public String getOrgTpEfctvDt() {
        return orgTpEfctvDt;
    }

    public void setOrgTpEfctvDt(String orgTpEfctvDt) {
        this.orgTpEfctvDt = orgTpEfctvDt;
    }

    @Basic
    @Column(name = "org_tp_expry_dt")
    public String getOrgTpExpryDt() {
        return orgTpExpryDt;
    }

    public void setOrgTpExpryDt(String orgTpExpryDt) {
        this.orgTpExpryDt = orgTpExpryDt;
    }

    @Basic
    @Column(name = "org_cat_tp_cd")
    public Integer getOrgCatTpCd() {
        return orgCatTpCd;
    }

    public void setOrgCatTpCd(Integer orgCatTpCd) {
        this.orgCatTpCd = orgCatTpCd;
    }

}
