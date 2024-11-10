package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bank_decision_indicator")
public class BankDecisionIndicatorEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String bnkDcsnSrcTpCd;
    private String bnkDcsnSrcTpDesc;
    private String tblNme;
    private Integer bnkDcsnSrcEntpsTpCd;
    private String bnkDcsnTpSrcTpDesc;
    private String bnkDcsnTpEfctvDt;
    private String bnkDcsnTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_decision_indicator_id_seq")
    @SequenceGenerator(name = "bank_decision_indicator_id_seq", sequenceName = "bank_decision_indicator_id_seq", allocationSize = 1)
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
    @Column(name = "bnk_dcsn_src_tp_cd")
    public String getBnkDcsnSrcTpCd() {
        return bnkDcsnSrcTpCd;
    }

    public void setBnkDcsnSrcTpCd(String bnkDcsnSrcTpCd) {
        this.bnkDcsnSrcTpCd = bnkDcsnSrcTpCd;
    }

    @Basic
    @Column(name = "bnk_dcsn_src_tp_desc")
    public String getBnkDcsnSrcTpDesc() {
        return bnkDcsnSrcTpDesc;
    }

    public void setBnkDcsnSrcTpDesc(String bnkDcsnSrcTpDesc) {
        this.bnkDcsnSrcTpDesc = bnkDcsnSrcTpDesc;
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
    @Column(name = "bnk_dcsn_src_entps_tp_cd")
    public Integer getBnkDcsnSrcEntpsTpCd() {
        return bnkDcsnSrcEntpsTpCd;
    }

    public void setBnkDcsnSrcEntpsTpCd(Integer bnkDcsnSrcEntpsTpCd) {
        this.bnkDcsnSrcEntpsTpCd = bnkDcsnSrcEntpsTpCd;
    }

    @Basic
    @Column(name = "bnk_dcsn_tp_src_tp_desc")
    public String getBnkDcsnTpSrcTpDesc() {
        return bnkDcsnTpSrcTpDesc;
    }

    public void setBnkDcsnTpSrcTpDesc(String bnkDcsnTpSrcTpDesc) {
        this.bnkDcsnTpSrcTpDesc = bnkDcsnTpSrcTpDesc;
    }

    @Basic
    @Column(name = "bnk_dcsn_tp_efctv_dt")
    public String getBnkDcsnTpEfctvDt() {
        return bnkDcsnTpEfctvDt;
    }

    public void setBnkDcsnTpEfctvDt(String bnkDcsnTpEfctvDt) {
        this.bnkDcsnTpEfctvDt = bnkDcsnTpEfctvDt;
    }

    @Basic
    @Column(name = "bnk_dcsn_tp_expry_dt")
    public String getBnkDcsnTpExpryDt() {
        return bnkDcsnTpExpryDt;
    }

    public void setBnkDcsnTpExpryDt(String bnkDcsnTpExpryDt) {
        this.bnkDcsnTpExpryDt = bnkDcsnTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankDecisionIndicatorEntity that = (BankDecisionIndicatorEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(bnkDcsnSrcTpCd, that.bnkDcsnSrcTpCd) && Objects.equals(bnkDcsnSrcTpDesc, that.bnkDcsnSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(bnkDcsnSrcEntpsTpCd, that.bnkDcsnSrcEntpsTpCd) && Objects.equals(bnkDcsnTpSrcTpDesc, that.bnkDcsnTpSrcTpDesc) && Objects.equals(bnkDcsnTpEfctvDt, that.bnkDcsnTpEfctvDt) && Objects.equals(bnkDcsnTpExpryDt, that.bnkDcsnTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, bnkDcsnSrcTpCd, bnkDcsnSrcTpDesc, tblNme, bnkDcsnSrcEntpsTpCd, bnkDcsnTpSrcTpDesc, bnkDcsnTpEfctvDt, bnkDcsnTpExpryDt);
    }
}
