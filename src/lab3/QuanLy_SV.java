/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLy_SV extends javax.swing.JFrame {
    
    SinhVienList svlist = new SinhVienList();
    
    String[] header={"Học và tên","Điểm","Ngành Học","Học lực","Thưởng"};
    DefaultTableModel model=new DefaultTableModel(header,0);
    Comparator<SinhVien> sxTheoTen = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien t, SinhVien t1) {
            return t.name.compareTo(t1.name);
        }
    };
    Comparator<SinhVien> sxTheoDiem = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien t, SinhVien t1) {
            Double a=t.marks;
            Double b=t1.marks;
            return a.compareTo(b);
        }
    };
         
   
    public QuanLy_SV() {
        this.setLocationRelativeTo(null);
        initComponents();
        jtbSinhVien.setModel(model);
        cbo();
    }
    public void cbo(){
        String[] data = {"Ứng dụng phần mềm","Thiết kế đồ họa","Lập trình di động","Lập trình web"};
        cboNganh.setModel(new DefaultComboBoxModel(data));
    }
    public void resest(){
        txtHoTen.setText("");
        txtDiem.setText("");
        txtHocLuc.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        cboNganh = new javax.swing.JComboBox<>();
        chkThuong = new javax.swing.JCheckBox();
        txtHocLuc = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSinhVien = new javax.swing.JTable();
        btnTheoTen = new javax.swing.JButton();
        btxTheoDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Quản Lý Sinh Viên");

        jLabel1.setText("Họ và tên");

        jLabel3.setText("Điểm");

        jLabel4.setText("Ngành");

        jLabel5.setText("Học lực");

        cboNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chkThuong.setText("Có phần thưởng ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnNhapMoi.setText("Nhập mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        jtbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbSinhVien);

        btnTheoTen.setText("Săp xếp theo tên");
        btnTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoTenActionPerformed(evt);
            }
        });

        btxTheoDiem.setText("Sắp xếp theo điểm");
        btxTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxTheoDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen)
                            .addComponent(txtDiem)
                            .addComponent(txtHocLuc)
                            .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkThuong)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCapNhat)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnNhapMoi)
                                .addGap(22, 22, 22))))
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btxTheoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(chkThuong)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnNhapMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTheoTen)
                    .addComponent(btxTheoDiem))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        SinhVien sv = new SinhVien();
        
        sv.name=txtHoTen.getText();        
        sv.marks=Double.parseDouble(txtDiem.getText());
        sv.major=cboNganh.getSelectedItem().toString() ;  
        txtHocLuc.setText(sv.getGrade());
        chkThuong.setSelected(sv.isBonus());
        add(sv);
        loadtable();
        
    }//GEN-LAST:event_btnThemActionPerformed
    public void add(SinhVien sv){
        svlist.them(sv);
    }
    public void loadtable(){
        model.setRowCount(0);
        Object rowData[]= new Object[5];
        for(int i=0;i<svlist.svlist.size();i++){
            rowData[0]=svlist.svlist.get(i).name;
            rowData[2]=svlist.svlist.get(i).major;
            rowData[1]=svlist.svlist.get(i).marks;
            rowData[3]=svlist.svlist.get(i).getGrade();
            rowData[4]=svlist.svlist.get(i).isBonus();
            
            model.addRow(rowData);
        }
    }
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         int r=jtbSinhVien.getSelectedRow();
        svlist.svlist.remove(r);
        loadtable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
       resest();
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int r=jtbSinhVien.getSelectedRow();
        svlist.svlist.remove(r);
        SinhVien sv = new SinhVien();
        sv.name=txtHoTen.getText();
        sv.marks=Double.parseDouble(txtDiem.getText());
        sv.major=cboNganh.getSelectedItem().toString() ;  
        txtHocLuc.setText(sv.getGrade());
        chkThuong.setSelected(sv.isBonus());
        add(sv);
        loadtable();
         
        
    }//GEN-LAST:event_btnCapNhatActionPerformed
   
    private void jtbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSinhVienMouseClicked
        int r=jtbSinhVien.getSelectedRow();
        txtHoTen.setText(jtbSinhVien.getValueAt(r, 0).toString());
        txtDiem.setText(jtbSinhVien.getValueAt(r, 1).toString());
        cboNganh.setSelectedItem(jtbSinhVien.getValueAt(r, 2).toString());
        txtHocLuc.setText(jtbSinhVien.getValueAt(r, 3).toString());
        String thuong= jtbSinhVien.getValueAt(r, 4).toString();
        if (thuong.equalsIgnoreCase("true")) 
            chkThuong.setSelected(true);
        else
            chkThuong.setSelected(false);
    }//GEN-LAST:event_jtbSinhVienMouseClicked

    private void btnTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoTenActionPerformed
        Collections.sort(svlist.svlist,sxTheoTen);
        loadtable();
    }//GEN-LAST:event_btnTheoTenActionPerformed

    private void btxTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxTheoDiemActionPerformed
        Collections.sort(svlist.svlist,sxTheoDiem);
        loadtable();
    }//GEN-LAST:event_btxTheoDiemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLy_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy_SV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTheoTen;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btxTheoDiem;
    private javax.swing.JComboBox<String> cboNganh;
    private javax.swing.JCheckBox chkThuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbSinhVien;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHocLuc;
    // End of variables declaration//GEN-END:variables
}
