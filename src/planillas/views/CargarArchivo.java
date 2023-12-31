package planillas.views;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import planillas.controllers.ArchivoController;
import planillas.models.Empresa;
import planillas.models.Planilla;
import planillas.models.Planilla_trabajador;

/**
 *
 * @author deleo
 */
public class CargarArchivo extends javax.swing.JFrame {

    Empresa empresa = new Empresa();
    Planilla planilla = new Planilla();

    private String direccionArchivo;

    public String getDireccionArchivo() {
        return direccionArchivo;
    }

    public void setDireccionArchivo(String direccionArchivo) {
        this.direccionArchivo = direccionArchivo;
        this.lblArchivoURL.setText(direccionArchivo);
    }

    public CargarArchivo() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Nueva Empresa");
    }

    public CargarArchivo(Empresa e, Planilla p) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Subir archivo de planilla");

        this.empresa = e;
        this.planilla = p;

        this.lblEmpresa.setText(e.getNombre());
        setDireccionArchivo("");
    }

    public CargarArchivo(Empresa e, Planilla p, String url) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Subir archivo de planilla");

        this.empresa = e;
        this.planilla = p;

        this.lblEmpresa.setText(e.getNombre());
        setDireccionArchivo(url);
        this.lblArchivoURL.setText(url);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archivoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblArchivoURL = new javax.swing.JLabel();
        cargarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        archivoBtn.setText("Seleccionar Archivo");
        archivoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Cargar Archivo");

        jLabel2.setText("Debe cargar un archivo con extension .txt que contenga los datos:");

        jLabel3.setText("- Id del trabajador");

        jLabel4.setText("- Sueldo");

        jLabel5.setText("- Id del trabajador");

        jLabel6.setText("Cada uno de los datos separados por comas");

        lblEmpresa.setFont(new java.awt.Font("Sitka Heading", 2, 14)); // NOI18N
        lblEmpresa.setText("Empresa");

        lblArchivoURL.setFont(new java.awt.Font("Sitka Heading", 2, 12)); // NOI18N
        lblArchivoURL.setForeground(new java.awt.Color(0, 102, 0));
        lblArchivoURL.setText("Archivo");

        cargarBtn.setText("Cargar");
        cargarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(archivoBtn)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cargarBtn))
                            .addComponent(lblArchivoURL)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpresa)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addComponent(archivoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblArchivoURL)
                .addGap(18, 18, 18)
                .addComponent(cargarBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoBtnActionPerformed
        AdminArchivos fileChooser = new AdminArchivos(this);
        fileChooser.setVisible(true);
    }//GEN-LAST:event_archivoBtnActionPerformed

    private void cargarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtnActionPerformed
        // TODO add your handling code here:

        if (this.direccionArchivo == "") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArchivoController ac = new ArchivoController();
            List<Planilla_trabajador> registros = new ArrayList<>();

            registros = ac.leerArchivo(this.direccionArchivo, this.planilla, this.empresa.getId());

            if (ac.getExito() == false) {
                if (ac.getAgregarTrabajador() == true) {

                    int opcion = JOptionPane.showConfirmDialog(this, "No existe un trabajador con este ID\n¿Desea agregar un nuevo trabajador?", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        NuevoTrabajador nt = new NuevoTrabajador(this.empresa, this.planilla, this.direccionArchivo, ac.getCuiInexistente());
                        nt.setVisible(true);
                        dispose();
                    } else {
                        System.out.println("Eligio NO");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, ac.getErrorMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                ConfirmacionArchivo ca = new ConfirmacionArchivo(this.empresa, this.planilla, this.direccionArchivo, registros);
                ca.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_cargarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoBtn;
    private javax.swing.JButton cargarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblArchivoURL;
    private javax.swing.JLabel lblEmpresa;
    // End of variables declaration//GEN-END:variables
}
