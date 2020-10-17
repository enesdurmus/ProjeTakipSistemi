/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetakipsistemi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author X550V
 */
@Entity
@Table(name = "MALZEME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malzeme.findAll", query = "SELECT m FROM Malzeme m")
    , @NamedQuery(name = "Malzeme.findByKodu", query = "SELECT m FROM Malzeme m WHERE m.kodu = :kodu")
    , @NamedQuery(name = "Malzeme.findByAdi", query = "SELECT m FROM Malzeme m WHERE m.adi = :adi")
    , @NamedQuery(name = "Malzeme.findByCiNsi", query = "SELECT m FROM Malzeme m WHERE m.ciNsi = :ciNsi")
    , @NamedQuery(name = "Malzeme.findByMiKtar", query = "SELECT m FROM Malzeme m WHERE m.miKtar = :miKtar")
    , @NamedQuery(name = "Malzeme.findByBiRiMfiYat", query = "SELECT m FROM Malzeme m WHERE m.biRiMfiYat = :biRiMfiYat")
    , @NamedQuery(name = "Malzeme.findByNakliYefiYat", query = "SELECT m FROM Malzeme m WHERE m.nakliYefiYat = :nakliYefiYat")
    , @NamedQuery(name = "Malzeme.findByTariH", query = "SELECT m FROM Malzeme m WHERE m.tariH = :tariH")
    , @NamedQuery(name = "Malzeme.findByKullanilacagiprojekodu", query = "SELECT m FROM Malzeme m WHERE m.kullanilacagiprojekodu = :kullanilacagiprojekodu")})
public class Malzeme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KODU")
    private String kodu;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "C\u0130NS\u0130")
    private String ciNsi;
    @Column(name = "M\u0130KTAR")
    private String miKtar;
    @Column(name = "B\u0130R\u0130MF\u0130YAT")
    private String biRiMfiYat;
    @Column(name = "NAKL\u0130YEF\u0130YAT")
    private String nakliYefiYat;
    @Column(name = "TAR\u0130H")
    private String tariH;
    @Column(name = "KULLANILACAGIPROJEKODU")
    private String kullanilacagiprojekodu;

    public Malzeme() {
    }

    public Malzeme(String kodu, String adi, String ciNsi, String miKtar, String biRiMfiYat, String nakliYefiYat, String tariH, String kullanilacagiprojekodu) {
        this.kodu = kodu;
        this.adi = adi;
        this.ciNsi = ciNsi;
        this.miKtar = miKtar;
        this.biRiMfiYat = biRiMfiYat;
        this.nakliYefiYat = nakliYefiYat;
        this.tariH = tariH;
        this.kullanilacagiprojekodu = kullanilacagiprojekodu;
    }
    

    public Malzeme(String kodu) {
        this.kodu = kodu;
    }

    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getCiNsi() {
        return ciNsi;
    }

    public void setCiNsi(String ciNsi) {
        this.ciNsi = ciNsi;
    }

    public String getMiKtar() {
        return miKtar;
    }

    public void setMiKtar(String miKtar) {
        this.miKtar = miKtar;
    }

    public String getBiRiMfiYat() {
        return biRiMfiYat;
    }

    public void setBiRiMfiYat(String biRiMfiYat) {
        this.biRiMfiYat = biRiMfiYat;
    }

    public String getNakliYefiYat() {
        return nakliYefiYat;
    }

    public void setNakliYefiYat(String nakliYefiYat) {
        this.nakliYefiYat = nakliYefiYat;
    }

    public String getTariH() {
        return tariH;
    }

    public void setTariH(String tariH) {
        this.tariH = tariH;
    }

    public String getKullanilacagiprojekodu() {
        return kullanilacagiprojekodu;
    }

    public void setKullanilacagiprojekodu(String kullanilacagiprojekodu) {
        this.kullanilacagiprojekodu = kullanilacagiprojekodu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodu != null ? kodu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malzeme)) {
            return false;
        }
        Malzeme other = (Malzeme) object;
        if ((this.kodu == null && other.kodu != null) || (this.kodu != null && !this.kodu.equals(other.kodu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetakipsistemi.Malzeme[ kodu=" + kodu + " ]";
    }
    
}
