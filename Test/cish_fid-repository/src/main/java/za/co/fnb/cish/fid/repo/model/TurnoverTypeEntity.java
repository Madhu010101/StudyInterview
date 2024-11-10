package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "turnover_type")
public class TurnoverTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer tnvrSrcTpCd;
    private String tnvrSrcTpDesc;
    private Integer tnvrEntpsTpCd;
    private String tnvrTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turnover_type_id_seq")
    @SequenceGenerator(name = "turnover_type_id_seq", sequenceName = "turnover_type_id_seq", allocationSize = 1)
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
    @Column(name = "tnvr_src_tp_cd")
    public Integer getTnvrSrcTpCd() {
        return tnvrSrcTpCd;
    }

    public void setTnvrSrcTpCd(Integer tnvrSrcTpCd) {
        this.tnvrSrcTpCd = tnvrSrcTpCd;
    }

    @Basic
    @Column(name = "tnvr_src_tp_desc")
    public String getTnvrSrcTpDesc() {
        return tnvrSrcTpDesc;
    }

    public void setTnvrSrcTpDesc(String tnvrSrcTpDesc) {
        this.tnvrSrcTpDesc = tnvrSrcTpDesc;
    }

    @Basic
    @Column(name = "tnvr_entps_tp_cd")
    public Integer getTnvrEntpsTpCd() {
        return tnvrEntpsTpCd;
    }

    public void setTnvrEntpsTpCd(Integer tnvrEntpsTpCd) {
        this.tnvrEntpsTpCd = tnvrEntpsTpCd;
    }

    @Basic
    @Column(name = "tnvr_tp_desc")
    public String getTnvrTpDesc() {
        return tnvrTpDesc;
    }

    public void setTnvrTpDesc(String tnvrTpDesc) {
        this.tnvrTpDesc = tnvrTpDesc;
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
        TurnoverTypeEntity that = (TurnoverTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(tnvrSrcTpCd, that.tnvrSrcTpCd) &&
                Objects.equals(tnvrSrcTpDesc, that.tnvrSrcTpDesc) &&
                Objects.equals(tnvrEntpsTpCd, that.tnvrEntpsTpCd) &&
                Objects.equals(tnvrTpDesc, that.tnvrTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, tnvrSrcTpCd, tnvrSrcTpDesc, tnvrEntpsTpCd, tnvrTpDesc, effDte, expDte);
    }
}
