package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kyc_status_type")
public class KycStatusTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String kycSttsSrcTpCd;
    private String kycSttsSrcTpDesc;
    private Integer kycSttsEntpsTpCd;
    private String kycSttsTpDesc;
    private String prmInd;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kyc_status_type_id_seq")
    @SequenceGenerator(name = "kyc_status_type_id_seq", sequenceName = "kyc_status_type_id_seq", allocationSize = 1)
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
    @Column(name = "kyc_stts_src_tp_cd")
    public String getKycSttsSrcTpCd() {
        return kycSttsSrcTpCd;
    }

    public void setKycSttsSrcTpCd(String kycSttsSrcTpCd) {
        this.kycSttsSrcTpCd = kycSttsSrcTpCd;
    }

    @Basic
    @Column(name = "kyc_stts_src_tp_desc")
    public String getKycSttsSrcTpDesc() {
        return kycSttsSrcTpDesc;
    }

    public void setKycSttsSrcTpDesc(String kycSttsSrcTpDesc) {
        this.kycSttsSrcTpDesc = kycSttsSrcTpDesc;
    }

    @Basic
    @Column(name = "kyc_stts_entps_tp_cd")
    public Integer getKycSttsEntpsTpCd() {
        return kycSttsEntpsTpCd;
    }

    public void setKycSttsEntpsTpCd(Integer kycSttsEntpsTpCd) {
        this.kycSttsEntpsTpCd = kycSttsEntpsTpCd;
    }

    @Basic
    @Column(name = "kyc_stts_tp_desc")
    public String getKycSttsTpDesc() {
        return kycSttsTpDesc;
    }

    public void setKycSttsTpDesc(String kycSttsTpDesc) {
        this.kycSttsTpDesc = kycSttsTpDesc;
    }

    @Basic
    @Column(name = "prm_ind")
    public String getPrmInd() {
        return prmInd;
    }

    public void setPrmInd(String prmInd) {
        this.prmInd = prmInd;
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
        KycStatusTypeEntity that = (KycStatusTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(kycSttsSrcTpCd, that.kycSttsSrcTpCd) &&
                Objects.equals(kycSttsSrcTpDesc, that.kycSttsSrcTpDesc) &&
                Objects.equals(kycSttsEntpsTpCd, that.kycSttsEntpsTpCd) &&
                Objects.equals(kycSttsTpDesc, that.kycSttsTpDesc) &&
                Objects.equals(prmInd, that.prmInd) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, kycSttsSrcTpCd, kycSttsSrcTpDesc, kycSttsEntpsTpCd, kycSttsTpDesc, prmInd, effDte, expDte);
    }
}
