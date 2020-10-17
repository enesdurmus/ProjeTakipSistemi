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
@Table(name = "PROJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proje.findAll", query = "SELECT p FROM Proje p")
    , @NamedQuery(name = "Proje.findByProjekodu", query = "SELECT p FROM Proje p WHERE p.projekodu = :projekodu")
    , @NamedQuery(name = "Proje.findByProjeadi", query = "SELECT p FROM Proje p WHERE p.projeadi = :projeadi")
    , @NamedQuery(name = "Proje.findByFirma", query = "SELECT p FROM Proje p WHERE p.firma = :firma")
    , @NamedQuery(name = "Proje.findByProjeninamaci", query = "SELECT p FROM Proje p WHERE p.projeninamaci = :projeninamaci")
    , @NamedQuery(name = "Proje.findByProjesatisbedeli", query = "SELECT p FROM Proje p WHERE p.projesatisbedeli = :projesatisbedeli")
    , @NamedQuery(name = "Proje.findByTahminiprojemaliyeti", query = "SELECT p FROM Proje p WHERE p.tahminiprojemaliyeti = :tahminiprojemaliyeti")
    , @NamedQuery(name = "Proje.findByTahminiprojekari", query = "SELECT p FROM Proje p WHERE p.tahminiprojekari = :tahminiprojekari")
    , @NamedQuery(name = "Proje.findByBaslangictarih", query = "SELECT p FROM Proje p WHERE p.baslangictarih = :baslangictarih")
    , @NamedQuery(name = "Proje.findByBitistarih", query = "SELECT p FROM Proje p WHERE p.bitistarih = :bitistarih")
    , @NamedQuery(name = "Proje.findByKullaniciid", query = "SELECT p FROM Proje p WHERE p.kullaniciid = :kullaniciid")})
public class Proje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROJEKODU")
    private String projekodu;
    @Column(name = "PROJEADI")
    private String projeadi;
    @Column(name = "FIRMA")
    private String firma;
    @Column(name = "PROJENINAMACI")
    private String projeninamaci;
    @Column(name = "PROJESATISBEDELI")
    private String projesatisbedeli;
    @Column(name = "TAHMINIPROJEMALIYETI")
    private String tahminiprojemaliyeti;
    @Column(name = "TAHMINIPROJEKARI")
    private String tahminiprojekari;
    @Column(name = "BASLANGICTARIH")
    private String baslangictarih;
    @Column(name = "BITISTARIH")
    private String bitistarih;
    @Column(name = "KULLANICIID")
    private String kullaniciid;

    public Proje() {
    }

    public Proje(String projekodu, String projeadi, String firma, String projeninamaci, String projesatisbedeli, String tahminiprojemaliyeti, String tahminiprojekari, String baslangictarih, String bitistarih, String kullaniciid) {
        this.projekodu = projekodu;
        this.projeadi = projeadi;
        this.firma = firma;
        this.projeninamaci = projeninamaci;
        this.projesatisbedeli = projesatisbedeli;
        this.tahminiprojemaliyeti = tahminiprojemaliyeti;
        this.tahminiprojekari = tahminiprojekari;
        this.baslangictarih = baslangictarih;
        this.bitistarih = bitistarih;
        this.kullaniciid = kullaniciid;
    }
    

    public Proje(String projekodu) {
        this.projekodu = projekodu;
    }

    public String getProjekodu() {
        return projekodu;
    }

    public void setProjekodu(String projekodu) {
        this.projekodu = projekodu;
    }

    public String getProjeadi() {
        return projeadi;
    }

    public void setProjeadi(String projeadi) {
        this.projeadi = projeadi;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getProjeninamaci() {
        return projeninamaci;
    }

    public void setProjeninamaci(String projeninamaci) {
        this.projeninamaci = projeninamaci;
    }

    public String getProjesatisbedeli() {
        return projesatisbedeli;
    }

    public void setProjesatisbedeli(String projesatisbedeli) {
        this.projesatisbedeli = projesatisbedeli;
    }

    public String getTahminiprojemaliyeti() {
        return tahminiprojemaliyeti;
    }

    public void setTahminiprojemaliyeti(String tahminiprojemaliyeti) {
        this.tahminiprojemaliyeti = tahminiprojemaliyeti;
    }

    public String getTahminiprojekari() {
        return tahminiprojekari;
    }

    public void setTahminiprojekari(String tahminiprojekari) {
        this.tahminiprojekari = tahminiprojekari;
    }

    public String getBaslangictarih() {
        return baslangictarih;
    }

    public void setBaslangictarih(String baslangictarih) {
        this.baslangictarih = baslangictarih;
    }

    public String getBitistarih() {
        return bitistarih;
    }

    public void setBitistarih(String bitistarih) {
        this.bitistarih = bitistarih;
    }

    public String getKullaniciid() {
        return kullaniciid;
    }

    public void setKullaniciid(String kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projekodu != null ? projekodu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proje)) {
            return false;
        }
        Proje other = (Proje) object;
        if ((this.projekodu == null && other.projekodu != null) || (this.projekodu != null && !this.projekodu.equals(other.projekodu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetakipsistemi.Proje[ projekodu=" + projekodu + " ]";
    }
    
}
