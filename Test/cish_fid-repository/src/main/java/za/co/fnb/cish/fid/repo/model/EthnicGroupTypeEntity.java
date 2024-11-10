package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ethnic_group_type")
public class EthnicGroupTypeEntity {
    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer ethnicGrpSrcTpCd;
    private String ethnicGrpSrcTpDesc;
    private Integer ethnicGrpEntpsTpCd;
    private String ethnicGrpTpDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ethnic_group_type_id_seq")
    @SequenceGenerator(name = "ethnic_group_type_id_seq", sequenceName = "ethnic_group_type_id_seq", allocationSize = 1)
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
    @Column(name = "ethnic_grp_src_tp_cd")
    public Integer getEthnicGrpSrcTpCd() {
        return ethnicGrpSrcTpCd;
    }

    public void setEthnicGrpSrcTpCd(Integer ethnicGrpSrcTpCd) {
        this.ethnicGrpSrcTpCd = ethnicGrpSrcTpCd;
    }

    @Basic
    @Column(name = "ethnic_grp_src_tp_desc")
    public String getEthnicGrpSrcTpDesc() {
        return ethnicGrpSrcTpDesc;
    }

    public void setEthnicGrpSrcTpDesc(String ethnicGrpSrcTpDesc) {
        this.ethnicGrpSrcTpDesc = ethnicGrpSrcTpDesc;
    }

    @Basic
    @Column(name = "ethnic_grp_entps_tp_cd")
    public Integer getEthnicGrpEntpsTpCd() {
        return ethnicGrpEntpsTpCd;
    }

    public void setEthnicGrpEntpsTpCd(Integer ethnicGrpEntpsTpCd) {
        this.ethnicGrpEntpsTpCd = ethnicGrpEntpsTpCd;
    }

    @Basic
    @Column(name = "ethnic_grp_tp_desc")
    public String getEthnicGrpTpDesc() {
        return ethnicGrpTpDesc;
    }

    public void setEthnicGrpTpDesc(String ethnicGrpTpDesc) {
        this.ethnicGrpTpDesc = ethnicGrpTpDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthnicGroupTypeEntity that = (EthnicGroupTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(cmpnyTpCd, that.cmpnyTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(ethnicGrpSrcTpCd, that.ethnicGrpSrcTpCd) &&
                Objects.equals(ethnicGrpSrcTpDesc, that.ethnicGrpSrcTpDesc) &&
                Objects.equals(ethnicGrpEntpsTpCd, that.ethnicGrpEntpsTpCd) &&
                Objects.equals(ethnicGrpTpDesc, that.ethnicGrpTpDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, cmpnyTpCd, srcTblNo, srcTblNme, srcCat, ethnicGrpSrcTpCd, ethnicGrpSrcTpDesc, ethnicGrpEntpsTpCd, ethnicGrpTpDesc);
    }
}
