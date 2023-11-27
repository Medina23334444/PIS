
package View;


public class FrmDocente extends javax.swing.JFrame {

    public FrmDocente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
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

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("(Perfil)");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 40));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton11.setForeground(new java.awt.Color(242, 242, 242));
        jButton11.setText("Cerrar Sesion");
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 150, 40));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(242, 242, 242));
        jButton12.setText("Agregar Estudiante");
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setText("Registro de Docentes");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 280, 30));

        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 255, 24));

        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 255, 30));

        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 255, 30));

        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 255, 30));

        jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 255, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grado", "Maestria", "Doctorado" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 255, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 242, 242));
        jButton3.setText("Cerrar Sesion");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 160, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 84, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Experiencia Laboral:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 84, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 84, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel7.setText("Grado Academico:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 130, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel8.setText("Email:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 84, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 430, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 430, -1));

        jDateChooser1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, 30));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnRegCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegCursosActionPerformed

    private void btnRegDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegDocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegDocentesActionPerformed

    private void btnRegAsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAsignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegAsignActionPerformed

    private void btnRegEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegEstudiantesActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseMoved

    }//GEN-LAST:event_btnRegresarMouseMoved

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered

    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegAsign;
    private javax.swing.JButton btnRegCursos;
    private javax.swing.JButton btnRegDocentes;
    private javax.swing.JButton btnRegEstudiantes;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
