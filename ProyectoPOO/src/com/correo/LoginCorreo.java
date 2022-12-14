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
public class LoginCorreo extends javax.swing.JFrame {
  int xMouse, yMouse;
  /**
   
   */
  public LoginCorreo() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Fondo = new javax.swing.JPanel();
    Login = new javax.swing.JPanel();
    InfoCorreo = new javax.swing.JLabel();
    txtCorreo = new javax.swing.JTextField();
    SeparadorCorreo = new javax.swing.JSeparator();
    InfoContra = new javax.swing.JLabel();
    txtContra = new javax.swing.JTextField();
    SeparadorContra = new javax.swing.JSeparator();
    InfoPanel = new javax.swing.JLabel();
    BtnAyuda = new javax.swing.JPanel();
    IconAyuda = new javax.swing.JLabel();
    BtnRegistrar = new javax.swing.JPanel();
    txtRegistrar = new javax.swing.JLabel();
    BtnEntrar = new javax.swing.JPanel();
    txtEntrar = new javax.swing.JLabel();
    BackgroundLogin = new javax.swing.JPanel();
    BackgroundColor = new javax.swing.JLabel();
    Header = new javax.swing.JPanel();
    ExitBtn = new javax.swing.JPanel();
    Exit = new javax.swing.JLabel();
    NameInterfaz = new javax.swing.JLabel();
    IconInterfaz = new javax.swing.JLabel();
    LogoEmpresa = new javax.swing.JLabel();
    FondoLogo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLocationByPlatform(true);
    setUndecorated(true);
    setResizable(false);

    Fondo.setBackground(new java.awt.Color(255, 255, 255));
    Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Login.setBackground(new java.awt.Color(255, 255, 255));
    Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    InfoCorreo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    InfoCorreo.setForeground(new java.awt.Color(227, 166, 114));
    InfoCorreo.setText("Correo");
    Login.add(InfoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 56, 100, 30));

    txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
    txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
    txtCorreo.setText("Ingrese su correo");
    txtCorreo.setBorder(null);
    Login.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 92, 254, 24));

    SeparadorCorreo.setBackground(new java.awt.Color(253, 182, 99));
    SeparadorCorreo.setForeground(new java.awt.Color(253, 182, 99));
    Login.add(SeparadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 254, 10));

    InfoContra.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    InfoContra.setForeground(new java.awt.Color(227, 166, 114));
    InfoContra.setText("Contrase??a");
    Login.add(InfoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 142, 100, 30));

    txtContra.setBackground(new java.awt.Color(255, 255, 255));
    txtContra.setForeground(new java.awt.Color(204, 204, 204));
    txtContra.setText("Ingrese su contrase??a");
    txtContra.setBorder(null);
    Login.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 178, 254, 24));

    SeparadorContra.setBackground(new java.awt.Color(253, 182, 99));
    SeparadorContra.setForeground(new java.awt.Color(253, 182, 99));
    Login.add(SeparadorContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 208, 254, 10));

    InfoPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    InfoPanel.setForeground(new java.awt.Color(102, 102, 102));
    InfoPanel.setText("Inicio de Sesi??n");
    Login.add(InfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, 156, 34));

    BtnAyuda.setBackground(new java.awt.Color(255, 255, 255));
    BtnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    BtnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        BtnAyudaMouseClicked(evt);
      }
    });

    IconAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/ayuda.png"))); // NOI18N

    javax.swing.GroupLayout BtnAyudaLayout = new javax.swing.GroupLayout(BtnAyuda);
    BtnAyuda.setLayout(BtnAyudaLayout);
    BtnAyudaLayout.setHorizontalGroup(
      BtnAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAyudaLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(IconAyuda)
        .addContainerGap())
    );
    BtnAyudaLayout.setVerticalGroup(
      BtnAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(BtnAyudaLayout.createSequentialGroup()
        .addComponent(IconAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    Login.add(BtnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

    BtnRegistrar.setBackground(new java.awt.Color(252, 165, 111));
    BtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        BtnRegistrarMouseClicked(evt);
      }
    });

    txtRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtRegistrar.setForeground(new java.awt.Color(51, 51, 51));
    txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtRegistrar.setText("Registrar");

    javax.swing.GroupLayout BtnRegistrarLayout = new javax.swing.GroupLayout(BtnRegistrar);
    BtnRegistrar.setLayout(BtnRegistrarLayout);
    BtnRegistrarLayout.setHorizontalGroup(
      BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRegistrarLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    BtnRegistrarLayout.setVerticalGroup(
      BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRegistrarLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtRegistrar)
        .addContainerGap())
    );

    Login.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));

    BtnEntrar.setBackground(new java.awt.Color(252, 165, 111));
    BtnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    BtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        BtnEntrarMouseClicked(evt);
      }
    });

    txtEntrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtEntrar.setForeground(new java.awt.Color(51, 51, 51));
    txtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtEntrar.setText("Entrar");

    javax.swing.GroupLayout BtnEntrarLayout = new javax.swing.GroupLayout(BtnEntrar);
    BtnEntrar.setLayout(BtnEntrarLayout);
    BtnEntrarLayout.setHorizontalGroup(
      BtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnEntrarLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    BtnEntrarLayout.setVerticalGroup(
      BtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnEntrarLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtEntrar)
        .addContainerGap())
    );

    Login.add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, 30));

    Fondo.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 320, 340));

    BackgroundLogin.setBackground(new java.awt.Color(255, 255, 255));
    BackgroundLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    BackgroundColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/BackgroundColor.png"))); // NOI18N
    BackgroundColor.setText("jLabel1");

    javax.swing.GroupLayout BackgroundLoginLayout = new javax.swing.GroupLayout(BackgroundLogin);
    BackgroundLogin.setLayout(BackgroundLoginLayout);
    BackgroundLoginLayout.setHorizontalGroup(
      BackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
    );
    BackgroundLoginLayout.setVerticalGroup(
      BackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );

    Fondo.add(BackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 480, 380));

    Header.setBackground(new java.awt.Color(0, 0, 0));
    Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        HeaderMouseDragged(evt);
      }
    });
    Header.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        HeaderMousePressed(evt);
      }
    });

    ExitBtn.setBackground(new java.awt.Color(0, 0, 0));
    ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    ExitBtn.setPreferredSize(new java.awt.Dimension(40, 40));
    ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ExitBtnMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        ExitBtnMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        ExitBtnMouseExited(evt);
      }
    });

    Exit.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
    Exit.setForeground(new java.awt.Color(255, 255, 255));
    Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Exit.setText("X");
    Exit.setPreferredSize(new java.awt.Dimension(40, 40));

    javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
    ExitBtn.setLayout(ExitBtnLayout);
    ExitBtnLayout.setHorizontalGroup(
      ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
    );
    ExitBtnLayout.setVerticalGroup(
      ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );

    NameInterfaz.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
    NameInterfaz.setForeground(new java.awt.Color(204, 204, 204));
    NameInterfaz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    NameInterfaz.setText("Interfaz - Log In");
    NameInterfaz.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

    IconInterfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/Logo (1).png"))); // NOI18N

    javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
    Header.setLayout(HeaderLayout);
    HeaderLayout.setHorizontalGroup(
      HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
        .addComponent(IconInterfaz)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(NameInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    HeaderLayout.setVerticalGroup(
      HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(NameInterfaz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(IconInterfaz, javax.swing.GroupLayout.Alignment.TRAILING)
      .addGroup(HeaderLayout.createSequentialGroup()
        .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        .addContainerGap())
    );

    Fondo.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

    LogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/LogoGato.png"))); // NOI18N
    Fondo.add(LogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 170));

    FondoLogo.setBackground(new java.awt.Color(255, 255, 255));
    FondoLogo.setForeground(new java.awt.Color(255, 255, 255));
    FondoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/banner.jpg"))); // NOI18N
    FondoLogo.setMaximumSize(new java.awt.Dimension(230, 420));
    FondoLogo.setMinimumSize(new java.awt.Dimension(230, 420));
    FondoLogo.setPreferredSize(new java.awt.Dimension(230, 420));
    Fondo.add(FondoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 240, 380));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
  }//GEN-LAST:event_HeaderMousePressed

  private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - xMouse, y - yMouse);
  }//GEN-LAST:event_HeaderMouseDragged

  private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
    System.exit(0);
  }//GEN-LAST:event_ExitBtnMouseClicked

  private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
    ExitBtn.setBackground(Color.red);
    Exit.setForeground(Color.white);
  }//GEN-LAST:event_ExitBtnMouseEntered

  private void ExitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseExited
    ExitBtn.setBackground(new Color(0,0,0));
    Exit.setForeground(new Color(255,255,255));
  }//GEN-LAST:event_ExitBtnMouseExited

  private void BtnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAyudaMouseClicked
    Interfaz_Ayuda Ayuda = new Interfaz_Ayuda();
    Ayuda.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_BtnAyudaMouseClicked

  private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntrarMouseClicked
    Interfaz_Correo Correo = new Interfaz_Correo();
    Correo.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_BtnEntrarMouseClicked

  private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
    Interfaz_Registrar Registrar = new Interfaz_Registrar();
    Registrar.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_BtnRegistrarMouseClicked

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
      java.util.logging.Logger.getLogger(LoginCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginCorreo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel BackgroundColor;
  private javax.swing.JPanel BackgroundLogin;
  private javax.swing.JPanel BtnAyuda;
  private javax.swing.JPanel BtnEntrar;
  private javax.swing.JPanel BtnRegistrar;
  private javax.swing.JLabel Exit;
  private javax.swing.JPanel ExitBtn;
  private javax.swing.JPanel Fondo;
  private javax.swing.JLabel FondoLogo;
  private javax.swing.JPanel Header;
  private javax.swing.JLabel IconAyuda;
  private javax.swing.JLabel IconInterfaz;
  private javax.swing.JLabel InfoContra;
  private javax.swing.JLabel InfoCorreo;
  private javax.swing.JLabel InfoPanel;
  private javax.swing.JPanel Login;
  private javax.swing.JLabel LogoEmpresa;
  private javax.swing.JLabel NameInterfaz;
  private javax.swing.JSeparator SeparadorContra;
  private javax.swing.JSeparator SeparadorCorreo;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField txtContra;
  private javax.swing.JTextField txtCorreo;
  private javax.swing.JLabel txtEntrar;
  private javax.swing.JLabel txtRegistrar;
  // End of variables declaration//GEN-END:variables
}
