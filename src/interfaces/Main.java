/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Zoidiano
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        Calendar cal = Calendar.getInstance();
        String fechas = cal.get(cal.DATE) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.YEAR);
        this.fecha.setText(fechas);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mm = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Slider1 = new javax.swing.JMenu();
        llama_interfaz_principal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Slider2 = new javax.swing.JMenu();
        llamaLibreria = new javax.swing.JMenuItem();
        llamaVestuario = new javax.swing.JMenuItem();
        llamaCasayPesca = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Slider3 = new javax.swing.JMenu();
        llamaUsuarios = new javax.swing.JMenuItem();
        Slider4 = new javax.swing.JMenu();
        llama_interfaz_informes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(56, 98, 127));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(56, 98, 127));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(56, 98, 127)));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        jPanel2.setBackground(new java.awt.Color(56, 98, 127));

        lb_user.setForeground(new java.awt.Color(255, 255, 255));
        lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        lb_user.setText("NOMBRE USUARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("|");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARGO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_user)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_user)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(56, 98, 127));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        hh.setForeground(new java.awt.Color(255, 255, 255));
        hh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hora.png"))); // NOI18N
        hh.setText("00");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        mm.setForeground(new java.awt.Color(255, 255, 255));
        mm.setText("00");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        ss.setForeground(new java.awt.Color(255, 255, 255));
        ss.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hh)
                    .addComponent(jLabel7)
                    .addComponent(mm)
                    .addComponent(jLabel9)
                    .addComponent(ss))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        fecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        fecha.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(fecha)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Slider1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.png"))); // NOI18N
        Slider1.setText("Ventas");
        Slider1.setEnabled(false);
        Slider1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slider1ActionPerformed(evt);
            }
        });

        llama_interfaz_principal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_principal.setText("Generar Venta");
        llama_interfaz_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_principalActionPerformed(evt);
            }
        });
        Slider1.add(llama_interfaz_principal);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Generar Venta Factura");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Slider1.add(jMenuItem1);

        jMenuBar1.add(Slider1);

        Slider2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        Slider2.setText("Inventario");
        Slider2.setEnabled(false);

        llamaLibreria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        llamaLibreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libreria.png"))); // NOI18N
        llamaLibreria.setText("Inventario Libreria");
        llamaLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaLibreriaActionPerformed(evt);
            }
        });
        Slider2.add(llamaLibreria);

        llamaVestuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        llamaVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vestuario.png"))); // NOI18N
        llamaVestuario.setText("Inventario Vestuario");
        llamaVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaVestuarioActionPerformed(evt);
            }
        });
        Slider2.add(llamaVestuario);

        llamaCasayPesca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        llamaCasayPesca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pesca.png"))); // NOI18N
        llamaCasayPesca.setText("Inventario Casa y Pesca");
        llamaCasayPesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaCasayPescaActionPerformed(evt);
            }
        });
        Slider2.add(llamaCasayPesca);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jMenuItem2.setText("Administracion Inventario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Slider2.add(jMenuItem2);

        jMenuBar1.add(Slider2);

        Slider3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        Slider3.setText("Usuarios");
        Slider3.setEnabled(false);
        Slider3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slider3ActionPerformed(evt);
            }
        });

        llamaUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        llamaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        llamaUsuarios.setText("Usuario");
        llamaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaUsuariosActionPerformed(evt);
            }
        });
        Slider3.add(llamaUsuarios);

        jMenuBar1.add(Slider3);

        Slider4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        Slider4.setText("Reportes");
        Slider4.setEnabled(false);

        llama_interfaz_informes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_informes.setText("Reportes Venta");
        llama_interfaz_informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_informesActionPerformed(evt);
            }
        });
        Slider4.add(llama_interfaz_informes);

        jMenuBar1.add(Slider4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llamaLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaLibreriaActionPerformed
        interfaz_inventario1 Form = new interfaz_inventario1();
        Form.CargarTablas(2, "LIBRERIA");
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Form.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaLibreriaActionPerformed

    private void llamaVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaVestuarioActionPerformed
        interfaz_inventario1 Form = new interfaz_inventario1();
        Form.CargarTablas(2, "VESTUARIO");
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaVestuarioActionPerformed

    private void llamaCasayPescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaCasayPescaActionPerformed
        interfaz_inventario1 Form = new interfaz_inventario1();
        Form.CargarTablas(2, "CASA Y PESCA");
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaCasayPescaActionPerformed

    private void llama_interfaz_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_principalActionPerformed
        interfaz_ventab Form = new interfaz_ventab();
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2)-50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_principalActionPerformed

    private void llama_interfaz_informesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_informesActionPerformed
        interfaz_informes Form = new interfaz_informes();
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_informesActionPerformed

    private void Slider3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slider3ActionPerformed

    }//GEN-LAST:event_Slider3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        interfaz_login il = new interfaz_login();
        il.setVisible(true);
        this.add(il);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = il.getSize();
        il.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2 - 60);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(il);

        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void llamaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaUsuariosActionPerformed
        interfaz_usuarios2 Form = new interfaz_usuarios2();
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2)-50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llamaUsuariosActionPerformed

    private void Slider1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slider1ActionPerformed
        interfaz_ventab il = new interfaz_ventab();
        il.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(il);
    }//GEN-LAST:event_Slider1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        interfaz_ventaf Form = new interfaz_ventaf();
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 50);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cerrar();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        interfaz_inventario_administracion Form = new interfaz_inventario_administracion();
        Form.setVisible(true);
        this.add(Form);
        Dimension desktopSize = this.getSize();
        Dimension FrameSize = Form.getSize();
        Form.setLocation((desktopSize.width - FrameSize.width) / 2, ((desktopSize.height - FrameSize.height) / 2) - 40);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public class cronometro implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);

            hh.setText((String.valueOf(hora - 1)));
            mm.setText(String.valueOf(minutos));
            ss.setText(String.valueOf(segundos));
        }
    }

    private void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea realizar cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            
        }
    }
    private Timer timer;

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Contenedor;
    public static javax.swing.JMenu Slider1;
    public static javax.swing.JMenu Slider2;
    public static javax.swing.JMenu Slider3;
    public static javax.swing.JMenu Slider4;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_user;
    private javax.swing.JMenuItem llamaCasayPesca;
    private javax.swing.JMenuItem llamaLibreria;
    private javax.swing.JMenuItem llamaUsuarios;
    private javax.swing.JMenuItem llamaVestuario;
    private javax.swing.JMenuItem llama_interfaz_informes;
    private javax.swing.JMenuItem llama_interfaz_principal;
    private javax.swing.JLabel mm;
    private javax.swing.JLabel ss;
    // End of variables declaration//GEN-END:variables
}
