/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceapplicationexercise01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3025667
 */
public class ListarRegistros extends javax.swing.JFrame {

    /**
     * Creates new form ListRegisters
     */
    public static ArrayList<Cadastro> db = new ArrayList<Cadastro>();
    public int count = 0;
    public boolean isEditing = false;

    public ListarRegistros(ArrayList<Cadastro> db) {
        initComponents();
        this.db = db;
        changeFormItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        clearForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputDocument = new javax.swing.JTextField();
        inputDate = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        inputNumber = new javax.swing.JTextField();
        inputCity = new javax.swing.JTextField();
        inputState = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        actualPage = new javax.swing.JLabel();
        jDelete = new javax.swing.JButton();
        jTotal = new javax.swing.JLabel();
        jRegister = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clearForm.setText("Limpar");
        clearForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFormMouseClicked(evt);
            }
        });
        clearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Documento:");

        jLabel3.setText("Nascimento:");

        jLabel4.setText("Endere??o:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Estado:");

        inputName.setEditable(false);
        inputName.setText("Nome...");
        inputName.setToolTipText("");
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputDocument.setEditable(false);
        inputDocument.setText("Documento...");
        inputDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDocumentActionPerformed(evt);
            }
        });

        inputDate.setEditable(false);
        inputDate.setText("Data de nascimento...");
        inputDate.setToolTipText("");

        inputAddress.setEditable(false);
        inputAddress.setText("Endere??o...");
        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });

        inputNumber.setEditable(false);
        inputNumber.setText("Numero...");
        inputNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumberActionPerformed(evt);
            }
        });

        inputCity.setEditable(false);
        inputCity.setText("Cidade...");
        inputCity.setToolTipText("");

        inputState.setEditable(false);
        inputState.setText("Estado...");
        inputState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStateActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        next.setText("Proximo");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        actualPage.setToolTipText("");
        actualPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jDelete.setText("Excluir");
        jDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeleteMouseClicked(evt);
            }
        });

        jRegister.setText("Cadastrar");
        jRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterMouseClicked(evt);
            }
        });
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        editButton.setText("Editar");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearForm)
                        .addGap(18, 18, 18)
                        .addComponent(jRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton)
                        .addGap(56, 56, 56)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actualPage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(next)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDelete))
                            .addComponent(inputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputState, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputName)
                            .addComponent(inputDocument)
                            .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCity, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(280, 280, 280))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRegister)
                        .addComponent(editButton))
                    .addComponent(jTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(actualPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(next)
                        .addComponent(jDelete)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearFormActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
        if (db.size() > 0) {
            this.inputName.setText(db.get(count).getNome());
        }
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAddressActionPerformed

    private void inputNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumberActionPerformed

    private void clearFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFormMouseClicked
        // TODO add your handling code here:
//        this.count = 0;
//        changeFormItems();

        this.inputName.setText("");
        this.inputDocument.setText("");
        this.inputDate.setText("");
        this.inputAddress.setText("");
        this.inputNumber.setText("");
        this.inputCity.setText("");
        this.inputState.setText("");
        this.actualPage.setText("");
        this.jTotal.setText(String.valueOf("Total: " + db.size()));

        enableFormToEdit();
    }//GEN-LAST:event_clearFormMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
        if ((count + 1) < db.size()) {
            this.count++;
        } else {
            this.count = 0;
        }

        changeFormItems();
    }//GEN-LAST:event_nextMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if ((count - 1) < 0) {
            this.count = db.size() - 1;
        } else {
            this.count--;
        }

        changeFormItems();
    }//GEN-LAST:event_jButton2MouseClicked

    private void inputStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStateActionPerformed

    private void jDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeleteMouseClicked
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclus??o de \n" + this.db.get(count).getNome(), "Exclus??o de Registro", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            this.db.remove(count);
            changeFormItems();
        }
        try {
            escrever_arquivo();
        } catch (IOException e) {
        }
    }//GEN-LAST:event_jDeleteMouseClicked

    private void jRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterMouseClicked
        // TODO add your handling code here:
        Cadastro cd = new Cadastro(this.inputName.getText(),
                this.inputDocument.getText(),
                this.inputDate.getText(),
                this.inputAddress.getText(),
                this.inputNumber.getText(),
                this.inputCity.getText(),
                this.inputState.getText());
        this.db.add(cd);

        try {
            this.escrever_arquivo();
            changeFormItems();
        } catch (IOException ex) {
            Logger.getLogger(ListarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRegisterMouseClicked

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegisterActionPerformed

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        // TODO add your handling code here:
        this.isEditing = !this.isEditing;
        this.editButton.setText(this.isEditing ? "Salvar" : "Editar");
        this.changeFormToEdit(this.isEditing);

        if (!this.isEditing) {
            this.updateRegister();
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void inputDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDocumentActionPerformed

    private void updateRegister() {
        this.db.get(count).setCidade(this.inputCity.getText());
        this.db.get(count).setCpf(this.inputDocument.getText());
        this.db.get(count).setData_nasc(this.inputDate.getText());
        this.db.get(count).setEndereco(this.inputAddress.getText());
        this.db.get(count).setEstado(this.inputState.getText());
        this.db.get(count).setNome(this.inputName.getText());
        this.db.get(count).setNumero(this.inputNumber.getText());

        try {
            this.escrever_arquivo();
        } catch (IOException ex) {
            Logger.getLogger(ListarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void changeFormItems() {
        // TODO add your handling code here:
        this.inputName.setText(db.get(count).getNome());
        this.inputDocument.setText(db.get(count).getCpf());
        this.inputDate.setText(db.get(count).getData_nasc());
        this.inputAddress.setText(db.get(count).getEndereco());
        this.inputNumber.setText(db.get(count).getNumero());
        this.inputCity.setText(db.get(count).getCidade());
        this.inputState.setText(db.get(count).getEstado());
        this.actualPage.setText(String.valueOf(count + 1));
        this.jTotal.setText(String.valueOf("Total: " + db.size()));
    }

    private void changeFormToEdit(boolean enabled) {
        this.inputName.setEditable(enabled);
        this.inputName.setEditable(enabled);
        this.inputDocument.setEditable(enabled);
        this.inputDate.setEditable(enabled);
        this.inputAddress.setEditable(enabled);
        this.inputNumber.setEditable(enabled);
        this.inputCity.setEditable(enabled);
        this.inputState.setEditable(enabled);
    }

    private void enableFormToEdit() {
        this.inputName.setEditable(rootPaneCheckingEnabled);
        this.inputName.setEditable(rootPaneCheckingEnabled);
        this.inputDocument.setEditable(rootPaneCheckingEnabled);
        this.inputDate.setEditable(rootPaneCheckingEnabled);
        this.inputAddress.setEditable(rootPaneCheckingEnabled);
        this.inputNumber.setEditable(rootPaneCheckingEnabled);
        this.inputCity.setEditable(rootPaneCheckingEnabled);
        this.inputState.setEditable(rootPaneCheckingEnabled);
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
            java.util.logging.Logger.getLogger(ListarRegistros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarRegistros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarRegistros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarRegistros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarRegistros(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualPage;
    private javax.swing.JButton clearForm;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputCity;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputDocument;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputNumber;
    private javax.swing.JTextField inputState;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jDelete;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jRegister;
    private javax.swing.JLabel jTotal;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
public void escrever_arquivo() throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("dados_novos.csv", StandardCharsets.ISO_8859_1, false));

        for (int i = 0; i < db.size(); i++) {
            buffWrite.append(db.get(i).toString() + "\n");
        }

        buffWrite.close();
    }
}
