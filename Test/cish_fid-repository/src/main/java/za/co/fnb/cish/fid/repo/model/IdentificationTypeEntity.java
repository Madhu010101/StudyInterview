package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "identification_type")
public class IdentificationTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcCat;
    private String idfctnSrcTpCd;
    private String idfctnSrcTpDesc;
    private String idfctnIssurCntryCd;
    private Integer idfctnEntpsTpCd;
    private String idTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identification_type_id_seq")
    @SequenceGenerator(name = "identification_type_id_seq", sequenceName = "identification_type_id_seq", allocationSize = 1)
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
    @Column(name = "src_cat")
    public String getSrcCat() {
        return srcCat;
    }

    public void setSrcCat(String srcCat) {
        this.srcCat = srcCat;
    }

    @Basic
    @Column(name = "idfctn_src_tp_cd")
    public String getIdfctnSrcTpCd() {
        return idfctnSrcTpCd;
    }

    public void setIdfctnSrcTpCd(String idfctnSrcTpCd) {
        this.idfctnSrcTpCd = idfctnSrcTpCd;
    }

    @Basic
    @Column(name = "idfctn_src_tp_desc")
    public String getIdfctnSrcTpDesc() {
        return idfctnSrcTpDesc;
    }

    public void setIdfctnSrcTpDesc(String idfctnSrcTpDesc) {
        this.idfctnSrcTpDesc = idfctnSrcTpDesc;
    }

    @Basic
    @Column(name = "idfctn_entps_tp_cd")
    public Integer getIdfctnEntpsTpCd() {
        return idfctnEntpsTpCd;
    }

    public void setIdfctnEntpsTpCd(Integer idfctnEntpsTpCd) {
        this.idfctnEntpsTpCd = idfctnEntpsTpCd;
    }

    @Basic
    @Column(name = "id_tp_desc")
    public String getIdTpDesc() {
        return idTpDesc;
    }

    public void setIdTpDesc(String idTpDesc) {
        this.idTpDesc = idTpDesc;
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

    @Basic
    @Column(name = "idfctn_issur_cntry_cd")
    public String getIdfctnIssurCntryCd() {
        return idfctnIssurCntryCd;
    }

    public void setIdfctnIssurCntryCd(String idfctnIssurCntryCd) {
        this.idfctnIssurCntryCd = idfctnIssurCntryCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentificationTypeEntity that = (IdentificationTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(idfctnSrcTpCd, that.idfctnSrcTpCd) &&
                Objects.equals(idfctnSrcTpDesc, that.idfctnSrcTpDesc) &&
                Objects.equals(idfctnIssurCntryCd, that.idfctnIssurCntryCd) &&
                Objects.equals(idfctnEntpsTpCd, that.idfctnEntpsTpCd) &&
                Objects.equals(idTpDesc, that.idTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcCat, idfctnSrcTpCd, idfctnSrcTpDesc,idfctnIssurCntryCd, idfctnEntpsTpCd, idTpDesc, effDte, expDte);
    }
}
