
package javaapplication1;

import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.JTextField;

public class Calculator extends javax.swing.JFrame {
 
    public Calculator() {
        initComponents();
    }
    private String number = "";
    private String state = "operand1";
    private String op;
    private double operand1 = 0;
    private double operand2 = 0;
    private double result = 0;
    public Calculator(JButton jButton0, JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7, JButton jButton8, JButton jButton9, JButton jButtonClear, JButton jButtonDivide, JButton jButtonMinus, JButton jButtonMulty, JButton jButtonPlus, JButton jButtonPoint, JButton jButtonResult, JTextField jTextField1) throws HeadlessException {
        this.jButton0 = jButton0;
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jButton6 = jButton6;
        this.jButton7 = jButton7;
        this.jButton8 = jButton8;
        this.jButton9 = jButton9;
        this.jButtonClear = jButtonClear;
        this.jButtonDivide = jButtonDivide;
        this.jButtonMinus = jButtonMinus;
        this.jButtonMulty = jButtonMulty;
        this.jButtonPlus = jButtonPlus;
        this.jButtonPoint = jButtonPoint;
        this.jButtonResult = jButtonResult;
        this.jTextField1 = jTextField1;
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonDivide = new javax.swing.JButton();
        jButtonMulty = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonResult = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButtonPower = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        displayOperation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Calculator");
        setBackground(new java.awt.Color(102, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        setForeground(new java.awt.Color(255, 153, 0));
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("My Calculator"); // NOI18N
        setSize(new java.awt.Dimension(500, 300));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setToolTipText("");
        jTextField1.setMaximumSize(new java.awt.Dimension(10, 5));

        jButtonDivide.setBackground(new java.awt.Color(255, 51, 204));
        jButtonDivide.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonDivide.setForeground(new java.awt.Color(102, 255, 204));
        jButtonDivide.setText("÷");
        jButtonDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonAction(evt);
            }
        });

        jButtonMulty.setBackground(new java.awt.Color(255, 51, 204));
        jButtonMulty.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonMulty.setForeground(new java.awt.Color(102, 255, 204));
        jButtonMulty.setText("x");
        jButtonMulty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonAction(evt);
            }
        });

        jButtonMinus.setBackground(new java.awt.Color(255, 51, 204));
        jButtonMinus.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButtonMinus.setForeground(new java.awt.Color(102, 255, 204));
        jButtonMinus.setText("__");
        jButtonMinus.setActionCommand("-");
        jButtonMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonAction(evt);
            }
        });

        jButtonPlus.setBackground(new java.awt.Color(255, 51, 204));
        jButtonPlus.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonPlus.setForeground(new java.awt.Color(102, 255, 204));
        jButtonPlus.setText("+");
        jButtonPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonAction(evt);
            }
        });

        jButtonResult.setBackground(new java.awt.Color(204, 204, 0));
        jButtonResult.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonResult.setForeground(new java.awt.Color(255, 51, 102));
        jButtonResult.setText("=");
        jButtonResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonAction(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 102, 102));
        jButton9.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 102, 102));
        jButton8.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButtonPoint.setBackground(new java.awt.Color(255, 102, 102));
        jButtonPoint.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonPoint.setText(".");
        jButtonPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(255, 102, 102));
        jButton0.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton0.setText("0");
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 255, 0));
        jButtonClear.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 51, 102));
        jButtonClear.setText("Clear all");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 204));
        jButton10.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 255, 204));
        jButton10.setText("!");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setName("!"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorial(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 204));
        jButton11.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 255, 204));
        jButton11.setText("√");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squreRoot(evt);
            }
        });

        jButtonPower.setBackground(new java.awt.Color(255, 51, 204));
        jButtonPower.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButtonPower.setForeground(new java.awt.Color(102, 255, 204));
        jButtonPower.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Desktop\\xy.png")); // NOI18N
        jButtonPower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPower.setName("^"); // NOI18N
        jButtonPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonAction(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 51, 204));
        jButton12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 255, 204));
        jButton12.setText("is plindrome");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setName("!"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPlindromeActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 51, 204));
        jButton13.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 255, 204));
        jButton13.setText("C");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setName("!"); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonDeleteOneDigitActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 51, 204));
        jButton14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 255, 204));
        jButton14.setText("Even/odd");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setName("!"); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isEvenOrOddActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 51, 204));
        jButton15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 255, 204));
        jButton15.setText("is plindrome");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setName("!"); // NOI18N

        jButton16.setBackground(new java.awt.Color(255, 51, 204));
        jButton16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(102, 255, 204));
        jButton16.setText("is plindrome");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setName("!"); // NOI18N

        displayOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayOperation.setText("0");
        displayOperation.setToolTipText("");
        displayOperation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonPlus)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonMulty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonMinus))))
                                    .addComponent(jButtonResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPower))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPower, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMulty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.getAccessibleContext().setAccessibleName("factorial");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        number = "";
        jTextField1.setText("0");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void digitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitActionPerformed
        JButton btn = (JButton) evt.getSource();
        if(state.equals("op")){
            number = "";
            state = "operand2";
        }
        
        if(btn == jButtonPoint){
            if(!number.contains(".")){
                if(number.equals(""))
                    number += "0" + btn.getText();
                else
                    number += btn.getText();
            }
        }else{
             number += btn.getText();
            try{
                // if the first character of string is zero
                if( number.charAt(0) == '0' && number.charAt(1) != '.' )
                number = number.substring(1);
            }catch(IndexOutOfBoundsException e){ 
            }
            
        }
        
        jTextField1.setText(number);
        displayOperation.setText(number);
        if(operand1 != 0){
            displayOperation.setText(operand1+"  "+op+"  "+ number);
        }
    }//GEN-LAST:event_digitActionPerformed
    
    // when press the equal(=) button this methode will called
    private void operatorButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorButtonAction
        JButton btn = (JButton) evt.getSource();
        if(state.equals("operand1")){
            operand1 = Double.parseDouble(jTextField1.getText());
        }
        state = "op";
        if(btn == jButtonDivide) op = "÷";
        if(btn == jButtonMulty) op = "x";
        if(btn == jButtonMinus) op = "-";
        if(btn == jButtonPlus) op = "+";
        if(btn == jButtonPower) op ="power";
        
        displayOperation.setText(operand1+" "+op+"");
    }//GEN-LAST:event_operatorButtonAction

    private void resultButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonAction
        if(state.equals("operand2")){
            operand2 = Double.parseDouble(jTextField1.getText());
           
        
        result =0;
        switch(op){
            case "+": result = (operand1 + operand2);
                break;
            case "-": result = (operand1 - operand2);
                break;
            case "x": result = (operand1 * operand2);
                break;
            case "÷": result = (operand1 / operand2);
                break;
            case "power": result = Math.pow(operand1, operand2);
         
        }
        jTextField1.setText(result+"");
        displayOperation.setText(operand1+" "+op+" "+operand2+"");
        
        operand1 = 0;
        operand2 = 0;
        number = "";
        state = "operand1";
        
        }    
          
        
    }//GEN-LAST:event_resultButtonAction

    private void factorial(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorial
        double result =1;
        operand1 = Double.parseDouble(jTextField1.getText());
        if(operand1 <= 170){
            for(int i = 1; i<= operand1; i++)
            result *= i;
            jTextField1.setText(result+"");
            displayOperation.setText(operand1+"! = "+result);
        }else{
            jTextField1.setText("Infinity");
            displayOperation.setText(operand1+"! = Infinity");
        } 
            
        
        
        operand1 = 0;
        number = "";
         
    }//GEN-LAST:event_factorial

    private void squreRoot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squreRoot
        operand1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText(Math.sqrt(operand1)+"");
        displayOperation.setText(operand1+" squre root = "+ Math.sqrt(operand1));
        operand1 = 0;
        number = "";
    }//GEN-LAST:event_squreRoot

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jbuttonDeleteOneDigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonDeleteOneDigitActionPerformed
        
        if(jTextField1.getText().length()>0){
           if(!jTextField1.getText().equals("0")){
               String str = jTextField1.getText();
               str = str.substring(0, str.length()-1);
               number = str;
               jTextField1.setText(str);
               displayOperation.setText(str);
           }
            
        }
            
        
           
    }//GEN-LAST:event_jbuttonDeleteOneDigitActionPerformed

    private void isPlindromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPlindromeActionPerformed
        
        if(number.length() >0){
            int high = number.length()-1;
            boolean isPlindrome = true;
            for(int i =0; i < number.length(); i++){
            if(number.charAt(i) != number.charAt(high))
                isPlindrome = false;
            high--;
        }
            if(isPlindrome){
            jTextField1.setText("true");
            displayOperation.setText(number+" is plindrome");
            }else{
            jTextField1.setText("false");
            displayOperation.setText(number+" is not plindrome");
            }
        }
        
            
    }//GEN-LAST:event_isPlindromeActionPerformed

    private void isEvenOrOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isEvenOrOddActionPerformed
        if(Double.parseDouble(number)%2 == 0){
           jTextField1.setText("Even");
           displayOperation.setText(number+" is Even");
        }else{
           jTextField1.setText("Odd");
           displayOperation.setText(number+" is Odd");
        }     
        
            
    }//GEN-LAST:event_isEvenOrOddActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayOperation;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMulty;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JButton jButtonPower;
    private javax.swing.JButton jButtonResult;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
