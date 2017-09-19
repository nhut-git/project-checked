package form;

import com.alee.laf.WebLookAndFeel;
import java.awt.Toolkit;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;

/**
 *
 * @author Dev
 */
public class frmMain extends javax.swing.JFrame {

    public static DefaultTableModel TableModel = new DefaultTableModel();

    public frmMain() {
        initComponents();
        onRun();
    }

    public void onRun() {
        this.setEnabled(true);
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.pnlSubEmployer4NewCard.setLocation(this.pnlSubStudent4NewCard.getLocation());
        this.pnlSubEmployer4NewCard.setVisible(false);
        this.pnlSubEmployer4NewCard.setEnabled(false);
        setTitle("ĐỒ ÁN ĐIỂM DANH - ĐẢM BẢO CHẤT LƯỢNG PHẦN MỀM");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("checked.png")));
        this.lblNickAdmin.setText(model.User.username);
        this.lblNickAdmin4Info.setText(model.User.username);
        this.lblNickAdmin4Events.setText(model.User.username);
        this.lblNickAdmin4Card.setText(model.User.username);
        this.lblFullNameAdmin.setText(model.User.fullname);
        this.lblIDAdmin.setText(model.User.codeID);
    }

    public void onPause() {
        this.setEnabled(false);
        this.setVisible(false);
    }

    public void onStop() {
        this.dispose();
    }

    public void onGoto() {
        frmLogin log = new frmLogin();
    }

    public void FileLogout() {
        model.Login logout = new model.Login(User.username, User.password);
        logout.logFile(false);
        onPause();
        onGoto();
        onStop();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fileChooser = new javax.swing.JFileChooser();
        dalChangePassword = new javax.swing.JDialog();
        pnl = new javax.swing.JPanel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblChangePasswordConfirm = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtChangePasswordRepeat = new javax.swing.JPasswordField();
        btnChangePasswordAgree = new javax.swing.JButton();
        btnChangePasswordCancel = new javax.swing.JButton();
        dalAddEventsFromExcel = new javax.swing.JDialog();
        pnlEventsFromExcel = new javax.swing.JPanel();
        cboEventsFromExcel = new javax.swing.JComboBox<>();
        btnOpenImportExcel4Events = new javax.swing.JButton();
        dalMakeNewCardFromExcel = new javax.swing.JDialog();
        pnlAccountFromExcel = new javax.swing.JPanel();
        cboAccountFromExcel = new javax.swing.JComboBox<>();
        btnOpenImportExcel4Account = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        tabbedPaneMain = new javax.swing.JTabbedPane();
        pnlCheckin = new javax.swing.JPanel();
        txtRFID = new javax.swing.JTextField();
        cboEvents4Checkin = new javax.swing.JComboBox<>();
        scrollPane4Checkin = new javax.swing.JScrollPane();
        tblCheckin = new javax.swing.JTable();
        chbTimeIn = new javax.swing.JCheckBox();
        chbTimeOut = new javax.swing.JCheckBox();
        pnlListChecked = new javax.swing.JPanel();
        cboEvents4ListChecked = new javax.swing.JComboBox<>();
        btnExportList = new javax.swing.JButton();
        btnExportMiss = new javax.swing.JButton();
        scrollPane4ListChecked = new javax.swing.JScrollPane();
        tblListChecked = new javax.swing.JTable();
        pnlEvents = new javax.swing.JPanel();
        txtFindEvents = new javax.swing.JTextField();
        scrollPane4Events = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        pnlUpdate4Events = new javax.swing.JPanel();
        lblAddEvents = new javax.swing.JLabel();
        lblSavedEvents = new javax.swing.JLabel();
        lblDeleteEvents = new javax.swing.JLabel();
        lbltextEvents0 = new javax.swing.JLabel();
        lbltextEvents1 = new javax.swing.JLabel();
        lbltextEvents2 = new javax.swing.JLabel();
        pnlAccount = new javax.swing.JPanel();
        txtFindAccount = new javax.swing.JTextField();
        cboAccount = new javax.swing.JComboBox<>();
        scrollPane4Account = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        pnlUpdate4Account = new javax.swing.JPanel();
        lblAddAcount = new javax.swing.JLabel();
        lblSavedAcount = new javax.swing.JLabel();
        lblDeleteAcount = new javax.swing.JLabel();
        lbltextAccount0 = new javax.swing.JLabel();
        lbltextAccount1 = new javax.swing.JLabel();
        lbltextAccount2 = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        tabbedPaneSub = new javax.swing.JTabbedPane();
        pnlInfo4Admin = new javax.swing.JPanel();
        pnlInfoAdminLeft = new javax.swing.JPanel();
        lblInfo1 = new javax.swing.JLabel();
        lblNickAdmin = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblFullNameAdmin = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblIDAdmin = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        pnlInfoAdminRight = new javax.swing.JPanel();
        lblImgAdmin4Info = new javax.swing.JLabel();
        lblNickAdmin4Info = new javax.swing.JLabel();
        btnLogout4Info = new javax.swing.JButton();
        lblExit4Info = new javax.swing.JLabel();
        pnlCreateNewEvents4Admin = new javax.swing.JPanel();
        lblevents4Admin0 = new javax.swing.JLabel();
        txtNewEventsName = new javax.swing.JTextField();
        lblevents4Admin1 = new javax.swing.JLabel();
        txtNewEventsID = new javax.swing.JTextField();
        lblevents4Admin2 = new javax.swing.JLabel();
        txtNewEventsDate = new javax.swing.JTextField();
        lblevents4Admin3 = new javax.swing.JLabel();
        txtNewEventsStart = new javax.swing.JTextField();
        lblevents4Admin4 = new javax.swing.JLabel();
        txtNewEventsEnd = new javax.swing.JTextField();
        btnSaveEvents4Admin = new javax.swing.JButton();
        btnCancelEvents4Admin = new javax.swing.JButton();
        pnlSub4CreateNewEvents = new javax.swing.JPanel();
        lblimgAdmin4Events = new javax.swing.JLabel();
        lblNickAdmin4Events = new javax.swing.JLabel();
        btnLogout4Events = new javax.swing.JButton();
        lblExit4Events = new javax.swing.JLabel();
        pnlMakeCard = new javax.swing.JPanel();
        pnlSub4NewCard = new javax.swing.JPanel();
        cboCard = new javax.swing.JComboBox<>();
        pnlSubStudent4NewCard = new javax.swing.JPanel();
        lblcard4Student0 = new javax.swing.JLabel();
        txtStudentCardRFID = new javax.swing.JTextField();
        lblcard4Student1 = new javax.swing.JLabel();
        txtStudentCardCodeID = new javax.swing.JTextField();
        lblcard4Student2 = new javax.swing.JLabel();
        txtStudentCardName = new javax.swing.JTextField();
        lblcard4Student3 = new javax.swing.JLabel();
        txtStudentCardClass = new javax.swing.JTextField();
        lblcard4Student4 = new javax.swing.JLabel();
        txtStudentCardMajors = new javax.swing.JTextField();
        lblcard4Student5 = new javax.swing.JLabel();
        txtStudentCardCollege = new javax.swing.JTextField();
        lblcard4Student6 = new javax.swing.JLabel();
        cboSchoolYear = new javax.swing.JComboBox<>();
        btnAddNewStudent1 = new javax.swing.JButton();
        btnCancelStudent = new javax.swing.JButton();
        pnlSubEmployer4NewCard = new javax.swing.JPanel();
        lblcard4Employer0 = new javax.swing.JLabel();
        txtEmployerCardRFID = new javax.swing.JTextField();
        lblcard4employer1 = new javax.swing.JLabel();
        txtEmployerCardCodeID = new javax.swing.JTextField();
        lblcard4employer2 = new javax.swing.JLabel();
        txtEmployerCardName = new javax.swing.JTextField();
        lblcard4employer3 = new javax.swing.JLabel();
        txtEmployerCardEmail = new javax.swing.JTextField();
        lblcard4employer4 = new javax.swing.JLabel();
        txtEmployerCardSet = new javax.swing.JTextField();
        lblcard4employer5 = new javax.swing.JLabel();
        txtEmployerCardDepartment = new javax.swing.JTextField();
        btnAddNewEmployer = new javax.swing.JButton();
        btnCancelEmployer = new javax.swing.JButton();
        pnlSub4Card = new javax.swing.JPanel();
        lblImgAdmin4Card = new javax.swing.JLabel();
        lblNickAdmin4Card = new javax.swing.JLabel();
        btnLogout4Card = new javax.swing.JButton();
        lblExit4Card = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFileLogout = new javax.swing.JMenuItem();
        mnuFileExit = new javax.swing.JMenuItem();
        mnuCreateNewEvents = new javax.swing.JMenu();
        mnuCreateNewEventsFromExcel = new javax.swing.JMenuItem();
        mnuMakeNewCard = new javax.swing.JMenu();
        mnuMakeNewCardFromExcel = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("C:\\Users"));

        dalChangePassword.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                dalChangePasswordWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dalChangePasswordWindowClosing(evt);
            }
        });
        dalChangePassword.getContentPane().setLayout(new java.awt.GridBagLayout());

        lblOldPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblOldPassword.setText("Mật khẩu hiện tại");

        lblNewPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNewPassword.setText("Mật khẩu mới");

        lblChangePasswordConfirm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblChangePasswordConfirm.setText("Nhập lại mật khẩu");

        txtOldPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNewPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtChangePasswordRepeat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnChangePasswordAgree.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnChangePasswordAgree.setText("Đồng ý");
        btnChangePasswordAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordAgreeActionPerformed(evt);
            }
        });

        btnChangePasswordCancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnChangePasswordCancel.setText("Hủy");
        btnChangePasswordCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewPassword)
                            .addComponent(lblOldPassword)
                            .addComponent(lblChangePasswordConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChangePasswordCancel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtChangePasswordRepeat)
                            .addComponent(txtOldPassword)))
                    .addComponent(btnChangePasswordAgree))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPassword)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChangePasswordConfirm)
                    .addComponent(txtChangePasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePasswordAgree)
                    .addComponent(btnChangePasswordCancel))
                .addGap(6, 6, 6))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        dalChangePassword.getContentPane().add(pnl, gridBagConstraints);

        dalAddEventsFromExcel.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                dalAddEventsFromExcelWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dalAddEventsFromExcelWindowClosing(evt);
            }
        });

        cboEventsFromExcel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboEventsFromExcel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày Hội Việc Làm 2017", "Tuần lễ Khám phá Tri thức", "Giao lưu với CLB CEO phần mềm Quang Trung" }));

        btnOpenImportExcel4Events.setText("Chọn");
        btnOpenImportExcel4Events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenImportExcel4EventsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEventsFromExcelLayout = new javax.swing.GroupLayout(pnlEventsFromExcel);
        pnlEventsFromExcel.setLayout(pnlEventsFromExcelLayout);
        pnlEventsFromExcelLayout.setHorizontalGroup(
            pnlEventsFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventsFromExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventsFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEventsFromExcel, 0, 388, Short.MAX_VALUE)
                    .addGroup(pnlEventsFromExcelLayout.createSequentialGroup()
                        .addComponent(btnOpenImportExcel4Events)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEventsFromExcelLayout.setVerticalGroup(
            pnlEventsFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventsFromExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEventsFromExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpenImportExcel4Events)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dalAddEventsFromExcelLayout = new javax.swing.GroupLayout(dalAddEventsFromExcel.getContentPane());
        dalAddEventsFromExcel.getContentPane().setLayout(dalAddEventsFromExcelLayout);
        dalAddEventsFromExcelLayout.setHorizontalGroup(
            dalAddEventsFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEventsFromExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dalAddEventsFromExcelLayout.setVerticalGroup(
            dalAddEventsFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEventsFromExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dalMakeNewCardFromExcel.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                dalMakeNewCardFromExcelWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dalMakeNewCardFromExcelWindowClosing(evt);
            }
        });

        cboAccountFromExcel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboAccountFromExcel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Cán bộ" }));

        btnOpenImportExcel4Account.setText("Chọn");
        btnOpenImportExcel4Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenImportExcel4AccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAccountFromExcelLayout = new javax.swing.GroupLayout(pnlAccountFromExcel);
        pnlAccountFromExcel.setLayout(pnlAccountFromExcelLayout);
        pnlAccountFromExcelLayout.setHorizontalGroup(
            pnlAccountFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountFromExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAccountFromExcel, 0, 388, Short.MAX_VALUE)
                    .addGroup(pnlAccountFromExcelLayout.createSequentialGroup()
                        .addComponent(btnOpenImportExcel4Account)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAccountFromExcelLayout.setVerticalGroup(
            pnlAccountFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountFromExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboAccountFromExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpenImportExcel4Account)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dalMakeNewCardFromExcelLayout = new javax.swing.GroupLayout(dalMakeNewCardFromExcel.getContentPane());
        dalMakeNewCardFromExcel.getContentPane().setLayout(dalMakeNewCardFromExcelLayout);
        dalMakeNewCardFromExcelLayout.setHorizontalGroup(
            dalMakeNewCardFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAccountFromExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dalMakeNewCardFromExcelLayout.setVerticalGroup(
            dalMakeNewCardFromExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAccountFromExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tabbedPaneMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneMainStateChanged(evt);
            }
        });

        txtRFID.setText("RFID");

        cboEvents4Checkin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày Hội Việc Làm 2017", "Tuần lễ Khám phá Tri thức", "Giao lưu với CLB CEO phần mềm Quang Trung" }));

        tblCheckin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ SỐ", "HỌ VÀ TÊN", "THỜI GIAN VÀO", "THỜI GIAN RA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane4Checkin.setViewportView(tblCheckin);

        chbTimeIn.setText("Điểm danh vào");

        chbTimeOut.setText("Điểm danh ra");

        javax.swing.GroupLayout pnlCheckinLayout = new javax.swing.GroupLayout(pnlCheckin);
        pnlCheckin.setLayout(pnlCheckinLayout);
        pnlCheckinLayout.setHorizontalGroup(
            pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane4Checkin)
                    .addGroup(pnlCheckinLayout.createSequentialGroup()
                        .addComponent(txtRFID, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCheckinLayout.createSequentialGroup()
                                .addComponent(chbTimeIn)
                                .addGap(18, 18, 18)
                                .addComponent(chbTimeOut))
                            .addComponent(cboEvents4Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlCheckinLayout.setVerticalGroup(
            pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEvents4Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbTimeIn)
                    .addComponent(chbTimeOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane4Checkin, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneMain.addTab("ĐIỂM DANH", pnlCheckin);

        cboEvents4ListChecked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày Hội Việc Làm 2017", "Tuần lễ Khám phá Tri thức", "Giao lưu với CLB CEO phần mềm Quang Trung" }));

        btnExportList.setText("Xuất danh sách tham gia sự kiện");

        btnExportMiss.setText("Xuất danh sách vắng");

        tblListChecked.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ SỐ", "HỌ VÀ TÊN", "LỚP/ PHÒNG BAN", "THAM GIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane4ListChecked.setViewportView(tblListChecked);

        javax.swing.GroupLayout pnlListCheckedLayout = new javax.swing.GroupLayout(pnlListChecked);
        pnlListChecked.setLayout(pnlListCheckedLayout);
        pnlListCheckedLayout.setHorizontalGroup(
            pnlListCheckedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListCheckedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListCheckedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEvents4ListChecked, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane4ListChecked, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListCheckedLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportMiss)))
                .addContainerGap())
        );
        pnlListCheckedLayout.setVerticalGroup(
            pnlListCheckedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListCheckedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEvents4ListChecked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListCheckedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportMiss)
                    .addComponent(btnExportList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane4ListChecked, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneMain.addTab("QUẢN LÝ DANH SÁCH ĐIỂM DANH", pnlListChecked);

        txtFindEvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindEventsKeyReleased(evt);
            }
        });

        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ SỐ", "TÊN SỰ KIỆN", "NGÀY TỔ CHỨC", "THỜI GIAN BẮT ĐẦU", "THỜI GIAN KẾT THÚC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane4Events.setViewportView(tblEvents);

        lblAddEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        lblAddEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddEventsMouseClicked(evt);
            }
        });

        lblSavedEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        lblSavedEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSavedEventsMouseClicked(evt);
            }
        });

        lblDeleteEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        lblDeleteEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteEventsMouseClicked(evt);
            }
        });

        lbltextEvents0.setText("Thêm mới");

        lbltextEvents1.setText("Sao lưu");

        lbltextEvents2.setText("Xóa");

        javax.swing.GroupLayout pnlUpdate4EventsLayout = new javax.swing.GroupLayout(pnlUpdate4Events);
        pnlUpdate4Events.setLayout(pnlUpdate4EventsLayout);
        pnlUpdate4EventsLayout.setHorizontalGroup(
            pnlUpdate4EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdate4EventsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlUpdate4EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeleteEvents)
                    .addComponent(lblSavedEvents)
                    .addComponent(lblAddEvents)
                    .addGroup(pnlUpdate4EventsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlUpdate4EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltextEvents1)
                            .addComponent(lbltextEvents0)
                            .addGroup(pnlUpdate4EventsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbltextEvents2)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlUpdate4EventsLayout.setVerticalGroup(
            pnlUpdate4EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdate4EventsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblAddEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltextEvents0)
                .addGap(73, 73, 73)
                .addComponent(lblSavedEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltextEvents1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDeleteEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltextEvents2)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout pnlEventsLayout = new javax.swing.GroupLayout(pnlEvents);
        pnlEvents.setLayout(pnlEventsLayout);
        pnlEventsLayout.setHorizontalGroup(
            pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFindEvents)
                    .addGroup(pnlEventsLayout.createSequentialGroup()
                        .addComponent(scrollPane4Events, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlUpdate4Events, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEventsLayout.setVerticalGroup(
            pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFindEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUpdate4Events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane4Events, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneMain.addTab("QUẢN LÝ SỰ KIỆN", pnlEvents);

        txtFindAccount.setText("Tìm Sinh viên hoặc Cán bộ");

        cboAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Cán bộ" }));
        cboAccount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAccountItemStateChanged(evt);
            }
        });

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SỐ", "HỌ VÀ TÊN", "LỚP", "NGÀNH", "KHOA", "NIÊN KHÓA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane4Account.setViewportView(tblAccount);

        lblAddAcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        lblAddAcount.setToolTipText("");
        lblAddAcount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddAcountMouseClicked(evt);
            }
        });

        lblSavedAcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N

        lblDeleteAcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N

        lbltextAccount0.setText("Thêm mới");

        lbltextAccount1.setText("Sao lưu");

        lbltextAccount2.setText("Xóa");

        javax.swing.GroupLayout pnlUpdate4AccountLayout = new javax.swing.GroupLayout(pnlUpdate4Account);
        pnlUpdate4Account.setLayout(pnlUpdate4AccountLayout);
        pnlUpdate4AccountLayout.setHorizontalGroup(
            pnlUpdate4AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdate4AccountLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pnlUpdate4AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeleteAcount)
                    .addComponent(lblSavedAcount)
                    .addComponent(lblAddAcount)
                    .addGroup(pnlUpdate4AccountLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlUpdate4AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltextAccount1)
                            .addComponent(lbltextAccount0)
                            .addGroup(pnlUpdate4AccountLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbltextAccount2)))))
                .addGap(32, 32, 32))
        );
        pnlUpdate4AccountLayout.setVerticalGroup(
            pnlUpdate4AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdate4AccountLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblAddAcount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltextAccount0)
                .addGap(79, 79, 79)
                .addComponent(lblSavedAcount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltextAccount1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDeleteAcount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltextAccount2)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane4Account, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addComponent(txtFindAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboAccount, 0, 130, Short.MAX_VALUE)
                    .addComponent(pnlUpdate4Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane4Account, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(pnlUpdate4Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneMain.addTab("QUẢN LÝ TÀI KHOẢN", pnlAccount);

        lblInfo1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblInfo1.setText("Tài Khoản");

        lblNickAdmin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNickAdmin.setText("Admin");

        lblInfo2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblInfo2.setText("Họ Tên");

        lblFullNameAdmin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblFullNameAdmin.setText("Không Biết Tên");

        lblInfo3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblInfo3.setText("Mã Số");

        lblIDAdmin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblIDAdmin.setText("MSCB");

        btnChangePassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnChangePassword.setText("Đổi mật khẩu");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoAdminLeftLayout = new javax.swing.GroupLayout(pnlInfoAdminLeft);
        pnlInfoAdminLeft.setLayout(pnlInfoAdminLeftLayout);
        pnlInfoAdminLeftLayout.setHorizontalGroup(
            pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAdminLeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInfoAdminLeftLayout.createSequentialGroup()
                        .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfo1)
                            .addComponent(lblInfo2)
                            .addComponent(lblInfo3))
                        .addGap(60, 60, 60)
                        .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFullNameAdmin)
                            .addComponent(lblNickAdmin)
                            .addComponent(lblIDAdmin))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        pnlInfoAdminLeftLayout.setVerticalGroup(
            pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAdminLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo1)
                    .addComponent(lblNickAdmin))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo2)
                    .addComponent(lblFullNameAdmin))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo3)
                    .addComponent(lblIDAdmin))
                .addGap(18, 18, 18)
                .addComponent(btnChangePassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblImgAdmin4Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N

        lblNickAdmin4Info.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNickAdmin4Info.setText("Admin");

        btnLogout4Info.setText("Đăng xuất");
        btnLogout4Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout4InfoActionPerformed(evt);
            }
        });

        lblExit4Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        lblExit4Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit4InfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoAdminRightLayout = new javax.swing.GroupLayout(pnlInfoAdminRight);
        pnlInfoAdminRight.setLayout(pnlInfoAdminRightLayout);
        pnlInfoAdminRightLayout.setHorizontalGroup(
            pnlInfoAdminRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoAdminRightLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pnlInfoAdminRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoAdminRightLayout.createSequentialGroup()
                        .addComponent(btnLogout4Info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoAdminRightLayout.createSequentialGroup()
                        .addComponent(lblImgAdmin4Info, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(pnlInfoAdminRightLayout.createSequentialGroup()
                .addGroup(pnlInfoAdminRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoAdminRightLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblNickAdmin4Info))
                    .addGroup(pnlInfoAdminRightLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblExit4Info)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlInfoAdminRightLayout.setVerticalGroup(
            pnlInfoAdminRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAdminRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgAdmin4Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickAdmin4Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout4Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(lblExit4Info)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlInfo4AdminLayout = new javax.swing.GroupLayout(pnlInfo4Admin);
        pnlInfo4Admin.setLayout(pnlInfo4AdminLayout);
        pnlInfo4AdminLayout.setHorizontalGroup(
            pnlInfo4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfo4AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfoAdminLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlInfoAdminRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlInfo4AdminLayout.setVerticalGroup(
            pnlInfo4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfo4AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfo4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInfoAdminRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoAdminLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneSub.addTab("THÔNG TIN TÀI KHOẢN QUẢN TRỊ", pnlInfo4Admin);

        lblevents4Admin0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblevents4Admin0.setText("Tên Sự Kiện");

        txtNewEventsName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblevents4Admin1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblevents4Admin1.setText("Mã Số Sự Kiện");

        txtNewEventsID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblevents4Admin2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblevents4Admin2.setText("Ngày Tổ Chức");

        txtNewEventsDate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblevents4Admin3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblevents4Admin3.setText("Thời Gian Vào");

        txtNewEventsStart.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblevents4Admin4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblevents4Admin4.setText("Thời Gian Ra");

        txtNewEventsEnd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnSaveEvents4Admin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSaveEvents4Admin.setText("Lưu");
        btnSaveEvents4Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEvents4AdminActionPerformed(evt);
            }
        });

        btnCancelEvents4Admin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCancelEvents4Admin.setText("Hủy");
        btnCancelEvents4Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEvents4AdminActionPerformed(evt);
            }
        });

        lblimgAdmin4Events.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N

        lblNickAdmin4Events.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNickAdmin4Events.setText("Admin");

        btnLogout4Events.setText("Đăng xuất");
        btnLogout4Events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout4EventsActionPerformed(evt);
            }
        });

        lblExit4Events.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        lblExit4Events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit4EventsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSub4CreateNewEventsLayout = new javax.swing.GroupLayout(pnlSub4CreateNewEvents);
        pnlSub4CreateNewEvents.setLayout(pnlSub4CreateNewEventsLayout);
        pnlSub4CreateNewEventsLayout.setHorizontalGroup(
            pnlSub4CreateNewEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CreateNewEventsLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pnlSub4CreateNewEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CreateNewEventsLayout.createSequentialGroup()
                        .addComponent(btnLogout4Events, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CreateNewEventsLayout.createSequentialGroup()
                        .addComponent(lblimgAdmin4Events, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(pnlSub4CreateNewEventsLayout.createSequentialGroup()
                .addGroup(pnlSub4CreateNewEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSub4CreateNewEventsLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblNickAdmin4Events))
                    .addGroup(pnlSub4CreateNewEventsLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblExit4Events)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSub4CreateNewEventsLayout.setVerticalGroup(
            pnlSub4CreateNewEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSub4CreateNewEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimgAdmin4Events)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickAdmin4Events)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout4Events)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExit4Events)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCreateNewEvents4AdminLayout = new javax.swing.GroupLayout(pnlCreateNewEvents4Admin);
        pnlCreateNewEvents4Admin.setLayout(pnlCreateNewEvents4AdminLayout);
        pnlCreateNewEvents4AdminLayout.setHorizontalGroup(
            pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreateNewEvents4AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblevents4Admin1)
                    .addComponent(lblevents4Admin0)
                    .addComponent(lblevents4Admin2)
                    .addComponent(lblevents4Admin3)
                    .addComponent(lblevents4Admin4)
                    .addComponent(btnSaveEvents4Admin))
                .addGap(18, 18, 18)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewEventsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNewEventsID)
                        .addComponent(txtNewEventsName, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNewEventsStart, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewEventsEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelEvents4Admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(pnlSub4CreateNewEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCreateNewEvents4AdminLayout.setVerticalGroup(
            pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreateNewEvents4AdminLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblevents4Admin0)
                    .addComponent(txtNewEventsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblevents4Admin1)
                    .addComponent(txtNewEventsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblevents4Admin2)
                    .addComponent(txtNewEventsDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblevents4Admin3)
                    .addComponent(txtNewEventsStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblevents4Admin4)
                    .addComponent(txtNewEventsEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCreateNewEvents4AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveEvents4Admin)
                    .addComponent(btnCancelEvents4Admin))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(pnlCreateNewEvents4AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSub4CreateNewEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneSub.addTab("TẠO MỚI SỰ KIỆN", pnlCreateNewEvents4Admin);

        cboCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Cán bộ" }));
        cboCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCardItemStateChanged(evt);
            }
        });

        lblcard4Student0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student0.setText("RFID");

        txtStudentCardRFID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student1.setText("Mã Số");

        txtStudentCardCodeID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student2.setText("Họ Tên");

        txtStudentCardName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student3.setText("Lớp");

        txtStudentCardClass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student4.setText("Ngành");

        txtStudentCardMajors.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student5.setText("Khoa");

        txtStudentCardCollege.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4Student6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Student6.setText("Niên Khóa");

        cboSchoolYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014 - 2018", "2015 - 2019", "2016 - 2020", "2017 - 2021" }));

        btnAddNewStudent1.setText("Lưu");

        btnCancelStudent.setText("Hủy");
        btnCancelStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSubStudent4NewCardLayout = new javax.swing.GroupLayout(pnlSubStudent4NewCard);
        pnlSubStudent4NewCard.setLayout(pnlSubStudent4NewCardLayout);
        pnlSubStudent4NewCardLayout.setHorizontalGroup(
            pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubStudent4NewCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSubStudent4NewCardLayout.createSequentialGroup()
                        .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcard4Student2)
                                    .addComponent(lblcard4Student1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblcard4Student0, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblcard4Student4)
                            .addComponent(lblcard4Student3)
                            .addComponent(lblcard4Student5)
                            .addComponent(lblcard4Student6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentCardClass, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentCardRFID, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentCardCodeID, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentCardMajors, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentCardCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSchoolYear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubStudent4NewCardLayout.createSequentialGroup()
                        .addComponent(btnAddNewStudent1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelStudent)))
                .addContainerGap())
        );
        pnlSubStudent4NewCardLayout.setVerticalGroup(
            pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubStudent4NewCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentCardRFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcard4Student0))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentCardCodeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcard4Student1))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcard4Student2)
                    .addComponent(txtStudentCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentCardClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcard4Student3))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentCardMajors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcard4Student4))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentCardCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcard4Student5))
                .addGap(18, 18, 18)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcard4Student6)
                    .addComponent(cboSchoolYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlSubStudent4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelStudent)
                    .addComponent(btnAddNewStudent1))
                .addContainerGap())
        );

        lblcard4Employer0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4Employer0.setText("RFID");

        txtEmployerCardRFID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4employer1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4employer1.setText("Mã Số");

        txtEmployerCardCodeID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4employer2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4employer2.setText("Họ Tên");

        txtEmployerCardName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4employer3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4employer3.setText("Email");

        txtEmployerCardEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4employer4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4employer4.setText("Bộ Môn/Tổ");

        txtEmployerCardSet.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblcard4employer5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcard4employer5.setText("Khoa/Phòng");

        txtEmployerCardDepartment.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnAddNewEmployer.setText("Lưu");

        btnCancelEmployer.setText("Hủy");
        btnCancelEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEmployerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSubEmployer4NewCardLayout = new javax.swing.GroupLayout(pnlSubEmployer4NewCard);
        pnlSubEmployer4NewCard.setLayout(pnlSubEmployer4NewCardLayout);
        pnlSubEmployer4NewCardLayout.setHorizontalGroup(
            pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubEmployer4NewCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubEmployer4NewCardLayout.createSequentialGroup()
                        .addComponent(btnAddNewEmployer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                        .addComponent(btnCancelEmployer))
                    .addGroup(pnlSubEmployer4NewCardLayout.createSequentialGroup()
                        .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcard4employer3)
                            .addComponent(lblcard4employer4)
                            .addComponent(lblcard4employer5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSubEmployer4NewCardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcard4employer2)
                            .addComponent(lblcard4employer1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblcard4Employer0, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(18, 18, 18)
                    .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmployerCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployerCardEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployerCardRFID, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployerCardCodeID, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployerCardSet, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployerCardDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlSubEmployer4NewCardLayout.setVerticalGroup(
            pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubEmployer4NewCardLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(lblcard4employer3)
                .addGap(26, 26, 26)
                .addComponent(lblcard4employer4)
                .addGap(29, 29, 29)
                .addComponent(lblcard4employer5)
                .addGap(18, 18, 18)
                .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelEmployer)
                    .addComponent(btnAddNewEmployer))
                .addContainerGap())
            .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSubEmployer4NewCardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmployerCardRFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcard4Employer0))
                    .addGap(18, 18, 18)
                    .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmployerCardCodeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcard4employer1))
                    .addGap(18, 18, 18)
                    .addGroup(pnlSubEmployer4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcard4employer2)
                        .addComponent(txtEmployerCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(txtEmployerCardEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtEmployerCardSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtEmployerCardDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlSub4NewCardLayout = new javax.swing.GroupLayout(pnlSub4NewCard);
        pnlSub4NewCard.setLayout(pnlSub4NewCardLayout);
        pnlSub4NewCardLayout.setHorizontalGroup(
            pnlSub4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSub4NewCardLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(pnlSub4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSubStudent4NewCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnlSub4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSub4NewCardLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(pnlSubEmployer4NewCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        pnlSub4NewCardLayout.setVerticalGroup(
            pnlSub4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSub4NewCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(pnlSubStudent4NewCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(pnlSub4NewCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSub4NewCardLayout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(pnlSubEmployer4NewCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        lblImgAdmin4Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N

        lblNickAdmin4Card.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNickAdmin4Card.setText("Admin");

        btnLogout4Card.setText("Đăng xuất");
        btnLogout4Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout4CardActionPerformed(evt);
            }
        });

        lblExit4Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        lblExit4Card.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit4CardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSub4CardLayout = new javax.swing.GroupLayout(pnlSub4Card);
        pnlSub4Card.setLayout(pnlSub4CardLayout);
        pnlSub4CardLayout.setHorizontalGroup(
            pnlSub4CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CardLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pnlSub4CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CardLayout.createSequentialGroup()
                        .addComponent(btnLogout4Card, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSub4CardLayout.createSequentialGroup()
                        .addComponent(lblImgAdmin4Card, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(pnlSub4CardLayout.createSequentialGroup()
                .addGroup(pnlSub4CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSub4CardLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblNickAdmin4Card))
                    .addGroup(pnlSub4CardLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblExit4Card)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSub4CardLayout.setVerticalGroup(
            pnlSub4CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSub4CardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgAdmin4Card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickAdmin4Card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout4Card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExit4Card)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMakeCardLayout = new javax.swing.GroupLayout(pnlMakeCard);
        pnlMakeCard.setLayout(pnlMakeCardLayout);
        pnlMakeCardLayout.setHorizontalGroup(
            pnlMakeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMakeCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSub4NewCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(pnlSub4Card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMakeCardLayout.setVerticalGroup(
            pnlMakeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMakeCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMakeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSub4Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSub4NewCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneSub.addTab("ĐĂNG KÝ THẺ MỚI", pnlMakeCard);

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneSub)
                .addContainerGap())
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneSub, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneMain.addTab("QUẢN TRỊ", pnlAdmin);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addComponent(tabbedPaneMain)
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addComponent(tabbedPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        mnuFile.setText("Tùy chọn");
        mnuFile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        mnuFileLogout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuFileLogout.setText("Đăng xuất");
        mnuFileLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileLogoutActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileLogout);

        mnuFileExit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuFileExit.setText("Thoát");
        mnuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileExit);

        MenuBar.add(mnuFile);

        mnuCreateNewEvents.setText("Sự kiện");
        mnuCreateNewEvents.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        mnuCreateNewEventsFromExcel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuCreateNewEventsFromExcel.setText("Thêm danh sách tham gia sự kiện từ file Excel");
        mnuCreateNewEventsFromExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreateNewEventsFromExcelActionPerformed(evt);
            }
        });
        mnuCreateNewEvents.add(mnuCreateNewEventsFromExcel);

        MenuBar.add(mnuCreateNewEvents);

        mnuMakeNewCard.setText("Đăng ký thẻ mới");
        mnuMakeNewCard.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        mnuMakeNewCardFromExcel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuMakeNewCardFromExcel.setText("Thêm danh sách đăng ký thẻ từ file Excel");
        mnuMakeNewCardFromExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMakeNewCardFromExcelActionPerformed(evt);
            }
        });
        mnuMakeNewCard.add(mnuMakeNewCardFromExcel);

        MenuBar.add(mnuMakeNewCard);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogout4InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout4InfoActionPerformed
        FileLogout();
    }//GEN-LAST:event_btnLogout4InfoActionPerformed

    private void btnLogout4EventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout4EventsActionPerformed
        FileLogout();
    }//GEN-LAST:event_btnLogout4EventsActionPerformed

    private void btnLogout4CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout4CardActionPerformed
        FileLogout();
    }//GEN-LAST:event_btnLogout4CardActionPerformed

    private void lblExit4InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit4InfoMouseClicked
        FileLogout();
    }//GEN-LAST:event_lblExit4InfoMouseClicked

    private void lblExit4EventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit4EventsMouseClicked
        FileLogout();
    }//GEN-LAST:event_lblExit4EventsMouseClicked

    private void lblExit4CardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit4CardMouseClicked
        FileLogout();
    }//GEN-LAST:event_lblExit4CardMouseClicked

    private void btnSaveEvents4AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEvents4AdminActionPerformed
        model.Events events = new model.Events(txtNewEventsID.getText(), txtNewEventsName.getText(), txtNewEventsDate.getText(), txtNewEventsStart.getText(), txtNewEventsEnd.getText());
        if (events.addEvents()) {
            new JOptionPane().showMessageDialog(null, "Tạo mới thành công sự kiện");
        } else {
            new JOptionPane().showMessageDialog(null, "Tạo sự kiện mới thất bại");
            System.out.println("LỖI KHI TẠO MỚI SỤ KIỆN");
        }
    }//GEN-LAST:event_btnSaveEvents4AdminActionPerformed

    public void resetTextCreateEvents() {
        txtNewEventsID.setText("");
        txtNewEventsName.setText("");
        txtNewEventsDate.setText("");
        txtNewEventsStart.setText("");
        txtNewEventsEnd.setText("");
    }

    private void btnCancelEvents4AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEvents4AdminActionPerformed

        resetTextCreateEvents();
    }//GEN-LAST:event_btnCancelEvents4AdminActionPerformed

    private void tabbedPaneMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneMainStateChanged
        switch (tabbedPaneMain.getSelectedIndex()) {
            // pnl_Checkin: Điểm danh
            case 0: {
                break;
            }
            // pnl_ListCheckin: Quản lý danh sách điểm danh
            case 1: {
                break;
            }
            // pnl_Events: Quản lý sự kiện
            case 2: {
                model.Events.listen2Update(this.tblEvents, "");
                break;
            }
            // pnl_Account: Quản lý tài khoản
            case 3: {
                break;
            }
            // pnl_Admin: Quản trị
            case 4: {
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_tabbedPaneMainStateChanged

    public boolean tryChangePassword() {
        if (txtOldPassword.getText().equals(model.User.password) && txtNewPassword.getText().equals(txtChangePasswordRepeat.getText())) {
            model.Login changePassword = new model.Login(model.User.username, model.User.password);
            changePassword.changePassword(txtNewPassword.getText());
            return true;
        } else {
            return false;
        }
    }
    private void dalChangePasswordWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalChangePasswordWindowActivated
        this.setEnabled(false);
    }//GEN-LAST:event_dalChangePasswordWindowActivated

    private void dalChangePasswordWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalChangePasswordWindowClosing
        this.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_dalChangePasswordWindowClosing

    private void lblSavedEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSavedEventsMouseClicked
        model.Events.edit2SaveEvents(this.tblEvents);
        model.Events.listen2Update(this.tblEvents, "");
    }//GEN-LAST:event_lblSavedEventsMouseClicked

    private void lblDeleteEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteEventsMouseClicked
        model.Events.deleteEvents(this.tblEvents);
        model.Events.listen2Update(this.tblEvents, "");
    }//GEN-LAST:event_lblDeleteEventsMouseClicked

    private void mnuFileLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileLogoutActionPerformed
        FileLogout();
    }//GEN-LAST:event_mnuFileLogoutActionPerformed

    private void mnuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileExitActionPerformed
        model.Login logout = new model.Login(User.username, User.password);
        logout.logFile(false);
        System.exit(0);
    }//GEN-LAST:event_mnuFileExitActionPerformed

    private void btnChangePasswordAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordAgreeActionPerformed
        if (tryChangePassword()) {
            model.User.password = txtNewPassword.getText();
            new JOptionPane().showMessageDialog(null, "Đổi mật khẩu thành công");
        } else {
            new JOptionPane().showMessageDialog(null, "Đổi mật khẩu thất bại");
        }
    }//GEN-LAST:event_btnChangePasswordAgreeActionPerformed

    private void btnChangePasswordCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordCancelActionPerformed
        dalChangePassword.dispose();
        this.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_btnChangePasswordCancelActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        this.dalChangePassword.setVisible(true);
        this.dalChangePassword.setEnabled(true);
        this.dalChangePassword.setSize(this.dalChangePassword.getPreferredSize());
        this.dalChangePassword.setTitle("ĐỔI MẬT KHẨU");
        this.dalChangePassword.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("checked.png")));
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtFindEventsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindEventsKeyReleased
        String sqlQuery = " WHERE name LIKE '%" + txtFindEvents.getText() + "%' OR codeNo LIKE '%" + txtFindEvents.getText() + "%'";
        model.Events.listen2Update(this.tblEvents, sqlQuery);
    }//GEN-LAST:event_txtFindEventsKeyReleased

    private void lblAddEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEventsMouseClicked
        this.tabbedPaneMain.setSelectedComponent(pnlAdmin);
        this.tabbedPaneSub.setSelectedComponent(pnlCreateNewEvents4Admin);
    }//GEN-LAST:event_lblAddEventsMouseClicked

    public void resetTextStudent() {
        txtStudentCardClass.setText("");
        txtStudentCardCodeID.setText("");
        txtStudentCardCollege.setText("");
        txtStudentCardMajors.setText("");
        txtStudentCardName.setText("");
        txtStudentCardRFID.setText("");
        cboSchoolYear.setSelectedIndex(0);
    }

    private void btnCancelStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelStudentActionPerformed
        resetTextStudent();
    }//GEN-LAST:event_btnCancelStudentActionPerformed

    public void resetTextEmployer() {
        txtEmployerCardCodeID.setText("");
        txtEmployerCardDepartment.setText("");
        txtEmployerCardEmail.setText("");
        txtEmployerCardName.setText("");
        txtEmployerCardRFID.setText("");
        txtEmployerCardSet.setText("");
    }
    private void btnCancelEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEmployerActionPerformed
        resetTextEmployer();
    }//GEN-LAST:event_btnCancelEmployerActionPerformed

    private void cboCardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCardItemStateChanged
        if (evt.getItem().toString() == cboCard.getItemAt(1).toString()) {
            resetTextStudent();
            this.pnlSubEmployer4NewCard.setVisible(true);
            this.pnlSubEmployer4NewCard.setEnabled(true);
            this.pnlSubStudent4NewCard.setVisible(false);
            this.pnlSubStudent4NewCard.setEnabled(false);
        } else {
            resetTextEmployer();
            this.pnlSubEmployer4NewCard.setVisible(false);
            this.pnlSubEmployer4NewCard.setEnabled(false);
            this.pnlSubStudent4NewCard.setVisible(true);
            this.pnlSubStudent4NewCard.setEnabled(true);
        }
    }//GEN-LAST:event_cboCardItemStateChanged

    private void lblAddAcountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddAcountMouseClicked
        this.tabbedPaneMain.setSelectedComponent(pnlAdmin);
        this.tabbedPaneSub.setSelectedComponent(pnlMakeCard);
        this.cboCard.setSelectedIndex(this.cboAccount.getSelectedIndex());
    }//GEN-LAST:event_lblAddAcountMouseClicked

    private void cboAccountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAccountItemStateChanged
        if (evt.getItem().toString() == cboAccount.getItemAt(1).toString()) {
            TableModel = new DefaultTableModel();
            String[] colsName = {"MÃ SỐ", "HỌ VÀ TÊN", "EMAIL", "BỘ MÔN/ TỔ", "KHOA/ PHÒNG"};
            TableModel.setColumnIdentifiers(colsName);
            TableModel.setNumRows(10);
            tblAccount.setModel(TableModel);
        } else {
            TableModel = new DefaultTableModel();
            String[] colsName = {"MÃ SỐ", "HỌ VÀ TÊN", "LỚP", "NGÀNH", "KHOA", "NIÊN KHÓA"};
            TableModel.setColumnIdentifiers(colsName);
            TableModel.setNumRows(10);
            tblAccount.setModel(TableModel);
        }
    }//GEN-LAST:event_cboAccountItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        new JOptionPane().showMessageDialog(null, "Bạn nên chọn đăng xuất!");
    }//GEN-LAST:event_formWindowClosing

    private void mnuCreateNewEventsFromExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreateNewEventsFromExcelActionPerformed
        this.dalAddEventsFromExcel.setVisible(true);
        this.dalAddEventsFromExcel.setEnabled(true);
        this.dalAddEventsFromExcel.setSize(this.dalAddEventsFromExcel.getPreferredSize());
        this.dalAddEventsFromExcel.setTitle("Thêm danh sách tham gia sự kiện từ file Excel");
        this.dalAddEventsFromExcel.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("checked.png")));
    }//GEN-LAST:event_mnuCreateNewEventsFromExcelActionPerformed

    private void btnOpenImportExcel4EventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenImportExcel4EventsActionPerformed
        this.setVisible(true);
        this.setEnabled(true);
        this.dalAddEventsFromExcel.setVisible(false);
        this.dalAddEventsFromExcel.setEnabled(false);
        this.fileChooser.showDialog(null, null);
    }//GEN-LAST:event_btnOpenImportExcel4EventsActionPerformed

    private void btnOpenImportExcel4AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenImportExcel4AccountActionPerformed
        this.setVisible(true);
        this.setEnabled(true);
        this.dalMakeNewCardFromExcel.setVisible(false);
        this.dalMakeNewCardFromExcel.setEnabled(false);
        this.fileChooser.showDialog(null, null);
    }//GEN-LAST:event_btnOpenImportExcel4AccountActionPerformed

    private void mnuMakeNewCardFromExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMakeNewCardFromExcelActionPerformed
        this.dalMakeNewCardFromExcel.setVisible(true);
        this.dalMakeNewCardFromExcel.setEnabled(true);
        this.dalMakeNewCardFromExcel.setSize(this.dalMakeNewCardFromExcel.getPreferredSize());
        this.dalMakeNewCardFromExcel.setTitle("Thêm danh sách đăng ký thẻ từ file Excel");
        this.dalMakeNewCardFromExcel.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("checked.png")));
    }//GEN-LAST:event_mnuMakeNewCardFromExcelActionPerformed

    private void dalAddEventsFromExcelWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalAddEventsFromExcelWindowActivated
        this.setEnabled(false);
    }//GEN-LAST:event_dalAddEventsFromExcelWindowActivated

    private void dalAddEventsFromExcelWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalAddEventsFromExcelWindowClosing
        this.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_dalAddEventsFromExcelWindowClosing

    private void dalMakeNewCardFromExcelWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalMakeNewCardFromExcelWindowActivated
        this.setEnabled(false);
    }//GEN-LAST:event_dalMakeNewCardFromExcelWindowActivated

    private void dalMakeNewCardFromExcelWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dalMakeNewCardFromExcelWindowClosing
        this.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_dalMakeNewCardFromExcelWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Web look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        WebLookAndFeel.install();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="value">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnAddNewEmployer;
    private javax.swing.JButton btnAddNewStudent1;
    private javax.swing.JButton btnCancelEmployer;
    private javax.swing.JButton btnCancelEvents4Admin;
    private javax.swing.JButton btnCancelStudent;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangePasswordAgree;
    private javax.swing.JButton btnChangePasswordCancel;
    private javax.swing.JButton btnExportList;
    private javax.swing.JButton btnExportMiss;
    private javax.swing.JButton btnLogout4Card;
    private javax.swing.JButton btnLogout4Events;
    private javax.swing.JButton btnLogout4Info;
    private javax.swing.JButton btnOpenImportExcel4Account;
    private javax.swing.JButton btnOpenImportExcel4Events;
    private javax.swing.JButton btnSaveEvents4Admin;
    private javax.swing.JComboBox<String> cboAccount;
    private javax.swing.JComboBox<String> cboAccountFromExcel;
    private javax.swing.JComboBox<String> cboCard;
    private javax.swing.JComboBox<String> cboEvents4Checkin;
    private javax.swing.JComboBox<String> cboEvents4ListChecked;
    private javax.swing.JComboBox<String> cboEventsFromExcel;
    private javax.swing.JComboBox<String> cboSchoolYear;
    private javax.swing.JCheckBox chbTimeIn;
    private javax.swing.JCheckBox chbTimeOut;
    private javax.swing.JDialog dalAddEventsFromExcel;
    private javax.swing.JDialog dalChangePassword;
    private javax.swing.JDialog dalMakeNewCardFromExcel;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel lblAddAcount;
    private javax.swing.JLabel lblAddEvents;
    private javax.swing.JLabel lblChangePasswordConfirm;
    private javax.swing.JLabel lblDeleteAcount;
    private javax.swing.JLabel lblDeleteEvents;
    private javax.swing.JLabel lblExit4Card;
    private javax.swing.JLabel lblExit4Events;
    private javax.swing.JLabel lblExit4Info;
    private javax.swing.JLabel lblFullNameAdmin;
    private javax.swing.JLabel lblIDAdmin;
    private javax.swing.JLabel lblImgAdmin4Card;
    private javax.swing.JLabel lblImgAdmin4Info;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNickAdmin;
    private javax.swing.JLabel lblNickAdmin4Card;
    private javax.swing.JLabel lblNickAdmin4Events;
    private javax.swing.JLabel lblNickAdmin4Info;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblSavedAcount;
    private javax.swing.JLabel lblSavedEvents;
    private javax.swing.JLabel lblcard4Employer0;
    private javax.swing.JLabel lblcard4Student0;
    private javax.swing.JLabel lblcard4Student1;
    private javax.swing.JLabel lblcard4Student2;
    private javax.swing.JLabel lblcard4Student3;
    private javax.swing.JLabel lblcard4Student4;
    private javax.swing.JLabel lblcard4Student5;
    private javax.swing.JLabel lblcard4Student6;
    private javax.swing.JLabel lblcard4employer1;
    private javax.swing.JLabel lblcard4employer2;
    private javax.swing.JLabel lblcard4employer3;
    private javax.swing.JLabel lblcard4employer4;
    private javax.swing.JLabel lblcard4employer5;
    private javax.swing.JLabel lblevents4Admin0;
    private javax.swing.JLabel lblevents4Admin1;
    private javax.swing.JLabel lblevents4Admin2;
    private javax.swing.JLabel lblevents4Admin3;
    private javax.swing.JLabel lblevents4Admin4;
    private javax.swing.JLabel lblimgAdmin4Events;
    private javax.swing.JLabel lbltextAccount0;
    private javax.swing.JLabel lbltextAccount1;
    private javax.swing.JLabel lbltextAccount2;
    private javax.swing.JLabel lbltextEvents0;
    private javax.swing.JLabel lbltextEvents1;
    private javax.swing.JLabel lbltextEvents2;
    private javax.swing.JMenu mnuCreateNewEvents;
    private javax.swing.JMenuItem mnuCreateNewEventsFromExcel;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileExit;
    private javax.swing.JMenuItem mnuFileLogout;
    private javax.swing.JMenu mnuMakeNewCard;
    private javax.swing.JMenuItem mnuMakeNewCardFromExcel;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlAccount;
    private javax.swing.JPanel pnlAccountFromExcel;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCheckin;
    private javax.swing.JPanel pnlCreateNewEvents4Admin;
    private javax.swing.JPanel pnlEvents;
    private javax.swing.JPanel pnlEventsFromExcel;
    private javax.swing.JPanel pnlInfo4Admin;
    private javax.swing.JPanel pnlInfoAdminLeft;
    private javax.swing.JPanel pnlInfoAdminRight;
    private javax.swing.JPanel pnlListChecked;
    private javax.swing.JPanel pnlMakeCard;
    private javax.swing.JPanel pnlSub4Card;
    private javax.swing.JPanel pnlSub4CreateNewEvents;
    private javax.swing.JPanel pnlSub4NewCard;
    private javax.swing.JPanel pnlSubEmployer4NewCard;
    private javax.swing.JPanel pnlSubStudent4NewCard;
    private javax.swing.JPanel pnlUpdate4Account;
    private javax.swing.JPanel pnlUpdate4Events;
    private javax.swing.JScrollPane scrollPane4Account;
    private javax.swing.JScrollPane scrollPane4Checkin;
    private javax.swing.JScrollPane scrollPane4Events;
    private javax.swing.JScrollPane scrollPane4ListChecked;
    private javax.swing.JTabbedPane tabbedPaneMain;
    private javax.swing.JTabbedPane tabbedPaneSub;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTable tblCheckin;
    private javax.swing.JTable tblEvents;
    private javax.swing.JTable tblListChecked;
    private javax.swing.JPasswordField txtChangePasswordRepeat;
    private javax.swing.JTextField txtEmployerCardCodeID;
    private javax.swing.JTextField txtEmployerCardDepartment;
    private javax.swing.JTextField txtEmployerCardEmail;
    private javax.swing.JTextField txtEmployerCardName;
    private javax.swing.JTextField txtEmployerCardRFID;
    private javax.swing.JTextField txtEmployerCardSet;
    private javax.swing.JTextField txtFindAccount;
    private javax.swing.JTextField txtFindEvents;
    private javax.swing.JTextField txtNewEventsDate;
    private javax.swing.JTextField txtNewEventsEnd;
    private javax.swing.JTextField txtNewEventsID;
    private javax.swing.JTextField txtNewEventsName;
    private javax.swing.JTextField txtNewEventsStart;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtRFID;
    private javax.swing.JTextField txtStudentCardClass;
    private javax.swing.JTextField txtStudentCardCodeID;
    private javax.swing.JTextField txtStudentCardCollege;
    private javax.swing.JTextField txtStudentCardMajors;
    private javax.swing.JTextField txtStudentCardName;
    private javax.swing.JTextField txtStudentCardRFID;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
