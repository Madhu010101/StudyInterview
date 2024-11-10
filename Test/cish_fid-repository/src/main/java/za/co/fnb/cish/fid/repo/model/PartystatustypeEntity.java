package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partystatustype")
public class PartystatustypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partySttsSrcTpCd;
    private String partySttsSrcTpDesc;
    private String tblNme;
    private Integer partySttsEntpsTpCd;
    private String rlTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partystatustype_id_seq")
    @SequenceGenerator(name = "partystatustype_id_seq", sequenceName = "partystatustype_id_seq", allocationSize = 1)
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
    @Column(name = "party_stts_src_tp_cd")
    public String getPartySttsSrcTpCd() {
        return partySttsSrcTpCd;
    }

    public void setPartySttsSrcTpCd(String partySttsSrcTpCd) {
        this.partySttsSrcTpCd = partySttsSrcTpCd;
    }

    @Basic
    @Column(name = "party_stts_src_tp_desc")
    public String getPartySttsSrcTpDesc() {
        return partySttsSrcTpDesc;
    }

    public void setPartySttsSrcTpDesc(String partySttsSrcTpDesc) {
        this.partySttsSrcTpDesc = partySttsSrcTpDesc;
    }

    @Basic
    @Column(name = "party_stts_entps_tp_cd")
    public Integer getPartySttsEntpsTpCd() {
        return partySttsEntpsTpCd;
    }

    public void setPartySttsEntpsTpCd(Integer partySttsEntpsTpCd) {
        this.partySttsEntpsTpCd = partySttsEntpsTpCd;
    }

    @Basic
    @Column(name = "rl_tp_desc")
    public String getRlTpDesc() {
        return rlTpDesc;
    }

    public void setRlTpDesc(String rlTpDesc) {
        this.rlTpDesc = rlTpDesc;
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
    @Column(name = "tbl_nme")
    public String getTblNme() {
        return tblNme;
    }

    public void setTblNme(String tblNme) {
        this.tblNme = tblNme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartystatustypeEntity that = (PartystatustypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(partySttsSrcTpCd, that.partySttsSrcTpCd) &&
                Objects.equals(partySttsSrcTpDesc, that.partySttsSrcTpDesc) &&
                Objects.equals(tblNme, that.tblNme) &&
                Objects.equals(partySttsEntpsTpCd, that.partySttsEntpsTpCd) &&
                Objects.equals(rlTpDesc, that.rlTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partySttsSrcTpCd, partySttsSrcTpDesc, tblNme, partySttsEntpsTpCd, rlTpDesc, effDte, expDte);
    }
}
