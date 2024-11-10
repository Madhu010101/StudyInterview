package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jurisdiction")
public class JurisdictionEntity {
    private Long id;
    private String stmTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String jrsdctnSrcTpCd;
    private String jrsdctnSrcTpDesc;
    private String tblNme;
    private Integer jurisdictionId;
    private Integer compTpCd;
    private String cntryCd;
    private String jurisdictionTpDesc;
    private String effDt;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jurisdiction_id_seq")
    @SequenceGenerator(name = "jurisdiction_id_seq", sequenceName = "jurisdiction_id_seq", allocationSize = 1)
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
    @Column(name = "jrsdctn_src_tp_cd")
    public String getJrsdctnSrcTpCd() {
        return jrsdctnSrcTpCd;
    }

    public void setJrsdctnSrcTpCd(String jrsdctnSrcTpCd) {
        this.jrsdctnSrcTpCd = jrsdctnSrcTpCd;
    }

    @Basic
    @Column(name = "jrsdctn_src_tp_desc")
    public String getJrsdctnSrcTpDesc() {
        return jrsdctnSrcTpDesc;
    }

    public void setJrsdctnSrcTpDesc(String jrsdctnSrcTpDesc) {
        this.jrsdctnSrcTpDesc = jrsdctnSrcTpDesc;
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
    @Column(name = "jurisdiction_id")
    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    @Basic
    @Column(name = "comp_tp_cd")
    public Integer getCompTpCd() {
        return compTpCd;
    }

    public void setCompTpCd(Integer compTpCd) {
        this.compTpCd = compTpCd;
    }

    @Basic
    @Column(name = "cntry_cd")
    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    @Basic
    @Column(name = "jurisdiction_tp_desc")
    public String getJurisdictionTpDesc() {
        return jurisdictionTpDesc;
    }

    public void setJurisdictionTpDesc(String jurisdictionTpDesc) {
        this.jurisdictionTpDesc = jurisdictionTpDesc;
    }

    @Basic
    @Column(name = "eff_dt")
    public String getEffDt() {
        return effDt;
    }

    public void setEffDt(String effDt) {
        this.effDt = effDt;
    }

    @Basic
    @Column(name = "exp_dte")
    public String getExpDte() {
        return expDte;
    }

    public void setExpDte(String expDte) {
        this.expDte = expDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JurisdictionEntity that = (JurisdictionEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(jrsdctnSrcTpCd, that.jrsdctnSrcTpCd) && Objects.equals(jrsdctnSrcTpDesc, that.jrsdctnSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(jurisdictionId, that.jurisdictionId) && Objects.equals(compTpCd, that.compTpCd) && Objects.equals(cntryCd, that.cntryCd) && Objects.equals(jurisdictionTpDesc, that.jurisdictionTpDesc) && Objects.equals(effDt, that.effDt) && Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, jrsdctnSrcTpCd, jrsdctnSrcTpDesc, tblNme, jurisdictionId, compTpCd, cntryCd, jurisdictionTpDesc, effDt, expDte);
    }
}
