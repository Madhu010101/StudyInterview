package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "foreign_tax_liability_type")
public class ForeignTaxLiabilityTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String frgnTaxLbltySrcTpCd;
    private String frgnTaxLbltySrcTpDesc;
    private Integer frgnTaxLbltyEntpsTpCd;
    private String frgnTaxLbltyTpDesc;
    private String effDte;
    private String expDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foreign_tax_liability_type_id_seq")
    @SequenceGenerator(name = "foreign_tax_liability_type_id_seq", sequenceName = "foreign_tax_liability_type_id_seq", allocationSize = 1)
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
    public String getSrcTblNo() {
        return srcTblNo;
    }

    public void setSrcTblNo(String srcTblNo) {
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
    @Column(name = "frgn_tax_lblty_src_tp_cd")
    public String getFrgnTaxLbltySrcTpCd() {
        return frgnTaxLbltySrcTpCd;
    }

    public void setFrgnTaxLbltySrcTpCd(String frgnTaxLbltySrcTpCd) {
        this.frgnTaxLbltySrcTpCd = frgnTaxLbltySrcTpCd;
    }

    @Basic
    @Column(name = "frgn_tax_lblty_src_tp_desc")
    public String getFrgnTaxLbltySrcTpDesc() {
        return frgnTaxLbltySrcTpDesc;
    }

    public void setFrgnTaxLbltySrcTpDesc(String frgnTaxLbltySrcTpDesc) {
        this.frgnTaxLbltySrcTpDesc = frgnTaxLbltySrcTpDesc;
    }

    @Basic
    @Column(name = "frgn_tax_lblty_entps_tp_cd")
    public Integer getFrgnTaxLbltyEntpsTpCd() {
        return frgnTaxLbltyEntpsTpCd;
    }

    public void setFrgnTaxLbltyEntpsTpCd(Integer frgnTaxLbltyEntpsTpCd) {
        this.frgnTaxLbltyEntpsTpCd = frgnTaxLbltyEntpsTpCd;
    }

    @Basic
    @Column(name = "frgn_tax_lblty_tp_desc")
    public String getFrgnTaxLbltyTpDesc() {
        return frgnTaxLbltyTpDesc;
    }

    public void setFrgnTaxLbltyTpDesc(String frgnTaxLbltyTpDesc) {
        this.frgnTaxLbltyTpDesc = frgnTaxLbltyTpDesc;
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
        ForeignTaxLiabilityTypeEntity that = (ForeignTaxLiabilityTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(frgnTaxLbltySrcTpCd, that.frgnTaxLbltySrcTpCd) &&
                Objects.equals(frgnTaxLbltySrcTpDesc, that.frgnTaxLbltySrcTpDesc) &&
                Objects.equals(frgnTaxLbltyEntpsTpCd, that.frgnTaxLbltyEntpsTpCd) &&
                Objects.equals(frgnTaxLbltyTpDesc, that.frgnTaxLbltyTpDesc) &&
                Objects.equals(effDte, that.effDte) &&
                Objects.equals(expDte, that.expDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, frgnTaxLbltySrcTpCd, frgnTaxLbltySrcTpDesc, frgnTaxLbltyEntpsTpCd, frgnTaxLbltyTpDesc, effDte, expDte);
    }
}
