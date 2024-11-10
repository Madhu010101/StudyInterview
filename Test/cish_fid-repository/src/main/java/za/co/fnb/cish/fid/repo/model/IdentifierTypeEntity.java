package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "identifier_type")
public class IdentifierTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcCat;
    private String stmTpSrcCd;
    private String idfrSrcTpCd;
    private String idfrSrcTpDesc;
    private String tblNme;
    private Integer idfrTpCd;
    private String idfrTpDesc;
    private String idfrEfctvDt;
    private String idfrExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identifier_type_id_seq")
    @SequenceGenerator(name = "identifier_type_id_seq", sequenceName = "identifier_type_id_seq", allocationSize = 1)
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
    @Column(name = "src_cat")
    public String getSrcCat() {
        return srcCat;
    }

    public void setSrcCat(String srcCat) {
        this.srcCat = srcCat;
    }

    @Basic
    @Column(name = "stm_tp_src_cd")
    public String getStmTpSrcCd() {
        return stmTpSrcCd;
    }

    public void setStmTpSrcCd(String stmTpSrcCd) {
        this.stmTpSrcCd = stmTpSrcCd;
    }

    @Basic
    @Column(name = "idfr_src_tp_cd")
    public String getIdfrSrcTpCd() {
        return idfrSrcTpCd;
    }

    public void setIdfrSrcTpCd(String idfrSrcTpCd) {
        this.idfrSrcTpCd = idfrSrcTpCd;
    }

    @Basic
    @Column(name = "idfr_src_tp_desc")
    public String getIdfrSrcTpDesc() {
        return idfrSrcTpDesc;
    }

    public void setIdfrSrcTpDesc(String idfrSrcTpDesc) {
        this.idfrSrcTpDesc = idfrSrcTpDesc;
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
    @Column(name = "idfr_tp_cd")
    public Integer getIdfrTpCd() {
        return idfrTpCd;
    }

    public void setIdfrTpCd(Integer idfrTpCd) {
        this.idfrTpCd = idfrTpCd;
    }

    @Basic
    @Column(name = "idfr_tp_desc")
    public String getIdfrTpDesc() {
        return idfrTpDesc;
    }

    public void setIdfrTpDesc(String idfrTpDesc) {
        this.idfrTpDesc = idfrTpDesc;
    }

    @Basic
    @Column(name = "idfr_efctv_dt")
    public String getIdfrEfctvDt() {
        return idfrEfctvDt;
    }

    public void setIdfrEfctvDt(String idfrEfctvDt) {
        this.idfrEfctvDt = idfrEfctvDt;
    }

    @Basic
    @Column(name = "idfr_expry_dt")
    public String getIdfrExpryDt() {
        return idfrExpryDt;
    }

    public void setIdfrExpryDt(String idfrExpryDt) {
        this.idfrExpryDt = idfrExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentifierTypeEntity that = (IdentifierTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcCat, that.srcCat) && Objects.equals(stmTpSrcCd, that.stmTpSrcCd) && Objects.equals(idfrSrcTpCd, that.idfrSrcTpCd) && Objects.equals(idfrSrcTpDesc, that.idfrSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(idfrTpCd, that.idfrTpCd) && Objects.equals(idfrTpDesc, that.idfrTpDesc) && Objects.equals(idfrEfctvDt, that.idfrEfctvDt) && Objects.equals(idfrExpryDt, that.idfrExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcCat, stmTpSrcCd, idfrSrcTpCd, idfrSrcTpDesc, tblNme, idfrTpCd, idfrTpDesc, idfrEfctvDt, idfrExpryDt);
    }
}
