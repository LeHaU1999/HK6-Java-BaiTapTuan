/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HK6_java_tuan_3;

/**
 *
 * @author ASUS
 */
public class Lab2_Calulator extends javax.swing.JFrame {

    /**
     * Creates new form Calulator
     */
    public Lab2_Calulator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jpannel = new javax.swing.JPanel();
        hienthi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnCanBac2 = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnChiaLayDu = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnChiaX = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        btnCongTru = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Culator");

        Container.setLayout(new javax.swing.BoxLayout(Container, javax.swing.BoxLayout.Y_AXIS));

        hienthi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                hienthiAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                hienthiAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jpannelLayout = new javax.swing.GroupLayout(jpannel);
        jpannel.setLayout(jpannelLayout);
        jpannelLayout.setHorizontalGroup(
            jpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hienthi, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        jpannelLayout.setVerticalGroup(
            jpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannelLayout.createSequentialGroup()
                .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Container.add(jpannel);

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo1);

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo2);

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo3);

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnChia);

        btnCanBac2.setText("Sqrt()");
        btnCanBac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanBac2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCanBac2);

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo4);

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo5);

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo6);

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhan);

        btnChiaLayDu.setText("%");
        btnChiaLayDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaLayDuActionPerformed(evt);
            }
        });
        jPanel2.add(btnChiaLayDu);

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo7);

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo8);

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo9);

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        jPanel2.add(btnTru);

        btnChiaX.setText("1/x");
        btnChiaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaXActionPerformed(evt);
            }
        });
        jPanel2.add(btnChiaX);

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo0);

        btnCongTru.setText("+/-");
        jPanel2.add(btnCongTru);

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel2.add(btnCong);

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel2.add(btnBang);

        Container.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo2.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo2ActionPerformed

    private void btnCanBac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanBac2ActionPerformed
        // TODO add your handling code here:
        this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "Sqrt()";
               this.hienthi.setText("0");
    }//GEN-LAST:event_btnCanBac2ActionPerformed

    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo7.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo7ActionPerformed

    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo8.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo8ActionPerformed

    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo9.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
                String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo1.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo1ActionPerformed

    private void hienthiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_hienthiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_hienthiAncestorAdded

    private void hienthiAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_hienthiAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_hienthiAncestorMoved

    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo3.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo3ActionPerformed

    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo4.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo4ActionPerformed

    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo5.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo6.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo6ActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        // TODO add your handling code here:
        String gt = this.hienthi.getText(); // lay gia tri trong lable hien thi
                if(gt .length() < 12){                                         //neu gia tri la so co it nhat 12 ki tu thi
                    if(gt.equals("0"))                                          // neu gia trij la so 0 thi reset gia ttri thanh chuoi rong
                        gt = "";
                    long so = Long.parseLong(gt + btnSo0.getText());        // ghep them gia tri cua nut vao gia tri da co va chuyen ra so nguyen
                    this.hienthi.setText(String.valueOf(so));        // chuyen so thanh chuoi va gan gia tri cho nut vua nhan 
                }
    }//GEN-LAST:event_btnSo0ActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        // TODO add your handling code here:
         this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "/";
               this.hienthi.setText("0");
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "*";
                this.hienthi.setText("0");
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
         this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "-";
                this.hienthi.setText("0");
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:          
                this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "+";
                this.hienthi.setText("0");
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        // TODO add your handling code here:
        if(this.phepToan.length()>0){
            long b = Long.parseLong(this.hienthi.getText());
            if(this.phepToan.equals("+")){
                long kq = this.a+b;
                this.hienthi.setText(String.valueOf(kq));
            }
            else if(this.phepToan.equals("-")){
                long kq = this.a-b;
                 this.hienthi.setText(String.valueOf(kq));
            }
            else if(this.phepToan.equals("*")){
                long kq = this.a*b;
                 this.hienthi.setText(String.valueOf(kq));
            }
            else if(this.phepToan.equals("/")){
                long kq = this.a/b;
                 this.hienthi.setText(String.valueOf(kq));
            }else if(this.phepToan.equals("Sqrt()")){
                long kq = (long) Math.sqrt(this.a);
                 this.hienthi.setText(String.valueOf(kq));
            } else if(this.phepToan.equals("%")){
                long kq =this.a%b;
                 this.hienthi.setText(String.valueOf(kq));
            } else if(this.phepToan.equals("1/x")){
                long kq =1/this.a;
                 this.hienthi.setText(String.valueOf(kq));
            }else if(this.phepToan.equals("+/-")){
                long kq =-this.a;
                 this.hienthi.setText(String.valueOf(kq));
            }
        }
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        hienthi.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnChiaLayDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaLayDuActionPerformed
        // TODO add your handling code here:
         this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "%";
                this.hienthi.setText("0");
    }//GEN-LAST:event_btnChiaLayDuActionPerformed

    private void btnChiaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaXActionPerformed
        // TODO add your handling code here:
         this.a = Long.parseLong(this.hienthi.getText());
                this.phepToan = "1/x";
                this.hienthi.setText("0");
    }//GEN-LAST:event_btnChiaXActionPerformed

    /**
     * @param args the command line arguments
     */
    private long a = 0;
    private String phepToan="";
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
            java.util.logging.Logger.getLogger(Lab2_Calulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab2_Calulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab2_Calulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab2_Calulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab2_Calulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCanBac2;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnChiaLayDu;
    private javax.swing.JButton btnChiaX;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnCongTru;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel hienthi;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpannel;
    // End of variables declaration//GEN-END:variables
}
