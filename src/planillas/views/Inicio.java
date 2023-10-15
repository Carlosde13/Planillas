package planillas.views;

import planillas.models.Empresa;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import planillas.controllers.ConsultasEmpresa;

/**
 *
 * @author deleo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle("Sistema de Planillas");
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEmpresaID = new javax.swing.JTextField();
        continuarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 19)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema de Planillas");

        jLabel2.setText("Ingrese el ID o código de planilla asignado a");

        tfEmpresaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpresaIDActionPerformed(evt);
            }
        });

        continuarBtn.setText("Continuar");
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("su empresa para continuar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmpresaID)
                            .addComponent(continuarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfEmpresaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(continuarBtn)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static boolean contieneSoloNumeros(String texto) {
        // Utiliza una expresión regular para verificar si el texto contiene solo números
        return texto.matches("[0-9]+");
    }
    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        // TODO add your handling code here:
        
        if(this.tfEmpresaID.getText().isBlank()){
            JOptionPane.showMessageDialog(this,"Ingrese el ID o código de planilla de su empresa", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int id;
            String codigo;
            ConsultasEmpresa consulta = new ConsultasEmpresa();
            Empresa empresa = null;
            
            if(contieneSoloNumeros(this.tfEmpresaID.getText())){
                
                id = Integer.parseInt(this.tfEmpresaID.getText());
                empresa = consulta.getById(id);
            }else{
                codigo = this.tfEmpresaID.getText();
                
                empresa = consulta.getByCodPlanilla(codigo);
            }

            if(empresa != null){
                Menu menu = new Menu (empresa);
                menu.show();
                dispose();
            }else{
                JFInscribir_Empresa inscribir = new JFInscribir_Empresa ();
                inscribir.show();
                dispose();
            }
        }
    }//GEN-LAST:event_continuarBtnActionPerformed

    private void tfEmpresaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpresaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmpresaIDActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfEmpresaID;
    // End of variables declaration//GEN-END:variables
}
