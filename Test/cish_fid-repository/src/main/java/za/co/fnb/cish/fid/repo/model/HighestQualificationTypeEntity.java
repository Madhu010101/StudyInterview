package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "highest_qualification_type")
public class HighestQualificationTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer scTblNo;
    private String srcTblNme;
    private String srcCat;
    private String srcCd;
    private String srcDesc;
    private String tblNme;
    private Integer hghstEduLvlTpCd;
    private String hghstEduLvlTpDesc;
    private String effDt;
    private String expDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "highest_qualification_type_id_seq")
    @SequenceGenerator(name = "highest_qualification_type_id_seq", sequenceName = "highest_qualification_type_id_seq", allocationSize = 1)
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
    @Column(name = "sc_tbl_no")
    public Integer getScTblNo() {
        return scTblNo;
    }

    public void setScTblNo(Integer scTblNo) {
        this.scTblNo = scTblNo;
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
    @Column(name = "hghst_edu_lvl_tp_cd")
    public Integer getHghstEduLvlTpCd() {
        return hghstEduLvlTpCd;
    }

    public void setHghstEduLvlTpCd(Integer hghstEduLvlTpCd) {
        this.hghstEduLvlTpCd = hghstEduLvlTpCd;
    }

    @Basic
    @Column(name = "hghst_edu_lvl_tp_desc")
    public String getHghstEduLvlTpDesc() {
        return hghstEduLvlTpDesc;
    }

    public void setHghstEduLvlTpDesc(String hghstEduLvlTpDesc) {
        this.hghstEduLvlTpDesc = hghstEduLvlTpDesc;
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

    @Basic
    @Column(name = "cmpny_tp_cd")
    public Integer getCmpnyTpCd() {
        return cmpnyTpCd;
    }

    public void setCmpnyTpCd(Integer cmpnyTpCd) {
        this.cmpnyTpCd = cmpnyTpCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighestQualificationTypeEntity that = (HighestQualificationTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(scTblNo, that.scTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(srcCd, that.srcCd) && Objects.equals(srcDesc, that.srcDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(hghstEduLvlTpCd, that.hghstEduLvlTpCd) && Objects.equals(hghstEduLvlTpDesc, that.hghstEduLvlTpDesc) && Objects.equals(effDt, that.effDt) && Objects.equals(expDt, that.expDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, scTblNo, srcTblNme, srcCat, srcCd, srcDesc, tblNme, hghstEduLvlTpCd, hghstEduLvlTpDesc, effDt, expDt);
    }
}
