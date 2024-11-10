package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "marital_contract_type")
public class MaritalContractTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String mrtlCntrctSrcTpCd;
    private String mrtlCntrctSrcTpDesc;
    private Integer mrtlCntrctEntpsTpCd;
    private String mrtlCntrctTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marital_contract_type_id_seq")
    @SequenceGenerator(name = "marital_contract_type_id_seq", sequenceName = "marital_contract_type_id_seq", allocationSize = 1)
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
    @Column(name = "mrtl_cntrct_src_tp_cd")
    public String getMrtlCntrctSrcTpCd() {
        return mrtlCntrctSrcTpCd;
    }

    public void setMrtlCntrctSrcTpCd(String mrtlCntrctSrcTpCd) {
        this.mrtlCntrctSrcTpCd = mrtlCntrctSrcTpCd;
    }

    @Basic
    @Column(name = "mrtl_cntrct_src_tp_desc")
    public String getMrtlCntrctSrcTpDesc() {
        return mrtlCntrctSrcTpDesc;
    }

    public void setMrtlCntrctSrcTpDesc(String mrtlCntrctSrcTpDesc) {
        this.mrtlCntrctSrcTpDesc = mrtlCntrctSrcTpDesc;
    }

    @Basic
    @Column(name = "mrtl_cntrct_entps_tp_cd")
    public Integer getMrtlCntrctEntpsTpCd() {
        return mrtlCntrctEntpsTpCd;
    }

    public void setMrtlCntrctEntpsTpCd(Integer mrtlCntrctEntpsTpCd) {
        this.mrtlCntrctEntpsTpCd = mrtlCntrctEntpsTpCd;
    }

    @Basic
    @Column(name = "mrtl_cntrct_tp_desc")
    public String getMrtlCntrctTpDesc() {
        return mrtlCntrctTpDesc;
    }

    public void setMrtlCntrctTpDesc(String mrtlCntrctTpDesc) {
        this.mrtlCntrctTpDesc = mrtlCntrctTpDesc;
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
        MaritalContractTypeEntity that = (MaritalContractTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(mrtlCntrctSrcTpCd, that.mrtlCntrctSrcTpCd) &&
                Objects.equals(mrtlCntrctSrcTpDesc, that.mrtlCntrctSrcTpDesc) &&
                Objects.equals(mrtlCntrctEntpsTpCd, that.mrtlCntrctEntpsTpCd) &&
                Objects.equals(mrtlCntrctTpDesc, that.mrtlCntrctTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, mrtlCntrctSrcTpCd, mrtlCntrctSrcTpDesc, mrtlCntrctEntpsTpCd, mrtlCntrctTpDesc, effDte, expDte);
    }
}
