package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "segmentation_type")
public class SegmentationTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String prntSrcCd;
    private String sgmtnSrcTpCd;
    private String sgmtnSrcTpDesc;
    private Integer prntSgmtnTpCd;
    private Integer sgmtnEntpsTpCd;
    private String sgmtnTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "segmentation_type_id_seq")
    @SequenceGenerator(name = "segmentation_type_id_seq", sequenceName = "segmentation_type_id_seq", allocationSize = 1)
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
    @Column(name = "prnt_src_cd")
    public String getPrntSrcCd() {
        return prntSrcCd;
    }

    public void setPrntSrcCd(String prntSrcCd) {
        this.prntSrcCd = prntSrcCd;
    }

    @Basic
    @Column(name = "sgmtn_src_tp_cd")
    public String getSgmtnSrcTpCd() {
        return sgmtnSrcTpCd;
    }

    public void setSgmtnSrcTpCd(String sgmtnSrcTpCd) {
        this.sgmtnSrcTpCd = sgmtnSrcTpCd;
    }

    @Basic
    @Column(name = "sgmtn_src_tp_desc")
    public String getSgmtnSrcTpDesc() {
        return sgmtnSrcTpDesc;
    }

    public void setSgmtnSrcTpDesc(String sgmtnSrcTpDesc) {
        this.sgmtnSrcTpDesc = sgmtnSrcTpDesc;
    }

    @Basic
    @Column(name = "prnt_sgmtn_tp_cd")
    public Integer getPrntSgmtnTpCd() {
        return prntSgmtnTpCd;
    }

    public void setPrntSgmtnTpCd(Integer prntSgmtnTpCd) {
        this.prntSgmtnTpCd = prntSgmtnTpCd;
    }

    @Basic
    @Column(name = "sgmtn_entps_tp_cd")
    public Integer getSgmtnEntpsTpCd() {
        return sgmtnEntpsTpCd;
    }

    public void setSgmtnEntpsTpCd(Integer sgmtnEntpsTpCd) {
        this.sgmtnEntpsTpCd = sgmtnEntpsTpCd;
    }

    @Basic
    @Column(name = "sgmtn_tp_desc")
    public String getSgmtnTpDesc() {
        return sgmtnTpDesc;
    }

    public void setSgmtnTpDesc(String sgmtnTpDesc) {
        this.sgmtnTpDesc = sgmtnTpDesc;
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
        SegmentationTypeEntity that = (SegmentationTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(prntSrcCd, that.prntSrcCd) &&
                Objects.equals(sgmtnSrcTpCd, that.sgmtnSrcTpCd) &&
                Objects.equals(sgmtnSrcTpDesc, that.sgmtnSrcTpDesc) &&
                Objects.equals(prntSgmtnTpCd, that.prntSgmtnTpCd) &&
                Objects.equals(sgmtnEntpsTpCd, that.sgmtnEntpsTpCd) &&
                Objects.equals(sgmtnTpDesc, that.sgmtnTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, prntSrcCd, sgmtnSrcTpCd, sgmtnSrcTpDesc, prntSgmtnTpCd, sgmtnEntpsTpCd, sgmtnTpDesc, effDte, expDte);
    }
}
