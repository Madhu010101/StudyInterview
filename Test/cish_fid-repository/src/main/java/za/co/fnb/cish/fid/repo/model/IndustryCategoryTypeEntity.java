package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "industry_category_type")
public class IndustryCategoryTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTlNme;
    private String srcCat;
    private String indstryCatSrcTpCd;
    private String indstryCatSrcTpDesc;
    private String tblNme;
    private Integer indstryCatEntpsTpCd;
    private String indstryCatEntpsTpDesc;
    private String indstryCatTpEfctvDt;
    private String indstryCatTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geo_address_type_id_seq")
    @SequenceGenerator(name = "geo_address_type_id_seq", sequenceName = "geo_address_type_id_seq", allocationSize = 1)
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
    @Column(name = "src_tl_nme")
    public String getSrcTlNme() {
        return srcTlNme;
    }

    public void setSrcTlNme(String srcTlNme) {
        this.srcTlNme = srcTlNme;
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
    @Column(name = "indstry_cat_src_tp_cd")
    public String getIndstryCatSrcTpCd() {
        return indstryCatSrcTpCd;
    }

    public void setIndstryCatSrcTpCd(String indstryCatSrcTpCd) {
        this.indstryCatSrcTpCd = indstryCatSrcTpCd;
    }

    @Basic
    @Column(name = "indstry_cat_src_tp_desc")
    public String getIndstryCatSrcTpDesc() {
        return indstryCatSrcTpDesc;
    }

    public void setIndstryCatSrcTpDesc(String indstryCatSrcTpDesc) {
        this.indstryCatSrcTpDesc = indstryCatSrcTpDesc;
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
    @Column(name = "indstry_cat_entps_tp_cd")
    public Integer getIndstryCatEntpsTpCd() {
        return indstryCatEntpsTpCd;
    }

    public void setIndstryCatEntpsTpCd(Integer indstryCatEntpsTpCd) {
        this.indstryCatEntpsTpCd = indstryCatEntpsTpCd;
    }

    @Basic
    @Column(name = "indstry_cat_entps_tp_desc")
    public String getIndstryCatEntpsTpDesc() {
        return indstryCatEntpsTpDesc;
    }

    public void setIndstryCatEntpsTpDesc(String indstryCatEntpsTpDesc) {
        this.indstryCatEntpsTpDesc = indstryCatEntpsTpDesc;
    }

    @Basic
    @Column(name = "indstry_cat_tp_efctv_dt")
    public String getIndstryCatTpEfctvDt() {
        return indstryCatTpEfctvDt;
    }

    public void setIndstryCatTpEfctvDt(String indstryCatTpEfctvDt) {
        this.indstryCatTpEfctvDt = indstryCatTpEfctvDt;
    }

    @Basic
    @Column(name = "indstry_cat_tp_expry_dt")
    public String getIndstryCatTpExpryDt() {
        return indstryCatTpExpryDt;
    }

    public void setIndstryCatTpExpryDt(String indstryCatTpExpryDt) {
        this.indstryCatTpExpryDt = indstryCatTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndustryCategoryTypeEntity that = (IndustryCategoryTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTlNme, that.srcTlNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(indstryCatSrcTpCd, that.indstryCatSrcTpCd) && Objects.equals(indstryCatSrcTpDesc, that.indstryCatSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(indstryCatEntpsTpCd, that.indstryCatEntpsTpCd) && Objects.equals(indstryCatEntpsTpDesc, that.indstryCatEntpsTpDesc) && Objects.equals(indstryCatTpEfctvDt, that.indstryCatTpEfctvDt) && Objects.equals(indstryCatTpExpryDt, that.indstryCatTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTlNme, srcCat, indstryCatSrcTpCd, indstryCatSrcTpDesc, tblNme, indstryCatEntpsTpCd, indstryCatEntpsTpDesc, indstryCatTpEfctvDt, indstryCatTpExpryDt);
    }
}
