package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "residency_status_type")
public class ResidencyStatusTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String rsdncySttsSrcTpCd;
    private String rsdncySttsSrcTpDesc;
    private Integer rsdncySttsEntpsTpCd;
    private String rsdncySttsTpCd;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "residency_status_type_id_seq")
    @SequenceGenerator(name = "residency_status_type_id_seq", sequenceName = "residency_status_type_id_seq", allocationSize = 1)
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
    @Column(name = "rsdncy_stts_src_tp_cd")
    public String getRsdncySttsSrcTpCd() {
        return rsdncySttsSrcTpCd;
    }

    public void setRsdncySttsSrcTpCd(String rsdncySttsSrcTpCd) {
        this.rsdncySttsSrcTpCd = rsdncySttsSrcTpCd;
    }

    @Basic
    @Column(name = "rsdncy_stts_src_tp_desc")
    public String getRsdncySttsSrcTpDesc() {
        return rsdncySttsSrcTpDesc;
    }

    public void setRsdncySttsSrcTpDesc(String rsdncySttsSrcTpDesc) {
        this.rsdncySttsSrcTpDesc = rsdncySttsSrcTpDesc;
    }

    @Basic
    @Column(name = "rsdncy_stts_entps_tp_cd")
    public Integer getRsdncySttsEntpsTpCd() {
        return rsdncySttsEntpsTpCd;
    }

    public void setRsdncySttsEntpsTpCd(Integer rsdncySttsEntpsTpCd) {
        this.rsdncySttsEntpsTpCd = rsdncySttsEntpsTpCd;
    }

    @Basic
    @Column(name = "rsdncy_stts_tp_cd")
    public String getRsdncySttsTpCd() {
        return rsdncySttsTpCd;
    }

    public void setRsdncySttsTpCd(String rsdncySttsTpCd) {
        this.rsdncySttsTpCd = rsdncySttsTpCd;
    }

    @Basic
    @Column(name = "eff_dte")
    public String getEffDte() {
        return effDte;
    }

    public void setEffDte(String effDte) {
        this.effDte = effDte;
    }

    @Basic
    @Column(name = "exp_dte")
    public String getExpDte() {
        return expDte;
    }

    public void setExpDte(String expDte) {
        this.expDte = expDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidencyStatusTypeEntity that = (ResidencyStatusTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(rsdncySttsSrcTpCd, that.rsdncySttsSrcTpCd) &&
                Objects.equals(rsdncySttsSrcTpDesc, that.rsdncySttsSrcTpDesc) &&
                Objects.equals(rsdncySttsEntpsTpCd, that.rsdncySttsEntpsTpCd) &&
                Objects.equals(rsdncySttsTpCd, that.rsdncySttsTpCd) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, rsdncySttsSrcTpCd, rsdncySttsSrcTpDesc, rsdncySttsEntpsTpCd, rsdncySttsTpCd, effDte, expDte);
    }
}
