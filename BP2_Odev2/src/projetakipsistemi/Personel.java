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
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findByTckimlik", query = "SELECT p FROM Personel p WHERE p.tckimlik = :tckimlik")
    , @NamedQuery(name = "Personel.findByAdi", query = "SELECT p FROM Personel p WHERE p.adi = :adi")
    , @NamedQuery(name = "Personel.findBySoyadi", query = "SELECT p FROM Personel p WHERE p.soyadi = :soyadi")
    , @NamedQuery(name = "Personel.findByOzelligi", query = "SELECT p FROM Personel p WHERE p.ozelligi = :ozelligi")
    , @NamedQuery(name = "Personel.findByRutbesi", query = "SELECT p FROM Personel p WHERE p.rutbesi = :rutbesi")
    , @NamedQuery(name = "Personel.findByCalisacagiproje", query = "SELECT p FROM Personel p WHERE p.calisacagiproje = :calisacagiproje")
    , @NamedQuery(name = "Personel.findByGiristarih", query = "SELECT p FROM Personel p WHERE p.giristarih = :giristarih")
    , @NamedQuery(name = "Personel.findByMaas", query = "SELECT p FROM Personel p WHERE p.maas = :maas")
    , @NamedQuery(name = "Personel.findByCinsiyet", query = "SELECT p FROM Personel p WHERE p.cinsiyet = :cinsiyet")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TCKIMLIK")
    private String tckimlik;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "OZELLIGI")
    private String ozelligi;
    @Column(name = "RUTBESI")
    private String rutbesi;
    @Column(name = "CALISACAGIPROJE")
    private String calisacagiproje;
    @Column(name = "GIRISTARIH")
    private String giristarih;
    @Column(name = "MAAS")
    private String maas;
    @Column(name = "CINSIYET")
    private String cinsiyet;

    public Personel() {
    }

    public Personel(String tckimlik, String adi, String soyadi, String ozelligi, String rutbesi, String calisacagiproje, String giristarih, String maas, String cinsiyet) {
        this.tckimlik = tckimlik;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ozelligi = ozelligi;
        this.rutbesi = rutbesi;
        this.calisacagiproje = calisacagiproje;
        this.giristarih = giristarih;
        this.maas = maas;
        this.cinsiyet = cinsiyet;
    }
    

    public Personel(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getOzelligi() {
        return ozelligi;
    }

    public void setOzelligi(String ozelligi) {
        this.ozelligi = ozelligi;
    }

    public String getRutbesi() {
        return rutbesi;
    }

    public void setRutbesi(String rutbesi) {
        this.rutbesi = rutbesi;
    }

    public String getCalisacagiproje() {
        return calisacagiproje;
    }

    public void setCalisacagiproje(String calisacagiproje) {
        this.calisacagiproje = calisacagiproje;
    }

    public String getGiristarih() {
        return giristarih;
    }

    public void setGiristarih(String giristarih) {
        this.giristarih = giristarih;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tckimlik != null ? tckimlik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.tckimlik == null && other.tckimlik != null) || (this.tckimlik != null && !this.tckimlik.equals(other.tckimlik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetakipsistemi.Personel[ tckimlik=" + tckimlik + " ]";
    }
    
}
