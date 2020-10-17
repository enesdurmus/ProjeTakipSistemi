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
@Table(name = "KULLANICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanici.findAll", query = "SELECT k FROM Kullanici k")
    , @NamedQuery(name = "Kullanici.findByKullaniciid", query = "SELECT k FROM Kullanici k WHERE k.kullaniciid = :kullaniciid")
    , @NamedQuery(name = "Kullanici.findByKullaniciparola", query = "SELECT k FROM Kullanici k WHERE k.kullaniciparola = :kullaniciparola")})
public class Kullanici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KULLANICIID")
    private String kullaniciid;
    @Column(name = "KULLANICIPAROLA")
    private String kullaniciparola;

    public Kullanici() {
    }

    public Kullanici(String kullaniciid, String kullaniciparola) {
        this.kullaniciid = kullaniciid;
        this.kullaniciparola = kullaniciparola;
    }

    public Kullanici(String kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    public String getKullaniciid() {
        return kullaniciid;
    }

    public void setKullaniciid(String kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    public String getKullaniciparola() {
        return kullaniciparola;
    }

    public void setKullaniciparola(String kullaniciparola) {
        this.kullaniciparola = kullaniciparola;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kullaniciid != null ? kullaniciid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanici)) {
            return false;
        }
        Kullanici other = (Kullanici) object;
        if ((this.kullaniciid == null && other.kullaniciid != null) || (this.kullaniciid != null && !this.kullaniciid.equals(other.kullaniciid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetakipsistemi.Kullanici[ kullaniciid=" + kullaniciid + " ]";
    }
    
}
