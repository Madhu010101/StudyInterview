package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "geo_address_type")
public class GeoAddressTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String geoAddrSrcTpCd;
    private String geoAddrSrcTpDesc;
    private String tblNme;
    private Integer geoAddrEntpsTpCd;
    private String geoAddrEntpsTpDesc;
    private String geoAddrTpEfctvDt;
    private String geoAddrTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geo_address_type_id_seq")
    @SequenceGenerator(name = "geo_address_type_id_seq", sequenceName = "geo_address_type_id_seq", allocationSize = 1)
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
    @Column(name = "geo_addr_src_tp_cd")
    public String getGeoAddrSrcTpCd() {
        return geoAddrSrcTpCd;
    }

    public void setGeoAddrSrcTpCd(String geoAddrSrcTpCd) {
        this.geoAddrSrcTpCd = geoAddrSrcTpCd;
    }

    @Basic
    @Column(name = "geo_addr_src_tp_desc")
    public String getGeoAddrSrcTpDesc() {
        return geoAddrSrcTpDesc;
    }

    public void setGeoAddrSrcTpDesc(String geoAddrSrcTpDesc) {
        this.geoAddrSrcTpDesc = geoAddrSrcTpDesc;
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
    @Column(name = "geo_addr_entps_tp_cd")
    public Integer getGeoAddrEntpsTpCd() {
        return geoAddrEntpsTpCd;
    }

    public void setGeoAddrEntpsTpCd(Integer geoAddrEntpsTpCd) {
        this.geoAddrEntpsTpCd = geoAddrEntpsTpCd;
    }

    @Basic
    @Column(name = "geo_addr_entps_tp_desc")
    public String getGeoAddrEntpsTpDesc() {
        return geoAddrEntpsTpDesc;
    }

    public void setGeoAddrEntpsTpDesc(String geoAddrEntpsTpDesc) {
        this.geoAddrEntpsTpDesc = geoAddrEntpsTpDesc;
    }

    @Basic
    @Column(name = "geo_addr_tp_efctv_dt")
    public String getGeoAddrTpEfctvDt() {
        return geoAddrTpEfctvDt;
    }

    public void setGeoAddrTpEfctvDt(String geoAddrTpEfctvDt) {
        this.geoAddrTpEfctvDt = geoAddrTpEfctvDt;
    }

    @Basic
    @Column(name = "geo_addr_tp_expry_dt")
    public String getGeoAddrTpExpryDt() {
        return geoAddrTpExpryDt;
    }

    public void setGeoAddrTpExpryDt(String geoAddrTpExpryDt) {
        this.geoAddrTpExpryDt = geoAddrTpExpryDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoAddressTypeEntity that = (GeoAddressTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(geoAddrSrcTpCd, that.geoAddrSrcTpCd) && Objects.equals(geoAddrSrcTpDesc, that.geoAddrSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(geoAddrEntpsTpCd, that.geoAddrEntpsTpCd) && Objects.equals(geoAddrEntpsTpDesc, that.geoAddrEntpsTpDesc) && Objects.equals(geoAddrTpEfctvDt, that.geoAddrTpEfctvDt) && Objects.equals(geoAddrTpExpryDt, that.geoAddrTpExpryDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, geoAddrSrcTpCd, geoAddrSrcTpDesc, tblNme, geoAddrEntpsTpCd, geoAddrEntpsTpDesc, geoAddrTpEfctvDt, geoAddrTpExpryDt);
    }
}
