package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "property_ownership_type")
public class PropertyOwnershipTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String propOwnrshpSrcTpCd;
    private String propOwnrshpSrcTpDesc;
    private String tblNme;
    private Integer propOwnrshpEntpsTpCd;
    private String propOwnrshpEntpsTpDec;
    private String propOwnrshpEfctvDte;
    private String propOwnrshpExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_ownership_type_id_seq")
    @SequenceGenerator(name = "property_ownership_type_id_seq", sequenceName = "property_ownership_type_id_seq", allocationSize = 1)
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
    @Column(name = "prop_ownrshp_src_tp_cd")
    public String getPropOwnrshpSrcTpCd() {
        return propOwnrshpSrcTpCd;
    }

    public void setPropOwnrshpSrcTpCd(String propOwnrshpSrcTpCd) {
        this.propOwnrshpSrcTpCd = propOwnrshpSrcTpCd;
    }

    @Basic
    @Column(name = "prop_ownrshp_src_tp_desc")
    public String getPropOwnrshpSrcTpDesc() {
        return propOwnrshpSrcTpDesc;
    }

    public void setPropOwnrshpSrcTpDesc(String propOwnrshpSrcTpDesc) {
        this.propOwnrshpSrcTpDesc = propOwnrshpSrcTpDesc;
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
    @Column(name = "prop_ownrshp_entps_tp_cd")
    public Integer getPropOwnrshpEntpsTpCd() {
        return propOwnrshpEntpsTpCd;
    }

    public void setPropOwnrshpEntpsTpCd(Integer propOwnrshpEntpsTpCd) {
        this.propOwnrshpEntpsTpCd = propOwnrshpEntpsTpCd;
    }

    @Basic
    @Column(name = "prop_ownrshp_entps_tp_dec")
    public String getPropOwnrshpEntpsTpDec() {
        return propOwnrshpEntpsTpDec;
    }

    public void setPropOwnrshpEntpsTpDec(String propOwnrshpEntpsTpDec) {
        this.propOwnrshpEntpsTpDec = propOwnrshpEntpsTpDec;
    }

    @Basic
    @Column(name = "prop_ownrshp_efctv_dte")
    public String getPropOwnrshpEfctvDte() {
        return propOwnrshpEfctvDte;
    }

    public void setPropOwnrshpEfctvDte(String propOwnrshpEfctvDte) {
        this.propOwnrshpEfctvDte = propOwnrshpEfctvDte;
    }

    @Basic
    @Column(name = "prop_ownrshp_expry_dte")
    public String getPropOwnrshpExpryDte() {
        return propOwnrshpExpryDte;
    }

    public void setPropOwnrshpExpryDte(String propOwnrshpExpryDte) {
        this.propOwnrshpExpryDte = propOwnrshpExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyOwnershipTypeEntity that = (PropertyOwnershipTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(propOwnrshpSrcTpCd, that.propOwnrshpSrcTpCd) && Objects.equals(propOwnrshpSrcTpDesc, that.propOwnrshpSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(propOwnrshpEntpsTpCd, that.propOwnrshpEntpsTpCd) && Objects.equals(propOwnrshpEntpsTpDec, that.propOwnrshpEntpsTpDec) && Objects.equals(propOwnrshpEfctvDte, that.propOwnrshpEfctvDte) && Objects.equals(propOwnrshpExpryDte, that.propOwnrshpExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, propOwnrshpSrcTpCd, propOwnrshpSrcTpDesc, tblNme, propOwnrshpEntpsTpCd, propOwnrshpEntpsTpDec, propOwnrshpEfctvDte, propOwnrshpExpryDte);
    }
}
