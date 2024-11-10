package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "identifier_status")
public class IdentifierStatusEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String idfrSttsSrcTpCd;
    private String idfrSttsSrcTpDesc;
    private String tblNme;
    private Integer idfrSttsEntpsTpCd;
    private String idfrSttsTpDesc;
    private String idfrSttsTpEfctvDt;
    private String idfrSttsTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identifier_status_id_seq")
    @SequenceGenerator(name = "identifier_status_id_seq", sequenceName = "identifier_status_id_seq", allocationSize = 1)
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
    @Column(name = "idfr_stts_src_tp_cd")
    public String getIdfrSttsSrcTpCd() {
        return idfrSttsSrcTpCd;
    }

    public void setIdfrSttsSrcTpCd(String idfrSttsSrcTpCd) {
        this.idfrSttsSrcTpCd = idfrSttsSrcTpCd;
    }

    @Basic
    @Column(name = "idfr_stts_src_tp_desc")
    public String getIdfrSttsSrcTpDesc() {
        return idfrSttsSrcTpDesc;
    }

    public void setIdfrSttsSrcTpDesc(String idfrSttsSrcTpDesc) {
        this.idfrSttsSrcTpDesc = idfrSttsSrcTpDesc;
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
    @Column(name = "idfr_stts_tp_cd")
    public Integer getIdfrSttsEntpsTpCd() {
        return idfrSttsEntpsTpCd;
    }

    public void setIdfrSttsEntpsTpCd(Integer idfrSttsTpCd) {
        this.idfrSttsEntpsTpCd = idfrSttsTpCd;
    }

    @Basic
    @Column(name = "idfr_stts_tp_desc")
    public String getIdfrSttsTpDesc() {
        return idfrSttsTpDesc;
    }

    public void setIdfrSttsTpDesc(String idfrSttsTpDesc) {
        this.idfrSttsTpDesc = idfrSttsTpDesc;
    }

    @Basic
    @Column(name = "idfr_stts_tp_efctv_dt")
    public String getIdfrSttsTpEfctvDt() {
        return idfrSttsTpEfctvDt;
    }

    public void setIdfrSttsTpEfctvDt(String idfrSttsTpEfctvDt) {
        this.idfrSttsTpEfctvDt = idfrSttsTpEfctvDt;
    }

    @Basic
    @Column(name = "idfr_stts_tp_expry_dt")
    public String getIdfrSttsTpExpryDt() {
        return idfrSttsTpExpryDt;
    }

    public void setIdfrSttsTpExpryDt(String idfrSttsTpExpryDt) {
        this.idfrSttsTpExpryDt = idfrSttsTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentifierStatusEntity that = (IdentifierStatusEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(idfrSttsSrcTpCd, that.idfrSttsSrcTpCd) && Objects.equals(idfrSttsSrcTpDesc, that.idfrSttsSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(idfrSttsEntpsTpCd, that.idfrSttsEntpsTpCd) && Objects.equals(idfrSttsTpDesc, that.idfrSttsTpDesc) && Objects.equals(idfrSttsTpEfctvDt, that.idfrSttsTpEfctvDt) && Objects.equals(idfrSttsTpExpryDt, that.idfrSttsTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, idfrSttsSrcTpCd, idfrSttsSrcTpDesc, tblNme, idfrSttsEntpsTpCd, idfrSttsTpDesc, idfrSttsTpEfctvDt, idfrSttsTpExpryDt);
    }
}
