package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "source_of_fund")
public class SourceOfFundEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String partyFundSrcTpCd;
    private String partyFundSrcTpDesc;
    private String tblNme;
    private Integer partyFundEntpsTpCd;
    private String partyFndTpDesc;
    private Integer partyEntpsTpCd;
    private String partyFundTpEfctvDt;
    private String partyFundTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "source_of_fund_id_seq")
    @SequenceGenerator(name = "source_of_fund_id_seq", sequenceName = "source_of_fund_id_seq", allocationSize = 1)
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
    @Column(name = "party_fund_src_tp_cd")
    public String getPartyFundSrcTpCd() {
        return partyFundSrcTpCd;
    }

    public void setPartyFundSrcTpCd(String partyFundSrcTpCd) {
        this.partyFundSrcTpCd = partyFundSrcTpCd;
    }

    @Basic
    @Column(name = "party_fund_src_tp_desc")
    public String getPartyFundSrcTpDesc() {
        return partyFundSrcTpDesc;
    }

    public void setPartyFundSrcTpDesc(String partyFundSrcTpDesc) {
        this.partyFundSrcTpDesc = partyFundSrcTpDesc;
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
    @Column(name = "party_fund_entps_tp_cd")
    public Integer getPartyFundEntpsTpCd() {
        return partyFundEntpsTpCd;
    }

    public void setPartyFundEntpsTpCd(Integer partyFundEntpsTpCd) {
        this.partyFundEntpsTpCd = partyFundEntpsTpCd;
    }

    @Basic
    @Column(name = "party_fnd_tp_desc")
    public String getPartyFndTpDesc() {
        return partyFndTpDesc;
    }

    public void setPartyFndTpDesc(String partyFndTpDesc) {
        this.partyFndTpDesc = partyFndTpDesc;
    }

    @Basic
    @Column(name = "party_fund_tp_efctv_dt")
    public String getPartyFundTpEfctvDt() {
        return partyFundTpEfctvDt;
    }

    public void setPartyFundTpEfctvDt(String partyFundTpEfctvDt) {
        this.partyFundTpEfctvDt = partyFundTpEfctvDt;
    }

    @Basic
    @Column(name = "party_fund_tp_expry_dt")
    public String getPartyFundTpExpryDt() {
        return partyFundTpExpryDt;
    }

    public void setPartyFundTpExpryDt(String partyFundTpExpryDt) {
        this.partyFundTpExpryDt = partyFundTpExpryDt;
    }
    @Basic
    @Column(name = "party_tp_cd")
    public Integer getPartyEntpsTpCd() {
        return partyEntpsTpCd;
    }

    public void setPartyEntpsTpCd(Integer partyEntpsTpCd) {
        this.partyEntpsTpCd = partyEntpsTpCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceOfFundEntity that = (SourceOfFundEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(partyFundSrcTpDesc, that.partyFundSrcTpDesc)&& Objects.equals(partyFundSrcTpDesc, that.partyFundSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(partyFundEntpsTpCd, that.partyFundEntpsTpCd) && Objects.equals(partyFndTpDesc, that.partyFndTpDesc) && Objects.equals(partyEntpsTpCd, that.partyEntpsTpCd) && Objects.equals(partyFundTpEfctvDt, that.partyFundTpEfctvDt) && Objects.equals(partyFundTpExpryDt, that.partyFundTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, partyFundSrcTpCd, partyFundSrcTpDesc, tblNme, partyFundEntpsTpCd, partyFndTpDesc,partyEntpsTpCd,partyFundTpEfctvDt, partyFundTpExpryDt);
    }


}
