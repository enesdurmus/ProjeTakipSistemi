/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetakipsistemi;

import java.awt.HeadlessException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author X550V
 */
public class projeTanım extends javax.swing.JFrame {

    String kullanıcıId;
    DefaultListModel projeDegistirmeModel = new DefaultListModel();

    /**
     * Creates new form projeTanım
     */
    Connection con;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjeTakipSistemiPU");

    public projeTanım() throws HeadlessException {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Database", "enes", "123");
            initComponents();

        } catch (SQLException ex) {
            Logger.getLogger(projeTanım.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public projeTanım(String kullanıcıId) {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Database", "enes", "123");

            initComponents();
            this.kullanıcıId = kullanıcıId;

        } catch (SQLException ex) {
            Logger.getLogger(projeTanım.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean desenKontrol(String desenMetni, String icindeDesenArananMetin) {

        Pattern desen = Pattern.compile(desenMetni);
        Matcher arama = desen.matcher(icindeDesenArananMetin);

        return icindeDesenArananMetin.matches(desenMetni);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projeSil = new javax.swing.JButton();
        cıkısYap = new javax.swing.JButton();
        projeYönetimiGecis = new javax.swing.JButton();
        projeOlustur = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        projeAdı = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yapımcıFirma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        projeninAmacı = new javax.swing.JTextField();
        projeKodu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        baslangıcGun = new javax.swing.JComboBox<>();
        baslangıcAy = new javax.swing.JComboBox<>();
        baslangıcYıl = new javax.swing.JComboBox<>();
        bitisGun = new javax.swing.JComboBox<>();
        bitisAy = new javax.swing.JComboBox<>();
        bitisYıl = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        projeSatısBedeli = new javax.swing.JTextField();
        tahminiProjeMaliyeti = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tahminiKarTutarı = new javax.swing.JTextField();
        projeDegistir = new javax.swing.JButton();

        projeSil.setText("Sil");
        projeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projeSilActionPerformed(evt);
            }
        });

        cıkısYap.setText("Çıkış Yap");
        cıkısYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkısYapActionPerformed(evt);
            }
        });

        projeYönetimiGecis.setText("Proje Yönetimi");
        projeYönetimiGecis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projeYönetimiGecisActionPerformed(evt);
            }
        });

        projeOlustur.setText("Oluştur");
        projeOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projeOlusturActionPerformed(evt);
            }
        });

        jLabel5.setText("Projenin Amacı");

        jLabel6.setText("Projenin Kodu");

        jLabel7.setText("Projenin Adı");

        jLabel1.setText("Yapımcı Firma");

        jLabel30.setText("Başlangıç Tarihi");

        jLabel31.setText("Bitiş Tarihi");

        baslangıcGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        baslangıcAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylul", "Ekim", "Kasım", "Aralık" }));

        baslangıcYıl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        bitisGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        bitisAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylul", "Ekim", "Kasım", "Aralık" }));

        bitisYıl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(projeAdı, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yapımcıFirma, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projeKodu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bitisGun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(baslangıcGun, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bitisAy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(baslangıcAy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(baslangıcYıl, 0, 84, Short.MAX_VALUE)
                            .addComponent(bitisYıl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(projeninAmacı))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projeAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yapımcıFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projeKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(baslangıcGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslangıcAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslangıcYıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(bitisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitisYıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projeninAmacı, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Genel Bilgiler ", jPanel3);

        jLabel10.setText("Proje Satış Bedeli");

        jLabel11.setText("Tahmini Proje Maliyeti");

        jLabel12.setText("Tahmini Kar Tutarı");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tahminiProjeMaliyeti, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(projeSatısBedeli)
                    .addComponent(tahminiKarTutarı))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projeSatısBedeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahminiProjeMaliyeti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tahminiKarTutarı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Finansal Bilgiler", jPanel4);

        projeDegistir.setText("Değiştir");
        projeDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projeDegistirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(projeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projeDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projeYönetimiGecis, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cıkısYap, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(projeOlustur)
                .addGap(44, 44, 44)
                .addComponent(projeSil)
                .addGap(42, 42, 42)
                .addComponent(projeDegistir)
                .addGap(49, 49, 49)
                .addComponent(projeYönetimiGecis)
                .addGap(44, 44, 44)
                .addComponent(cıkısYap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projeSilActionPerformed
        // TODO add your handling code here:

        projeSil prjSl = new projeSil(kullanıcıId);
        prjSl.setVisible(true);


    }//GEN-LAST:event_projeSilActionPerformed

    private void cıkısYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkısYapActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_cıkısYapActionPerformed

    private void projeYönetimiGecisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projeYönetimiGecisActionPerformed
        // TODO add your handling code here:
        projeYönetim prjYonetim = new projeYönetim(kullanıcıId);

        prjYonetim.setVisible(true);
    }//GEN-LAST:event_projeYönetimiGecisActionPerformed

    private void projeOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projeOlusturActionPerformed
        // TODO add your handling code here:
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p from Proje p");
        List<Proje> projeler = q.getResultList();
        boolean olusturulabilirmi = true;
        int[] tarihBaslangıc = new int[3];
        int[] tarihBitis = new int[3];
        boolean ayDogrumu = true;
        boolean gunDogrumu = true;
        String baslangıcTarih, bitisTarih;

        tarihBaslangıc[0] = baslangıcGun.getSelectedIndex() + 1;
        tarihBaslangıc[1] = baslangıcAy.getSelectedIndex() + 1;
        tarihBaslangıc[2] = baslangıcYıl.getSelectedIndex() + 2018;
        tarihBitis[0] = bitisGun.getSelectedIndex() + 1;
        tarihBitis[1] = bitisAy.getSelectedIndex() + 1;
        tarihBitis[2] = bitisYıl.getSelectedIndex() + 2018;
        baslangıcTarih = tarihBaslangıc[0] + "," + tarihBaslangıc[1] + "," + tarihBaslangıc[2];
        bitisTarih = tarihBitis[0] + "," + tarihBitis[1] + "," + tarihBitis[2];
        if (tarihBaslangıc[2] == tarihBitis[2]) {
            if (tarihBaslangıc[1] > tarihBitis[1]) {
                ayDogrumu = false;
            }
        }
        if (tarihBaslangıc[2] == tarihBitis[2]) {
            if (tarihBaslangıc[1] == tarihBitis[1]) {
                if (tarihBaslangıc[0] > tarihBitis[0]) {
                    gunDogrumu = false;
                }
            }
        }
        for (Proje p : projeler) {

            if (p.getProjekodu().equalsIgnoreCase(projeKodu.getText()) && p.getProjeadi().equalsIgnoreCase(projeAdı.getText())) {
                olusturulabilirmi = false;
            }
        }
        if (tarihBitis[2] >= tarihBaslangıc[2]) {
            if (ayDogrumu) {
                if (gunDogrumu) {
                    if (!(projeAdı.getText().equalsIgnoreCase("") || yapımcıFirma.getText().equalsIgnoreCase("") || projeKodu.getText().equalsIgnoreCase("") || projeninAmacı.getText().equalsIgnoreCase("") || projeSatısBedeli.getText().equalsIgnoreCase("") || tahminiProjeMaliyeti.getText().equalsIgnoreCase("") || tahminiKarTutarı.getText().equalsIgnoreCase(""))) {
                        if (desenKontrol("\\d+", projeSatısBedeli.getText().concat(tahminiProjeMaliyeti.getText().concat(tahminiKarTutarı.getText())))) {
                            if (olusturulabilirmi) {
                                Proje yeniProje = new Proje(projeKodu.getText(), projeAdı.getText(), yapımcıFirma.getText(), projeninAmacı.getText(), projeSatısBedeli.getText(), tahminiProjeMaliyeti.getText(), tahminiKarTutarı.getText(), baslangıcTarih, bitisTarih, kullanıcıId);
                                em.getTransaction().begin();
                                em.persist(yeniProje);
                                em.getTransaction().commit();
                                em.close();
                                projeYönetim prjYonetim = new projeYönetim(kullanıcıId);
                                prjYonetim.setVisible(true);
                                JOptionPane.showMessageDialog(this, "Proje Oluşturuldu ...", "Uyarı", JOptionPane.PLAIN_MESSAGE, null);
                            } else {
                                JOptionPane.showMessageDialog(this, "Proje Kodunun Veya Proje Adının Daha Önce Kullanılmadığından Emin Olun", "UYARI", JOptionPane.ERROR_MESSAGE, null);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Finans Bölümüne Rakam Harici Karakter Girmeyeniz ...", "UYARI", JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Bütün Alanlar Dolu Olmalıdır ...", "UYARI", JOptionPane.ERROR_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Proje Bitiş Tarihi Başlangıç Tarihinden Önce Olamaz ...", "UYARI", JOptionPane.ERROR_MESSAGE, null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Proje Bitiş Tarihi Başlangıç Tarihinden Önce Olamaz ...", "UYARI", JOptionPane.ERROR_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Proje Bitiş Tarihi Başlangıç Tarihinden Önce Olamaz ...", "UYARI", JOptionPane.ERROR_MESSAGE, null);
        }

    }//GEN-LAST:event_projeOlusturActionPerformed

    private void projeDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projeDegistirActionPerformed
        try {
            // TODO add your handling code here:
            projeDegistirmeModel.removeAllElements();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM PROJE");

            while (rs.next()) {
                if (rs.getString("KULLANICIID").equals(kullanıcıId)) {
                    projeDegistirmeModel.addElement(rs.getString("PROJEKODU"));
                }
            }
            projeOzellikDegistirme prjOzllk = new projeOzellikDegistirme(projeDegistirmeModel, kullanıcıId);

            prjOzllk.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(projeTanım.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_projeDegistirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(projeTanım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projeTanım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projeTanım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projeTanım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projeTanım().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> baslangıcAy;
    private javax.swing.JComboBox<String> baslangıcGun;
    private javax.swing.JComboBox<String> baslangıcYıl;
    private javax.swing.JComboBox<String> bitisAy;
    private javax.swing.JComboBox<String> bitisGun;
    private javax.swing.JComboBox<String> bitisYıl;
    private javax.swing.JButton cıkısYap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField projeAdı;
    private javax.swing.JButton projeDegistir;
    private javax.swing.JTextField projeKodu;
    private javax.swing.JButton projeOlustur;
    private javax.swing.JTextField projeSatısBedeli;
    private javax.swing.JButton projeSil;
    private javax.swing.JButton projeYönetimiGecis;
    private javax.swing.JTextField projeninAmacı;
    private javax.swing.JTextField tahminiKarTutarı;
    private javax.swing.JTextField tahminiProjeMaliyeti;
    private javax.swing.JTextField yapımcıFirma;
    // End of variables declaration//GEN-END:variables
}
