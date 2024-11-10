package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "name_type")
public class NameTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String srcCd;
    private String srcDesc;
    private String tblNme;
    private Integer nmTpCd;
    private String nmTpDesc;
    private String nmTpAttrbtNm;
    private String nmTpEfctvDt;
    private String nmTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_type_id_seq")
    @SequenceGenerator(name = "name_type_id_seq", sequenceName = "name_type_id_seq", allocationSize = 1)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    @Column(name = "src_cd")
    public String getSrcCd() {
        return srcCd;
    }

    public void setSrcCd(String srcCd) {
        this.srcCd = srcCd;
    }

    @Basic
    @Column(name = "src_desc")
    public String getSrcDesc() {
        return srcDesc;
    }

    public void setSrcDesc(String srcDesc) {
        this.srcDesc = srcDesc;
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
    @Column(name = "nm_tp_cd")
    public Integer getNmTpCd() {
        return nmTpCd;
    }

    public void setNmTpCd(Integer nmTpCd) {
        this.nmTpCd = nmTpCd;
    }

    @Basic
    @Column(name = "nm_tp_desc")
    public String getNmTpDesc() {
        return nmTpDesc;
    }

    public void setNmTpDesc(String nmTpDesc) {
        this.nmTpDesc = nmTpDesc;
    }

    @Basic
    @Column(name = "nm_tp_attrbt_nm")
    public String getNmTpAttrbtNm() {
        return nmTpAttrbtNm;
    }

    public void setNmTpAttrbtNm(String nmTpAttrbtNm) {
        this.nmTpAttrbtNm = nmTpAttrbtNm;
    }

    @Basic
    @Column(name = "nm_tp_efctv_dt")
    public String getNmTpEfctvDt() {
        return nmTpEfctvDt;
    }

    public void setNmTpEfctvDt(String nmTpEfctvDt) {
        this.nmTpEfctvDt = nmTpEfctvDt;
    }

    @Basic
    @Column(name = "nm_tp_expry_dt")
    public String getNmTpExpryDt() {
        return nmTpExpryDt;
    }

    public void setNmTpExpryDt(String nmTpExpryDt) {
        this.nmTpExpryDt = nmTpExpryDt;
    }
}
