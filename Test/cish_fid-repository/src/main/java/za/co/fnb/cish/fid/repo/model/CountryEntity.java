package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country")
public class CountryEntity {
    private Long id;
    private String stmTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String srcCd;
    private String cntryName;
    private String tblNme;
    private Integer edwCntryCd;
    private String cntryCd;
    private String cntryNm;
    private String isoAlphaCntryCd;
    private Integer isoNumCntryCd;
    private String effDt;
    private String expDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id_seq")
    @SequenceGenerator(name = "country_id_seq", sequenceName = "country_id_seq", allocationSize = 1)
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
    @Column(name = "cntry_name")
    public String getCntryName() {
        return cntryName;
    }

    public void setCntryName(String cntryName) {
        this.cntryName = cntryName;
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
    @Column(name = "edw_cntry_cd")
    public Integer getEdwCntryCd() {
        return edwCntryCd;
    }

    public void setEdwCntryCd(Integer edwCntryCd) {
        this.edwCntryCd = edwCntryCd;
    }

    @Basic
    @Column(name = "cntry_cd")
    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    @Basic
    @Column(name = "cntry_nm")
    public String getCntryNm() {
        return cntryNm;
    }

    public void setCntryNm(String cntryNm) {
        this.cntryNm = cntryNm;
    }

    @Basic
    @Column(name = "iso_alpha_cntry_cd")
    public String getIsoAlphaCntryCd() {
        return isoAlphaCntryCd;
    }

    public void setIsoAlphaCntryCd(String isoAlphaCntryCd) {
        this.isoAlphaCntryCd = isoAlphaCntryCd;
    }

    @Basic
    @Column(name = "iso_num_cntry_cd")
    public Integer getIsoNumCntryCd() {
        return isoNumCntryCd;
    }

    public void setIsoNumCntryCd(Integer isoNumCntryCd) {
        this.isoNumCntryCd = isoNumCntryCd;
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
        CountryEntity that = (CountryEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(srcCd, that.srcCd) && Objects.equals(cntryName, that.cntryName) && Objects.equals(tblNme, that.tblNme) && Objects.equals(edwCntryCd, that.edwCntryCd) && Objects.equals(cntryCd, that.cntryCd) && Objects.equals(cntryNm, that.cntryNm) && Objects.equals(isoAlphaCntryCd, that.isoAlphaCntryCd) && Objects.equals(isoNumCntryCd, that.isoNumCntryCd) && Objects.equals(effDt, that.effDt) && Objects.equals(expDt, that.expDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, srcCd, cntryName, tblNme, edwCntryCd, cntryCd, cntryNm, isoAlphaCntryCd, isoNumCntryCd, effDt, expDt);
    }
}
