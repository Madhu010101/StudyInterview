package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "time_frequency_type")
public class TimeFrequencyTypeEntity {
    private long id;
    private String stmTpCd;
    private Integer cmpnyTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String timeFrequencySrcTpCd;
    private String timeFrequencySrcTpDesc;
    private String tblNme;
    private Integer timeFrequencyEntpsTpCd;
    private String timeFrequencyTpDesc;
    private Integer timeFrequencyCatTpCd;
    private String timeFrequencyTpEfctvDt;
    private String timeFrequencyTpExpryDt;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_frequency_type_id_seq")
    @SequenceGenerator(name = "time_frequency_type_id_seq", sequenceName = "time_frequency_type_id_seq", allocationSize = 1)
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
    @Column(name = "time_frequency_src_tp_cd")
    public String getTimeFrequencySrcTpCd() {
        return timeFrequencySrcTpCd;
    }

    public void setTimeFrequencySrcTpCd(String timeFrequencySrcTpCd) {
        this.timeFrequencySrcTpCd = timeFrequencySrcTpCd;
    }

    @Basic
    @Column(name = "time_frequency_src_tp_desc")
    public String getTimeFrequencySrcTpDesc() {
        return timeFrequencySrcTpDesc;
    }

    public void setTimeFrequencySrcTpDesc(String timeFrequencySrcTpDesc) {
        this.timeFrequencySrcTpDesc = timeFrequencySrcTpDesc;
    }

    @Basic
    @Column(name = "time_frequency_entps_tp_cd")
    public Integer getTimeFrequencyEntpsTpCd() {
        return timeFrequencyEntpsTpCd;
    }

    public void setTimeFrequencyEntpsTpCd(Integer timeFrequencyEntpsTpCd) {
        this.timeFrequencyEntpsTpCd = timeFrequencyEntpsTpCd;
    }

    @Basic
    @Column(name = "time_frequency_entps_tp_desc")
    public String getTimeFrequencyTpDesc() {
        return timeFrequencyTpDesc;
    }

    public void setTimeFrequencyTpDesc(String timeFrequencyTpDesc) {
        this.timeFrequencyTpDesc = timeFrequencyTpDesc;
    }

    @Basic
    @Column(name = "time_frequency_cat_tp_id")
    public Integer getTimeFrequencyCatTpCd() {
        return timeFrequencyCatTpCd;
    }

    public void setTimeFrequencyCatTpCd(Integer timeFrequencyCatTpCd) {
        this.timeFrequencyCatTpCd = timeFrequencyCatTpCd;
    }

    @Basic
    @Column(name = "time_frequency_tp_efctv_dt")
    public String getTimeFrequencyTpEfctvDt() {
        return timeFrequencyTpEfctvDt;
    }

    public void setTimeFrequencyTpEfctvDt(String timeFrequencyTpEfctvDt) {
        this.timeFrequencyTpEfctvDt = timeFrequencyTpEfctvDt;
    }

    @Basic
    @Column(name = "time_frequency_tp_expry_dt")
    public String getTimeFrequencyTpExpryDt() {
        return timeFrequencyTpExpryDt;
    }

    public void setTimeFrequencyTpExpryDt(String timeFrequencyTpExpryDt) {
        this.timeFrequencyTpExpryDt = timeFrequencyTpExpryDt;
    }
}