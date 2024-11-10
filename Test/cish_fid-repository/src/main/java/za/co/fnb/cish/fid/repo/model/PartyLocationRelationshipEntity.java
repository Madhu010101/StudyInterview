package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "party_location_relationship")
public class PartyLocationRelationshipEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partyLocRltnpSrcTpCd;
    private String partyLocRltnpSrcTpDesc;
    private String tblNme;
    private Integer partyLocRltnpEntpsTpCd;
    private String partyLocRltnpTpDesc;
    private String partyLocRltnpTpEfctvDt;
    private String partyLocRltnpTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_location_relationship_id_seq")
    @SequenceGenerator(name = "party_location_relationship_id_seq", sequenceName = "party_location_relationship_id_seq", allocationSize = 1)
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
    @Column(name = "party_loc_rltnp_src_tp_cd")
    public String getPartyLocRltnpSrcTpCd() {
        return partyLocRltnpSrcTpCd;
    }

    public void setPartyLocRltnpSrcTpCd(String partyLocRltnpSrcTpCd) {
        this.partyLocRltnpSrcTpCd = partyLocRltnpSrcTpCd;
    }

    @Basic
    @Column(name = "party_loc_rltnp_src_tp_desc")
    public String getPartyLocRltnpSrcTpDesc() {
        return partyLocRltnpSrcTpDesc;
    }

    public void setPartyLocRltnpSrcTpDesc(String partyLocRltnpSrcTpDesc) {
        this.partyLocRltnpSrcTpDesc = partyLocRltnpSrcTpDesc;
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
    @Column(name = "party_loc_rltnp_entps_tp_cd")
    public Integer getPartyLocRltnpEntpsTpCd() {
        return partyLocRltnpEntpsTpCd;
    }

    public void setPartyLocRltnpEntpsTpCd(Integer partyLocRltnpEntpsTpCd) {
        this.partyLocRltnpEntpsTpCd = partyLocRltnpEntpsTpCd;
    }

    @Basic
    @Column(name = "party_loc_rltnp_tp_desc")
    public String getPartyLocRltnpTpDesc() {
        return partyLocRltnpTpDesc;
    }

    public void setPartyLocRltnpTpDesc(String partyLocRltnpTpDesc) {
        this.partyLocRltnpTpDesc = partyLocRltnpTpDesc;
    }

    @Basic
    @Column(name = "party_loc_rltnp_tp_efctv_dt")
    public String getPartyLocRltnpTpEfctvDt() {
        return partyLocRltnpTpEfctvDt;
    }

    public void setPartyLocRltnpTpEfctvDt(String partyLocRltnpTpEfctvDt) {
        this.partyLocRltnpTpEfctvDt = partyLocRltnpTpEfctvDt;
    }

    @Basic
    @Column(name = "party_loc_rltnp_tp_expry_dt")
    public String getPartyLocRltnpTpExpryDt() {
        return partyLocRltnpTpExpryDt;
    }

    public void setPartyLocRltnpTpExpryDt(String partyLocRltnpTpExpryDt) {
        this.partyLocRltnpTpExpryDt = partyLocRltnpTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartyLocationRelationshipEntity that = (PartyLocationRelationshipEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(partyLocRltnpSrcTpCd, that.partyLocRltnpSrcTpCd) && Objects.equals(partyLocRltnpSrcTpDesc, that.partyLocRltnpSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(partyLocRltnpEntpsTpCd, that.partyLocRltnpEntpsTpCd) && Objects.equals(partyLocRltnpTpDesc, that.partyLocRltnpTpDesc) && Objects.equals(partyLocRltnpTpEfctvDt, that.partyLocRltnpTpEfctvDt) && Objects.equals(partyLocRltnpTpExpryDt, that.partyLocRltnpTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partyLocRltnpSrcTpCd, partyLocRltnpSrcTpDesc, tblNme, partyLocRltnpEntpsTpCd, partyLocRltnpTpDesc, partyLocRltnpTpEfctvDt, partyLocRltnpTpExpryDt);
    }
}
