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
public class Interfaz_Correo extends javax.swing.JFrame {
  int xMouse, yMouse;
  
  /**
   * Creates new form Interfaz_Gmail
   */
  public Interfaz_Correo() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    BackgroundGmail = new javax.swing.JPanel();
    HeaderCorreo = new javax.swing.JPanel();
    IconEfelante = new javax.swing.JLabel();
    InfoInterfaz = new javax.swing.JLabel();
    BtnExitCorreo = new javax.swing.JPanel();
    txtExitCorreo = new javax.swing.JLabel();
    HeaderPanel = new javax.swing.JPanel();
    BackgroundHeaderPanel = new javax.swing.JLabel();
    Paneles = new javax.swing.JTabbedPane();
    Panel1 = new javax.swing.JPanel();
    InfoPanel1 = new javax.swing.JPanel();
    txtInfoPanel = new javax.swing.JLabel();
    Para = new javax.swing.JLabel();
    txtCorreoEnvio = new javax.swing.JTextField();
    SeparadorCorreo = new javax.swing.JSeparator();
    Asunto = new javax.swing.JLabel();
    txtAsunto = new javax.swing.JTextField();
    SeparadorAsunto = new javax.swing.JSeparator();
    AreaTexto = new javax.swing.JScrollPane();
    txtMensaje = new javax.swing.JTextArea();
    BtnEnvio = new javax.swing.JPanel();
    txtEnvio = new javax.swing.JLabel();
    Panel2 = new javax.swing.JPanel();
    InfoPanel2 = new javax.swing.JPanel();
    txtInfoPanel2 = new javax.swing.JLabel();
    txtNoMessage = new javax.swing.JLabel();
    Panel3 = new javax.swing.JPanel();
    InfoPanel3 = new javax.swing.JPanel();
    txtInfoPanel3 = new javax.swing.JLabel();
    txtNoDeleted = new javax.swing.JLabel();
    Panel4 = new javax.swing.JPanel();
    InfoPanel4 = new javax.swing.JPanel();
    txtInfoPanel4 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    FondoUser = new javax.swing.JPanel();
    OptRedactar = new javax.swing.JPanel();
    InfoText1 = new javax.swing.JLabel();
    IconRedac = new javax.swing.JLabel();
    OptRecibidos = new javax.swing.JPanel();
    InfoText2 = new javax.swing.JLabel();
    IconReci = new javax.swing.JLabel();
    OptPapelera = new javax.swing.JPanel();
    InfoText3 = new javax.swing.JLabel();
    IconPape = new javax.swing.JLabel();
    OptOpciones = new javax.swing.JPanel();
    InfoText4 = new javax.swing.JLabel();
    IconOpc = new javax.swing.JLabel();
    OptSalir = new javax.swing.JPanel();
    InfoText5 = new javax.swing.JLabel();
    IconSalir = new javax.swing.JLabel();
    User = new javax.swing.JLabel();
    BackgroundColorCorreo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLocationByPlatform(true);
    setUndecorated(true);
    setResizable(false);

    BackgroundGmail.setBackground(new java.awt.Color(255, 255, 255));
    BackgroundGmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    HeaderCorreo.setBackground(new java.awt.Color(0, 0, 0));
    HeaderCorreo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        HeaderCorreoMouseDragged(evt);
      }
    });
    HeaderCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        HeaderCorreoMousePressed(evt);
      }
    });

    IconEfelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/Logo (1).png"))); // NOI18N

    InfoInterfaz.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
    InfoInterfaz.setForeground(new java.awt.Color(204, 204, 204));
    InfoInterfaz.setText("Interfaz - Correo");

    BtnExitCorreo.setBackground(new java.awt.Color(0, 0, 0));
    BtnExitCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        BtnExitCorreoMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        BtnExitCorreoMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        BtnExitCorreoMouseExited(evt);
      }
    });

    txtExitCorreo.setBackground(new java.awt.Color(0, 0, 0));
    txtExitCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
    txtExitCorreo.setForeground(new java.awt.Color(255, 255, 255));
    txtExitCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtExitCorreo.setText("X");

    javax.swing.GroupLayout BtnExitCorreoLayout = new javax.swing.GroupLayout(BtnExitCorreo);
    BtnExitCorreo.setLayout(BtnExitCorreoLayout);
    BtnExitCorreoLayout.setHorizontalGroup(
      BtnExitCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtExitCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
    );
    BtnExitCorreoLayout.setVerticalGroup(
      BtnExitCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtExitCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout HeaderCorreoLayout = new javax.swing.GroupLayout(HeaderCorreo);
    HeaderCorreo.setLayout(HeaderCorreoLayout);
    HeaderCorreoLayout.setHorizontalGroup(
      HeaderCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderCorreoLayout.createSequentialGroup()
        .addComponent(IconEfelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(InfoInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 560, Short.MAX_VALUE)
        .addComponent(BtnExitCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    HeaderCorreoLayout.setVerticalGroup(
      HeaderCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(IconEfelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(InfoInterfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(HeaderCorreoLayout.createSequentialGroup()
        .addComponent(BtnExitCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    BackgroundGmail.add(HeaderCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

    HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));

    BackgroundHeaderPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/139 High Flight.png"))); // NOI18N

    javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
    HeaderPanel.setLayout(HeaderPanelLayout);
    HeaderPanelLayout.setHorizontalGroup(
      HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundHeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, Short.MAX_VALUE)
    );
    HeaderPanelLayout.setVerticalGroup(
      HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
        .addComponent(BackgroundHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
        .addContainerGap())
    );

    BackgroundGmail.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 650, 30));

    Panel1.setBackground(new java.awt.Color(255, 255, 255));
    Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    InfoPanel1.setBackground(new java.awt.Color(102, 102, 102));

    txtInfoPanel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtInfoPanel.setForeground(new java.awt.Color(204, 204, 204));
    txtInfoPanel.setText("Mensaje Nuevo");

    javax.swing.GroupLayout InfoPanel1Layout = new javax.swing.GroupLayout(InfoPanel1);
    InfoPanel1.setLayout(InfoPanel1Layout);
    InfoPanel1Layout.setHorizontalGroup(
      InfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InfoPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        .addContainerGap())
    );
    InfoPanel1Layout.setVerticalGroup(
      InfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
    );

    Panel1.add(InfoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

    Para.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Para.setForeground(new java.awt.Color(204, 204, 204));
    Para.setText("Para");
    Panel1.add(Para, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 30));

    txtCorreoEnvio.setBackground(new java.awt.Color(255, 255, 255));
    txtCorreoEnvio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    txtCorreoEnvio.setForeground(new java.awt.Color(102, 102, 102));
    txtCorreoEnvio.setText("Ingrese el correo del destinatario");
    txtCorreoEnvio.setBorder(null);
    txtCorreoEnvio.setCaretColor(new java.awt.Color(153, 153, 153));
    Panel1.add(txtCorreoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 470, 30));
    Panel1.add(SeparadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 10));

    Asunto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Asunto.setForeground(new java.awt.Color(204, 204, 204));
    Asunto.setText("Asunto");
    Panel1.add(Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 30));

    txtAsunto.setBackground(new java.awt.Color(255, 255, 255));
    txtAsunto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    txtAsunto.setForeground(new java.awt.Color(102, 102, 102));
    txtAsunto.setText("Asunto...");
    txtAsunto.setBorder(null);
    txtAsunto.setCaretColor(new java.awt.Color(153, 153, 153));
    Panel1.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 470, 30));
    Panel1.add(SeparadorAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 550, 10));

    AreaTexto.setBorder(null);
    AreaTexto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

    txtMensaje.setBackground(new java.awt.Color(255, 255, 255));
    txtMensaje.setColumns(20);
    txtMensaje.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    txtMensaje.setForeground(new java.awt.Color(102, 102, 102));
    txtMensaje.setRows(10);
    txtMensaje.setTabSize(10);
    txtMensaje.setText("Escriba aquí...");
    txtMensaje.setBorder(null);
    txtMensaje.setMargin(new java.awt.Insets(5, 5, 5, 5));
    AreaTexto.setViewportView(txtMensaje);

    Panel1.add(AreaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 550, 200));

    BtnEnvio.setBackground(new java.awt.Color(31, 168, 254));

    txtEnvio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    txtEnvio.setForeground(new java.awt.Color(51, 51, 51));
    txtEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtEnvio.setText("Enviar");

    javax.swing.GroupLayout BtnEnvioLayout = new javax.swing.GroupLayout(BtnEnvio);
    BtnEnvio.setLayout(BtnEnvioLayout);
    BtnEnvioLayout.setHorizontalGroup(
      BtnEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
    );
    BtnEnvioLayout.setVerticalGroup(
      BtnEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(txtEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
    );

    Panel1.add(BtnEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 90, 30));

    Paneles.addTab("tab1", Panel1);

    Panel2.setBackground(new java.awt.Color(255, 255, 255));

    InfoPanel2.setBackground(new java.awt.Color(102, 102, 102));

    txtInfoPanel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtInfoPanel2.setForeground(new java.awt.Color(204, 204, 204));
    txtInfoPanel2.setText("Correos Recibidos");

    javax.swing.GroupLayout InfoPanel2Layout = new javax.swing.GroupLayout(InfoPanel2);
    InfoPanel2.setLayout(InfoPanel2Layout);
    InfoPanel2Layout.setHorizontalGroup(
      InfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InfoPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    InfoPanel2Layout.setVerticalGroup(
      InfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
    );

    txtNoMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtNoMessage.setForeground(new java.awt.Color(153, 153, 153));
    txtNoMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtNoMessage.setText("No hay mensajes nuevos");

    javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
    Panel2.setLayout(Panel2Layout);
    Panel2Layout.setHorizontalGroup(
      Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(txtNoMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
    );
    Panel2Layout.setVerticalGroup(
      Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(Panel2Layout.createSequentialGroup()
        .addComponent(InfoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNoMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        .addContainerGap())
    );

    Paneles.addTab("tab2", Panel2);

    Panel3.setBackground(new java.awt.Color(255, 255, 255));

    InfoPanel3.setBackground(new java.awt.Color(102, 102, 102));

    txtInfoPanel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtInfoPanel3.setForeground(new java.awt.Color(204, 204, 204));
    txtInfoPanel3.setText("Mensajes Eliminados");

    javax.swing.GroupLayout InfoPanel3Layout = new javax.swing.GroupLayout(InfoPanel3);
    InfoPanel3.setLayout(InfoPanel3Layout);
    InfoPanel3Layout.setHorizontalGroup(
      InfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InfoPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    InfoPanel3Layout.setVerticalGroup(
      InfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
    );

    txtNoDeleted.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtNoDeleted.setForeground(new java.awt.Color(153, 153, 153));
    txtNoDeleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtNoDeleted.setText("No hay mensajes eliminados");

    javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
    Panel3.setLayout(Panel3Layout);
    Panel3Layout.setHorizontalGroup(
      Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(txtNoDeleted, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
    );
    Panel3Layout.setVerticalGroup(
      Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(Panel3Layout.createSequentialGroup()
        .addComponent(InfoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNoDeleted, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
    );

    Paneles.addTab("tab3", Panel3);

    Panel4.setBackground(new java.awt.Color(255, 255, 255));

    InfoPanel4.setBackground(new java.awt.Color(102, 102, 102));

    txtInfoPanel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    txtInfoPanel4.setForeground(new java.awt.Color(204, 204, 204));
    txtInfoPanel4.setText("Opciones");

    javax.swing.GroupLayout InfoPanel4Layout = new javax.swing.GroupLayout(InfoPanel4);
    InfoPanel4.setLayout(InfoPanel4Layout);
    InfoPanel4Layout.setHorizontalGroup(
      InfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(InfoPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    InfoPanel4Layout.setVerticalGroup(
      InfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtInfoPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
    );

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(153, 153, 153));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("De momento no se puede actualizar la interfaz, vuelva luego... ");

    javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
    Panel4.setLayout(Panel4Layout);
    Panel4Layout.setHorizontalGroup(
      Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
    );
    Panel4Layout.setVerticalGroup(
      Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(Panel4Layout.createSequentialGroup()
        .addComponent(InfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        .addContainerGap())
    );

    Paneles.addTab("tab4", Panel4);

    BackgroundGmail.add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 590, 450));

    FondoUser.setBackground(new java.awt.Color(80, 80, 80));
    FondoUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    OptRedactar.setBackground(new java.awt.Color(80, 80, 80));
    OptRedactar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    OptRedactar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        OptRedactarMouseClicked(evt);
      }
    });

    InfoText1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    InfoText1.setText("Redactar");

    IconRedac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconRedac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/Redactar.png"))); // NOI18N

    javax.swing.GroupLayout OptRedactarLayout = new javax.swing.GroupLayout(OptRedactar);
    OptRedactar.setLayout(OptRedactarLayout);
    OptRedactarLayout.setHorizontalGroup(
      OptRedactarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptRedactarLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(IconRedac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8)
        .addComponent(InfoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    OptRedactarLayout.setVerticalGroup(
      OptRedactarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(OptRedactarLayout.createSequentialGroup()
        .addComponent(IconRedac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    FondoUser.add(OptRedactar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, -1));

    OptRecibidos.setBackground(new java.awt.Color(80, 80, 80));
    OptRecibidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    OptRecibidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    OptRecibidos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        OptRecibidosMouseClicked(evt);
      }
    });

    InfoText2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    InfoText2.setText("Recibidos");

    IconReci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconReci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/recibido.png"))); // NOI18N

    javax.swing.GroupLayout OptRecibidosLayout = new javax.swing.GroupLayout(OptRecibidos);
    OptRecibidos.setLayout(OptRecibidosLayout);
    OptRecibidosLayout.setHorizontalGroup(
      OptRecibidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptRecibidosLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(IconReci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8)
        .addComponent(InfoText2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    OptRecibidosLayout.setVerticalGroup(
      OptRecibidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(OptRecibidosLayout.createSequentialGroup()
        .addComponent(IconReci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    FondoUser.add(OptRecibidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 170, -1));

    OptPapelera.setBackground(new java.awt.Color(80, 80, 80));
    OptPapelera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    OptPapelera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    OptPapelera.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        OptPapeleraMouseClicked(evt);
      }
    });

    InfoText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    InfoText3.setText("Papelera");

    IconPape.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconPape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/papelera.png"))); // NOI18N

    javax.swing.GroupLayout OptPapeleraLayout = new javax.swing.GroupLayout(OptPapelera);
    OptPapelera.setLayout(OptPapeleraLayout);
    OptPapeleraLayout.setHorizontalGroup(
      OptPapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptPapeleraLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(IconPape, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8)
        .addComponent(InfoText3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    OptPapeleraLayout.setVerticalGroup(
      OptPapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(OptPapeleraLayout.createSequentialGroup()
        .addComponent(IconPape, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    FondoUser.add(OptPapelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 250, 170, -1));

    OptOpciones.setBackground(new java.awt.Color(80, 80, 80));
    OptOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    OptOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    OptOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        OptOpcionesMouseClicked(evt);
      }
    });

    InfoText4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    InfoText4.setText("Opciones");

    IconOpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconOpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/opciones.png"))); // NOI18N

    javax.swing.GroupLayout OptOpcionesLayout = new javax.swing.GroupLayout(OptOpciones);
    OptOpciones.setLayout(OptOpcionesLayout);
    OptOpcionesLayout.setHorizontalGroup(
      OptOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptOpcionesLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(IconOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8)
        .addComponent(InfoText4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    OptOpcionesLayout.setVerticalGroup(
      OptOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(OptOpcionesLayout.createSequentialGroup()
        .addComponent(IconOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    FondoUser.add(OptOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 170, -1));

    OptSalir.setBackground(new java.awt.Color(80, 80, 80));
    OptSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    OptSalir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        OptSalirMouseClicked(evt);
      }
    });

    InfoText5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    InfoText5.setText("Salir");

    IconSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    IconSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/salida.png"))); // NOI18N

    javax.swing.GroupLayout OptSalirLayout = new javax.swing.GroupLayout(OptSalir);
    OptSalir.setLayout(OptSalirLayout);
    OptSalirLayout.setHorizontalGroup(
      OptSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptSalirLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(IconSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8)
        .addComponent(InfoText5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    OptSalirLayout.setVerticalGroup(
      OptSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(InfoText5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(OptSalirLayout.createSequentialGroup()
        .addComponent(IconSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    FondoUser.add(OptSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, -1));

    User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/user.png"))); // NOI18N
    FondoUser.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

    BackgroundGmail.add(FondoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 470));

    BackgroundColorCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images2/139 High Flight.png"))); // NOI18N
    BackgroundGmail.add(BackgroundColorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 650, 470));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundGmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(BackgroundGmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void OptRedactarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptRedactarMouseClicked
    Paneles.setSelectedIndex(0);
  }//GEN-LAST:event_OptRedactarMouseClicked

  private void OptRecibidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptRecibidosMouseClicked
    Paneles.setSelectedIndex(1);
  }//GEN-LAST:event_OptRecibidosMouseClicked

  private void OptPapeleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptPapeleraMouseClicked
    Paneles.setSelectedIndex(2);
  }//GEN-LAST:event_OptPapeleraMouseClicked

  private void OptOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptOpcionesMouseClicked
    Paneles.setSelectedIndex(3);
  }//GEN-LAST:event_OptOpcionesMouseClicked

  private void HeaderCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderCorreoMousePressed
    xMouse= evt.getX();
    yMouse = evt.getY();
  }//GEN-LAST:event_HeaderCorreoMousePressed

  private void HeaderCorreoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderCorreoMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - xMouse, y - yMouse);
  }//GEN-LAST:event_HeaderCorreoMouseDragged

  private void BtnExitCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitCorreoMouseClicked
    SalidaCorreo Salir = new SalidaCorreo();
    Salir.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_BtnExitCorreoMouseClicked

  private void BtnExitCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitCorreoMouseEntered
    BtnExitCorreo.setBackground(Color.red);
  }//GEN-LAST:event_BtnExitCorreoMouseEntered

  private void BtnExitCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitCorreoMouseExited
    BtnExitCorreo.setBackground(Color.black);
  }//GEN-LAST:event_BtnExitCorreoMouseExited

  private void OptSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptSalirMouseClicked
    SalidaCorreo Salir = new SalidaCorreo();
    Salir.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_OptSalirMouseClicked

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
      java.util.logging.Logger.getLogger(Interfaz_Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Interfaz_Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Interfaz_Correo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane AreaTexto;
  private javax.swing.JLabel Asunto;
  private javax.swing.JLabel BackgroundColorCorreo;
  private javax.swing.JPanel BackgroundGmail;
  private javax.swing.JLabel BackgroundHeaderPanel;
  private javax.swing.JPanel BtnEnvio;
  private javax.swing.JPanel BtnExitCorreo;
  private javax.swing.JPanel FondoUser;
  private javax.swing.JPanel HeaderCorreo;
  private javax.swing.JPanel HeaderPanel;
  private javax.swing.JLabel IconEfelante;
  private javax.swing.JLabel IconOpc;
  private javax.swing.JLabel IconPape;
  private javax.swing.JLabel IconReci;
  private javax.swing.JLabel IconRedac;
  private javax.swing.JLabel IconSalir;
  private javax.swing.JLabel InfoInterfaz;
  private javax.swing.JPanel InfoPanel1;
  private javax.swing.JPanel InfoPanel2;
  private javax.swing.JPanel InfoPanel3;
  private javax.swing.JPanel InfoPanel4;
  private javax.swing.JLabel InfoText1;
  private javax.swing.JLabel InfoText2;
  private javax.swing.JLabel InfoText3;
  private javax.swing.JLabel InfoText4;
  private javax.swing.JLabel InfoText5;
  private javax.swing.JPanel OptOpciones;
  private javax.swing.JPanel OptPapelera;
  private javax.swing.JPanel OptRecibidos;
  private javax.swing.JPanel OptRedactar;
  private javax.swing.JPanel OptSalir;
  private javax.swing.JPanel Panel1;
  private javax.swing.JPanel Panel2;
  private javax.swing.JPanel Panel3;
  private javax.swing.JPanel Panel4;
  private javax.swing.JTabbedPane Paneles;
  private javax.swing.JLabel Para;
  private javax.swing.JSeparator SeparadorAsunto;
  private javax.swing.JSeparator SeparadorCorreo;
  private javax.swing.JLabel User;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField txtAsunto;
  private javax.swing.JTextField txtCorreoEnvio;
  private javax.swing.JLabel txtEnvio;
  private javax.swing.JLabel txtExitCorreo;
  private javax.swing.JLabel txtInfoPanel;
  private javax.swing.JLabel txtInfoPanel2;
  private javax.swing.JLabel txtInfoPanel3;
  private javax.swing.JLabel txtInfoPanel4;
  private javax.swing.JTextArea txtMensaje;
  private javax.swing.JLabel txtNoDeleted;
  private javax.swing.JLabel txtNoMessage;
  // End of variables declaration//GEN-END:variables
}