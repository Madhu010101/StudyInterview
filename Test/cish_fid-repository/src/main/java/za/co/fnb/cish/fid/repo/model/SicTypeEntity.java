package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sic_type")
public class SicTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer indstrySrcTpCd;
    private String indstrySrcTpDesc;
    private String tblNme;
    private String indstryEntpsTpCd;
    private String indstryEntpsTpDesc;
    private Integer indstryCatTpId;
    private String indstryTpEffDte;
    private String indstryTpExpDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sic_type_id_seq")
    @SequenceGenerator(name = "sic_type_id_seq", sequenceName = "sic_type_id_seq", allocationSize = 1)
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
    @Column(name = "indstry_src_tp_cd")
    public Integer getIndstrySrcTpCd() {
        return indstrySrcTpCd;
    }

    public void setIndstrySrcTpCd(Integer indstrySrcTpCd) {
        this.indstrySrcTpCd = indstrySrcTpCd;
    }

    @Basic
    @Column(name = "indstry_src_tp_desc")
    public String getIndstrySrcTpDesc() {
        return indstrySrcTpDesc;
    }

    public void setIndstrySrcTpDesc(String indstrySrcTpDesc) {
        this.indstrySrcTpDesc = indstrySrcTpDesc;
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
    @Column(name = "indstry_entps_tp_cd")
    public String getIndstryEntpsTpCd() {
        return indstryEntpsTpCd;
    }

    public void setIndstryEntpsTpCd(String indstryEntpsTpCd) {
        this.indstryEntpsTpCd = indstryEntpsTpCd;
    }

    @Basic
    @Column(name = "indstry_entps_tp_desc")
    public String getIndstryEntpsTpDesc() {
        return indstryEntpsTpDesc;
    }

    public void setIndstryEntpsTpDesc(String indstryEntpsTpDesc) {
        this.indstryEntpsTpDesc = indstryEntpsTpDesc;
    }

    @Basic
    @Column(name = "indstry_cat_tp_id")
    public Integer getIndstryCatTpId() {
        return indstryCatTpId;
    }

    public void setIndstryCatTpId(Integer indstryCatTpId) {
        this.indstryCatTpId = indstryCatTpId;
    }

    @Basic
    @Column(name = "indstry_tp_eff_dte")
    public String getIndstryTpEffDte() {
        return indstryTpEffDte;
    }

    public void setIndstryTpEffDte(String indstryTpEffDte) {
        this.indstryTpEffDte = indstryTpEffDte;
    }

    @Basic
    @Column(name = "indstry_tp_exp_dte")
    public String getIndstryTpExpDte() {
        return indstryTpExpDte;
    }

    public void setIndstryTpExpDte(String indstryTpExpDte) {
        this.indstryTpExpDte = indstryTpExpDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SicTypeEntity that = (SicTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(cmpnyTpCd, that.cmpnyTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(indstrySrcTpCd, that.indstrySrcTpCd) && Objects.equals(indstrySrcTpDesc, that.indstrySrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(indstryEntpsTpCd, that.indstryEntpsTpCd) && Objects.equals(indstryEntpsTpDesc, that.indstryEntpsTpDesc) && Objects.equals(indstryCatTpId, that.indstryCatTpId) && Objects.equals(indstryTpEffDte, that.indstryTpEffDte) && Objects.equals(indstryTpExpDte, that.indstryTpExpDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, indstrySrcTpCd, indstrySrcTpDesc, tblNme, indstryEntpsTpCd, indstryEntpsTpDesc, indstryCatTpId, indstryTpEffDte, indstryTpExpDte);
    }
}
