package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "party_stature_type")
public class PartyStatureTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partyStatrSrcTpCd;
    private String partyStatrSrcTpDesc;
    private String tblNme;
    private Integer partyStatrEntpsTpCd;
    private String partyStatrTpDesc;
    private String partyStatrTpEfctvDte;
    private String partyStatrTpExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_stature_type_id_seq")
    @SequenceGenerator(name = "party_stature_type_id_seq", sequenceName = "party_stature_type_id_seq", allocationSize = 1)
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
    @Column(name = "party_statr_src_tp_cd")
    public String getPartyStatrSrcTpCd() {
        return partyStatrSrcTpCd;
    }

    public void setPartyStatrSrcTpCd(String partyStatrSrcTpCd) {
        this.partyStatrSrcTpCd = partyStatrSrcTpCd;
    }

    @Basic
    @Column(name = "party_statr_src_tp_desc")
    public String getPartyStatrSrcTpDesc() {
        return partyStatrSrcTpDesc;
    }

    public void setPartyStatrSrcTpDesc(String partyStatrSrcTpDesc) {
        this.partyStatrSrcTpDesc = partyStatrSrcTpDesc;
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
    @Column(name = "party_statr_entps_tp_cd")
    public Integer getPartyStatrEntpsTpCd() {
        return partyStatrEntpsTpCd;
    }

    public void setPartyStatrEntpsTpCd(Integer partyStatrEntpsTpCd) {
        this.partyStatrEntpsTpCd = partyStatrEntpsTpCd;
    }

    @Basic
    @Column(name = "party_statr_tp_desc")
    public String getPartyStatrTpDesc() {
        return partyStatrTpDesc;
    }

    public void setPartyStatrTpDesc(String partyStatrTpDesc) {
        this.partyStatrTpDesc = partyStatrTpDesc;
    }

    @Basic
    @Column(name = "party_statr_tp_efctv_dte")
    public String getPartyStatrTpEfctvDte() {
        return partyStatrTpEfctvDte;
    }

    public void setPartyStatrTpEfctvDte(String partyStatrTpEfctvDte) {
        this.partyStatrTpEfctvDte = partyStatrTpEfctvDte;
    }

    @Basic
    @Column(name = "party_statr_tp_expry_dte")
    public String getPartyStatrTpExpryDte() {
        return partyStatrTpExpryDte;
    }

    public void setPartyStatrTpExpryDte(String partyStatrTpExpryDte) {
        this.partyStatrTpExpryDte = partyStatrTpExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartyStatureTypeEntity that = (PartyStatureTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(partyStatrSrcTpCd, that.partyStatrSrcTpCd) && Objects.equals(partyStatrSrcTpDesc, that.partyStatrSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(partyStatrEntpsTpCd, that.partyStatrEntpsTpCd) && Objects.equals(partyStatrTpDesc, that.partyStatrTpDesc) && Objects.equals(partyStatrTpEfctvDte, that.partyStatrTpEfctvDte) && Objects.equals(partyStatrTpExpryDte, that.partyStatrTpExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partyStatrSrcTpCd, partyStatrSrcTpDesc, tblNme, partyStatrEntpsTpCd, partyStatrTpDesc, partyStatrTpEfctvDte, partyStatrTpExpryDte);
    }
}
