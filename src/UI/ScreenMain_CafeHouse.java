package UI;

/**
 *
 * @author Triệu Phan Thiên Bảo
 */
import Utils.DateHelper;
import Utils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;

public class ScreenMain_CafeHouse extends javax.swing.JFrame {

    public ScreenMain_CafeHouse() {

        initComponents();
        setLocationRelativeTo(null);
      
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        ThanhNgangPanel = new javax.swing.JPanel();
        ThongTinPanel = new javax.swing.JPanel();
        IconThongTin = new javax.swing.JLabel();
        IconNhanVien1 = new javax.swing.JLabel();
        DangXuatPanel = new javax.swing.JPanel();
        DangXuatLabel = new javax.swing.JLabel();
        IconDangXuat = new javax.swing.JLabel();
        TongQuanPanel = new javax.swing.JPanel();
        TongQuanLabel = new javax.swing.JLabel();
        IconTongQuan = new javax.swing.JLabel();
        lbl_DongHo = new javax.swing.JLabel();
        lbl_NgayThangNam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        BanHang = new javax.swing.JPanel();
        BanHangLabel = new javax.swing.JLabel();
        IconBanHang = new javax.swing.JLabel();
        BanHang1 = new javax.swing.JPanel();
        BanHangLabel1 = new javax.swing.JLabel();
        IconBanHang1 = new javax.swing.JLabel();
        BanHang5 = new javax.swing.JPanel();
        BanHangLabel5 = new javax.swing.JLabel();
        IconBanHang5 = new javax.swing.JLabel();
        BanHang6 = new javax.swing.JPanel();
        BanHangLabel6 = new javax.swing.JLabel();
        IconBanHang6 = new javax.swing.JLabel();
        BanHang7 = new javax.swing.JPanel();
        BanHangLabel7 = new javax.swing.JLabel();
        IconBanHang7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Café_House");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        kGradientPanel2.setkEndColor(new java.awt.Color(245, 245, 245));
        kGradientPanel2.setkStartColor(new java.awt.Color(245, 245, 245));

        ThanhNgangPanel.setBackground(new java.awt.Color(135, 99, 44));

        ThongTinPanel.setBackground(new java.awt.Color(135, 99, 44));
        ThongTinPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongTinPanelMouseClicked(evt);
            }
        });

        IconThongTin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        IconThongTin.setForeground(new java.awt.Color(255, 255, 255));
        IconThongTin.setText("Thông Tin");
        IconThongTin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                IconThongTinAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        IconNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/account.png"))); // NOI18N

        javax.swing.GroupLayout ThongTinPanelLayout = new javax.swing.GroupLayout(ThongTinPanel);
        ThongTinPanel.setLayout(ThongTinPanelLayout);
        ThongTinPanelLayout.setHorizontalGroup(
            ThongTinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IconThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ThongTinPanelLayout.setVerticalGroup(
            ThongTinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconNhanVien1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DangXuatPanel.setBackground(new java.awt.Color(135, 99, 44));
        DangXuatPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatPanelMouseClicked(evt);
            }
        });

        DangXuatLabel.setBackground(new java.awt.Color(255, 204, 102));
        DangXuatLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        DangXuatLabel.setForeground(new java.awt.Color(255, 255, 255));
        DangXuatLabel.setText("Đăng xuất");

        IconDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N

        javax.swing.GroupLayout DangXuatPanelLayout = new javax.swing.GroupLayout(DangXuatPanel);
        DangXuatPanel.setLayout(DangXuatPanelLayout);
        DangXuatPanelLayout.setHorizontalGroup(
            DangXuatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconDangXuat)
                .addGap(18, 18, 18)
                .addComponent(DangXuatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        DangXuatPanelLayout.setVerticalGroup(
            DangXuatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(DangXuatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TongQuanPanel.setBackground(new java.awt.Color(135, 99, 44));
        TongQuanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TongQuanPanelMouseClicked(evt);
            }
        });

        TongQuanLabel.setBackground(new java.awt.Color(255, 204, 102));
        TongQuanLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TongQuanLabel.setForeground(new java.awt.Color(255, 255, 255));
        TongQuanLabel.setText("Tổng quan");

        IconTongQuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/info.png"))); // NOI18N

        javax.swing.GroupLayout TongQuanPanelLayout = new javax.swing.GroupLayout(TongQuanPanel);
        TongQuanPanel.setLayout(TongQuanPanelLayout);
        TongQuanPanelLayout.setHorizontalGroup(
            TongQuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TongQuanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconTongQuan)
                .addGap(18, 18, 18)
                .addComponent(TongQuanLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TongQuanPanelLayout.setVerticalGroup(
            TongQuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TongQuanLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbl_DongHo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_DongHo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clcok.png"))); // NOI18N
        lbl_DongHo.setText("hh:mm:ss");

        lbl_NgayThangNam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_NgayThangNam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NgayThangNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Date.png"))); // NOI18N
        lbl_NgayThangNam.setText("dd-MM-yyyy");

        javax.swing.GroupLayout ThanhNgangPanelLayout = new javax.swing.GroupLayout(ThanhNgangPanel);
        ThanhNgangPanel.setLayout(ThanhNgangPanelLayout);
        ThanhNgangPanelLayout.setHorizontalGroup(
            ThanhNgangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhNgangPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_DongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(lbl_NgayThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TongQuanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThongTinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DangXuatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        ThanhNgangPanelLayout.setVerticalGroup(
            ThanhNgangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThongTinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TongQuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DangXuatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_DongHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_NgayThangNam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_300.jpg"))); // NOI18N

        kGradientPanel1.setBackground(new java.awt.Color(255, 204, 102));
        kGradientPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        kGradientPanel1.setkEndColor(new java.awt.Color(245, 245, 245));
        kGradientPanel1.setkStartColor(new java.awt.Color(135, 99, 44));

        BanHang.setBackground(new java.awt.Color(135, 99, 44));
        BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHangMouseClicked(evt);
            }
        });

        BanHangLabel.setBackground(new java.awt.Color(255, 204, 102));
        BanHangLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BanHangLabel.setForeground(new java.awt.Color(255, 255, 255));
        BanHangLabel.setText("Bán hàng");

        IconBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cart.png"))); // NOI18N

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconBanHang)
                .addGap(18, 18, 18)
                .addComponent(BanHangLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BanHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        BanHang1.setBackground(new java.awt.Color(135, 99, 44));
        BanHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHang1MouseClicked(evt);
            }
        });

        BanHangLabel1.setBackground(new java.awt.Color(255, 204, 102));
        BanHangLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BanHangLabel1.setForeground(new java.awt.Color(255, 255, 255));
        BanHangLabel1.setText("Quản lý nhân viên");

        IconBanHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/users.png"))); // NOI18N

        javax.swing.GroupLayout BanHang1Layout = new javax.swing.GroupLayout(BanHang1);
        BanHang1.setLayout(BanHang1Layout);
        BanHang1Layout.setHorizontalGroup(
            BanHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconBanHang1)
                .addGap(18, 18, 18)
                .addComponent(BanHangLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BanHang1Layout.setVerticalGroup(
            BanHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BanHangLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconBanHang1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        BanHang5.setBackground(new java.awt.Color(135, 99, 44));
        BanHang5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHang5MouseClicked(evt);
            }
        });

        BanHangLabel5.setBackground(new java.awt.Color(255, 204, 102));
        BanHangLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BanHangLabel5.setForeground(new java.awt.Color(255, 255, 255));
        BanHangLabel5.setText("Quản lý hàng hoá");

        IconBanHang5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/goods.png"))); // NOI18N

        javax.swing.GroupLayout BanHang5Layout = new javax.swing.GroupLayout(BanHang5);
        BanHang5.setLayout(BanHang5Layout);
        BanHang5Layout.setHorizontalGroup(
            BanHang5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHang5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconBanHang5)
                .addGap(18, 18, 18)
                .addComponent(BanHangLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BanHang5Layout.setVerticalGroup(
            BanHang5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BanHangLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconBanHang5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        BanHang6.setBackground(new java.awt.Color(135, 99, 44));
        BanHang6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHang6MouseClicked(evt);
            }
        });

        BanHangLabel6.setBackground(new java.awt.Color(255, 204, 102));
        BanHangLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BanHangLabel6.setForeground(new java.awt.Color(255, 255, 255));
        BanHangLabel6.setText("Quản lý khách hàng");

        IconBanHang6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/users_group.png"))); // NOI18N

        javax.swing.GroupLayout BanHang6Layout = new javax.swing.GroupLayout(BanHang6);
        BanHang6.setLayout(BanHang6Layout);
        BanHang6Layout.setHorizontalGroup(
            BanHang6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHang6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconBanHang6)
                .addGap(18, 18, 18)
                .addComponent(BanHangLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BanHang6Layout.setVerticalGroup(
            BanHang6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BanHangLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IconBanHang6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BanHang7.setBackground(new java.awt.Color(135, 99, 44));
        BanHang7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHang7MouseClicked(evt);
            }
        });

        BanHangLabel7.setBackground(new java.awt.Color(255, 204, 102));
        BanHangLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BanHangLabel7.setForeground(new java.awt.Color(255, 255, 255));
        BanHangLabel7.setText("Thống kê doanh thu");

        IconBanHang7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/statistical.png"))); // NOI18N

        javax.swing.GroupLayout BanHang7Layout = new javax.swing.GroupLayout(BanHang7);
        BanHang7.setLayout(BanHang7Layout);
        BanHang7Layout.setHorizontalGroup(
            BanHang7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHang7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconBanHang7)
                .addGap(18, 18, 18)
                .addComponent(BanHangLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BanHang7Layout.setVerticalGroup(
            BanHang7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconBanHang7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(BanHangLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BanHang7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BanHang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BanHang5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BanHang6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BanHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BanHang5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BanHang6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BanHang7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_169.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CHÀO MỪNG ĐẾN HỆ THỐNG CỦA CAFÉ HOUSE ");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72))))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(ThanhNgangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThanhNgangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThongTinPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongTinPanelMouseClicked
//        DialogHelper.alert(this, "Đăng Nhập Với: "+ShareHelper.USER.getManv());
    }//GEN-LAST:event_ThongTinPanelMouseClicked

    private void IconThongTinAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_IconThongTinAncestorAdded
        //String t =ShareHelper.USER.getVaiTro()?"Quản Lý":"Nhân Viên";
//        ShareHelper.USER = USER;
//        if(USER.getVaiTro() == true ){
//            DialogHelper.alert(this, "Đăng Nhập Với: "+ShareHelper.USER.getManv());
//            // JOptionPane.showMessageDialog(this, "Chức Năng :  "+ShareHelper.USER.getVaitro());
//        }else {
//            DialogHelper.alert(this, "Đăng Nhập Với: "+ShareHelper.USER.getManv());
//            // JOptionPane.showMessageDialog(this, "Chức Năng :  "+ShareHelper.USER.getVaitro());
//        }
    }//GEN-LAST:event_IconThongTinAncestorAdded

    private void BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHangMouseClicked
//        if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
//            System.exit(0);
//        }
    }//GEN-LAST:event_BanHangMouseClicked

    private void DangXuatPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DangXuatPanelMouseClicked

    private void TongQuanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TongQuanPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TongQuanPanelMouseClicked

    private void BanHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHang1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BanHang1MouseClicked

    private void BanHang5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHang5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BanHang5MouseClicked

    private void BanHang6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHang6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BanHang6MouseClicked

    private void BanHang7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHang7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BanHang7MouseClicked

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
            java.util.logging.Logger.getLogger(ScreenMain_CafeHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenMain_CafeHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenMain_CafeHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain_CafeHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenMain_CafeHouse().setVisible(true);
            }
        });

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanHang;
    private javax.swing.JPanel BanHang1;
    private javax.swing.JPanel BanHang5;
    private javax.swing.JPanel BanHang6;
    private javax.swing.JPanel BanHang7;
    private javax.swing.JLabel BanHangLabel;
    private javax.swing.JLabel BanHangLabel1;
    private javax.swing.JLabel BanHangLabel5;
    private javax.swing.JLabel BanHangLabel6;
    private javax.swing.JLabel BanHangLabel7;
    private javax.swing.JLabel DangXuatLabel;
    private javax.swing.JPanel DangXuatPanel;
    private javax.swing.JLabel IconBanHang;
    private javax.swing.JLabel IconBanHang1;
    private javax.swing.JLabel IconBanHang5;
    private javax.swing.JLabel IconBanHang6;
    private javax.swing.JLabel IconBanHang7;
    private javax.swing.JLabel IconDangXuat;
    private javax.swing.JLabel IconNhanVien1;
    private javax.swing.JLabel IconThongTin;
    private javax.swing.JLabel IconTongQuan;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel ThanhNgangPanel;
    private javax.swing.JPanel ThongTinPanel;
    private javax.swing.JLabel TongQuanLabel;
    private javax.swing.JPanel TongQuanPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lbl_DongHo;
    private javax.swing.JLabel lbl_NgayThangNam;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setIconImage(XImage.getAppIcon());
        startDongHo();
        
    }

    void startDongHo() {
        lbl_NgayThangNam.setText(DateHelper.toString(DateHelper.now(), "dd-MM-yyyy"));
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_DongHo.setText(format.format(new java.util.Date()));
            }
        }).start();
    }
}