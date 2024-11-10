package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "qualification_speciality_type")
public class QualificationSpecialityTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String srcCd;
    private String srcDesc;
    private String tblNme;
    private Integer qualSpcltyTpCd;
    private String qualSpcltyTpDesc;
    private String effDt;
    private String expDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qualification_speciality_type_id_seq")
    @SequenceGenerator(name = "qualification_speciality_type_id_seq", sequenceName = "qualification_speciality_type_id_seq", allocationSize = 1)
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
    @Column(name = "src_cd")
    public String getSrcCd() {
        return srcCd;
    }

    public void setSrcCd(String srcCd) {
        this.srcCd = srcCd;
    }

    @Basic
    @Column(name = "src_desc")
    public String getSrcDesc() {
        return srcDesc;
    }

    public void setSrcDesc(String srcDesc) {
        this.srcDesc = srcDesc;
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
    @Column(name = "qual_spclty_tp_cd")
    public Integer getQualSpcltyTpCd() {
        return qualSpcltyTpCd;
    }

    public void setQualSpcltyTpCd(Integer qualSpcltyTpCd) {
        this.qualSpcltyTpCd = qualSpcltyTpCd;
    }

    @Basic
    @Column(name = "qual_spclty_tp_desc")
    public String getQualSpcltyTpDesc() {
        return qualSpcltyTpDesc;
    }

    public void setQualSpcltyTpDesc(String qualSpcltyTpDesc) {
        this.qualSpcltyTpDesc = qualSpcltyTpDesc;
    }

    @Basic
    @Column(name = "eff_dt")
    public String getEffDt() {
        return effDt;
    }

    public void setEffDt(String effDt) {
        this.effDt = effDt;
    }

    @Basic
    @Column(name = "exp_dt")
    public String getExpDt() {
        return expDt;
    }

    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QualificationSpecialityTypeEntity that = (QualificationSpecialityTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(srcCd, that.srcCd) && Objects.equals(srcDesc, that.srcDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(qualSpcltyTpCd, that.qualSpcltyTpCd) && Objects.equals(qualSpcltyTpDesc, that.qualSpcltyTpDesc) && Objects.equals(effDt, that.effDt) && Objects.equals(expDt, that.expDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, srcCd, srcDesc, tblNme, qualSpcltyTpCd, qualSpcltyTpDesc, effDt, expDt);
    }
}
