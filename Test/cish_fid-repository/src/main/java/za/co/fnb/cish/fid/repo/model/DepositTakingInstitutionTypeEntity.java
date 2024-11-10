package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "deposit_taking_institution_type")
public class DepositTakingInstitutionTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String dtiTpSrcTpCd;
    private String dtiTpSrcTpDesc;
    private String tblNme;
    private Integer dtiEntpsTpCd;
    private String dtiEntpsTpDesc;
    private String dtiTpEfctvDt;
    private String dtiTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deposit_taking_institution_type_id_seq")
    @SequenceGenerator(name = "deposit_taking_institution_type_id_seq", sequenceName = "deposit_taking_institution_type_id_seq", allocationSize = 1)
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
    @Column(name = "dti_tp_src_tp_cd")
    public String getDtiTpSrcTpCd() {
        return dtiTpSrcTpCd;
    }

    public void setDtiTpSrcTpCd(String dtiTpSrcTpCd) {
        this.dtiTpSrcTpCd = dtiTpSrcTpCd;
    }

    @Basic
    @Column(name = "dti_tp_src_tp_desc")
    public String getDtiTpSrcTpDesc() {
        return dtiTpSrcTpDesc;
    }

    public void setDtiTpSrcTpDesc(String dtiTpSrcTpDesc) {
        this.dtiTpSrcTpDesc = dtiTpSrcTpDesc;
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
    @Column(name = "dti_entps_tp_cd")
    public Integer getDtiEntpsTpCd() {
        return dtiEntpsTpCd;
    }

    public void setDtiEntpsTpCd(Integer dtiEntpsTpCd) {
        this.dtiEntpsTpCd = dtiEntpsTpCd;
    }

    @Basic
    @Column(name = "dti_entps_tp_desc")
    public String getDtiEntpsTpDesc() {
        return dtiEntpsTpDesc;
    }

    public void setDtiEntpsTpDesc(String dtiEntpsTpDesc) {
        this.dtiEntpsTpDesc = dtiEntpsTpDesc;
    }

    @Basic
    @Column(name = "dti_tp_efctv_dt")
    public String getDtiTpEfctvDt() {
        return dtiTpEfctvDt;
    }

    public void setDtiTpEfctvDt(String dtiTpEfctvDt) {
        this.dtiTpEfctvDt = dtiTpEfctvDt;
    }

    @Basic
    @Column(name = "dti_tp_expry_dt")
    public String getDtiTpExpryDt() {
        return dtiTpExpryDt;
    }

    public void setDtiTpExpryDt(String dtiTpExpryDt) {
        this.dtiTpExpryDt = dtiTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositTakingInstitutionTypeEntity that = (DepositTakingInstitutionTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(dtiTpSrcTpCd, that.dtiTpSrcTpCd) && Objects.equals(dtiTpSrcTpDesc, that.dtiTpSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(dtiEntpsTpCd, that.dtiEntpsTpCd) && Objects.equals(dtiEntpsTpDesc, that.dtiEntpsTpDesc) && Objects.equals(dtiTpEfctvDt, that.dtiTpEfctvDt) && Objects.equals(dtiTpExpryDt, that.dtiTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, dtiTpSrcTpCd, dtiTpSrcTpDesc, tblNme, dtiEntpsTpCd, dtiEntpsTpDesc, dtiTpEfctvDt, dtiTpExpryDt);
    }
}
