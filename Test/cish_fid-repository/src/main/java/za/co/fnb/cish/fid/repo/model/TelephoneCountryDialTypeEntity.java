package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "telephone_countrydial_type")
public class TelephoneCountryDialTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String telCntrydialSrcTpCd;
    private String telCntrydialSrcTpDesc;
    private String tblNme;
    private Integer telCntrydialEntpsTpCd;
    private String telCntrydialEntpsTpDesc;
    private String telCntrydialEfctvDte;
    private String telCntrydialExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telephone_countrydial_type_id_seq")
    @SequenceGenerator(name = "telephone_countrydial_type_id_seq", sequenceName = "telephone_countrydial_type_id_seq", allocationSize = 1)
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
    @Column(name = "tel_cntrydial_src_tp_cd")
    public String getTelCntrydialSrcTpCd() {
        return telCntrydialSrcTpCd;
    }

    public void setTelCntrydialSrcTpCd(String telCntrydialSrcTpCd) {
        this.telCntrydialSrcTpCd = telCntrydialSrcTpCd;
    }

    @Basic
    @Column(name = "tel_cntrydial_src_tp_desc")
    public String getTelCntrydialSrcTpDesc() {
        return telCntrydialSrcTpDesc;
    }

    public void setTelCntrydialSrcTpDesc(String telCntrydialSrcTpDesc) {
        this.telCntrydialSrcTpDesc = telCntrydialSrcTpDesc;
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
    @Column(name = "tel_cntrydial_entps_tp_cd")
    public Integer getTelCntrydialEntpsTpCd() {
        return telCntrydialEntpsTpCd;
    }

    public void setTelCntrydialEntpsTpCd(Integer telCntrydialEntpsTpCd) {
        this.telCntrydialEntpsTpCd = telCntrydialEntpsTpCd;
    }

    @Basic
    @Column(name = "tel_cntrydial_entps_tp_desc")
    public String getTelCntrydialEntpsTpDesc() {
        return telCntrydialEntpsTpDesc;
    }

    public void setTelCntrydialEntpsTpDesc(String telCntrydialEntpsTpDesc) {
        this.telCntrydialEntpsTpDesc = telCntrydialEntpsTpDesc;
    }

    @Basic
    @Column(name = "eff_dte")
    public String getTelCntrydialEfctvDte() {
        return telCntrydialEfctvDte;
    }

    public void setTelCntrydialEfctvDte(String telCntrydialEfctvDte) {
        this.telCntrydialEfctvDte = telCntrydialEfctvDte;
    }

    @Basic
    @Column(name = "exp_dte")
    public String getTelCntrydialExpryDte() {
        return telCntrydialExpryDte;
    }

    public void setTelCntrydialExpryDte(String telCntrydialExpryDte) {
        this.telCntrydialExpryDte = telCntrydialExpryDte;
    }

}
