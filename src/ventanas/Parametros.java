package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import tarea3.Metodos;
import static tarea3.Metodos.*;
/**
 *
 * @author Nacho
 */
public class Parametros extends javax.swing.JFrame {
    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    
    public static File original;

    /**
     * Creates new form Inicio
     */
    public Parametros() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAbrir = new javax.swing.JButton();
        jLabelValidar = new javax.swing.JLabel();
        jLabelIteraciones = new javax.swing.JLabel();
        jTexttmax = new javax.swing.JTextField();
        jLabelPoblacion = new javax.swing.JLabel();
        jTextFieldpsize = new javax.swing.JTextField();
        jLabelTamtor = new javax.swing.JLabel();
        jTextFieldk = new javax.swing.JTextField();
        jLabelProbcross = new javax.swing.JLabel();
        jTextFieldpcross = new javax.swing.JTextField();
        jLabelPorcent = new javax.swing.JLabel();
        jLabelProbmuta = new javax.swing.JLabel();
        jTextFieldpmut = new javax.swing.JTextField();
        jLabelPorcent1 = new javax.swing.JLabel();
        jButtonGo = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(java.awt.Color.darkGray);
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("<html>\n<center>Elección de parámetros</center>\n</html>");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 380, 40));

        jButtonAbrir.setText("Abir archivo...");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 93, -1, 30));

        jLabelValidar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelValidar.setText("No se ha seleccionado archivo");
        getContentPane().add(jLabelValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 280, 40));

        jLabelIteraciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIteraciones.setText("Número máx de iteraciones");
        getContentPane().add(jLabelIteraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 20));

        jTexttmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttmaxActionPerformed(evt);
            }
        });
        getContentPane().add(jTexttmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 50, -1));

        jLabelPoblacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPoblacion.setText("Tamaño de la población");
        getContentPane().add(jLabelPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, 20));

        jTextFieldpsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpsizeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldpsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 50, -1));

        jLabelTamtor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTamtor.setText("Tamaño del torneo");
        getContentPane().add(jLabelTamtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 160, 20));
        getContentPane().add(jTextFieldk, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 50, -1));

        jLabelProbcross.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelProbcross.setText("Probabilidad de cruzamiento");
        getContentPane().add(jLabelProbcross, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 160, 20));
        getContentPane().add(jTextFieldpcross, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 50, -1));

        jLabelPorcent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPorcent.setText("1 ~ 100 %");
        getContentPane().add(jLabelPorcent, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, 20));

        jLabelProbmuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelProbmuta.setText("Probabilidad de mutación");
        getContentPane().add(jLabelProbmuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 160, 20));
        getContentPane().add(jTextFieldpmut, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 50, -1));

        jLabelPorcent1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPorcent1.setText("1 ~ 100 %");
        getContentPane().add(jLabelPorcent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 20));

        jButtonGo.setBackground(new java.awt.Color(0, 0, 102));
        jButtonGo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonGo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGo.setText("¡ GO !");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 150, 60));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        //Sale del programa
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        //Creación un objeto JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Se llamará al método del objeto creado
        dlg.setFileFilter(filter);
        //Se abre la ventana de diálogo para seleccionar archivo
        int option = dlg.showOpenDialog(this);
        //Si hacemos click en el botón abir
        if (option==JFileChooser.APPROVE_OPTION)
        {
            //Se obtiene el nombre del archivo seleccionado
            String rutaCompleta = dlg.getSelectedFile().getPath();
            //Crear variable a partir de la selección
            original = new File(rutaCompleta);
            //Traspasar nombre de archivo a label adyacente
            String label = "Archivo seleccionado exitosamente: "+original.getName();
            jLabelValidar.setText(label);
            //jLabelValidar.setForeground(Color.green);
            Metodos.ruta = rutaCompleta;
            //Generar archivo temporal dentro del directorio raiz
            crearArchivo();
            //Crear matriz 2D con los costos de distancias entre las ciudades
            crearMatriz();
        }
        else
        {
            //Transmitir error en caso que se cancele la carga del archivo
            String label = "Carga de archivo fallida, intente nuevamente.";
            jLabelValidar.setText(label);
            //jLabelValidar.setForeground(Color.red);//
        }
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jTextFieldpsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpsizeActionPerformed

    private void jTexttmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttmaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttmaxActionPerformed

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
        
    }//GEN-LAST:event_jButtonGoActionPerformed

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
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Parametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonGo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIteraciones;
    private javax.swing.JLabel jLabelPoblacion;
    private javax.swing.JLabel jLabelPorcent;
    private javax.swing.JLabel jLabelPorcent1;
    private javax.swing.JLabel jLabelProbcross;
    private javax.swing.JLabel jLabelProbmuta;
    private javax.swing.JLabel jLabelTamtor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValidar;
    private javax.swing.JTextField jTextFieldk;
    private javax.swing.JTextField jTextFieldpcross;
    private javax.swing.JTextField jTextFieldpmut;
    private javax.swing.JTextField jTextFieldpsize;
    private javax.swing.JTextField jTexttmax;
    // End of variables declaration//GEN-END:variables
}
