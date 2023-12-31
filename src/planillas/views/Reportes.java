package planillas.views;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import planillas.controllers.ReportesController;
import planillas.models.Empresa;

/**
 *
 * @author deleo
 */
public class Reportes extends javax.swing.JFrame {

    Empresa empresa = new Empresa ();
    public Reportes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reportes");
    }
    
    public Reportes(Empresa e) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reportes");
        this.empresa = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        btn3mil = new javax.swing.JButton();
        btnSueldoMinimo = new javax.swing.JButton();
        btnSuspendidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de Empleado", "CUI", "Nombre", "Sueldo", "Empresa"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        btn3mil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3mil.setText("Empleados con Sueldo Mayor a Q3,000");
        btn3mil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3milActionPerformed(evt);
            }
        });

        btnSueldoMinimo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSueldoMinimo.setText("Empleados que Ganan el Minimo");
        btnSueldoMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoMinimoActionPerformed(evt);
            }
        });

        btnSuspendidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuspendidos.setText("Empleados Suspendidos");
        btnSuspendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspendidosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Reportes...");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el tipo de reporte que quiere ver.");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de Reporte:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblReporte))
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn3mil)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSueldoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuspendidos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3mil)
                    .addComponent(btnSueldoMinimo)
                    .addComponent(btnSuspendidos))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void agregarFila(String col1, String col2, String col3, String col4, String col5) {
        Object[] rowdata = {col1, col2, col3, col4, col5};

        DefaultTableModel m = (DefaultTableModel) this.tablita.getModel();
        m.addRow(rowdata);
    }
    private void btn3milActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3milActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        
        String[] colNames = {"ID del Empleado", "CUI", "Nombre", "Sueldo", "Empresa"};
        DefaultTableModel m = (DefaultTableModel) this.tablita.getModel();
        
        m.setColumnIdentifiers(colNames);
        
        this.lblReporte.setText("Empleados que ganan mas de Q3,000.00");
        
        List<String[]> resultados = ReportesController.getBySueldo("3mil");
        
        for (String[] fila : resultados) {
            agregarFila(fila[0], fila[1],fila[2], fila[3], fila[4]);
        }
        
    }//GEN-LAST:event_btn3milActionPerformed

    private void btnSueldoMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoMinimoActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        String[] colNames = {"ID del Empleado", "CUI", "Nombre", "Estado", "Empresa"};
        DefaultTableModel m = (DefaultTableModel) this.tablita.getModel();
        
        m.setColumnIdentifiers(colNames);
        
        this.lblReporte.setText("Empleados que ganan el sueldo minimo (Q2,900.00)");
        
        List<String[]> resultados = ReportesController.getMinimo();
        
        for (String[] fila : resultados) {
            agregarFila(fila[0], fila[1],fila[2], fila[3], fila[4]);
        }
    }//GEN-LAST:event_btnSueldoMinimoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu (this.empresa);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void limpiarTabla() {
        DefaultTableModel m = (DefaultTableModel) this.tablita.getModel();

        int noFilas = m.getRowCount() - 1;

        while (noFilas >= 0) {
            m.removeRow(noFilas);
            noFilas = noFilas - 1;
        }
    }
    private void btnSuspendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendidosActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        String[] colNames = {"ID del Empleado", "CUI", "Nombre", "Sueldo", "Empresa"};
        DefaultTableModel m = (DefaultTableModel) this.tablita.getModel();
        
        m.setColumnIdentifiers(colNames);
        
        this.lblReporte.setText("Empleados que estan suspendidos");
        
        List<String[]> resultados = ReportesController.getBySueldo("susp");
        
        for (String[] fila : resultados) {
            agregarFila(fila[0], fila[1],fila[2], fila[3], fila[4]);
        }
    }//GEN-LAST:event_btnSuspendidosActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3mil;
    private javax.swing.JButton btnSueldoMinimo;
    private javax.swing.JButton btnSuspendidos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
