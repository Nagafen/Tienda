/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasEpicas;

import DAOs.FuncionesInicioSesion;
import VEOs.Usuarios;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanelInicioS = new javax.swing.JPanel();
        Registro = new javax.swing.JPanel();
        PreguntaRegistro = new javax.swing.JLabel();
        TextoRegistro = new javax.swing.JLabel();
        TextoNombreRegistro = new javax.swing.JLabel();
        NombreRegistro = new javax.swing.JTextField();
        TextoContraseñaRegistro = new javax.swing.JLabel();
        ContraseñaRegistro = new javax.swing.JTextField();
        TextoCorreoRegstro = new javax.swing.JLabel();
        CorreoRegistro = new javax.swing.JTextField();
        ConfirmacionRegistro = new javax.swing.JLabel();
        TextoConfirmacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        ImgUsuario = new javax.swing.JLabel();
        PreguntaLogin = new javax.swing.JLabel();
        TextoLogin = new javax.swing.JLabel();
        TextoNombreLogin = new javax.swing.JLabel();
        NombreLogin = new javax.swing.JTextField();
        TextoContraseñaLogin = new javax.swing.JLabel();
        ContraseñaLogin = new javax.swing.JTextField();
        GO = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        MainPanelInicioS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registro.setBackground(new java.awt.Color(44, 62, 80));

        PreguntaRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        PreguntaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        PreguntaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PreguntaRegistro.setText("¿No tienes Usuario?");

        TextoRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        TextoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoRegistro.setText("REGISTRATE");

        TextoNombreRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        TextoNombreRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombreRegistro.setText("Nombre");

        NombreRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N

        TextoContraseñaRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        TextoContraseñaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TextoContraseñaRegistro.setText("Contraseña");

        ContraseñaRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N
        ContraseñaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaRegistroActionPerformed(evt);
            }
        });

        TextoCorreoRegstro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        TextoCorreoRegstro.setForeground(new java.awt.Color(255, 255, 255));
        TextoCorreoRegstro.setText("Correo");

        CorreoRegistro.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N

        ConfirmacionRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok_52px.png"))); // NOI18N
        ConfirmacionRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmacionRegistroMouseClicked(evt);
            }
        });

        TextoConfirmacion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N
        TextoConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        TextoConfirmacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/High Priority_20px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/High Priority_20px.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/High Priority_20px.png"))); // NOI18N

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreguntaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(ConfirmacionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(CorreoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextoContraseñaRegistro)
                            .addComponent(TextoNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoCorreoRegstro)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ContraseñaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(NombreRegistro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PreguntaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextoContraseñaRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextoCorreoRegstro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CorreoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ConfirmacionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(TextoConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainPanelInicioS.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 410));

        Login.setBackground(new java.awt.Color(236, 240, 241));

        ImgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Male User_100px.png"))); // NOI18N

        PreguntaLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        PreguntaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PreguntaLogin.setText("¿Ya tienes Usuario?");

        TextoLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        TextoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoLogin.setText("INGRESA!");

        TextoNombreLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        TextoNombreLogin.setText("Nombre");

        NombreLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N
        NombreLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreLoginActionPerformed(evt);
            }
        });

        TextoContraseñaLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        TextoContraseñaLogin.setText("Contraseña");

        ContraseñaLogin.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N

        GO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Go_52px.png"))); // NOI18N
        GO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOMouseClicked(evt);
            }
        });

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel_20px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Error_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Error_20px.png"))); // NOI18N

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PreguntaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(NombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextoContraseñaLogin)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(ContraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(ImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addComponent(Cerrar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(Cerrar)
                .addGap(7, 7, 7)
                .addComponent(ImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PreguntaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoNombreLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextoContraseñaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        MainPanelInicioS.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 260, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanelInicioS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanelInicioS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreLoginActionPerformed

    }//GEN-LAST:event_NombreLoginActionPerformed

    private void ConfirmacionRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmacionRegistroMouseClicked
        int contador = 0;
        if (this.NombreRegistro.getText().isEmpty() == true) {
            this.jLabel1.setVisible(true);
            this.TextoConfirmacion.setText("Falta llenar algunos campos :)");
        } else {
            contador++;
            this.jLabel1.setVisible(false);
        }
        if (this.ContraseñaRegistro.getText().isEmpty() == true) {
            this.jLabel2.setVisible(true);
            this.TextoConfirmacion.setText("Falta llenar algunos campos :)");
        } else {
            contador++;
            this.jLabel2.setVisible(false);
        }
        if (this.CorreoRegistro.getText().isEmpty() == true) {
            this.jLabel3.setVisible(true);
            this.TextoConfirmacion.setText("Falta llenar algunos campos :)");
        } else {
            contador++;
            this.jLabel3.setVisible(false);
        }

        if (contador == 3) {
            FuncionesInicioSesion inser = new FuncionesInicioSesion();
            try {
                inser.insertar(this.NombreRegistro.getText(), this.ContraseñaRegistro.getText(), this.CorreoRegistro.getText());
                this.NombreRegistro.setText("");
                this.ContraseñaRegistro.setText("");
                this.CorreoRegistro.setText("");
                JOptionPane.showMessageDialog(this, "Registro completado con exito");
            } catch (URISyntaxException | SQLException | IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_ConfirmacionRegistroMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void GOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOMouseClicked
        int contador = 0;
        if (this.NombreLogin.getText().isEmpty() == true) {
            this.jLabel4.setVisible(true);
        } else {
            contador++;
            this.jLabel4.setVisible(false);
        }
        if (this.ContraseñaLogin.getText().isEmpty() == true) {
            this.jLabel5.setVisible(true);
        } else {
            contador++;
            this.jLabel5.setVisible(false);
        }
        if (contador == 2) {
            FuncionesInicioSesion fun = new FuncionesInicioSesion();
            Usuarios usu = fun.seleccionarUno(this.NombreLogin.getText()); 
            if(usu!=null){
                try {
                    if (usu.getContraseña().equalsIgnoreCase(this.ContraseñaLogin.getText())) {
                        JOptionPane.showMessageDialog(this, "Bienvenido " + usu.getNombre());
                        this.setVisible(false);
                        PrincipalFuncionesEpicas pri = new PrincipalFuncionesEpicas();
                        pri.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Datos erroneos, intentalo de nuevo");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } 
            }else{
                JOptionPane.showMessageDialog(this, "El usuario " + this.NombreLogin.getText() + " " + "no existe");
            }
            

        }
    }//GEN-LAST:event_GOMouseClicked

    private void ContraseñaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaRegistroActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel ConfirmacionRegistro;
    private javax.swing.JTextField ContraseñaLogin;
    private javax.swing.JTextField ContraseñaRegistro;
    private javax.swing.JTextField CorreoRegistro;
    private javax.swing.JLabel GO;
    private javax.swing.JLabel ImgUsuario;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel MainPanelInicioS;
    private javax.swing.JTextField NombreLogin;
    private javax.swing.JTextField NombreRegistro;
    private javax.swing.JLabel PreguntaLogin;
    private javax.swing.JLabel PreguntaRegistro;
    private javax.swing.JPanel Registro;
    private javax.swing.JLabel TextoConfirmacion;
    private javax.swing.JLabel TextoContraseñaLogin;
    private javax.swing.JLabel TextoContraseñaRegistro;
    private javax.swing.JLabel TextoCorreoRegstro;
    private javax.swing.JLabel TextoLogin;
    private javax.swing.JLabel TextoNombreLogin;
    private javax.swing.JLabel TextoNombreRegistro;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
