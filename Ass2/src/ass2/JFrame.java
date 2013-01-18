/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2;

 
import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Jama.Matrix;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author tiagopereira
 */
public class JFrame extends javax.swing.JFrame {
    
    private Matrix matrix;
    private int minPercentagePoints = 50;
    private int maxIterations = 1000;
    private int maxWidthAnnulus = 300;
    private ArrayList<Point> pointList = new ArrayList<Point>(); 
    
    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        listModel = new DefaultListModel();
        pointscircle.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ransac = new javax.swing.JButton();
        desenho = new javax.swing.JPanel();
        maxit = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        x = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        minp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        maxw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        smallannulus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pointscircle = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        desenho1 = new javax.swing.JPanel();
        numCirclesText = new javax.swing.JTextField();
        clear1 = new javax.swing.JButton();
        x1 = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        hough1 = new javax.swing.JButton();
        numCircles = new javax.swing.JLabel();
        radiusText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        msgLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pointscircle1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setOpaque(true);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        ransac.setText("COMPUTE");
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

        maxit.setColumns(5);
        maxit.setText("1000");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        x.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        x.setText("x");

        y.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        y.setText("y");

        jLabel2.setText("Coordinates");

        jButton2.setText("Browse file...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Max Iterations:");

        minp.setColumns(5);
        minp.setText("50");

        jLabel3.setText("Min % of points:");

        maxw.setColumns(5);
        maxw.setText("100");
        maxw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxwActionPerformed(evt);
            }
        });

        jLabel4.setText("Max width annulus:");

        msgLabel.setForeground(new java.awt.Color(204, 0, 0));
        msgLabel.setText("Message:");

        jLabel5.setText("Smallest width annulus:");

        smallannulus.setText("--");

        jLabel6.setText("Points in the circle:");

        pointscircle.setEnabled(false);
        jScrollPane1.setViewportView(pointscircle);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(minp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(maxw, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton2)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(x, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(y, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jLabel3)
                    .add(maxit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(msgLabel)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(desenho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(smallannulus)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5)))))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(ransac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(171, 171, 171)
                    .add(clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 763, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jLabel2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(ransac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(desenho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel5)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(smallannulus)
                            .add(18, 18, 18)
                            .add(jLabel6)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jScrollPane1)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(x)
                            .add(y))
                        .add(18, 18, 18)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(maxit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(minp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(maxw, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(msgLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RANSAC", jPanel1);

        desenho1.setBackground(new java.awt.Color(255, 255, 255));
        desenho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desenho1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desenho1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desenho1MouseEntered(evt);
            }
        });
        desenho1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                desenho1MouseMoved(evt);
            }
        });
        desenho1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desenho1FocusGained(evt);
            }
        });

        org.jdesktop.layout.GroupLayout desenho1Layout = new org.jdesktop.layout.GroupLayout(desenho1);
        desenho1.setLayout(desenho1Layout);
        desenho1Layout.setHorizontalGroup(
            desenho1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 473, Short.MAX_VALUE)
        );
        desenho1Layout.setVerticalGroup(
            desenho1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        numCirclesText.setColumns(5);
        numCirclesText.setText("1");
        numCirclesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCirclesTextActionPerformed(evt);
            }
        });

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        x1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        x1.setText("x");

        y1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        y1.setText("y");

        jLabel7.setText("Coordinates");

        jButton3.setText("Browse file...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        hough1.setText("COMPUTE");
        hough1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hough1ActionPerformed(evt);
            }
        });

        numCircles.setText("# of circles:");

        radiusText.setColumns(5);
        radiusText.setText("50");

        jLabel9.setText("Radius:");

        msgLabel1.setForeground(new java.awt.Color(204, 0, 0));
        msgLabel1.setText("Message:");

        jLabel12.setText("Points in the circle:");

        pointscircle1.setEnabled(false);
        jScrollPane2.setViewportView(pointscircle1);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(numCirclesText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(radiusText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton3)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(x1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(y1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(numCircles)
                    .add(jLabel9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(msgLabel1)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(desenho1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                .add(jPanel2Layout.createSequentialGroup()
                    .add(hough1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(189, 189, 189)
                    .add(clear1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 763, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jLabel7)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(hough1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(clear1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(desenho1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(jLabel12)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jScrollPane2)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(x1)
                            .add(y1))
                        .add(18, 18, 18)
                        .add(numCircles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numCirclesText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(radiusText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(msgLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hough Transform", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 818, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        pointList.removeAll(pointList);
        desenho.removeAll();
        desenho.repaint();
        ((DefaultListModel)pointscircle.getModel()).removeAllElements();
        smallannulus.setText("--");
    }//GEN-LAST:event_clearActionPerformed

    private void desenhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_desenhoMouseClicked

    private void desenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMousePressed
        //draw a point
        Ass2.putpoint(desenho.getGraphics(), evt.getX(), evt.getY(), Color.RED);
        
       // Ass2.putcircle(desenho.getGraphics(), evt.getX(), evt.getY(), 50, Color.BLACK);
        
        //put point on arraylist
        pointList.add(evt.getPoint());
        
    }//GEN-LAST:event_desenhoMousePressed

    private void ransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ransacActionPerformed
        // TODO add your handling code here:
    	desenho.removeAll();
    	//desenho.getGraphics().clearRect(0, 0, 300, 300);
    	//desenho.setBackground(Color.WHITE);
        desenho.repaint();
        ((DefaultListModel)pointscircle.getModel()).removeAllElements();
    	
    	try {
	        minPercentagePoints = Integer.parseInt(minp.getText());
	        maxIterations = Integer.parseInt(maxit.getText());
	        maxWidthAnnulus = Integer.parseInt(maxw.getText());
    	}
    	catch (Exception e) {
			msgLabel.setText("Incorrect input.");
    		return;
		}
        
        removeDuplicates(pointList);
        
        if (pointList.size() < 3) {
        	msgLabel.setText("Insufficient amount of points.");
        	return;
        }
        else {
        	msgLabel.setText("");
        }
        
        
        
        matrix = new Matrix(pointList.size(), 2);
        
        int i = 0;
        for (Point p : pointList) {
        	matrix.set(i, 0, p.x);
        	matrix.set(i, 1, p.y);
        	i++;
            Ass2.putpoint(desenho.getGraphics(), p.x, p.y, Color.RED);
        }
        
      
        int minWidthAnnulus = 1;
        RansacUtil ransacUtil = null;
        
        
        for (i = 0; i < maxWidthAnnulus; i++) {
        
	        ransacUtil = new RansacUtil(matrix, maxIterations, minWidthAnnulus, minPercentagePoints);
	        if (ransacUtil.foundCircle()) {
	        	break;
	        }
	        minWidthAnnulus++;
        }
        
        if (ransacUtil.foundCircle()) {
        	final ArrayList<Point> points = ransacUtil.getPoints();
        	final Circle c = ransacUtil.getCircle();
        	final int minWid = minWidthAnnulus;
        	

        	SwingUtilities.invokeLater(new Runnable() {
        		@Override
        		public void run() {
        			for (Point p : pointList) {
        				Ass2.putpoint(desenho.getGraphics(), p.x, p.y, Color.RED);
        			}

        			int k = 1;
        			int d = desenho.getSize().height;
        			for (Point p : points) {
        				Ass2.putpoint(desenho.getGraphics(), p.x, p.y, Color.GREEN);
        				((DefaultListModel)pointscircle.getModel()).addElement(k+++".("+p.x+","+(d - p.y)+")");
        			}

        			Ass2.putcircle(desenho.getGraphics(), c.center.x, c.center.y, (int)c.radius, Color.BLACK);
        			Ass2.putcircle(desenho.getGraphics(), c.center.x, c.center.y, (int)c.radius+minWid, Color.GRAY);
        			Ass2.putcircle(desenho.getGraphics(), c.center.x, c.center.y, (int)c.radius-minWid, Color.GRAY);

        			smallannulus.setText(String.valueOf(minWid*2));
        		}
        	});
        }
        else {
        	smallannulus.setText("--");
        }
        
    }//GEN-LAST:event_ransacActionPerformed

    private void desenhoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desenhoFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_desenhoFocusGained

    private void desenhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_desenhoMouseEntered

    private void desenhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenhoMouseMoved
        //get coordinates of cursor
        x.setText("x: "+evt.getPoint().x);
        y.setText("y: "+(int)((desenho.getSize().getHeight() - evt.getPoint().y)));
    }//GEN-LAST:event_desenhoMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	// TODO add your handling code here:
    	desenho.repaint();
    	final JFileChooser fc = new JFileChooser();
    	fc.showOpenDialog(this);
    	int i=0;
    	
    	pointList = new ArrayList<Point>();

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
    			temp[0] = temp[0].trim();
    			temp[1] = temp[1].trim();
    			int x = Integer.parseInt(temp[0]);
    			int y = (desenho.getSize().height - Integer.parseInt(temp[1]));
    			try{
    				//draw points
    				//Ass2.putpoint(desenho.getGraphics(), x, y, Color.RED);
    				
    				//put points on list
    				pointList.add(new Point(x,y));
    				
    			} catch(NumberFormatException n){
    				JOptionPane.showMessageDialog(null, "You have some erro on input file: "+n.getMessage(), "Error on line: "+i, JOptionPane.INFORMATION_MESSAGE, null);
    				return;
    			}
    		}
    	} catch (IOException ex) {
    		Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	
    	SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				for(Point p :pointList) {
					Ass2.putpoint(desenho.getGraphics(), p.x, p.y, Color.RED);
				}
			}
		});
    	
    }//GEN-LAST:event_jButton2ActionPerformed

    private void desenho1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenho1MousePressed
       //draw a point
        Ass2.putpoint(desenho1.getGraphics(), evt.getX(), evt.getY(), Color.RED);
        
       // Ass2.putcircle(desenho.getGraphics(), evt.getX(), evt.getY(), 50, Color.BLACK);
        
        //put point on arraylist
        pointList.add(evt.getPoint());
    }//GEN-LAST:event_desenho1MousePressed

    private void desenho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenho1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_desenho1MouseClicked

    private void desenho1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenho1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_desenho1MouseEntered

    private void desenho1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desenho1MouseMoved
       //get coordinates of cursor
        x1.setText("x: "+evt.getPoint().x);
        y1.setText("y: "+(int)((desenho1.getSize().getHeight() - evt.getPoint().y)));
    }//GEN-LAST:event_desenho1MouseMoved

    private void desenho1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desenho1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_desenho1FocusGained

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        pointList.removeAll(pointList);
        desenho.removeAll();
        desenho.repaint();
        ((DefaultListModel)pointscircle.getModel()).removeAllElements();
        smallannulus.setText("--");
    }//GEN-LAST:event_clear1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    	desenho.repaint();
    	final JFileChooser fc = new JFileChooser();
    	fc.showOpenDialog(this);
    	int i=0;
    	
    	pointList = new ArrayList<Point>();

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
    			temp[0] = temp[0].trim();
    			temp[1] = temp[1].trim();
    			int x = Integer.parseInt(temp[0]);
    			int y = (desenho.getSize().height - Integer.parseInt(temp[1]));
    			try{
    				//draw points
    				//Ass2.putpoint(desenho.getGraphics(), x, y, Color.RED);
    				
    				//put points on list
    				pointList.add(new Point(x,y));
    				
    			} catch(NumberFormatException n){
    				JOptionPane.showMessageDialog(null, "You have some erro on input file: "+n.getMessage(), "Error on line: "+i, JOptionPane.INFORMATION_MESSAGE, null);
    				return;
    			}
    		}
    	} catch (IOException ex) {
    		Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	
    	SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				for(Point p :pointList) {
					Ass2.putpoint(desenho.getGraphics(), p.x, p.y, Color.RED);
				}
			}
		});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void hough1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hough1ActionPerformed
        HoughTransformUtil hough = new HoughTransformUtil(pointList, desenho1.getSize().height, desenho1.getSize().width, 50, 4);
    	
    	ArrayList<Circle> circles = hough.getCircles();
    	
    	if (circles.size() > 0) {
    		for (Circle c : circles) {
    			Ass2.putcircle(desenho1.getGraphics(), c.center.x, c.center.y, (int)c.radius, Color.GREEN);
    		}
    	}
    	else {
    		msgLabel1.setText("Circulo n�o encontrado");
    	}
    }//GEN-LAST:event_hough1ActionPerformed

    private void numCirclesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCirclesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCirclesTextActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TOD
        if (pointscircle.getModel() instanceof DefaultListModel) {
            clearActionPerformed(null);
            System.out.println(jTabbedPane1.getSelectedIndex());
        }
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void maxwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        new JFrame().setVisible(true);
        
        
        
    }
    
    
    public static void removeDuplicates(List list)  
    {  
      Set set = new HashSet();  
      List newList = new ArrayList();  
      for (Iterator iter = list.iterator(); iter.hasNext(); ) {  
        Object element = iter.next();  
        if (set.add(element))  
          newList.add(element);  
      }  
      list.clear();  
      list.addAll(newList);  
    } 
    private DefaultListModel listModel;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JPanel desenho;
    private javax.swing.JPanel desenho1;
    private javax.swing.JButton hough1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField maxit;
    private javax.swing.JTextField maxw;
    private javax.swing.JTextField minp;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel msgLabel1;
    private javax.swing.JLabel numCircles;
    private javax.swing.JTextField numCirclesText;
    private javax.swing.JList pointscircle;
    private javax.swing.JList pointscircle1;
    private javax.swing.JTextField radiusText;
    private javax.swing.JButton ransac;
    private javax.swing.JLabel smallannulus;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel y;
    private javax.swing.JLabel y1;
    // End of variables declaration//GEN-END:variables
}
