package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "identification_issuer_type")
public class IdentificationIssuerTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String idfctnIssurSrcTpCd;
    private String idfctnIssurSrcTpDesc;
    private String tblNme;
    private Integer idfctnIssurEntpsTpCd;
    private String idfctnIssurEntpsTpDesc;
    private String idfctnIssurEfctvDt;
    private String idfctnIssurExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identification_issuer_type_id_seq")
    @SequenceGenerator(name = "identification_issuer_type_id_seq", sequenceName = "identification_issuer_type_id_seq", allocationSize = 1)
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
    @Column(name = "idfctn_issur_src_tp_cd")
    public String getIdfctnIssurSrcTpCd() {
        return idfctnIssurSrcTpCd;
    }

    public void setIdfctnIssurSrcTpCd(String idfctnIssurSrcTpCd) {
        this.idfctnIssurSrcTpCd = idfctnIssurSrcTpCd;
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
    @Column(name = "idfctn_issur_src_tp_desc")
    public String getIdfctnIssurSrcTpDesc() {
        return idfctnIssurSrcTpDesc;
    }

    public void setIdfctnIssurSrcTpDesc(String idfctnIssurSrcTpDesc) {
        this.idfctnIssurSrcTpDesc = idfctnIssurSrcTpDesc;
    }

    @Basic
    @Column(name = "idfctn_issur_entps_tp_cd")
    public Integer getIdfctnIssurEntpsTpCd() {
        return idfctnIssurEntpsTpCd;
    }

    public void setIdfctnIssurEntpsTpCd(Integer idfctnIssurEntpsTpCd) {
        this.idfctnIssurEntpsTpCd = idfctnIssurEntpsTpCd;
    }

    @Basic
    @Column(name = "idfctn_issur_entps_tp_desc")
    public String getIdfctnIssurEntpsTpDesc() {
        return idfctnIssurEntpsTpDesc;
    }

    public void setIdfctnIssurEntpsTpDesc(String idfctnIssurEntpsTpDesc) {
        this.idfctnIssurEntpsTpDesc = idfctnIssurEntpsTpDesc;
    }

    @Basic
    @Column(name = "idfctn_issur_efctv_dt")
    public String getIdfctnIssurEfctvDt() {
        return idfctnIssurEfctvDt;
    }

    public void setIdfctnIssurEfctvDt(String idfctnIssurEfctvDt) {
        this.idfctnIssurEfctvDt = idfctnIssurEfctvDt;
    }

    @Basic
    @Column(name = "idfctn_issur_expry_dt")
    public String getIdfctnIssurExpryDt() {
        return idfctnIssurExpryDt;
    }

    public void setIdfctnIssurExpryDt(String idfctnIssurExpryDt) {
        this.idfctnIssurExpryDt = idfctnIssurExpryDt;
    }
}