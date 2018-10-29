
import javax.swing.JButton;



public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        
        initComponents();
    }
    
    public char operator[] = {'+', '-', '×', '÷', '%', '^'};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEqu = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnFac = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnX2 = new javax.swing.JButton();
        btnXn = new javax.swing.JButton();
        btnRoot = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btn10n = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        btnLn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("계산기");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtOutput.setLineWrap(true);
        txtOutput.setRows(5);
        txtOutput.setWrapStyleWord(true);
        txtOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtOutput);

        btn0.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnEqu.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnEqu.setText("=");
        btnEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquActionPerformed(evt);
            }
        });

        btnPM.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnPM.setText("±");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setToolTipText("");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnPi.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnPi.setText("π");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnFac.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnFac.setText("n!");
        btnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnMult.setText("×");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnX2.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnX2.setText("χ²");
        btnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX2ActionPerformed(evt);
            }
        });

        btnXn.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnXn.setText("χⁿ");
        btnXn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXnActionPerformed(evt);
            }
        });

        btnRoot.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnRoot.setText("√");
        btnRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRootActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCE.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("굴림", 1, 23)); // NOI18N
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("굴림", 1, 23)); // NOI18N
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnBack.setText("←");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("굴림", 1, 22)); // NOI18N
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        btnExp.setText("Exp");
        btnExp.setToolTipText("");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("굴림", 1, 17)); // NOI18N
        btnMod.setText("Mod");
        btnMod.setToolTipText("");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btn10n.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        btn10n.setText("10ⁿ");
        btn10n.setToolTipText("");
        btn10n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10nActionPerformed(evt);
            }
        });

        txtInput.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        txtInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInput.setText("0");

        btnLn.setFont(new java.awt.Font("굴림", 1, 22)); // NOI18N
        btnLn.setText("ln");
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtInput)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn10n, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFac, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnXn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn10n, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEqu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        Click("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Click("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Click("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Click("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Click("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Click("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Click("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Click("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Click("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Click("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        Click(".");
    }//GEN-LAST:event_btnPointActionPerformed

    private void Click(String btn) {
        String x = "";
        x = txtInput.getText();
        if (x.equals("0") && !btn.equals(".")) {
            txtInput.setText(btn);
        } else if (btn.equals(".")) {
            for(int i = 0; i < x.length(); i++) {
                if(x.charAt(i) == '.') {
                    return;
                }
            }
            if (x.equals("")) {
                txtInput.setText("0.");
            } else {
                txtInput.setText(x + ".");
            }
        } else {
            txtInput.setText(x + btn);
        } 
    }
    
    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtInput.setText("0");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtInput.setText("0");
        txtOutput.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String x = "";
        x = txtInput.getText();
        if(x.length() < 1)
            return;
        x = x.substring(0, x.length() - 1);
        txtInput.setText(x);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
        String pm[] = txtInput.getText().split(" ");
        Double result = Double.parseDouble(pm[0]);
        result *= -1;
        txtInput.setText(result.toString());
    }//GEN-LAST:event_btnPMActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        Oper("+");
    }//GEN-LAST:event_btnPlusActionPerformed
  
    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        Oper("-");
    }//GEN-LAST:event_btnMinusActionPerformed
  
    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        Oper("×");
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        Oper("÷");
    }//GEN-LAST:event_btnDivActionPerformed
   
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        Oper("%");
        //txtInput.setText(button[5].getText());
    }//GEN-LAST:event_btnModActionPerformed
  
    private void btnEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquActionPerformed
       Oper("=");
    }//GEN-LAST:event_btnEquActionPerformed

    private void Oper(String ope) {
        String x = txtOutput.getText();
        String y = txtInput.getText();
        String z = " " + ope + " ";
        
        if (x.equals("") && y.equals("")) {     // 입력 결과 모두 공백
            return;
        } else if (x.equals("") && !y.equals("")) {     //결과 공백 입력 공백아님
            if(ope.equals("="))
                txtOutput.setText(y);
            else
                txtOutput.setText(y + z);
            txtInput.setText("");
            return;
        } else {                // 결과 공백 아님
            for(int i = 0; i < operator.length; i++)
            {
                if (x.charAt(x.length()-2) == operator[i]) {    // 결과창의 끝이 연산자라면
                    if (y.equals("")) {         // 연산자 바꾸기
                        if (!ope.equals("="))
                            txtOutput.setText(x.substring(0, x.length()-3) + z);
                        return;
                    } else {                    // 입력 + 연산자 추가
                        txtOutput.append(y);
                        txtOutput.setText(result().toString());
                        txtInput.setText("");
                        if (!ope.equals("="))
                            txtOutput.append(z);
                        return;
                    }
                }
            }   
            // 결과창의 끝이 피연산자라면
            if (!ope.equals("="))
                txtOutput.append(z);
            return;         
        }
    }
    
    private void btnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        int result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Integer.parseInt(y);
            for (int i = result-1; i > 0; i--)
            {
                result *= i;
            }
            txtInput.setText(Integer.toString(result));
        } else {
            result = (int)Double.parseDouble(x);
            for (int i = result-1; i > 0; i--)
            {
                result *= i;
            }
            txtOutput.setText(Integer.toString(result));
        }
    }//GEN-LAST:event_btnFacActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result *= Math.PI;
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result *= Math.PI;
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnPiActionPerformed

    private void btnRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRootActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.sqrt(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.sqrt(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnRootActionPerformed

    private void btn10nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10nActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.pow(10, result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.pow(10, result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btn10nActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.log10(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.log10(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.exp(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.exp(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX2ActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.pow(result, 2);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.pow(result, 2);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnX2ActionPerformed

    private void btnXnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXnActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        
        if (x.equals("") && y.equals("")) {     // 입력 결과 모두 공백
            return;
        } else if (x.equals("") && !y.equals("")) {     //결과 공백 입력 공백아님
            txtOutput.setText(y + " ^ ");
            txtInput.setText("");
            return;
        } else {                // 결과 공백 아님
            for(int i = 0; i < operator.length; i++)
            {
                if (x.charAt(x.length()-2) == operator[i]) {    // 결과창의 끝이 연산자라면
                    if (y.equals("")) {         // 연산자 바꾸기
                        txtOutput.setText(x.substring(0, x.length()-3) + " ^ ");
                        return;
                    } else {                    // 입력 + 연산자 추가
                        txtOutput.append(y);
                        txtOutput.setText(result().toString());
                        txtOutput.append(" ^ ");
                        txtInput.setText("");
                        return;
                    }
                }
            }
            // 결과창의 끝이 피연산자라면
            txtOutput.append(" ^ ");
            return;         
        }
    }//GEN-LAST:event_btnXnActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.sin(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.sin(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.cos(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.cos(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.tan(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.tan(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLnActionPerformed
        String x = txtOutput.getText();
        String y = txtInput.getText();
        double result = 0;
        
        if (y.equals("") && x.equals("")) {     // 모두 공백
            return;
        } else if (!y.equals("")) {
            result = Double.parseDouble(y);
            result = Math.log(result);
            txtInput.setText(Double.toString(result));
        } else {
            result = Double.parseDouble(x);
            result = Math.log(result);
            txtOutput.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnLnActionPerformed
    
    private Double result() {
        String calc[] = txtOutput.getText().split(" ");
        Double result = 0.0;
        switch(calc[1])
        {
            case "+":
                result = Double.parseDouble(calc[0]) + Double.parseDouble(calc[2]);
                break;
            case "-":
                result = Double.parseDouble(calc[0]) - Double.parseDouble(calc[2]);
                break;
            case "×":
                result = Double.parseDouble(calc[0]) * Double.parseDouble(calc[2]);
                break;
            case "÷":
                result = Double.parseDouble(calc[0]) / Double.parseDouble(calc[2]);
                break;
            case "%":
                result = Double.parseDouble(calc[0]) % Double.parseDouble(calc[2]);
                break;      
            case "^":
                result = Math.pow(Double.parseDouble(calc[0]), Double.parseDouble(calc[2]));
                break;     
        }
        return result;
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10n;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqu;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFac;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPM;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnRoot;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnX2;
    private javax.swing.JButton btnXn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
