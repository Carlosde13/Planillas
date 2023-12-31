package planillas.views;

import planillas.views.Inicio;
import planillas.models.Empresa;
import javax.swing.JOptionPane;
import planillas.controllers.ConsultasEmpresa;

/**
 *
 * @author deleo
 */
public class JFInscribir_Empresa extends javax.swing.JFrame {

    /**
     * Creates new form JFInscribir_Empresa
     */
    public JFInscribir_Empresa() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Nueva Empresa");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfnombreEmpresa = new javax.swing.JTextField();
        inscribirBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Inscripción de Empresa");

        jLabel2.setText("Ha sido dirigido a esta vista ya que no se ha encontrado una empresa con el codigo que ha ingresado,");

        jLabel3.setText("si ya ha inscrito una emprea y cree que este es un error, puede verificar el codigo de la misma e intentarlo ");

        jLabel4.setText("de nuevo. De lo contrario, puede ingresar un nombre para su empresa (Debe ser unico, es decir,");

        jLabel5.setText("que no sea igual al de ninguna empresa existente) y registrarla.");

        jLabel6.setText("Nombre de la Empresa:");

        inscribirBtn.setText("Inscribir");
        inscribirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirBtnActionPerformed(evt);
            }
        });

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inscribirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfnombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfnombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscribirBtn)
                    .addComponent(volverBtn))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscribirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirBtnActionPerformed
        // TODO add your handling code here:
        if(this.tfnombreEmpresa.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El nombre de la empresa es requerido", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            ConsultasEmpresa inscribirE = new ConsultasEmpresa();
        
            String nombreEmpresa = this.tfnombreEmpresa.getText();
        
            boolean agregar = inscribirE.inscribirEmpresa(nombreEmpresa);
            if(agregar){
                
                Empresa e = new Empresa();
                e = inscribirE.getByName(nombreEmpresa);
                String codigo = "PL-"+ e.getId();
                boolean setCod = inscribirE.setCodigo(codigo, e.getId());
                
                if (setCod){
                    String mensaje = "Se ha agregado correctamente! \n El ID de su empresa es: "+e.getId()+"\n El codigo de planilla para la empresa es: "+codigo;
                    JOptionPane.showMessageDialog(this, mensaje);
                }else{
                    String mensaje = "Se ha agregado correctamente! \n El ID de su empresa es: "+e.getId()+"\nHubo un error al crear el codigo de planilla, debera ingresar la planilla con el id de su empresa ";
                    JOptionPane.showMessageDialog(this, mensaje);
                }
                
                Menu menu = new Menu (e);
                menu.show();
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Error al agregar, verifique que el nombre no exista en la base de datos e intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_inscribirBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        inicio.show();
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JFInscribir_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInscribir_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInscribir_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInscribir_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInscribir_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inscribirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfnombreEmpresa;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
