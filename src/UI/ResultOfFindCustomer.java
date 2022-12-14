package UI;

/**
 *
 * @author Triệu Phan Thiên Bảo
 */
import DAO.KhachHangDAO;
import EntityClass.KhachHang;
import Utils.Auth;
import Utils.ChuyenDoi;
import Utils.MsgBox;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class ResultOfFindCustomer extends javax.swing.JFrame {

    static List<KhachHang> ListKH;

    public ResultOfFindCustomer(List<KhachHang> ListKH) {
        initComponents();
        setLocationRelativeTo(null);
        this.ListKH = ListKH;
        hienThongTinKhachHang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txt_TimKhachHang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Giới tính", "Địa chỉ", "Ngày sinh", "Email", "SĐT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhachHang);

        txt_TimKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TimKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        txt_TimKhachHang.setText("Tìm theo tên, SĐT");
        txt_TimKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TimKhachHangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TimKhachHangFocusLost(evt);
            }
        });
        txt_TimKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_TimKhachHangKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_TimKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            chonKhachHang();
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void txt_TimKhachHangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimKhachHangFocusGained
        // TODO add your handling code here:
        if (txt_TimKhachHang.getText().equals("Tìm theo tên, SĐT")) {
            txt_TimKhachHang.setText("");
        }
    }//GEN-LAST:event_txt_TimKhachHangFocusGained

    private void txt_TimKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TimKhachHangFocusLost
        // TODO add your handling code here:
        if (txt_TimKhachHang.getText().equals("")) {
            txt_TimKhachHang.setText("Tìm theo tên, SĐT");

        }
    }//GEN-LAST:event_txt_TimKhachHangFocusLost

    private void txt_TimKhachHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimKhachHangKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            timKhachHang();
        }
    }//GEN-LAST:event_txt_TimKhachHangKeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultOfFindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultOfFindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultOfFindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultOfFindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultOfFindCustomer(ListKH).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txt_TimKhachHang;
    // End of variables declaration//GEN-END:variables
    int row = -1;
    KhachHangDAO khdao = new KhachHangDAO();

    private void timKhachHang() {

    }

    private void hienThongTinKhachHang() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            for (KhachHang kh : ListKH) {
                Object[] row = {kh.getMaKH(), kh.getTenKH(), kh.getGioiTinh() ? "Nam" : "Nữ", kh.getDiaChi(), ChuyenDoi.toString(kh.getNgaySinh(), "dd/MM/yyyy"), kh.getEmail(), kh.getSDT()};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void chonKhachHang() {
        int index = tblKhachHang.getSelectedRow();
        int MaKhachHang = Integer.parseInt(tblKhachHang.getValueAt(index, 0).toString());
        try {
            Auth.khachhang = khdao.selectById(MaKhachHang);
            
            
            Auth.hoadon.setMaKH(Auth.khachhang.getMaKH());
            
            chuyenThongTinVeFrameBanHang();
            this.dispose();
        } catch (Exception e) {
            MsgBox.alert(this, "Có lỗi:" + e.getMessage());
        }
    }

    void chuyenThongTinVeFrameBanHang() {
        Frame[] listFrames = Frame.getFrames();
        for (Frame fr : listFrames) {
            String tenFrame = fr.getClass().getName();
            if (tenFrame.equals("UI.ManageSale")) {
                fr.dispose();
            }
        }
        new ManageSale(this, true).setVisible(true);
    }
}
