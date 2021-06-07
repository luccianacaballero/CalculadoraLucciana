/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorlu;

import java.awt.Color;
import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CalculatorLu extends javax.swing.JFrame {
    //PRIMERA PARTE CLASE SCRIPTENGINEMANAGER
    ScriptEngineManager sem= new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    
    

    public CalculatorLu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        byn_multi = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();

        jButton18.setBackground(new java.awt.Color(232, 48, 206));
        jButton18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 51, 51));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton18.setText("C");
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N

        jButton19.setBackground(new java.awt.Color(232, 48, 206));
        jButton19.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 51, 51));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton19.setText("C");
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N

        jButton20.setBackground(new java.awt.Color(232, 48, 206));
        jButton20.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 51, 51));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton20.setText("C");
        jButton20.setFocusPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("•");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 248, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 51, 51));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, 350, 50));

        txtOperacion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(0, 102, 102));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 346, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("•");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("•");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("•");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 140));

        jPanel2.setBackground(new java.awt.Color(232, 48, 206));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setBackground(new java.awt.Color(232, 48, 206));
        btn_igual.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(0, 51, 51));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton33.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton33.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton33_pre.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 55, 55));

        btn_9.setBackground(new java.awt.Color(232, 48, 206));
        btn_9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(0, 51, 51));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 55, 55));

        btn_exp.setBackground(new java.awt.Color(232, 48, 206));
        btn_exp.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(0, 51, 51));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_exp.setText("CE");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 55, 55));

        btn_porcentaje.setBackground(new java.awt.Color(232, 48, 206));
        btn_porcentaje.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(0, 51, 51));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 55, 55));

        btn_division.setBackground(new java.awt.Color(232, 48, 206));
        btn_division.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        btn_division.setForeground(new java.awt.Color(0, 51, 51));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_division.setText("÷");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 55, 55));

        byn_multi.setBackground(new java.awt.Color(232, 48, 206));
        byn_multi.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        byn_multi.setForeground(new java.awt.Color(0, 51, 51));
        byn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        byn_multi.setText("x");
        byn_multi.setFocusPainted(false);
        byn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        byn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        byn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        byn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byn_multiActionPerformed(evt);
            }
        });
        jPanel2.add(byn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 55, 55));

        btn_suma.setBackground(new java.awt.Color(232, 48, 206));
        btn_suma.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(0, 51, 51));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 55, 55));

        btn_resta.setBackground(new java.awt.Color(232, 48, 206));
        btn_resta.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(0, 51, 51));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 55, 55));

        btn_c.setBackground(new java.awt.Color(232, 48, 206));
        btn_c.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(0, 51, 51));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton12.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presiona.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 55, 55));

        btn_7.setBackground(new java.awt.Color(232, 48, 206));
        btn_7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(0, 51, 51));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 55, 55));

        btn_8.setBackground(new java.awt.Color(232, 48, 206));
        btn_8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(0, 51, 51));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 55, 55));

        btn_6.setBackground(new java.awt.Color(232, 48, 206));
        btn_6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(0, 51, 51));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 55, 55));

        btn_5.setBackground(new java.awt.Color(232, 48, 206));
        btn_5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(0, 51, 51));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 55, 55));

        btn_4.setBackground(new java.awt.Color(232, 48, 206));
        btn_4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(0, 51, 51));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 55, 55));

        btn_3.setBackground(new java.awt.Color(232, 48, 206));
        btn_3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(0, 51, 51));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 55, 55));

        btn_2.setBackground(new java.awt.Color(232, 48, 206));
        btn_2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(0, 51, 51));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 55, 55));

        btn_1.setBackground(new java.awt.Color(232, 48, 206));
        btn_1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(0, 51, 51));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 55, 55));

        btn_punto.setBackground(new java.awt.Color(232, 48, 206));
        btn_punto.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(0, 51, 51));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 55, 55));

        btn_0.setBackground(new java.awt.Color(232, 48, 206));
        btn_0.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(0, 51, 51));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2presiona.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 55, 55));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 370, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//BOTONES - ACCIONES
    private void byn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byn_multiActionPerformed
        addNumber("*");
    }//GEN-LAST:event_byn_multiActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
       String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
       btn_igual.doClick();
       
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        addNumber("/");
       
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
        
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
       addNumber("+");
      
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
       addNumber("-");
       
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try{
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
            
        }catch (Exception e){
            //btn_c.doClick();
        }
        
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
       addNumber("4");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       addNumber("1");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
       addNumber("2");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
       addNumber(".");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_puntoActionPerformed
    //SEGUNDA PARTE
    boolean modoVintage=false;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!modoVintage){ //MODO VINTAGE = VERDADERO 
            jPanel1.setBackground(Color.decode("#cb7749"));
            jPanel2.setBackground(Color.decode("#446e67"));
            txtOperacion.setForeground(Color.decode("#ffffff"));
            txtResultado.setForeground(Color.decode("#ffffff"));

            btn_1.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_2.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_3.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_4.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_5.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_6.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_7.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_8.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_9.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_0.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_punto.setIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));

            btn_1.setForeground(Color.decode("#ffffff"));
            btn_2.setForeground(Color.decode("#ffffff"));
            btn_3.setForeground(Color.decode("#ffffff"));
            btn_4.setForeground(Color.decode("#ffffff"));
            btn_5.setForeground(Color.decode("#ffffff"));
            btn_6.setForeground(Color.decode("#ffffff"));
            btn_7.setForeground(Color.decode("#ffffff"));
            btn_8.setForeground(Color.decode("#ffffff"));
            btn_9.setForeground(Color.decode("#ffffff"));
            btn_0.setForeground(Color.decode("#ffffff"));
            btn_punto.setForeground(Color.decode("#ffffff"));

            btn_1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
            btn_1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton_numeropre.png")));

            cambiarColorBtn2(btn_1);
            cambiarColorBtn2(btn_2);
            cambiarColorBtn2(btn_3);
            cambiarColorBtn2(btn_4);
            cambiarColorBtn2(btn_5);
            cambiarColorBtn2(btn_6);
            cambiarColorBtn2(btn_7);cambiarColorBtn2(btn_8);cambiarColorBtn2(btn_9);
            cambiarColorBtn2(btn_0);
            cambiarColorBtn2(btn_punto);
            cambiarColorBtn1(byn_multi);
            cambiarColorBtn1(btn_division);
            cambiarColorBtn1(btn_exp);
            cambiarColorBtn1(btn_suma);cambiarColorBtn1(btn_resta);
            cambiarColorBtn1(btn_igual);
            cambiarColorBtn1(btn_c);
            cambiarColorBtn1(btn_porcentaje);
            modoVintage=true;
            
        }
        else{
            CalculatorLu frame= new CalculatorLu();
            this.dispose();
            frame.setVisible(true);
        }
        
        
       
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       this.dispose(); //cierra ventana
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);//MINIMIZA
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

   
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
            java.util.logging.Logger.getLogger(CalculatorLu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorLu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorLu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorLu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorLu().setVisible(true);
            }
        });
    }
    public void cambiarColorBtn2(JButton btn){
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/numero.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton_numeropre.png")));
        
    }
    public void cambiarColorBtn1(JButton btn){
         btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/botonsimb.png")));
         btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/botonsimb.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/botonsimb_pre.png")));
        
    }
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton byn_multi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
