package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "system")
public class SystemEntity {
    private Long id;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String stmSrcTpCd;
    private String stmSrcTpDesc;
    private String tblNme;
    private String stmTpCd;
    private String stmTpLongDesc;
    private String stmTpShortDesc;
    private String stmEfctvDt;
    private String stmExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "system_id_seq")
    @SequenceGenerator(name = "system_id_seq", sequenceName = "system_id_seq", allocationSize = 1)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "stm_src_tp_cd")
    public String getStmSrcTpCd() {
        return stmSrcTpCd;
    }

    public void setStmSrcTpCd(String stmSrcTpCd) {
        this.stmSrcTpCd = stmSrcTpCd;
    }

    @Basic
    @Column(name = "stm_src_tp_desc")
    public String getStmSrcTpDesc() {
        return stmSrcTpDesc;
    }

    public void setStmSrcTpDesc(String stmSrcTpDesc) {
        this.stmSrcTpDesc = stmSrcTpDesc;
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
    @Column(name = "stm_tp_cd")
    public String getStmTpCd() {
        return stmTpCd;
    }

    public void setStmTpCd(String stmTpCd) {
        this.stmTpCd = stmTpCd;
    }

    @Basic
    @Column(name = "stm_tp_long_desc")
    public String getStmTpLongDesc() {
        return stmTpLongDesc;
    }

    public void setStmTpLongDesc(String stmTpLongDesc) {
        this.stmTpLongDesc = stmTpLongDesc;
    }

    @Basic
    @Column(name = "stm_tp_short_desc")
    public String getStmTpShortDesc() {
        return stmTpShortDesc;
    }

    public void setStmTpShortDesc(String stmTpShortDesc) {
        this.stmTpShortDesc = stmTpShortDesc;
    }

    @Basic
    @Column(name = "stm_efctv_dt")
    public String getStmEfctvDt() {
        return stmEfctvDt;
    }

    public void setStmEfctvDt(String stmEfctvDt) {
        this.stmEfctvDt = stmEfctvDt;
    }

    @Basic
    @Column(name = "stm_expry_dt")
    public String getStmExpryDt() {
        return stmExpryDt;
    }

    public void setStmExpryDt(String stmExpryDt) {
        this.stmExpryDt = stmExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemEntity that = (SystemEntity) o;
        return Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(stmSrcTpCd, that.stmSrcTpCd) && Objects.equals(stmSrcTpDesc, that.stmSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(stmTpLongDesc, that.stmTpLongDesc) && Objects.equals(stmTpShortDesc, that.stmTpShortDesc) && Objects.equals(stmEfctvDt, that.stmEfctvDt) && Objects.equals(stmExpryDt, that.stmExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcTblNo, srcTblNme, srcCat, stmSrcTpCd, stmSrcTpDesc, tblNme, stmTpCd, stmTpLongDesc, stmTpShortDesc, stmEfctvDt, stmExpryDt);
    }
}
