package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "marital_status_type")
public class MaritalStatusTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String mrtlSttsSrcTpCd;
    private String mrtlSttsSrcTpDesc;
    private Integer mrtlSttsEntpsTpCd;
    private String mrtlSttsTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marital_status_type_id_seq")
    @SequenceGenerator(name = "marital_status_type_id_seq", sequenceName = "marital_status_type_id_seq", allocationSize = 1)
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
    @Column(name = "mrtl_stts_src_tp_cd")
    public String getMrtlSttsSrcTpCd() {
        return mrtlSttsSrcTpCd;
    }

    public void setMrtlSttsSrcTpCd(String mrtlSttsSrcTpCd) {
        this.mrtlSttsSrcTpCd = mrtlSttsSrcTpCd;
    }

    @Basic
    @Column(name = "mrtl_stts_src_tp_desc")
    public String getMrtlSttsSrcTpDesc() {
        return mrtlSttsSrcTpDesc;
    }

    public void setMrtlSttsSrcTpDesc(String mrtlSttsSrcTpDesc) {
        this.mrtlSttsSrcTpDesc = mrtlSttsSrcTpDesc;
    }

    @Basic
    @Column(name = "mrtl_stts_entps_tp_cd")
    public Integer getMrtlSttsEntpsTpCd() {
        return mrtlSttsEntpsTpCd;
    }

    public void setMrtlSttsEntpsTpCd(Integer mrtlSttsEntpsTpCd) {
        this.mrtlSttsEntpsTpCd = mrtlSttsEntpsTpCd;
    }

    @Basic
    @Column(name = "mrtl_stts_tp_desc")
    public String getMrtlSttsTpDesc() {
        return mrtlSttsTpDesc;
    }

    public void setMrtlSttsTpDesc(String mrtlSttsTpDesc) {
        this.mrtlSttsTpDesc = mrtlSttsTpDesc;
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
        MaritalStatusTypeEntity that = (MaritalStatusTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(mrtlSttsSrcTpCd, that.mrtlSttsSrcTpCd) &&
                Objects.equals(mrtlSttsSrcTpDesc, that.mrtlSttsSrcTpDesc) &&
                Objects.equals(mrtlSttsEntpsTpCd, that.mrtlSttsEntpsTpCd) &&
                Objects.equals(mrtlSttsTpDesc, that.mrtlSttsTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, mrtlSttsSrcTpCd, mrtlSttsSrcTpDesc, mrtlSttsEntpsTpCd, mrtlSttsTpDesc, effDte, expDte);
    }
}
