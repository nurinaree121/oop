/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class GUI_Gaji_Interface extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Gaji_Interface
     */
    public GUI_Gaji_Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_hitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_hadir = new javax.swing.JTextField();
        txt_lembur = new javax.swing.JTextField();
        txt_Gatot = new javax.swing.JTextField();
        cmb_karyawan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_keahlian = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jKeahllian = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Hari");

        jLabel7.setText("Jam");

        jLabel1.setText("Pilih Jabatan");

        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        jLabel2.setText("Jumlah Hadir");

        jLabel3.setText("Jumlah Lembur");

        jLabel4.setText("Total Gaji");

        txt_hadir.setText("0");

        txt_lembur.setText("0");

        cmb_karyawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karyawan", "Sekretaris", "Manager" }));

        jLabel5.setText("Rp.");

        jLabel8.setText("Keahlian");

        jLabel10.setText("Keahlian");

        jKeahllian.setText(": ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_hitung)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_karyawan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_hadir)
                    .addComponent(txt_lembur)
                    .addComponent(txt_Gatot)
                    .addComponent(txt_keahlian)
                    .addComponent(jKeahllian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmb_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_hadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_lembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_keahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btn_hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(txt_Gatot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jKeahllian))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        
//        if (cmb_karyawan.getSelectedIndex()==0)
//        {
//            gaji Gj = new gaji() ;
//        }
//        gaji GJ;
//        int Hadir = Integer.parseInt(txt_hadir.getText());
//        int Lembur = Integer.parseInt(txt_lembur.getText());
//        //        int selectedItem = cmb_karyawan.getSelectedIndex();
//        //        int Hadir = Integer.parseInt(jmlHadir.getText());
//        //        gaji GJ = new karyawan();
//        switch (cmb_karyawan.getSelectedIndex()) {
//            case 0 -> {
//                GJ = new karyawan();
//                karyawan GJKarya = (karyawan) GJ;
//                //                txt_jabatan.setText(GJ.klsJabatan(GJKarya));
//                txt_Gatot.setText(Integer.toString(GJ.hitGaji()));
//                
//            }
//            case 1 -> {
//                GJ = new Sekretaris();
//                Sekretaris GJSek = (Sekretaris) GJ;
//                GJSek.jmlHadir = Hadir;
//                //                txt_jabatan.setText(GJ.klsJabatan(GJSek));
//                //            GJ.jmlHadir = Integer.parseInt(txt_hadir.getText());
//                txt_Gatot.setText(Integer.toString(GJ.hitGaji()));
//                jKeahllian.setText(Integer.toString(Hadir));
//            }
//            default -> {
//                GJ = new manajer();
//                manajer GJman = (manajer) GJ;
//                GJman.jmlHadir = Hadir;
//                GJman.jmlLembur = Lembur;
//                //                txt_jabatan.setText(GJ.klsJabatan(GJman));
//                //            GJman.jmlHadir = Integer.parseInt(txt_hadir.getText());
//                //            GJman.jmlLembur = Integer.parseInt(txt_lembur.getText());
//                txt_Gatot.setText(Integer.toString(GJ.hitGaji()));
//                //        gaji GJ = new karyawan();
//                //        System.out.println(GJ.hitGaji());
//                //        karyawan GJ1 =(karyawan) GJ;
//                //        System.out.println(GJ1.hitGaji());
//                //        GJ = new Sekretaris();
//                //        System.out.println(GJ.hitGaji());
//            }
//            //        gaji GJ = new karyawan();
//            //        System.out.println(GJ.hitGaji());
//            //        karyawan GJ1 =(karyawan) GJ;
//            //        System.out.println(GJ1.hitGaji());
//            //        GJ = new Sekretaris();
//            //        System.out.println(GJ.hitGaji());
//        }
//        

        
    }//GEN-LAST:event_btn_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Gaji_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Gaji_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Gaji_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Gaji_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Gaji_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JComboBox<String> cmb_karyawan;
    private javax.swing.JLabel jKeahllian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_Gatot;
    private javax.swing.JTextField txt_hadir;
    private javax.swing.JTextField txt_keahlian;
    private javax.swing.JTextField txt_lembur;
    // End of variables declaration//GEN-END:variables
}
