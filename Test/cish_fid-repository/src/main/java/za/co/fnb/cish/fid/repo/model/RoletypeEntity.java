package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roletype")
public class RoletypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partyRoleSrcTpCd;
    private String partyRoleSrcTpDesc;
    private Integer partyRoleEntpsTpCd;
    private String rlTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roletype_id_seq")
    @SequenceGenerator(name = "roletype_id_seq", sequenceName = "roletype_id_seq", allocationSize = 1)
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
    @Column(name = "party_role_src_tp_cd")
    public String getPartyRoleSrcTpCd() {
        return partyRoleSrcTpCd;
    }

    public void setPartyRoleSrcTpCd(String partyRoleSrcTpCd) {
        this.partyRoleSrcTpCd = partyRoleSrcTpCd;
    }

    @Basic
    @Column(name = "party_role_src_tp_desc")
    public String getPartyRoleSrcTpDesc() {
        return partyRoleSrcTpDesc;
    }

    public void setPartyRoleSrcTpDesc(String partyRoleSrcTpDesc) {
        this.partyRoleSrcTpDesc = partyRoleSrcTpDesc;
    }

    @Basic
    @Column(name = "party_role_entps_tp_cd")
    public Integer getPartyRoleEntpsTpCd() {
        return partyRoleEntpsTpCd;
    }

    public void setPartyRoleEntpsTpCd(Integer partyRoleEntpsTpCd) {
        this.partyRoleEntpsTpCd = partyRoleEntpsTpCd;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoletypeEntity that = (RoletypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(partyRoleSrcTpCd, that.partyRoleSrcTpCd) &&
                Objects.equals(partyRoleSrcTpDesc, that.partyRoleSrcTpDesc) &&
                Objects.equals(partyRoleEntpsTpCd, that.partyRoleEntpsTpCd) &&
                Objects.equals(rlTpDesc, that.rlTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partyRoleSrcTpCd, partyRoleSrcTpDesc, partyRoleEntpsTpCd, rlTpDesc, effDte, expDte);
    }
}
