/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fpt.Views;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author hquan
 */
public class Main extends javax.swing.JFrame {

    public static Main currentmain;
    private final Map<PanelName, JPanel> panels = new HashMap<>();

    public Main() {
        initComponents();
        init();
        currentmain = this;

    }

    private void init() {
        setLocationRelativeTo(null);
        addPanels();
        offPanels();
        setPanelVisibility(PanelName.BANHANG);
    }

    private void addPanels() {
        panels.put(PanelName.BANHANG, new JplBanHang());
        panels.put(PanelName.THONGKE, new JplThongKe());
        panels.put(PanelName.KHACHHANG, new JplKhachHang());
        panels.put(PanelName.SANPHAM, new JplSanPham());
        panels.put(PanelName.NHANVIEN, new JplNhanVien());
        panels.put(PanelName.HOADON, new JplHoaDon());

        panels.forEach((panelName, panel) -> {
            jplmain.add(panel);
            panel.setVisible(false);
        });
    }

    private void offPanels() {
        panels.values().forEach(panel -> panel.setVisible(false));
    }

    public void setPanelVisibility(PanelName panelName) {
        offPanels();
        panels.get(panelName).setVisible(true);
    }

    public void add(PanelName panelName) {
        setPanelVisibility(panelName);
    }

    public enum PanelName {
        BANHANG,
        THONGKE,
        KHACHHANG,
        SANPHAM,
        NHANVIEN,
        HOADON
    }

//    public void reloadHoadonTable() {
//        if (panels.get(PanelName.HOADON) != null) {
//            ((jplHoadon) panels.get(PanelName.HOADON)).reloadTable(HoaDonDAO.getInstance().selectAll());
//            System.out.println("Load thành công hóa đơn");
//        }
//    }
//    
//    public void reloadThuoc() {
//        if (panels.get(PanelName.SANPHAM) != null) {
//            ((jplSanPham) panels.get(PanelName.SANPHAM)).fillTableThuoc(ThuocDao.getInstance().selectAll());
//            System.out.println("Load thành công thuốc");
//        }
//    }
//    
//    public void reloadBanHang() {
//        if (panels.get(PanelName.BANHANG) != null) {
//            ((JplBanhang) panels.get(PanelName.BANHANG)).fillToTablebanhang(ThuocDao.getInstance().selectAll());
//            System.out.println("Load thành công bán hàng");
//        }
//    }
//    
//    public void reloadKhachHang() {
//        if (panels.get(PanelName.KHACHHANG) != null) {
//            ((jplKhachHangnew) panels.get(PanelName.KHACHHANG)).fillToTablebKH(KhachHangDAO.getInstance().selectAll());
//            System.out.println("Load thành công khách hàng");
//        }
//    }
//    
//    public void reloadThongKe() {
//        if (panels.get(PanelName.THONGKE) != null) {
//            ((jplThongke) panels.get(PanelName.THONGKE)).reloadfromthongke();
//            System.out.println("Load thành công thống kê");
//        }
//    }
//    
//    private void updateUserInfo() {
//        if (Auth.isLogin()) {
//            lblTen.setText("Tên : " + Auth.user.getHoTen());
//            lblVaitro.setText("Vai trò : " + (Auth.isManager() ? "Trưởng phòng" : "Nhân viên"));
//        } else {
//            lblTen.setText("Tên : ");
//            lblVaitro.setText("Vai trò : ");
//        }
//    }
//    
//    public void login() {
//        Auth.clear();
//        lblTen.setText("Tên :");
//        lblVaitro.setText("Vai trò: ");
//        this.dispose();
//        new JFrameDangnhap(this, true).setVisible(true);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplmain = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jplBanhang = new javax.swing.JPanel();
        lblBanhang = new javax.swing.JLabel();
        jplKhachhang = new javax.swing.JPanel();
        lblKhachhang = new javax.swing.JLabel();
        jplSanpham = new javax.swing.JPanel();
        lblSanpham = new javax.swing.JLabel();
        jplHoadon = new javax.swing.JPanel();
        lblHoadon = new javax.swing.JLabel();
        jplNhanvien = new javax.swing.JPanel();
        lblNhanvien = new javax.swing.JLabel();
        jplThongke = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        lblVaitro = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jplmain.setBackground(new java.awt.Color(0, 0, 0));
        jplmain.setLayout(new java.awt.CardLayout());
        getContentPane().add(jplmain, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 5, 5));

        lblBanhang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBanhang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBanhang.setText("Bán hàng");
        lblBanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanhangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplBanhangLayout = new javax.swing.GroupLayout(jplBanhang);
        jplBanhang.setLayout(jplBanhangLayout);
        jplBanhangLayout.setHorizontalGroup(
            jplBanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplBanhangLayout.createSequentialGroup()
                .addComponent(lblBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jplBanhangLayout.setVerticalGroup(
            jplBanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplBanhang);

        lblKhachhang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKhachhang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKhachhang.setText("Khách hàng");
        lblKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachhangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplKhachhangLayout = new javax.swing.GroupLayout(jplKhachhang);
        jplKhachhang.setLayout(jplKhachhangLayout);
        jplKhachhangLayout.setHorizontalGroup(
            jplKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jplKhachhangLayout.setVerticalGroup(
            jplKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplKhachhang);

        lblSanpham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSanpham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSanpham.setText("Sản phẩm");
        lblSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanphamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplSanphamLayout = new javax.swing.GroupLayout(jplSanpham);
        jplSanpham.setLayout(jplSanphamLayout);
        jplSanphamLayout.setHorizontalGroup(
            jplSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jplSanphamLayout.setVerticalGroup(
            jplSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplSanpham);

        lblHoadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHoadon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHoadon.setText("Hóa đơn");
        lblHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoadonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplHoadonLayout = new javax.swing.GroupLayout(jplHoadon);
        jplHoadon.setLayout(jplHoadonLayout);
        jplHoadonLayout.setHorizontalGroup(
            jplHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jplHoadonLayout.setVerticalGroup(
            jplHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplHoadon);

        lblNhanvien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNhanvien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNhanvien.setText("Nhân viên");
        lblNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanvienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplNhanvienLayout = new javax.swing.GroupLayout(jplNhanvien);
        jplNhanvien.setLayout(jplNhanvienLayout);
        jplNhanvienLayout.setHorizontalGroup(
            jplNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jplNhanvienLayout.setVerticalGroup(
            jplNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplNhanvien);

        lblThongke.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblThongke.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblThongke.setText("Thống kê");
        lblThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongkeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplThongkeLayout = new javax.swing.GroupLayout(jplThongke);
        jplThongke.setLayout(jplThongkeLayout);
        jplThongkeLayout.setHorizontalGroup(
            jplThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongke, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jplThongkeLayout.setVerticalGroup(
            jplThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongke, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel1.add(jplThongke);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        lblTen.setText("Tên");

        lblVaitro.setText("Vai trò");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Hệ thống");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cài đặt");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1552, 835));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanhangMouseClicked
        add(PanelName.BANHANG);
    }//GEN-LAST:event_lblBanhangMouseClicked

    private void lblSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanphamMouseClicked
        add(PanelName.SANPHAM);
    }//GEN-LAST:event_lblSanphamMouseClicked

    private void lblKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachhangMouseClicked
        add(PanelName.KHACHHANG);
    }//GEN-LAST:event_lblKhachhangMouseClicked

    private void lblHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoadonMouseClicked
        add(PanelName.HOADON);
    }//GEN-LAST:event_lblHoadonMouseClicked

    private void lblNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanvienMouseClicked
        add(PanelName.NHANVIEN);
    }//GEN-LAST:event_lblNhanvienMouseClicked

    private void lblThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongkeMouseClicked
        add(PanelName.THONGKE);
    }//GEN-LAST:event_lblThongkeMouseClicked

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
                if ("window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jplBanhang;
    private javax.swing.JPanel jplHoadon;
    private javax.swing.JPanel jplKhachhang;
    private javax.swing.JPanel jplNhanvien;
    private javax.swing.JPanel jplSanpham;
    private javax.swing.JPanel jplThongke;
    private javax.swing.JLayeredPane jplmain;
    private javax.swing.JLabel lblBanhang;
    private javax.swing.JLabel lblHoadon;
    private javax.swing.JLabel lblKhachhang;
    private javax.swing.JLabel lblNhanvien;
    private javax.swing.JLabel lblSanpham;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblVaitro;
    // End of variables declaration//GEN-END:variables

}