package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_type")
public class LocationTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String locSrcTpCd;
    private String locSrcTpDesc;
    private String tblNme;
    private Integer locEntpsTpCd;
    private String locEntpsTpDesc;
    private String locTpEfctvDte;
    private String locTpExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_type_id_seq")
    @SequenceGenerator(name = "location_type_id_seq", sequenceName = "location_type_id_seq", allocationSize = 1)
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
    @Column(name = "loc_src_tp_cd")
    public String getLocSrcTpCd() {
        return locSrcTpCd;
    }

    public void setLocSrcTpCd(String locSrcTpCd) {
        this.locSrcTpCd = locSrcTpCd;
    }

    @Basic
    @Column(name = "loc_src_tp_desc")
    public String getLocSrcTpDesc() {
        return locSrcTpDesc;
    }

    public void setLocSrcTpDesc(String locSrcTpDesc) {
        this.locSrcTpDesc = locSrcTpDesc;
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
    @Column(name = "loc_entps_tp_cd")
    public Integer getLocEntpsTpCd() {
        return locEntpsTpCd;
    }

    public void setLocEntpsTpCd(Integer locEntpsTpCd) {
        this.locEntpsTpCd = locEntpsTpCd;
    }

    @Basic
    @Column(name = "loc_entps_tp_desc")
    public String getLocEntpsTpDesc() {
        return locEntpsTpDesc;
    }

    public void setLocEntpsTpDesc(String locEntpsTpDesc) {
        this.locEntpsTpDesc = locEntpsTpDesc;
    }

    @Basic
    @Column(name = "loc_tp_efctv_dte")
    public String getLocTpEfctvDte() {
        return locTpEfctvDte;
    }

    public void setLocTpEfctvDte(String locTpEfctvDte) {
        this.locTpEfctvDte = locTpEfctvDte;
    }

    @Basic
    @Column(name = "loc_tp_expry_dte")
    public String getLocTpExpryDte() {
        return locTpExpryDte;
    }

    public void setLocTpExpryDte(String locTpExpryDte) {
        this.locTpExpryDte = locTpExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationTypeEntity that = (LocationTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(locSrcTpCd, that.locSrcTpCd) && Objects.equals(locSrcTpDesc, that.locSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(locEntpsTpCd, that.locEntpsTpCd) && Objects.equals(locEntpsTpDesc, that.locEntpsTpDesc) && Objects.equals(locTpEfctvDte, that.locTpEfctvDte) && Objects.equals(locTpExpryDte, that.locTpExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, locSrcTpCd, locSrcTpDesc, tblNme, locEntpsTpCd, locEntpsTpDesc, locTpEfctvDte, locTpExpryDte);
    }
}
