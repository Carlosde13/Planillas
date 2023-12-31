package planillas.views;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author deleo
 */
public class AdminArchivos extends javax.swing.JFrame {
    
    CargarArchivo cargarArchivo = new CargarArchivo();
    
    public AdminArchivos() {
        initComponents();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        this.selectorArchivos.setFileFilter(filter);
        setLocationRelativeTo(null);
        setTitle("Seleccionar Archivo");
    }

    public AdminArchivos(CargarArchivo ca) {
        initComponents();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        this.selectorArchivos.setFileFilter(filter);
        setLocationRelativeTo(null);
        setTitle("Seleccionar Archivo");
        
        this.cargarArchivo = ca;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorArchivos = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectorArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArchivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchivosActionPerformed
        
        java.io.File selectedFile = this.selectorArchivos.getSelectedFile();
            
        System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
        String nombreArchivo = selectedFile.getName();
        if(selectedFile.getAbsolutePath() != null ){

            if(nombreArchivo.endsWith(".txt")){

                this.cargarArchivo.setDireccionArchivo(selectedFile.getAbsolutePath());
                dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Debe Seleccionar un Archivo con extension .txt", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"Por favor, seleccione un archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selectorArchivosActionPerformed

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
            java.util.logging.Logger.getLogger(AdminArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser selectorArchivos;
    // End of variables declaration//GEN-END:variables
}
