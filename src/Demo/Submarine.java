/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Demo;

import java.awt.Color;

public class Submarine extends javax.swing.JFrame implements Observer{
  
    public Submarine() {
        
        initComponents();
        setTitle("Submarine");
        btnShoot.setEnabled(false);
        btnSonar.setEnabled(false);
        btnTamhawk.setEnabled(false);
        btnTrindent.setEnabled(false);
        setLocation(770, 440);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelArea = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTamhawk = new javax.swing.JButton();
        btnTrindent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(770, 440, 647, 364));
        setMaximizedBounds(new java.awt.Rectangle(770, 440, 647, 375));
        setMaximumSize(new java.awt.Dimension(647, 375));
        setMinimumSize(new java.awt.Dimension(647, 375));
        setPreferredSize(new java.awt.Dimension(647, 375));
        setSize(new java.awt.Dimension(647, 375));
        getContentPane().setLayout(null);

        jLabelArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelArea.setForeground(new java.awt.Color(255, 0, 0));
        jLabelArea.setText("Area Not Cleared");
        getContentPane().add(jLabelArea);
        jLabelArea.setBounds(15, 10, 120, 20);

        btnShoot.setBackground(new java.awt.Color(255, 51, 51));
        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        getContentPane().add(btnShoot);
        btnShoot.setBounds(15, 43, 129, 35);

        btnSonar.setBackground(new java.awt.Color(255, 51, 51));
        btnSonar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSonar.setText("Sonar Operation");
        getContentPane().add(btnSonar);
        btnSonar.setBounds(150, 43, 129, 35);

        btnTamhawk.setBackground(new java.awt.Color(255, 51, 51));
        btnTamhawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTamhawk.setText("Tamhawk Missile");
        btnTamhawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamhawkActionPerformed(evt);
            }
        });
        getContentPane().add(btnTamhawk);
        btnTamhawk.setBounds(15, 84, 129, 34);

        btnTrindent.setBackground(new java.awt.Color(255, 51, 51));
        btnTrindent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrindent.setText("Trindent-2 Missile");
        getContentPane().add(btnTrindent);
        btnTrindent.setBounds(150, 84, 129, 34);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ammo Count");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(311, 52, 70, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Soldier Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(309, 12, 72, 16);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(387, 9, 52, 22);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(387, 49, 52, 22);

        jSlider1.setBackground(new java.awt.Color(102, 255, 255));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(153, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(534, 43, 59, 272);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(15, 130, 260, 151);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend);
        btnSend.setBounds(381, 293, 62, 31);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(15, 293, 354, 31);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(311, 84, 99, 34);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Energy");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(469, 12, 40, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Oxygen");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(534, 12, 50, 16);

        jSlider3.setBackground(new java.awt.Color(102, 255, 255));
        jSlider3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSlider3.setForeground(new java.awt.Color(153, 255, 255));
        jSlider3.setMajorTickSpacing(20);
        jSlider3.setMinorTickSpacing(5);
        jSlider3.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setValue(100);
        getContentPane().add(jSlider3);
        jSlider3.setBounds(455, 43, 59, 272);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Demo/Submarine-ezgif.com-webp-to-gif-converter.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 647, 375);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        Observerble.getReference().getMessage("Submarine:"+jTextField1.getText()+"\n");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnTamhawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamhawkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTamhawkActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTamhawk;
    private javax.swing.JButton btnTrindent;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPosition(int value) {
        if(jCheckBox1.isSelected()){
            if(value >= 20){
                btnShoot.setEnabled(true);
            }
            if(value >= 40){
                btnSonar.setEnabled(true);
            }
            if(value >= 60){
                btnTamhawk.setEnabled(true);
            }
            if(value >= 80){
                btnTrindent.setEnabled(true);
            }
            if(value <= 20){
                btnShoot.setEnabled(false);
            }
            if(value <= 40){
                btnSonar.setEnabled(false);
            }
            if(value <= 60){
                btnTamhawk.setEnabled(false);
            }
            if(value <= 80){
                btnTrindent.setEnabled(false);
            }
        }
    }

    @Override
    public void setArea(boolean b) {
        if(b){
            jLabelArea.setText("Area Cleared");
        }else{
            jLabelArea.setText("Area Not Cleared");
        }
    }

    @Override
    public void setMessage(String msg) {
        jTextArea1.append(msg);
    }
}
