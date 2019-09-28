/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HK6_java_tuan_3;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ASUS
 */
public class Bai7_ThaotacTrenList extends javax.swing.JFrame {
    DefaultListModel listModel =new DefaultListModel<>();
    
    public Bai7_ThaotacTrenList() {
        initComponents();
        listBox.setModel(listModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnToDenSoLe = new javax.swing.JButton();
        btnToDenSoNguyenTo = new javax.swing.JButton();
        btnBoToDen = new javax.swing.JButton();
        btnToDenSoChan = new javax.swing.JButton();
        btnTinhTongCacGiaTriTrongList = new javax.swing.JButton();
        btnXoaCacGiaTriDangToDen = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnNhap = new javax.swing.JButton();
        txtNhap = new javax.swing.JTextField();
        checkBoxNhapSoAm = new javax.swing.JCheckBox();
        jScrollPane = new javax.swing.JScrollPane();
        listBox = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("THAO TÁC TRÊN LIST-CHECKBOX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExit.setText("Đóng Chương Trình");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chọn Tác Vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        btnToDenSoLe.setText("Tô Đen Số Lẽ");
        btnToDenSoLe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenSoLeActionPerformed(evt);
            }
        });

        btnToDenSoNguyenTo.setText("Tô Đen Số Nguyên Tố");
        btnToDenSoNguyenTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenSoNguyenToActionPerformed(evt);
            }
        });

        btnBoToDen.setText("Bỏ Tô Đen");
        btnBoToDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoToDenActionPerformed(evt);
            }
        });

        btnToDenSoChan.setText("Tô Đen Số Chẳn");
        btnToDenSoChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenSoChanActionPerformed(evt);
            }
        });

        btnTinhTongCacGiaTriTrongList.setText("Tổng các Giá Trị Trong List");
        btnTinhTongCacGiaTriTrongList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTongCacGiaTriTrongListActionPerformed(evt);
            }
        });

        btnXoaCacGiaTriDangToDen.setText("Xóa Các Giá Trị Đang Tô Đen");
        btnXoaCacGiaTriDangToDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCacGiaTriDangToDenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnToDenSoLe, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToDenSoNguyenTo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoToDen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTinhTongCacGiaTriTrongList, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToDenSoChan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaCacGiaTriDangToDen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnToDenSoChan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnToDenSoLe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnToDenSoNguyenTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBoToDen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaCacGiaTriDangToDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTinhTongCacGiaTriTrongList, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập Thông Tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        btnNhap.setText("NHập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        checkBoxNhapSoAm.setText("Cho Nhập Số Âm");

        jScrollPane.setViewportView(listBox);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNhap)
                        .addGap(18, 18, 18)
                        .addComponent(txtNhap)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxNhapSoAm, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxNhapSoAm))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // TODO add your handling code here:
        nhapSo();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnToDenSoChanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenSoChanActionPerformed
        // TODO add your handling code here:
        toDenSoChan();
    }//GEN-LAST:event_btnToDenSoChanActionPerformed

    private void btnToDenSoLeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenSoLeActionPerformed
        // TODO add your handling code here:
        toDenSoLe();
    }//GEN-LAST:event_btnToDenSoLeActionPerformed

    private void btnToDenSoNguyenToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenSoNguyenToActionPerformed
        // TODO add your handling code here:
        toDenSoNguyenTo();
    }//GEN-LAST:event_btnToDenSoNguyenToActionPerformed

    private void btnTinhTongCacGiaTriTrongListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTongCacGiaTriTrongListActionPerformed
        // TODO add your handling code here:
        tongList();
        
    }//GEN-LAST:event_btnTinhTongCacGiaTriTrongListActionPerformed

    private void btnBoToDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoToDenActionPerformed
        // TODO add your handling code here:
        boToDen();
    }//GEN-LAST:event_btnBoToDenActionPerformed

    private void btnXoaCacGiaTriDangToDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCacGiaTriDangToDenActionPerformed
        // TODO add your handling code here:
        xoaCacGiaTriDangToDen();
    }//GEN-LAST:event_btnXoaCacGiaTriDangToDenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int ret=JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Bai7_ThaotacTrenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai7_ThaotacTrenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai7_ThaotacTrenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai7_ThaotacTrenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai7_ThaotacTrenList().setVisible(true);
            }
        });
    }

    public void nhapSo() {
       try{
            int n=Integer.parseInt(txtNhap.getText());
            if(checkBoxNhapSoAm.isSelected()){
                listModel.addElement(n);
                txtNhap.setText("");
            }
            else {
                if(n<0){

                    JOptionPane.showMessageDialog(null,"Chỉ nhập số dương");
                }
                else {
                    listModel.addElement(n);
                    txtNhap.setText("");
                }
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng số");
        }
    }
    
    public  void toDenSoChan(){
        listBox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int chan=Integer.parseInt(listModel.get(i).toString());
            if(chan%2==0){
               select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        listBox.setSelectedIndices(select);
    }
    
    public void toDenSoLe(){
        listBox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int le=Integer.parseInt(listModel.get(i).toString());
            if(le%2==1){
                select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        listBox.setSelectedIndices(select);
    }
    
    public  boolean soNguyenTo(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void toDenSoNguyenTo(){
        listBox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int[] select = new int[listModel.size()];
        for(int i=0;i<listModel.size();i++){
            int SNT=Integer.parseInt(listModel.get(i).toString());
            if(soNguyenTo(SNT)==true){
                select[i]=i;
            }
            else {
                select[i]=-1;
            }
        }
        listBox.setSelectedIndices(select);
    }
    
    public void boToDen(){
        listBox.clearSelection();
    }
    
    public void tongList(){
        JOptionPane.showMessageDialog(null,"Tổng giá trị trong list là: "+listModel.size());
    }
    
    public void xoaCacGiaTriDangToDen(){
        if(listBox.isSelectionEmpty()==false){
                    for(int i=0;i<listModel.size()+5;i++){
                        int index = listBox.getSelectedIndex();
                        System.out.println(""+index);
                        if(index >= 0){
                            listModel.removeElementAt(index);
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Bạn chưa chọn mục để xóa");
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoToDen;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnTinhTongCacGiaTriTrongList;
    private javax.swing.JButton btnToDenSoChan;
    private javax.swing.JButton btnToDenSoLe;
    private javax.swing.JButton btnToDenSoNguyenTo;
    private javax.swing.JButton btnXoaCacGiaTriDangToDen;
    private javax.swing.JCheckBox checkBoxNhapSoAm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JList listBox;
    private javax.swing.JTextField txtNhap;
    // End of variables declaration//GEN-END:variables
}
