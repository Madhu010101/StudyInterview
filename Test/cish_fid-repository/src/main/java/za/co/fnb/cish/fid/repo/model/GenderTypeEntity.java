package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gender_type")
public class GenderTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String gndrSrcTpCd;
    private String gndrSrcTpDesc;
    private Integer gndrEntpsTpCd;
    private String gndrTpDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gender_type_id_seq")
    @SequenceGenerator(name = "gender_type_id_seq", sequenceName = "gender_type_id_seq", allocationSize = 1)
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
    @Column(name = "gndr_src_tp_cd")
    public String getGndrSrcTpCd() {
        return gndrSrcTpCd;
    }

    public void setGndrSrcTpCd(String gndrSrcTpCd) {
        this.gndrSrcTpCd = gndrSrcTpCd;
    }

    @Basic
    @Column(name = "gndr_src_tp_desc")
    public String getGndrSrcTpDesc() {
        return gndrSrcTpDesc;
    }

    public void setGndrSrcTpDesc(String gndrSrcTpDesc) {
        this.gndrSrcTpDesc = gndrSrcTpDesc;
    }

    @Basic
    @Column(name = "gndr_entps_tp_cd")
    public Integer getGndrEntpsTpCd() {
        return gndrEntpsTpCd;
    }

    public void setGndrEntpsTpCd(Integer gndrEntpsTpCd) {
        this.gndrEntpsTpCd = gndrEntpsTpCd;
    }

    @Basic
    @Column(name = "gndr_tp_desc")
    public String getGndrTpDesc() {
        return gndrTpDesc;
    }

    public void setGndrTpDesc(String gndrTpDesc) {
        this.gndrTpDesc = gndrTpDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenderTypeEntity that = (GenderTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(gndrSrcTpCd, that.gndrSrcTpCd) &&
                Objects.equals(gndrSrcTpDesc, that.gndrSrcTpDesc) &&
                Objects.equals(gndrEntpsTpCd, that.gndrEntpsTpCd) &&
                Objects.equals(gndrTpDesc, that.gndrTpDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, srcTblNo, srcTblNme, srcCat, gndrSrcTpCd, gndrSrcTpDesc, gndrEntpsTpCd, gndrTpDesc);
    }
}
