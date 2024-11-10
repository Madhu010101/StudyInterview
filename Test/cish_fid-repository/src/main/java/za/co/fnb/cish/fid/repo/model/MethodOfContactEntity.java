package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "method_of_contact")
public class MethodOfContactEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNp;
    private String srcTblNme;
    private String srcCat;
    private String mthdOfCntctSrcTpCd;
    private String mthdOfCntctSrcTpDesc;
    private String tblNme;
    private Integer mthdOfCntctEntpsTpCd;
    private String mthdOfCntctEntpsTpDesc;
    private String mthdOfCntctTpEfctvDt;
    private String mthdOfCntctTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "method_of_contact_id_seq")
    @SequenceGenerator(name = "method_of_contact_id_seq", sequenceName = "method_of_contact_id_seq", allocationSize = 1)
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
    @Column(name = "src_tbl_np")
    public Integer getSrcTblNp() {
        return srcTblNp;
    }

    public void setSrcTblNp(Integer srcTblNp) {
        this.srcTblNp = srcTblNp;
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
    @Column(name = "mthd_of_cntct_src_tp_cd")
    public String getMthdOfCntctSrcTpCd() {
        return mthdOfCntctSrcTpCd;
    }

    public void setMthdOfCntctSrcTpCd(String mthdOfCntctSrcTpCd) {
        this.mthdOfCntctSrcTpCd = mthdOfCntctSrcTpCd;
    }

    @Basic
    @Column(name = "mthd_of_cntct_src_tp_desc")
    public String getMthdOfCntctSrcTpDesc() {
        return mthdOfCntctSrcTpDesc;
    }

    public void setMthdOfCntctSrcTpDesc(String mthdOfCntctSrcTpDesc) {
        this.mthdOfCntctSrcTpDesc = mthdOfCntctSrcTpDesc;
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
    @Column(name = "mthd_of_cntct_entps_tp_cd")
    public Integer getMthdOfCntctEntpsTpCd() {
        return mthdOfCntctEntpsTpCd;
    }

    public void setMthdOfCntctEntpsTpCd(Integer mthdOfCntctEntpsTpCd) {
        this.mthdOfCntctEntpsTpCd = mthdOfCntctEntpsTpCd;
    }

    @Basic
    @Column(name = "mthd_of_cntct_entps_tp_desc")
    public String getMthdOfCntctEntpsTpDesc() {
        return mthdOfCntctEntpsTpDesc;
    }

    public void setMthdOfCntctEntpsTpDesc(String mthdOfCntctEntpsTpDesc) {
        this.mthdOfCntctEntpsTpDesc = mthdOfCntctEntpsTpDesc;
    }

    @Basic
    @Column(name = "mthd_of_cntct_tp_efctv_dt")
    public String getMthdOfCntctTpEfctvDt() {
        return mthdOfCntctTpEfctvDt;
    }

    public void setMthdOfCntctTpEfctvDt(String mthdOfCntctTpEfctvDt) {
        this.mthdOfCntctTpEfctvDt = mthdOfCntctTpEfctvDt;
    }

    @Basic
    @Column(name = "mthd_of_cntct_tp_expry_dt")
    public String getMthdOfCntctTpExpryDt() {
        return mthdOfCntctTpExpryDt;
    }

    public void setMthdOfCntctTpExpryDt(String mthdOfCntctTpExpryDt) {
        this.mthdOfCntctTpExpryDt = mthdOfCntctTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodOfContactEntity that = (MethodOfContactEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNp, that.srcTblNp) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(mthdOfCntctSrcTpCd, that.mthdOfCntctSrcTpCd) && Objects.equals(mthdOfCntctSrcTpDesc, that.mthdOfCntctSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(mthdOfCntctEntpsTpCd, that.mthdOfCntctEntpsTpCd) && Objects.equals(mthdOfCntctEntpsTpDesc, that.mthdOfCntctEntpsTpDesc) && Objects.equals(mthdOfCntctTpEfctvDt, that.mthdOfCntctTpEfctvDt) && Objects.equals(mthdOfCntctTpExpryDt, that.mthdOfCntctTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNp, srcTblNme, srcCat, mthdOfCntctSrcTpCd, mthdOfCntctSrcTpDesc, tblNme, mthdOfCntctEntpsTpCd, mthdOfCntctEntpsTpDesc, mthdOfCntctTpEfctvDt, mthdOfCntctTpExpryDt);
    }
}
