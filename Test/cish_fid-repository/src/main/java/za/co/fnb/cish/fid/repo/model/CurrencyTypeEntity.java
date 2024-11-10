package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "currency_type")
public class CurrencyTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String currencySrcTpCd;
    private String currencySrcTpDesc;
    private String tblNme;
    private Integer currencyEntpsTpCd;
    private String currencyTpDesc;
    private Integer currencyCatTpCd;
    private String currencyTpEfctvDt;
    private String currencyTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_type_id_seq")
    @SequenceGenerator(name = "currency_type_id_seq", sequenceName = "currency_type_id_seq", allocationSize = 1)
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
    @Column(name = "tbl_nme")
    public String getTblNme() {
        return tblNme;
    }

    public void setTblNme(String tblNme) {
        this.tblNme = tblNme;
    }

    @Basic
    @Column(name = "currency_src_tp_cd")
    public String getCurrencySrcTpCd() {
        return currencySrcTpCd;
    }

    public void setCurrencySrcTpCd(String currencySrcTpCd) {
        this.currencySrcTpCd = currencySrcTpCd;
    }

    @Basic
    @Column(name = "currency_src_tp_desc")
    public String getCurrencySrcTpDesc() {
        return currencySrcTpDesc;
    }

    public void setCurrencySrcTpDesc(String currencySrcTpDesc) {
        this.currencySrcTpDesc = currencySrcTpDesc;
    }

    @Basic
    @Column(name = "currency_entps_tp_cd")
    public Integer getCurrencyEntpsTpCd() {
        return currencyEntpsTpCd;
    }

    public void setCurrencyEntpsTpCd(Integer currencyEntpsTpCd) {
        this.currencyEntpsTpCd = currencyEntpsTpCd;
    }

    @Basic
    @Column(name = "currency_entps_tp_desc")
    public String getCurrencyTpDesc() {
        return currencyTpDesc;
    }

    public void setCurrencyTpDesc(String currencyTpDesc) {
        this.currencyTpDesc = currencyTpDesc;
    }

    @Basic
    @Column(name = "currency_cat_tp_id")
    public Integer getCurrencyCatTpCd() {
        return currencyCatTpCd;
    }

    public void setCurrencyCatTpCd(Integer currencyCatTpCd) {
        this.currencyCatTpCd = currencyCatTpCd;
    }

    @Basic
    @Column(name = "currency_tp_efctv_dt")
    public String getCurrencyTpEfctvDt() {
        return currencyTpEfctvDt;
    }

    public void setCurrencyTpEfctvDt(String currencyTpEfctvDt) {
        this.currencyTpEfctvDt = currencyTpEfctvDt;
    }

    @Basic
    @Column(name = "currency_tp_expry_dt")
    public String getCurrencyTpExpryDt() {
        return currencyTpExpryDt;
    }

    public void setCurrencyTpExpryDt(String currencyTpExpryDt) {
        this.currencyTpExpryDt = currencyTpExpryDt;
    }
}