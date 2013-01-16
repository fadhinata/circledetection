/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2;

 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tiagopereira
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        ((Graphics2D)desenho.getGraphics()).scale(1, 1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ransac = new javax.swing.JButton();
        desenho = new javax.swing.JPanel();
        texto = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        x = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        hough = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        texto2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ransac.setText("RANSAC");
        ransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ransacActionPerformed(evt);
            }
        });

        desenho.setBackground(new java.awt.Color(255, 255, 255));
        desenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desenhoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desenhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desenhoMouseEntered(evt);
            }
        });
        desenho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                desenhoMouseMoved(evt);
            }
        });
        desenho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desenhoFocusGained(evt);
            }
        });

        org.jdesktop.layout.GroupLayout desenhoLayout = new org.jdesktop.layout.GroupLayout(desenho);
        desenho.setLayout(desenhoLayout);
        desenhoLayout.setHorizontalGroup(
            desenhoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 473, Short.MAX_VALUE)
        );
        desenhoLayout.setVerticalGroup(
            desenhoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        texto.setText("jTextField1");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        x.setText("x");

        y.setText("y");

        jLabel2.setText("Coordenators");

        jButton2.setText("Browse file...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hough.setText("Hough transform");
        hough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houghActionPerformed(evt);
            }
        });

        jLabel1.setText("Annulus:");

        texto1.setText("jTextField1");

        jLabel3.setText("Annulus:");

        texto2.setText("jTextField1");

        jLabel4.setText("Annulus:");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton2)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jSeparator1)
                        .addContainerGap())))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(texto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(texto1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(texto2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(x, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(y, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(canvas1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 50, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(ransac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(hough, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(clear))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(desenho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(ransac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, hough, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(x)
                            .add(y))
                        .add(18, 18, 18)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(texto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(texto1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(texto2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(42, 42, 42)
                        .add(canvas1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(desenho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
  
        desenho.repaint();
    }//GEN-LAST:event_clearActionPerformed

    private void desenhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_desenhoMouseClicked

    private void desenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMousePressed
        // TODO add your handling code here:
        desenho.getMousePosition();
 
        int x;
        int y;
       
        evt.getClickCount();
        x =  evt.getY();
        texto.setText(Integer.toString(x));
        
        //draw a point
        Ass2.putline(desenho.getGraphics(), evt.getX()-2, evt.getY(), evt.getX()+2, evt.getY());
        Ass2.putline(desenho.getGraphics(), evt.getX(), evt.getY()-2, evt.getX(), evt.getY()+2);
        //Ass2.putcircle(desenho.getGraphics(), evt.getX(), evt.getY(),40);
        //put point on matrix
        //...
        //...
        
    }//GEN-LAST:event_desenhoMousePressed

    private void ransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ransacActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ransacActionPerformed

    private void desenhoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desenhoFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_desenhoFocusGained

    private void desenhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_desenhoMouseEntered

    private void desenhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseMoved
        // TODO add your handling code here:
        //get coordenators of cursor
        x.setText("x: "+evt.getX());
        y.setText("y: "+(desenho.getHeight()-evt.getY()));
    }//GEN-LAST:event_desenhoMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        desenho.repaint();
        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        int i=0;
 
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fc.getSelectedFile()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while((line = in.readLine()) != null)
            {
              i++;
              System.out.println(line);
              String temp[] = line.split(",");
              try{
                //draw points
                Ass2.putline(desenho.getGraphics(),Integer.parseInt(temp[0]), Integer.parseInt(temp[1])-2, Integer.parseInt(temp[0]), Integer.parseInt(temp[1])+2);
                Ass2.putline(desenho.getGraphics(),Integer.parseInt(temp[0])-2, Integer.parseInt(temp[1]), Integer.parseInt(temp[0])+2, Integer.parseInt(temp[1]));
                //put points on matrix
                //...
                //...
            
              } catch(NumberFormatException n){
                  JOptionPane.showMessageDialog(null, "You have some erro on input file: "+n.getMessage(), "Error on line: "+i, JOptionPane.INFORMATION_MESSAGE, null);
                  return;
              }
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void houghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houghActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houghActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton clear;
    private javax.swing.JPanel desenho;
    private javax.swing.JButton hough;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton ransac;
    private javax.swing.JTextField texto;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
