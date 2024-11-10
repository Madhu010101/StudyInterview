package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "business_rescue_indicator")
public class BusinessRescueIndicatorEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String finSttsSrcTpCd;
    private String finSttsSrcTpDesc;
    private String tblNme;
    private Integer finSttsEntpsTpCd;
    private String finSttsEntpsTpDesc;
    private String finSttsTpEfctvDt;
    private String finSttsTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "business_rescue_indicator_id_seq")
    @SequenceGenerator(name = "business_rescue_indicator_id_seq", sequenceName = "business_rescue_indicator_id_seq", allocationSize = 1)
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
    @Column(name = "fin_stts_src_tp_cd")
    public String getFinSttsSrcTpCd() {
        return finSttsSrcTpCd;
    }

    public void setFinSttsSrcTpCd(String finSttsSrcTpCd) {
        this.finSttsSrcTpCd = finSttsSrcTpCd;
    }

    @Basic
    @Column(name = "fin_stts_src_tp_desc")
    public String getFinSttsSrcTpDesc() {
        return finSttsSrcTpDesc;
    }

    public void setFinSttsSrcTpDesc(String finSttsSrcTpDesc) {
        this.finSttsSrcTpDesc = finSttsSrcTpDesc;
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
    @Column(name = "fin_stts_entps_tp_cd")
    public Integer getFinSttsEntpsTpCd() {
        return finSttsEntpsTpCd;
    }

    public void setFinSttsEntpsTpCd(Integer finSttsEntpsTpCd) {
        this.finSttsEntpsTpCd = finSttsEntpsTpCd;
    }

    @Basic
    @Column(name = "fin_stts_entps_tp_desc")
    public String getFinSttsEntpsTpDesc() {
        return finSttsEntpsTpDesc;
    }

    public void setFinSttsEntpsTpDesc(String finSttsEntpsTpDesc) {
        this.finSttsEntpsTpDesc = finSttsEntpsTpDesc;
    }

    @Basic
    @Column(name = "fin_stts_tp_efctv_dt")
    public String getFinSttsTpEfctvDt() {
        return finSttsTpEfctvDt;
    }

    public void setFinSttsTpEfctvDt(String finSttsTpEfctvDt) {
        this.finSttsTpEfctvDt = finSttsTpEfctvDt;
    }

    @Basic
    @Column(name = "fin_stts_tp_expry_dt")
    public String getFinSttsTpExpryDt() {
        return finSttsTpExpryDt;
    }

    public void setFinSttsTpExpryDt(String finSttsTpExpryDt) {
        this.finSttsTpExpryDt = finSttsTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessRescueIndicatorEntity that = (BusinessRescueIndicatorEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(finSttsSrcTpCd, that.finSttsSrcTpCd) && Objects.equals(finSttsSrcTpDesc, that.finSttsSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(finSttsEntpsTpCd, that.finSttsEntpsTpCd) && Objects.equals(finSttsEntpsTpDesc, that.finSttsEntpsTpDesc) && Objects.equals(finSttsTpEfctvDt, that.finSttsTpEfctvDt) && Objects.equals(finSttsTpExpryDt, that.finSttsTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, finSttsSrcTpCd, finSttsSrcTpDesc, tblNme, finSttsEntpsTpCd, finSttsEntpsTpDesc, finSttsTpEfctvDt, finSttsTpExpryDt);
    }
}
