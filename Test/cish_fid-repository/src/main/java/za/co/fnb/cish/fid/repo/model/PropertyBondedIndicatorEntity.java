package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "property_bonded_indicator")
public class PropertyBondedIndicatorEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String propBndSrcTpCd;
    private String propBndSrcTpDesc;
    private String tblNme;
    private Integer propBndEntpsTpCd;
    private String propBndEntpsTpDesc;
    private String propBndSrcEfctvDte;
    private String propBndSrcExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_bonded_indicator_id_seq")
    @SequenceGenerator(name = "property_bonded_indicator_id_seq", sequenceName = "property_bonded_indicator_id_seq", allocationSize = 1)
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
    @Column(name = "prop_bnd_src_tp_cd")
    public String getPropBndSrcTpCd() {
        return propBndSrcTpCd;
    }

    public void setPropBndSrcTpCd(String propBndSrcTpCd) {
        this.propBndSrcTpCd = propBndSrcTpCd;
    }

    @Basic
    @Column(name = "prop_bnd_src_tp_desc")
    public String getPropBndSrcTpDesc() {
        return propBndSrcTpDesc;
    }

    public void setPropBndSrcTpDesc(String propBndSrcTpDesc) {
        this.propBndSrcTpDesc = propBndSrcTpDesc;
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
    @Column(name = "prop_bnd_entps_tp_cd")
    public Integer getPropBndEntpsTpCd() {
        return propBndEntpsTpCd;
    }

    public void setPropBndEntpsTpCd(Integer propBndEntpsTpCd) {
        this.propBndEntpsTpCd = propBndEntpsTpCd;
    }

    @Basic
    @Column(name = "prop_bnd_entps_tp_desc")
    public String getPropBndEntpsTpDesc() {
        return propBndEntpsTpDesc;
    }

    public void setPropBndEntpsTpDesc(String propBndEntpsTpDesc) {
        this.propBndEntpsTpDesc = propBndEntpsTpDesc;
    }

    @Basic
    @Column(name = "prop_bnd_src_efctv_dte")
    public String getPropBndSrcEfctvDte() {
        return propBndSrcEfctvDte;
    }

    public void setPropBndSrcEfctvDte(String propBndSrcEfctvDte) {
        this.propBndSrcEfctvDte = propBndSrcEfctvDte;
    }

    @Basic
    @Column(name = "prop_bnd_src_expry_dte")
    public String getPropBndSrcExpryDte() {
        return propBndSrcExpryDte;
    }

    public void setPropBndSrcExpryDte(String propBndSrcExpryDte) {
        this.propBndSrcExpryDte = propBndSrcExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyBondedIndicatorEntity that = (PropertyBondedIndicatorEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(propBndSrcTpCd, that.propBndSrcTpCd) && Objects.equals(propBndSrcTpDesc, that.propBndSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(propBndEntpsTpCd, that.propBndEntpsTpCd) && Objects.equals(propBndEntpsTpDesc, that.propBndEntpsTpDesc) && Objects.equals(propBndSrcEfctvDte, that.propBndSrcEfctvDte) && Objects.equals(propBndSrcExpryDte, that.propBndSrcExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, propBndSrcTpCd, propBndSrcTpDesc, tblNme, propBndEntpsTpCd, propBndEntpsTpDesc, propBndSrcEfctvDte, propBndSrcExpryDte);
    }
}
