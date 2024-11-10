package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sanction_screening_status")
public class SanctionScreeningStatusEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer sanctnSrcTpCd;
    private String sanctnSrcTpDesc;
    private String tblNme;
    private Integer sanctnEntpsTpCd;
    private String sanctnSrcEntpsTpDesc;
    private String sanctnTpEfctvDte;
    private String sanctnTpExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sanction_screening_status_id_seq")
    @SequenceGenerator(name = "sanction_screening_status_id_seq", sequenceName = "sanction_screening_status_id_seq", allocationSize = 1)
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
    @Column(name = "sanctn_src_tp_cd")
    public Integer getSanctnSrcTpCd() {
        return sanctnSrcTpCd;
    }

    public void setSanctnSrcTpCd(Integer sanctnSrcTpCd) {
        this.sanctnSrcTpCd = sanctnSrcTpCd;
    }

    @Basic
    @Column(name = "sanctn_src_tp_desc")
    public String getSanctnSrcTpDesc() {
        return sanctnSrcTpDesc;
    }

    public void setSanctnSrcTpDesc(String sanctnSrcTpDesc) {
        this.sanctnSrcTpDesc = sanctnSrcTpDesc;
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
    @Column(name = "sanctn_entps_tp_cd")
    public Integer getSanctnEntpsTpCd() {
        return sanctnEntpsTpCd;
    }

    public void setSanctnEntpsTpCd(Integer sanctnEntpsTpCd) {
        this.sanctnEntpsTpCd = sanctnEntpsTpCd;
    }

    @Basic
    @Column(name = "sanctn_src_entps_tp_desc")
    public String getSanctnSrcEntpsTpDesc() {
        return sanctnSrcEntpsTpDesc;
    }

    public void setSanctnSrcEntpsTpDesc(String sanctnSrcEntpsTpDesc) {
        this.sanctnSrcEntpsTpDesc = sanctnSrcEntpsTpDesc;
    }

    @Basic
    @Column(name = "sanctn_tp_efctv_dte")
    public String getSanctnTpEfctvDte() {
        return sanctnTpEfctvDte;
    }

    public void setSanctnTpEfctvDte(String sanctnTpEfctvDte) {
        this.sanctnTpEfctvDte = sanctnTpEfctvDte;
    }

    @Basic
    @Column(name = "sanctn_tp_expry_dte")
    public String getSanctnTpExpryDte() {
        return sanctnTpExpryDte;
    }

    public void setSanctnTpExpryDte(String sanctnTpExpryDte) {
        this.sanctnTpExpryDte = sanctnTpExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanctionScreeningStatusEntity that = (SanctionScreeningStatusEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(sanctnSrcTpCd, that.sanctnSrcTpCd) && Objects.equals(sanctnSrcTpDesc, that.sanctnSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(sanctnEntpsTpCd, that.sanctnEntpsTpCd) && Objects.equals(sanctnSrcEntpsTpDesc, that.sanctnSrcEntpsTpDesc) && Objects.equals(sanctnTpEfctvDte, that.sanctnTpEfctvDte) && Objects.equals(sanctnTpExpryDte, that.sanctnTpExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, sanctnSrcTpCd, sanctnSrcTpDesc, tblNme, sanctnEntpsTpCd, sanctnSrcEntpsTpDesc, sanctnTpEfctvDte, sanctnTpExpryDte);
    }
}
