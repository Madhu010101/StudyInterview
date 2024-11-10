package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "foreign_tax_identity_class_type")
public class ForeignTaxIdentityClassTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer idfctnClassSrcTpCd;
    private String idfctnClassSrcTpDesc;
    private Integer idfctnClassEntpsTpCd;
    private String idfctnClassTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foreign_tax_identity_class_type_id_seq")
    @SequenceGenerator(name = "foreign_tax_identity_class_type_id_seq", sequenceName = "foreign_tax_identity_class_type_id_seq", allocationSize = 1)
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
    @Column(name = "idfctn_class_src_tp_cd")
    public Integer getIdfctnClassSrcTpCd() {
        return idfctnClassSrcTpCd;
    }

    public void setIdfctnClassSrcTpCd(Integer idfctnClassSrcTpCd) {
        this.idfctnClassSrcTpCd = idfctnClassSrcTpCd;
    }

    @Basic
    @Column(name = "idfctn_class_src_tp_desc")
    public String getIdfctnClassSrcTpDesc() {
        return idfctnClassSrcTpDesc;
    }

    public void setIdfctnClassSrcTpDesc(String idfctnClassSrcTpDesc) {
        this.idfctnClassSrcTpDesc = idfctnClassSrcTpDesc;
    }

    @Basic
    @Column(name = "idfctn_class_entps_tp_cd")
    public Integer getIdfctnClassEntpsTpCd() {
        return idfctnClassEntpsTpCd;
    }

    public void setIdfctnClassEntpsTpCd(Integer idfctnClassEntpsTpCd) {
        this.idfctnClassEntpsTpCd = idfctnClassEntpsTpCd;
    }

    @Basic
    @Column(name = "idfctn_class_tp_desc")
    public String getIdfctnClassTpDesc() {
        return idfctnClassTpDesc;
    }

    public void setIdfctnClassTpDesc(String idfctnClassTpDesc) {
        this.idfctnClassTpDesc = idfctnClassTpDesc;
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
        ForeignTaxIdentityClassTypeEntity that = (ForeignTaxIdentityClassTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(idfctnClassSrcTpCd, that.idfctnClassSrcTpCd) &&
                Objects.equals(idfctnClassSrcTpDesc, that.idfctnClassSrcTpDesc) &&
                Objects.equals(idfctnClassEntpsTpCd, that.idfctnClassEntpsTpCd) &&
                Objects.equals(idfctnClassTpDesc, that.idfctnClassTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, idfctnClassSrcTpCd, idfctnClassSrcTpDesc, idfctnClassEntpsTpCd, idfctnClassTpDesc, effDte, expDte);
    }
}
