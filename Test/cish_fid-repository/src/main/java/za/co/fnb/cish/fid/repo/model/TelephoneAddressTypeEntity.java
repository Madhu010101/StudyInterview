package za.co.fnb.cish.fid.repo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telephone_address_type")
public class TelephoneAddressTypeEntity {
    private Long id;
    private String stmTpCd;
    private String srcTblNo;
    private String srcTblNme;
    private String srcCat;
    private String telAddrTpSrcTpCd;
    private String telAddrTpSrcTpDesc;
    private String tblNme;
    private Integer telAddrEntpsTpCd;
    private String telAddrEntpsTpDesc;
    private String telAddrTpEfctvDte;
    private String telAddrTpExpryDte;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telephone_address_type_id_seq")
    @SequenceGenerator(name = "telephone_address_type_id_seq", sequenceName = "telephone_address_type_id_seq", allocationSize = 1)
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
    @Column(name = "tel_addr_tp_src_tp_cd")
    public String getTelAddrTpSrcTpCd() {
        return telAddrTpSrcTpCd;
    }

    public void setTelAddrTpSrcTpCd(String telAddrTpSrcTpCd) {
        this.telAddrTpSrcTpCd = telAddrTpSrcTpCd;
    }

    @Basic
    @Column(name = "tel_addr_tp_src_tp_desc")
    public String getTelAddrTpSrcTpDesc() {
        return telAddrTpSrcTpDesc;
    }

    public void setTelAddrTpSrcTpDesc(String telAddrTpSrcTpDesc) {
        this.telAddrTpSrcTpDesc = telAddrTpSrcTpDesc;
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
    @Column(name = "tel_addr_entps_tp_cd")
    public Integer getTelAddrEntpsTpCd() {
        return telAddrEntpsTpCd;
    }

    public void setTelAddrEntpsTpCd(Integer telAddrEntpsTpCd) {
        this.telAddrEntpsTpCd = telAddrEntpsTpCd;
    }

    @Basic
    @Column(name = "tel_addr_entps_tp_desc")
    public String getTelAddrEntpsTpDesc() {
        return telAddrEntpsTpDesc;
    }

    public void setTelAddrEntpsTpDesc(String telAddrEntpsTpDesc) {
        this.telAddrEntpsTpDesc = telAddrEntpsTpDesc;
    }

    @Basic
    @Column(name = "tel_addr_tp_efctv_dte")
    public String getTelAddrTpEfctvDte() {
        return telAddrTpEfctvDte;
    }

    public void setTelAddrTpEfctvDte(String telAddrTpEfctvDte) {
        this.telAddrTpEfctvDte = telAddrTpEfctvDte;
    }

    @Basic
    @Column(name = "tel_addr_tp_expry_dte")
    public String getTelAddrTpExpryDte() {
        return telAddrTpExpryDte;
    }

    public void setTelAddrTpExpryDte(String telAddrTpExpryDte) {
        this.telAddrTpExpryDte = telAddrTpExpryDte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneAddressTypeEntity that = (TelephoneAddressTypeEntity) o;
        return Objects.equals(stmTpCd, that.stmTpCd) && Objects.equals(srcTblNo, that.srcTblNo) && Objects.equals(srcTblNme, that.srcTblNme) && Objects.equals(srcCat, that.srcCat) && Objects.equals(telAddrTpSrcTpCd, that.telAddrTpSrcTpCd) && Objects.equals(telAddrTpSrcTpDesc, that.telAddrTpSrcTpDesc) && Objects.equals(tblNme, that.tblNme) && Objects.equals(telAddrEntpsTpCd, that.telAddrEntpsTpCd) && Objects.equals(telAddrEntpsTpDesc, that.telAddrEntpsTpDesc) && Objects.equals(telAddrTpEfctvDte, that.telAddrTpEfctvDte) && Objects.equals(telAddrTpExpryDte, that.telAddrTpExpryDte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stmTpCd, srcTblNo, srcTblNme, srcCat, telAddrTpSrcTpCd, telAddrTpSrcTpDesc, tblNme, telAddrEntpsTpCd, telAddrEntpsTpDesc, telAddrTpEfctvDte, telAddrTpExpryDte);
    }
}
