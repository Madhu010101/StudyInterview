package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partytype")
public class PartytypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer partySrcTpCd;
    private String partySrcTpDesc;
    private Integer partyEntpsTpCd;
    private String ptTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partytype_id_seq")
    @SequenceGenerator(name = "partytype_id_seq", sequenceName = "partytype_id_seq", allocationSize = 1)
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
    @Column(name = "party_src_tp_cd")
    public Integer getPartySrcTpCd() {
        return partySrcTpCd;
    }

    public void setPartySrcTpCd(Integer partySrcTpCd) {
        this.partySrcTpCd = partySrcTpCd;
    }

    @Basic
    @Column(name = "party_src_tp_desc")
    public String getPartySrcTpDesc() {
        return partySrcTpDesc;
    }

    public void setPartySrcTpDesc(String partySrcTpDesc) {
        this.partySrcTpDesc = partySrcTpDesc;
    }

    @Basic
    @Column(name = "party_entps_tp_cd")
    public Integer getPartyEntpsTpCd() {
        return partyEntpsTpCd;
    }

    public void setPartyEntpsTpCd(Integer partyEntpsTpCd) {
        this.partyEntpsTpCd = partyEntpsTpCd;
    }

    @Basic
    @Column(name = "pt_tp_desc")
    public String getPtTpDesc() {
        return ptTpDesc;
    }

    public void setPtTpDesc(String ptTpDesc) {
        this.ptTpDesc = ptTpDesc;
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
        PartytypeEntity that = (PartytypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(partySrcTpCd, that.partySrcTpCd) &&
                Objects.equals(partySrcTpDesc, that.partySrcTpDesc) &&
                Objects.equals(partyEntpsTpCd, that.partyEntpsTpCd) &&
                Objects.equals(ptTpDesc, that.ptTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partySrcTpCd, partySrcTpDesc, partyEntpsTpCd, ptTpDesc, effDte, expDte);
    }
}
