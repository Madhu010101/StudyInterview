package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bic_type")
public class IndustrySpecialityType {

    private Long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private Integer indstrySrcTpCd;
    private String indstrySrcTpDesc;
    private String tblNme;
    private Integer indstryEntpsTpCd;
    private String indstryEntpsTpDesc;
    private Integer indstryCatTpId;
    private String indstryTpEfctvDt;
    private String indstryTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bic_type_id_seq")
    @SequenceGenerator(name = "bic_type_id_seq", sequenceName = "bic_type_id_seq", allocationSize = 1)
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
    public Integer getIndstryEntpsTpCd() {
        return indstryEntpsTpCd;
    }

    public void setIndstryEntpsTpCd(Integer indstryEntpsTpCd) {
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
    @Column(name = "indstry_tp_efctv_dt")
    public String getIndstryTpEfctvDt() {
        return indstryTpEfctvDt;
    }

    public void setIndstryTpEfctvDt(String indstryTpEfctvDt) {
        this.indstryTpEfctvDt = indstryTpEfctvDt;
    }
    @Basic
    @Column(name = "indstry_tp_expry_dt")
    public String getIndstryTpExpryDt() {
        return indstryTpExpryDt;
    }

    public void setIndstryTpExpryDt(String indstryTpExpryDt) {
        this.indstryTpExpryDt = indstryTpExpryDt;
    }
}
