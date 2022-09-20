/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package imageeditor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author cg080111
 */
public class TelaImageEditor extends javax.swing.JFrame {

    /**
     * Creates new form TelaImageEditor
     */
    public TelaImageEditor() {
        initComponents();
        ImageIcon icon = new ImageIcon("dog.jpg");
        jLabel1.setIcon(icon);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        getEdge = new javax.swing.JButton();
        invertGray = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 460));
        setMinimumSize(new java.awt.Dimension(1020, 460));
        setPreferredSize(new java.awt.Dimension(1020, 460));

        jPanel1.setMaximumSize(new java.awt.Dimension(479, 359));
        jPanel1.setMinimumSize(new java.awt.Dimension(479, 359));
        jPanel1.setPreferredSize(new java.awt.Dimension(479, 359));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 445, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 345, Short.MAX_VALUE))
        );

        jButton1.setText("Duplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(479, 359));
        jPanel2.setMinimumSize(new java.awt.Dimension(479, 359));
        jPanel2.setPreferredSize(new java.awt.Dimension(479, 359));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 445, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 345, Short.MAX_VALUE))
        );

        jButton2.setText("Tons de Cinza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Binarização");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("127");
        jTextField1.setMaximumSize(new java.awt.Dimension(25, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(25, 20));

        jSlider1.setMaximum(255);
        jSlider1.setValue(127);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                movimentoSlider(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AtualizarBinarizacao(evt);
            }
        });

        getEdge.setText("Encontrar bordas");
        getEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEdgeActionPerformed(evt);
            }
        });

        invertGray.setText("Tons de cinza invertido");
        invertGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertGrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getEdge)
                        .addGap(18, 18, 18)
                        .addComponent(invertGray)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(68, 68, 68)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(getEdge)
                        .addComponent(invertGray))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");
        jLabel2.setIcon(icon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        ImageIcon icon = new ImageIcon("dog.jpg");
        jLabel2.setIcon(this.grayColor());
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 0;
                } else {
                    media = 255;
                }

                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void movimentoSlider(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_movimentoSlider
        this.jTextField1.setText(String.valueOf(this.jSlider1.getValue()));
        /* ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
       // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;
                
                if(media < Integer.parseInt(this.jTextField1.getText()))
                    media = 0;
                else
                    media = 255;
                             
                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());
                
            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);*/
    }//GEN-LAST:event_movimentoSlider

    private void AtualizarBinarizacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizarBinarizacao
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 0;
                } else {
                    media = 255;
                }

                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_AtualizarBinarizacao

    private void getEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEdgeActionPerformed
        // TODO add your handling code here:
        String filename = "dog.jpg";

        File file = new File(filename);
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(TelaImageEditor.class.getName()).log(Level.SEVERE, null, ex);
        }

        int x = image.getWidth();
        int y = image.getHeight();

        int[][] edgeColors = new int[x][y];
        int maxGradient = -1;

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                int val01 = getGrayScale(image.getRGB(i - 1, j));
                int val02 = getGrayScale(image.getRGB(i - 1, j + 1));

                int val10 = getGrayScale(image.getRGB(i, j - 1));
                int val11 = getGrayScale(image.getRGB(i, j));
                int val12 = getGrayScale(image.getRGB(i, j + 1));

                int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                int val21 = getGrayScale(image.getRGB(i + 1, j));
                int val22 = getGrayScale(image.getRGB(i + 1, j + 1));

                int gx = ((-1 * val00) + (0 * val01) + (1 * val02))
                        + ((-2 * val10) + (0 * val11) + (2 * val12))
                        + ((-1 * val20) + (0 * val21) + (1 * val22));

                int gy = ((-1 * val00) + (-2 * val01) + (-1 * val02))
                        + ((0 * val10) + (0 * val11) + (0 * val12))
                        + ((1 * val20) + (2 * val21) + (1 * val22));

                double gval = Math.sqrt((gx * gx) + (gy * gy));
                int g = (int) gval;

                if (maxGradient < g) {
                    maxGradient = g;
                }

                edgeColors[i][j] = g;
            }
        }
        System.out.println("maxxx "+ maxGradient);
        double scale = 255.0 / maxGradient;

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int edgeColor = edgeColors[i][j];
                edgeColor = (int) (edgeColor * scale);
                edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;

                image.setRGB(i, j, edgeColor);
            }
        }

        jLabel2.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_getEdgeActionPerformed

    private void invertGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertGrayActionPerformed
        // TODO add your handling code here:
//        this.grayColor();
        ImageIcon icon = this.grayColor();

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() / 2 + mycolor.getGreen() + mycolor.getBlue()) / 3;

                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 0;
                } else {
                    media = 255;
                }

                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_invertGrayActionPerformed

    private ImageIcon grayColor() {
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);

        return icon2;
    }

    public static int getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;

        //from https://en.wikipedia.org/wiki/Grayscale, calculating luminance
        int gray = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);
        //int gray = (r + g + b) / 3;

        return gray;
    }

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
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImageEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getEdge;
    private javax.swing.JButton invertGray;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
