package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_type")
public class TitleTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String ttleSrcTpCd;
    private String ttleSrcTpDesc;
    private Integer ttleEntpsTpCd;
    private String ttleTpDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "title_type_id_seq")
    @SequenceGenerator(name = "title_type_id_seq", sequenceName = "title_type_id_seq", allocationSize = 1)
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
    @Column(name = "ttle_src_tp_cd")
    public String getTtleSrcTpCd() {
        return ttleSrcTpCd;
    }

    public void setTtleSrcTpCd(String ttleSrcTpCd) {
        this.ttleSrcTpCd = ttleSrcTpCd;
    }

    @Basic
    @Column(name = "ttle_src_tp_desc")
    public String getTtleSrcTpDesc() {
        return ttleSrcTpDesc;
    }

    public void setTtleSrcTpDesc(String ttleSrcTpDesc) {
        this.ttleSrcTpDesc = ttleSrcTpDesc;
    }

    @Basic
    @Column(name = "ttle_entps_tp_cd")
    public Integer getTtleEntpsTpCd() {
        return ttleEntpsTpCd;
    }

    public void setTtleEntpsTpCd(Integer ttleEntpsTpCd) {
        this.ttleEntpsTpCd = ttleEntpsTpCd;
    }

    @Basic
    @Column(name = "ttle_tp_desc")
    public String getTtleTpDesc() {
        return ttleTpDesc;
    }

    public void setTtleTpDesc(String ttleTpDesc) {
        this.ttleTpDesc = ttleTpDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleTypeEntity that = (TitleTypeEntity) o;
        return id == that.id &&
                Objects.equals(stmTpCd, that.stmTpCd) &&
                Objects.equals(srcTblNo, that.srcTblNo) &&
                Objects.equals(srcTblNme, that.srcTblNme) &&
                Objects.equals(srcCat, that.srcCat) &&
                Objects.equals(ttleSrcTpCd, that.ttleSrcTpCd) &&
                Objects.equals(ttleSrcTpDesc, that.ttleSrcTpDesc) &&
                Objects.equals(ttleEntpsTpCd, that.ttleEntpsTpCd) &&
                Objects.equals(ttleTpDesc, that.ttleTpDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stmTpCd, srcTblNo, srcTblNme, srcCat, ttleSrcTpCd, ttleSrcTpDesc, ttleEntpsTpCd, ttleTpDesc);
    }
}
