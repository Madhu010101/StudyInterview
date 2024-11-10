package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organisation_status_type")
public class OrganisationStatusTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String orgSttsSrcTpCd;
    private String orgSttsSrcTpDesc;
    private Integer orgSttsEntpsTpCd;
    private String orgSttsTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_status_type_id_seq")
    @SequenceGenerator(name = "organisation_status_type_id_seq", sequenceName = "organisation_status_type_id_seq", allocationSize = 1)
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
    @Column(name = "org_stts_src_tp_cd")
    public String getOrgSttsSrcTpCd() {
        return orgSttsSrcTpCd;
    }

    public void setOrgSttsSrcTpCd(String orgSttsSrcTpCd) {
        this.orgSttsSrcTpCd = orgSttsSrcTpCd;
    }

    @Basic
    @Column(name = "org_stts_src_tp_desc")
    public String getOrgSttsSrcTpDesc() {
        return orgSttsSrcTpDesc;
    }

    public void setOrgSttsSrcTpDesc(String orgSttsSrcTpDesc) {
        this.orgSttsSrcTpDesc = orgSttsSrcTpDesc;
    }

    @Basic
    @Column(name = "org_stts_entps_tp_cd")
    public Integer getOrgSttsEntpsTpCd() {
        return orgSttsEntpsTpCd;
    }

    public void setOrgSttsEntpsTpCd(Integer orgSttsEntpsTpCd) {
        this.orgSttsEntpsTpCd = orgSttsEntpsTpCd;
    }

    @Basic
    @Column(name = "org_stts_tp_desc")
    public String getOrgSttsTpDesc() {
        return orgSttsTpDesc;
    }

    public void setOrgSttsTpDesc(String orgSttsTpDesc) {
        this.orgSttsTpDesc = orgSttsTpDesc;
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
        OrganisationStatusTypeEntity that = (OrganisationStatusTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(orgSttsSrcTpCd, that.orgSttsSrcTpCd) &&
                Objects.equals(orgSttsSrcTpDesc, that.orgSttsSrcTpDesc) &&
                Objects.equals(orgSttsEntpsTpCd, that.orgSttsEntpsTpCd) &&
                Objects.equals(orgSttsTpDesc, that.orgSttsTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, orgSttsSrcTpCd, orgSttsSrcTpDesc, orgSttsEntpsTpCd, orgSttsTpDesc, effDte, expDte);
    }
}
