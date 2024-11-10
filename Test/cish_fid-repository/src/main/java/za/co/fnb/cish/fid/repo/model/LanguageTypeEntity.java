package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "language_type")
public class LanguageTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String ctryCd;
    private String lngSrcTpCd;
    private String lngSrcTpDesc;
    private Integer lngEntpsTpCd;
    private String lngTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "language_type_id_seq")
    @SequenceGenerator(name = "language_type_id_seq", sequenceName = "language_type_id_seq", allocationSize = 1)
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
    @Column(name = "ctry_cd")
    public String getCtryCd() {
        return ctryCd;
    }

    public void setCtryCd(String ctryCd) {
        this.ctryCd = ctryCd;
    }

    @Basic
    @Column(name = "lng_src_tp_cd")
    public String getLngSrcTpCd() {
        return lngSrcTpCd;
    }

    public void setLngSrcTpCd(String lngSrcTpCd) {
        this.lngSrcTpCd = lngSrcTpCd;
    }

    @Basic
    @Column(name = "lng_src_tp_desc")
    public String getLngSrcTpDesc() {
        return lngSrcTpDesc;
    }

    public void setLngSrcTpDesc(String lngSrcTpDesc) {
        this.lngSrcTpDesc = lngSrcTpDesc;
    }

    @Basic
    @Column(name = "lng_entps_tp_cd")
    public Integer getLngEntpsTpCd() {
        return lngEntpsTpCd;
    }

    public void setLngEntpsTpCd(Integer lngEntpsTpCd) {
        this.lngEntpsTpCd = lngEntpsTpCd;
    }

    @Basic
    @Column(name = "lng_tp_desc")
    public String getLngTpDesc() {
        return lngTpDesc;
    }

    public void setLngTpDesc(String lngTpDesc) {
        this.lngTpDesc = lngTpDesc;
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
        LanguageTypeEntity that = (LanguageTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(ctryCd, that.ctryCd) &&
                Objects.equals(lngSrcTpCd, that.lngSrcTpCd) &&
                Objects.equals(lngSrcTpDesc, that.lngSrcTpDesc) &&
                Objects.equals(lngEntpsTpCd, that.lngEntpsTpCd) &&
                Objects.equals(lngTpDesc, that.lngTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, ctryCd, lngSrcTpCd, lngSrcTpDesc, lngEntpsTpCd, lngTpDesc, effDte, expDte);
    }
}
