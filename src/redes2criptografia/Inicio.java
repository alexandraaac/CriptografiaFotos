/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes2criptografia;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ximen
 */
public class Inicio extends javax.swing.JFrame {

    boolean flagCifraCesar = true;
    boolean flagCifraXOR = true;
    boolean flagSDES = true;
    BufferedImage bufferImagem;
    BufferedImage aux;

    Raster rasterImagem;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(700, 550);
        jPanel1.setSize(700, 550);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        btnCifraDeCesar = new javax.swing.JButton();
        btnCifraXOR = new javax.swing.JButton();
        btnSDes = new javax.swing.JButton();
        btnCarregarArquivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        lblImagem.setBackground(new java.awt.Color(255, 0, 51));
        lblImagem.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane1.setViewportView(jPanel2);

        btnCifraDeCesar.setText("Cifra de Cesar");
        btnCifraDeCesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifraDeCesarActionPerformed(evt);
            }
        });

        btnCifraXOR.setText("Cifra XOR");
        btnCifraXOR.setActionCommand("");
        btnCifraXOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifraXORActionPerformed(evt);
            }
        });

        btnSDes.setText("S-DES");
        btnSDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDesActionPerformed(evt);
            }
        });

        btnCarregarArquivo.setText("Carregar Arquivo");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                        .addComponent(btnCarregarArquivo)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCifraDeCesar)
                        .addGap(116, 116, 116)
                        .addComponent(btnCifraXOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(btnSDes)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnCarregarArquivo)
                .addGap(355, 355, 355)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCifraDeCesar)
                    .addComponent(btnCifraXOR)
                    .addComponent(btnSDes))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
        Random gerador = new Random();
        int randomico = gerador.nextInt(255)+1;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Importar imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            ImageIcon iconImagem = new ImageIcon(fileChooser.getSelectedFile().getPath());
            File fileImagem = new File(fileChooser.getSelectedFile().getPath());
            Color color;
            int testeCor;
            lblImagem.setIcon(iconImagem);
            try {
                bufferImagem = ImageIO.read(fileImagem);
                for (int i = 0; i < bufferImagem.getWidth(); i++) {
                    for (int j = 0; j < bufferImagem.getHeight(); j++) {
                        color = new Color(bufferImagem.getRGB(i, j));
                        testeCor = bufferImagem.getRGB(i, j);
                       /* int r1 = (int) ((testeCor & 0x00FF0000) >>> 16); //R
                        int g1 = (int) ((testeCor & 0x0000FF00) >>> 8);  //G
                        int b1 = (int) (testeCor & 0x000000FF);
                        int r = (int) ((testeCor & 0x00FF0000) >>> 16)+randomico; //R
                        int g = (int) ((testeCor & 0x0000FF00) >>> 8)+randomico;  //G
                        int b = (int) (testeCor & 0x000000FF)+randomico;       //B
                        //System.out.println(color);
                       */
                        bufferImagem.setRGB(i, j, testeCor+randomico);
                        
                        
                       /* System.out.print(testeCor);
                        System.out.printf("\nRed: %d", r1);
                        System.out.printf("\nGreen: %d", g1);
                        System.out.printf("\nBlue: %d",b1);
             
                        System.out.printf("\nRed: %d", r);
                        System.out.printf("\nGreen: %d", g);
                        System.out.printf("\nBlue: %d",b);
                       // System.out.printf("\n%x\n", testeCor);*/
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
           // System.out.println(bufferImagem);
            try {
                ImageIO.write(bufferImagem, "PNG", new File ("teste.png"));
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed

    private void btnCifraXORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifraXORActionPerformed
        if (flagCifraXOR) {
            //Criptografar 
            btnCifraDeCesar.setEnabled(false);
            btnSDes.setEnabled(false);
            flagCifraXOR = false;
        } else {
            //Desincriptografar
            btnCifraDeCesar.setEnabled(true);
            btnSDes.setEnabled(true);
            flagCifraXOR = true;
        }
    }//GEN-LAST:event_btnCifraXORActionPerformed

    private void btnCifraDeCesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifraDeCesarActionPerformed
        if (flagCifraCesar) {
            //Criptografar
            btnCifraXOR.setEnabled(false);
            btnSDes.setEnabled(false);
            flagCifraCesar = false;
        } else {
            //Desincriptografar
            btnCifraXOR.setEnabled(true);
            btnSDes.setEnabled(true);
            flagCifraCesar = true;
        }
    }//GEN-LAST:event_btnCifraDeCesarActionPerformed
    private void btnSDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDesActionPerformed
        if (flagSDES) {
            //Criptografar 
            btnCifraDeCesar.setEnabled(false);
            btnCifraXOR.setEnabled(false);
            flagSDES = false;
        } else {
            //Desincriptografar
            btnCifraDeCesar.setEnabled(true);
            btnCifraXOR.setEnabled(true);
            flagSDES = true;
        }
    }//GEN-LAST:event_btnSDesActionPerformed
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
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnCifraDeCesar;
    private javax.swing.JButton btnCifraXOR;
    private javax.swing.JButton btnSDes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
