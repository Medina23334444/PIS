package View;

import java.awt.Color;

public class FrmEstudiante extends javax.swing.JFrame {

    public FrmEstudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        btnCerrarS = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        cbxEtnia = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnRegCursos = new javax.swing.JButton();
        btnRegDocentes = new javax.swing.JButton();
        btnRegAsign = new javax.swing.JButton();
        btnRegEstudiantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPerfil.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(242, 242, 242));
        btnPerfil.setText("(Perfil)");
        btnPerfil.setBorder(null);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        jPanel2.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 40));

        btnCerrarS.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCerrarS.setForeground(new java.awt.Color(242, 242, 242));
        btnCerrarS.setText("Cerrar Sesion");
        btnCerrarS.setBorder(null);
        btnCerrarS.setContentAreaFilled(false);
        btnCerrarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 150, 40));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(242, 242, 242));
        jButton13.setText("Agregar Estudiante");
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setText("Registro de Estudiante");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 310, 30));

        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 255, 24));

        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 255, 30));

        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 255, 30));

        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 255, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Provincia:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 140, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 84, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 84, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel7.setText("Etnia:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel8.setText("Email:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 84, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 430, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 430, -1));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 170, 40));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegresarMouseMoved(evt);
            }
        });
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 170, 40));

        jDateChooser1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 260, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel10.setText("Nombres:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 84, 30));

        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 255, 30));

        cbxEtnia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel3.add(cbxEtnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 255, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 570, 530));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegCursos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRegCursos.setText("Registro de Cursos");
        btnRegCursos.setBorder(null);
        btnRegCursos.setContentAreaFilled(false);
        btnRegCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegCursos.setMargin(new java.awt.Insets(15, 14, 15, 14));
        btnRegCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCursosActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 46));

        btnRegDocentes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRegDocentes.setText("Registro de Docentes");
        btnRegDocentes.setBorder(null);
        btnRegDocentes.setContentAreaFilled(false);
        btnRegDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegDocentes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegDocentes.setMargin(new java.awt.Insets(15, 14, 15, 14));
        btnRegDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegDocentesActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 220, 46));

        btnRegAsign.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRegAsign.setText("Registro de Asignaturas");
        btnRegAsign.setBorder(null);
        btnRegAsign.setContentAreaFilled(false);
        btnRegAsign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegAsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegAsign.setMargin(new java.awt.Insets(15, 14, 15, 14));
        btnRegAsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAsignActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegAsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, 46));

        btnRegEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRegEstudiantes.setText("Agregar Estudiante");
        btnRegEstudiantes.setBorder(null);
        btnRegEstudiantes.setContentAreaFilled(false);
        btnRegEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegEstudiantes.setMargin(new java.awt.Insets(15, 14, 15, 14));
        btnRegEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEstudiantesActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 46));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnRegDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegDocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegDocentesActionPerformed

    private void btnRegCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegCursosActionPerformed

    private void btnRegAsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAsignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegAsignActionPerformed

    private void btnRegEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegEstudiantesActionPerformed

    private void btnRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseMoved

    }//GEN-LAST:event_btnRegresarMouseMoved

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered

    }//GEN-LAST:event_btnRegresarMouseEntered

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
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarS;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnRegAsign;
    private javax.swing.JButton btnRegCursos;
    private javax.swing.JButton btnRegDocentes;
    private javax.swing.JButton btnRegEstudiantes;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxEtnia;
    private javax.swing.JButton jButton13;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
