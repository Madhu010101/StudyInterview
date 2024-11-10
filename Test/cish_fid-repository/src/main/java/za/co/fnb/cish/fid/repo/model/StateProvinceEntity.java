package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "state_province")
public class StateProvinceEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String stateSrcTpCd;
    private String stateSrcTpDesc;
    private String tblNme;
    private String stateEntpsTpCd;
    private String stateTpDesc;
    private String stateTpEfctvDt;
    private String stateTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_province_id_seq")
    @SequenceGenerator(name = "state_province_id_seq", sequenceName = "state_province_id_seq", allocationSize = 1)
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
    @Column(name = "state_src_tp_cd")
    public String getStateSrcTpCd() {
        return stateSrcTpCd;
    }

    public void setStateSrcTpCd(String stateSrcTpCd) {
        this.stateSrcTpCd = stateSrcTpCd;
    }

    @Basic
    @Column(name = "state_src_tp_desc")
    public String getStateSrcTpDesc() {
        return stateSrcTpDesc;
    }

    public void setStateSrcTpDesc(String stateSrcTpDesc) {
        this.stateSrcTpDesc = stateSrcTpDesc;
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
    @Column(name = "state_entps_tp_cd")
    public String getStateEntpsTpCd() {
        return stateEntpsTpCd;
    }

    public void setStateEntpsTpCd(String stateEntpsTpCd) {
        this.stateEntpsTpCd = stateEntpsTpCd;
    }

    @Basic
    @Column(name = "state_tp_desc")
    public String getStateTpDesc() {
        return stateTpDesc;
    }

    public void setStateTpDesc(String stateTpDesc) {
        this.stateTpDesc = stateTpDesc;
    }

    @Basic
    @Column(name = "state_tp_efctv_dt")
    public String getStateTpEfctvDt() {
        return stateTpEfctvDt;
    }

    public void setStateTpEfctvDt(String stateTpEfctvDt) {
        this.stateTpEfctvDt = stateTpEfctvDt;
    }

    @Basic
    @Column(name = "state_tp_expry_dt")
    public String getStateTpExpryDt() {
        return stateTpExpryDt;
    }

    public void setStateTpExpryDt(String stateTpExpryDt) {
        this.stateTpExpryDt = stateTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateProvinceEntity that = (StateProvinceEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(stateSrcTpCd, that.stateSrcTpCd) && Objects.equals(stateSrcTpDesc, that.stateSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(stateEntpsTpCd, that.stateEntpsTpCd) && Objects.equals(stateTpDesc, that.stateTpDesc) && Objects.equals(stateTpEfctvDt, that.stateTpEfctvDt) && Objects.equals(stateTpExpryDt, that.stateTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, stateSrcTpCd, stateSrcTpDesc, tblNme, stateEntpsTpCd, stateTpDesc, stateTpEfctvDt, stateTpExpryDt);
    }
}
