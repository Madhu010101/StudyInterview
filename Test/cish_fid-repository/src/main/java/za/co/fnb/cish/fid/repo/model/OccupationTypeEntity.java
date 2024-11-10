package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "occupation_type")
public class OccupationTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String ocptnSrcTpCd;
    private String ocptnSrcTpDesc;
    private Integer ocptnEntpsTpCd;
    private String ocptnTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "occupation_type_id_seq")
    @SequenceGenerator(name = "occupation_type_id_seq", sequenceName = "occupation_type_id_seq", allocationSize = 1)
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
    @Column(name = "ocptn_src_tp_cd")
    public String getOcptnSrcTpCd() {
        return ocptnSrcTpCd;
    }

    public void setOcptnSrcTpCd(String ocptnSrcTpCd) {
        this.ocptnSrcTpCd = ocptnSrcTpCd;
    }

    @Basic
    @Column(name = "ocptn_src_tp_desc")
    public String getOcptnSrcTpDesc() {
        return ocptnSrcTpDesc;
    }

    public void setOcptnSrcTpDesc(String ocptnSrcTpDesc) {
        this.ocptnSrcTpDesc = ocptnSrcTpDesc;
    }

    @Basic
    @Column(name = "ocptn_entps_tp_cd")
    public Integer getOcptnEntpsTpCd() {
        return ocptnEntpsTpCd;
    }

    public void setOcptnEntpsTpCd(Integer ocptnEntpsTpCd) {
        this.ocptnEntpsTpCd = ocptnEntpsTpCd;
    }

    @Basic
    @Column(name = "ocptn_tp_desc")
    public String getOcptnTpDesc() {
        return ocptnTpDesc;
    }

    public void setOcptnTpDesc(String ocptnTpDesc) {
        this.ocptnTpDesc = ocptnTpDesc;
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
        OccupationTypeEntity that = (OccupationTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(ocptnSrcTpCd, that.ocptnSrcTpCd) &&
                Objects.equals(ocptnSrcTpDesc, that.ocptnSrcTpDesc) &&
                Objects.equals(ocptnEntpsTpCd, that.ocptnEntpsTpCd) &&
                Objects.equals(ocptnTpDesc, that.ocptnTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, ocptnSrcTpCd, ocptnSrcTpDesc, ocptnEntpsTpCd, ocptnTpDesc, effDte, expDte);
    }
}
