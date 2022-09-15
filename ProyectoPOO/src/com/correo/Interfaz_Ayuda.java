/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.correo;

import java.awt.Color;

/**
 *
 * @author piero
 */
public class Interfaz_Ayuda extends javax.swing.JFrame {
  int xMouse, yMouse;
  
  /**
   * Creates new form AYUDA
   */
  public Interfaz_Ayuda() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    BackgroundAyuda = new javax.swing.JPanel();
    HeaderAyuda = new javax.swing.JPanel();
    IconInterfaz = new javax.swing.JLabel();
    InfAyuda = new javax.swing.JLabel();
    BtnExitAyuda = new javax.swing.JPanel();
    txtExitAyuda = new javax.swing.JLabel();
    Ayuda = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel2 = new javax.swing.JLabel();
    BackgroundColorAyuda = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);

    BackgroundAyuda.setBackground(new java.awt.Color(255, 255, 255));
    BackgroundAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    HeaderAyuda.setBackground(new java.awt.Color(0, 0, 0));
    HeaderAyuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        HeaderAyudaMouseDragged(evt);
      }
    });
    HeaderAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        HeaderAyudaMousePressed(evt);
      }
    });

    IconInterfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/Logo (1).png"))); // NOI18N

    InfAyuda.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
    InfAyuda.setForeground(new java.awt.Color(204, 204, 204));
    InfAyuda.setText("Interfaz - Ayuda");

    BtnExitAyuda.setBackground(new java.awt.Color(0, 0, 0));
    BtnExitAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    BtnExitAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        BtnExitAyudaMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        BtnExitAyudaMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        BtnExitAyudaMouseExited(evt);
      }
    });

    txtExitAyuda.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
    txtExitAyuda.setForeground(new java.awt.Color(255, 255, 255));
    txtExitAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtExitAyuda.setText("X");

    javax.swing.GroupLayout BtnExitAyudaLayout = new javax.swing.GroupLayout(BtnExitAyuda);
    BtnExitAyuda.setLayout(BtnExitAyudaLayout);
    BtnExitAyudaLayout.setHorizontalGroup(
      BtnExitAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtExitAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
    );
    BtnExitAyudaLayout.setVerticalGroup(
      BtnExitAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtExitAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout HeaderAyudaLayout = new javax.swing.GroupLayout(HeaderAyuda);
    HeaderAyuda.setLayout(HeaderAyudaLayout);
    HeaderAyudaLayout.setHorizontalGroup(
      HeaderAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderAyudaLayout.createSequentialGroup()
        .addComponent(IconInterfaz)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(InfAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
        .addComponent(BtnExitAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    HeaderAyudaLayout.setVerticalGroup(
      HeaderAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(HeaderAyudaLayout.createSequentialGroup()
        .addGroup(HeaderAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(IconInterfaz)
          .addComponent(InfAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(BtnExitAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    BackgroundAyuda.add(HeaderAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

    Ayuda.setBackground(new java.awt.Color(255, 255, 255));
    Ayuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/Buscar.png"))); // NOI18N

    jTextField1.setBackground(new java.awt.Color(255, 255, 255));
    jTextField1.setText("Buscar...");
    jTextField1.setBorder(null);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
      .addComponent(jTextField1)
    );

    Ayuda.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));
    Ayuda.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 10));

    jLabel2.setForeground(new java.awt.Color(153, 153, 153));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("De momento no hay preguntas frecuentes.");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Ayuda.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 380));

    BackgroundAyuda.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 430));

    BackgroundColorAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    BackgroundColorAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/157 Sleepless Night.png"))); // NOI18N
    BackgroundAyuda.add(BackgroundColorAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 470));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void HeaderAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderAyudaMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
  }//GEN-LAST:event_HeaderAyudaMousePressed

  private void HeaderAyudaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderAyudaMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - xMouse,y - yMouse);
  }//GEN-LAST:event_HeaderAyudaMouseDragged

  private void BtnExitAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitAyudaMouseClicked
    LoginCorreo Login = new LoginCorreo();
    Login.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_BtnExitAyudaMouseClicked

  private void BtnExitAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitAyudaMouseEntered
    BtnExitAyuda.setBackground(Color.red);
  }//GEN-LAST:event_BtnExitAyudaMouseEntered

  private void BtnExitAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitAyudaMouseExited
    BtnExitAyuda.setBackground(Color.black);
  }//GEN-LAST:event_BtnExitAyudaMouseExited

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
      java.util.logging.Logger.getLogger(Interfaz_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Interfaz_Ayuda().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel Ayuda;
  private javax.swing.JPanel BackgroundAyuda;
  private javax.swing.JLabel BackgroundColorAyuda;
  private javax.swing.JPanel BtnExitAyuda;
  private javax.swing.JPanel HeaderAyuda;
  private javax.swing.JLabel IconInterfaz;
  private javax.swing.JLabel InfAyuda;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JLabel txtExitAyuda;
  // End of variables declaration//GEN-END:variables
}