package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "foreign_tax_identity_status_type")
public class ForeignTaxIdentityStatusTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer idfctnSttsSrcTpCd;
    private String idfctnSttsSrcTpDesc;
    private Integer idfctnSttsEntpsTpCd;
    private String idfctnSttsTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foreign_tax_identity_status_type_id_seq")
    @SequenceGenerator(name = "foreign_tax_identity_status_type_id_seq", sequenceName = "foreign_tax_identity_status_type_id_seq", allocationSize = 1)
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
    @Column(name = "idfctn_stts_src_tp_cd")
    public Integer getIdfctnSttsSrcTpCd() {
        return idfctnSttsSrcTpCd;
    }

    public void setIdfctnSttsSrcTpCd(Integer idfctnSttsSrcTpCd) {
        this.idfctnSttsSrcTpCd = idfctnSttsSrcTpCd;
    }

    @Basic
    @Column(name = "idfctn_stts_src_tp_desc")
    public String getIdfctnSttsSrcTpDesc() {
        return idfctnSttsSrcTpDesc;
    }

    public void setIdfctnSttsSrcTpDesc(String idfctnSttsSrcTpDesc) {
        this.idfctnSttsSrcTpDesc = idfctnSttsSrcTpDesc;
    }

    @Basic
    @Column(name = "idfctn_stts_entps_tp_cd")
    public Integer getIdfctnSttsEntpsTpCd() {
        return idfctnSttsEntpsTpCd;
    }

    public void setIdfctnSttsEntpsTpCd(Integer idfctnSttsEntpsTpCd) {
        this.idfctnSttsEntpsTpCd = idfctnSttsEntpsTpCd;
    }

    @Basic
    @Column(name = "idfctn_stts_tp_desc")
    public String getIdfctnSttsTpDesc() {
        return idfctnSttsTpDesc;
    }

    public void setIdfctnSttsTpDesc(String idfctnSttsTpDesc) {
        this.idfctnSttsTpDesc = idfctnSttsTpDesc;
    }

    @Basic
    @Column(name = "eff_dte")
    public String getEffDte() {
        return effDte;
    }

    public void setEffDte(String effDte) {
        this.effDte = effDte;
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
        ForeignTaxIdentityStatusTypeEntity that = (ForeignTaxIdentityStatusTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(idfctnSttsSrcTpCd, that.idfctnSttsSrcTpCd) &&
                Objects.equals(idfctnSttsSrcTpDesc, that.idfctnSttsSrcTpDesc) &&
                Objects.equals(idfctnSttsEntpsTpCd, that.idfctnSttsEntpsTpCd) &&
                Objects.equals(idfctnSttsTpDesc, that.idfctnSttsTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, idfctnSttsSrcTpCd, idfctnSttsSrcTpDesc, idfctnSttsEntpsTpCd, idfctnSttsTpDesc, effDte, expDte);
    }
}
