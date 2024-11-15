/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import config.configDatabase;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author USER
 */
public class booking extends javax.swing.JFrame {
    
    private String url ="jdbc:mysql://localhost:3306/2210010468_pbo2";
    private String user ="root";
    private String pass ="";
    
    private Connection Koneksi;


    /**
     * Creates new form booking
     */
    public booking() {
        initComponents();
        this.setLocationRelativeTo(null);
        configDatabase configDatabase = new configDatabase();
        
        
        try {
            Driver driverku = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driverku);
            Koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Frame berhasil dikoneksikan ke database");
        } catch (Exception e) {
            System.err.print(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdBooking = new javax.swing.JLabel();
        fIdBooking = new javax.swing.JTextField();
        fNamaCustomer = new javax.swing.JTextField();
        fNamaPaket = new javax.swing.JTextField();
        fTglBooking = new javax.swing.JTextField();
        fTotalHarga = new javax.swing.JTextField();
        lblNamaCustomer = new javax.swing.JLabel();
        lblNamaPaket = new javax.swing.JLabel();
        lblTglBooking = new javax.swing.JLabel();
        lblTotalHarga = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdBooking.setText("ID_Booking");
        lblIdBooking.setName("lblIdBooking"); // NOI18N

        fIdBooking.setName("fIdBooking"); // NOI18N
        fIdBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIdBookingActionPerformed(evt);
            }
        });

        fNamaCustomer.setName("fNamaCustomer"); // NOI18N

        fNamaPaket.setName("fNamaPaket"); // NOI18N
        fNamaPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNamaPaketActionPerformed(evt);
            }
        });

        fTglBooking.setName("fTglBooking"); // NOI18N
        fTglBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTglBookingActionPerformed(evt);
            }
        });

        fTotalHarga.setName("fTotalHarga"); // NOI18N

        lblNamaCustomer.setText("Nama_Customer");
        lblNamaCustomer.setName("lblNamaCustomer"); // NOI18N

        lblNamaPaket.setText("Nama_Paket");
        lblNamaPaket.setName("lblNamaPaket"); // NOI18N

        lblTglBooking.setText("Tgl_Booking");
        lblTglBooking.setName("lblTglBooking"); // NOI18N

        lblTotalHarga.setText("Total_Harga");
        lblTotalHarga.setName("lblTotalHarga"); // NOI18N

        btnSimpan.setText("SIMPAN");
        btnSimpan.setName("btnSimpan"); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.setName("btnUbah"); // NOI18N
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.setName("btnHapus"); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdBooking)
                    .addComponent(lblTglBooking)
                    .addComponent(lblNamaPaket)
                    .addComponent(lblNamaCustomer)
                    .addComponent(lblTotalHarga))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fNamaPaket)
                    .addComponent(fNamaCustomer)
                    .addComponent(fTglBooking)
                    .addComponent(fTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(fIdBooking))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(41, 41, 41)
                .addComponent(btnUbah)
                .addGap(44, 44, 44)
                .addComponent(btnHapus)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdBooking)
                    .addComponent(fIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamaCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNamaPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamaPaket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTglBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTglBooking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalHarga))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNamaPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNamaPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNamaPaketActionPerformed

    private void fTglBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTglBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTglBookingActionPerformed

    private void fIdBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIdBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fIdBookingActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String Id_Booking = fIdBooking.getText();
            String Nama_Customer = fNamaCustomer.getText();
            String Nama_Paket = fNamaPaket.getText();
            String Tgl_Booking  = fTglBooking.getText();
            String Total_Harga = fTotalHarga.getText();
            
            new configDatabase().SimpanBookingStatement(Id_Booking, Nama_Customer, Nama_Paket, Tgl_Booking, Total_Harga);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // Membuat objek dari dbCRUD
        configDatabase configDatabase = new configDatabase(); 
        // Memanggil method UbahDinamis menggunakan objek
        String[] field = {"Nama_Customer", "Nama_Paket", "Tgl_Booking", "Total_Harga"};
        String[] data = {fNamaCustomer.getText(), fNamaPaket.getText(), fTglBooking.getText(), fTotalHarga.getText()};

        configDatabase.UbahDinamis("booking", "Id_Booking", fIdBooking.getText(), field, data);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        configDatabase.HapusDinamis("booking", "Id_Booking", fIdBooking.getText());
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField fIdBooking;
    private javax.swing.JTextField fNamaCustomer;
    private javax.swing.JTextField fNamaPaket;
    private javax.swing.JTextField fTglBooking;
    private javax.swing.JTextField fTotalHarga;
    private javax.swing.JLabel lblIdBooking;
    private javax.swing.JLabel lblNamaCustomer;
    private javax.swing.JLabel lblNamaPaket;
    private javax.swing.JLabel lblTglBooking;
    private javax.swing.JLabel lblTotalHarga;
    // End of variables declaration//GEN-END:variables
}
