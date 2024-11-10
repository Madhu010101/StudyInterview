package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organisation_size_type")
public class OrganisationSizeTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String orgSizeSrcTpCd;
    private String orgSizeSrcTpDesc;
    private Integer orgSizeEntpsTpCd;
    private String orgSizeTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_size_type_id_seq")
    @SequenceGenerator(name = "organisation_size_type_id_seq", sequenceName = "organisation_size_type_id_seq", allocationSize = 1)
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
    @Column(name = "org_size_src_tp_cd")
    public String getOrgSizeSrcTpCd() {
        return orgSizeSrcTpCd;
    }

    public void setOrgSizeSrcTpCd(String orgSizeSrcTpCd) {
        this.orgSizeSrcTpCd = orgSizeSrcTpCd;
    }

    @Basic
    @Column(name = "org_size_src_tp_desc")
    public String getOrgSizeSrcTpDesc() {
        return orgSizeSrcTpDesc;
    }

    public void setOrgSizeSrcTpDesc(String orgSizeSrcTpDesc) {
        this.orgSizeSrcTpDesc = orgSizeSrcTpDesc;
    }

    @Basic
    @Column(name = "org_size_entps_tp_cd")
    public Integer getOrgSizeEntpsTpCd() {
        return orgSizeEntpsTpCd;
    }

    public void setOrgSizeEntpsTpCd(Integer orgSizeEntpsTpCd) {
        this.orgSizeEntpsTpCd = orgSizeEntpsTpCd;
    }

    @Basic
    @Column(name = "org_size_tp_desc")
    public String getOrgSizeTpDesc() {
        return orgSizeTpDesc;
    }

    public void setOrgSizeTpDesc(String orgSizeTpDesc) {
        this.orgSizeTpDesc = orgSizeTpDesc;
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
        OrganisationSizeTypeEntity that = (OrganisationSizeTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(orgSizeSrcTpCd, that.orgSizeSrcTpCd) &&
                Objects.equals(orgSizeSrcTpDesc, that.orgSizeSrcTpDesc) &&
                Objects.equals(orgSizeEntpsTpCd, that.orgSizeEntpsTpCd) &&
                Objects.equals(orgSizeTpDesc, that.orgSizeTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, orgSizeSrcTpCd, orgSizeSrcTpDesc, orgSizeEntpsTpCd, orgSizeTpDesc, effDte, expDte);
    }
}
