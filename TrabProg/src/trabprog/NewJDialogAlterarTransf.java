/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package trabprog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Costa
 */
public class NewJDialogAlterarTransf extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialogAlterarTransf
     */
    public NewJDialogAlterarTransf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherComboBoxInfos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodTransf = new javax.swing.JTextField();
        jComboBoxTransf = new javax.swing.JComboBox<>();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Digite o código da transferência e selecione a informação que deseja alterar:");

        jComboBoxTransf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabprog/bola.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButtonVoltar)
                        .addGap(124, 124, 124)
                        .addComponent(jButtonSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTransf, 0, 110, Short.MAX_VALUE)
                            .addComponent(jTextFieldCodTransf))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jTextFieldCodTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jComboBoxTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonVoltar))
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        // TODO add your handling code here:
        alterarInformacaoTransf();
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed
private void preencherComboBoxInfos() {
        jComboBoxTransf.removeAllItems();
        jComboBoxTransf.addItem("Selecionar");
        jComboBoxTransf.addItem("Data");
        jComboBoxTransf.addItem("Valor Transfência");
        jComboBoxTransf.addItem("Status");
        jComboBoxTransf.addItem("Código do Jogador");
        jComboBoxTransf.addItem("Time Atual");
        jComboBoxTransf.addItem("Time Negociando");
    }

    private void alterarInformacaoTransf() {
        // Obtém o código do jogador do campo de texto
        String codigoTransferencia = jTextFieldCodTransf.getText().trim();

        // Valida se o código foi inserido
        if (codigoTransferencia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira o código da transfência antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtém o campo selecionado no ComboBox
        String campoSelecionado = (String) jComboBoxTransf.getSelectedItem();

        // Solicitar o novo valor diretamente
        String novoValor = JOptionPane.showInputDialog(this, "Digite a alteração para " + campoSelecionado + ":");
        if (novoValor == null || novoValor.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum valor foi inserido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Mapeamento do campo selecionado para o nome do campo no banco de dados
        String campoBanco;
        switch (campoSelecionado) {
            case "Data":
                campoBanco = "Data_Transf";
                break;
            case "Valor da Transfência":
                campoBanco = "Valor_Transf";
                break;
            case "Status":
                campoBanco = "Status_Jog";
                break;
            case "Código do Jogador":
                campoBanco = "Cod_Jogador";
                break;
            case "Time Atual":
                campoBanco = "Cod_TimeA";
                break;
            case "Time Negociando":
                campoBanco = "Cod_TimeN";
                break;
            default:
                JOptionPane.showMessageDialog(this, "Campo inválido selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }

        // Confirmação antes de alterar
        Object[] options = {"SIM", "NÃO"};
        int confirmacao = JOptionPane.showOptionDialog(
                this,
                "Deseja realmente alterar o campo '" + campoSelecionado + "' para: " + novoValor + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Realizar a alteração no banco de dados
        try (Connection conn = ConexaoBD.getConnection()) {
            String sql = "UPDATE Transferencia SET " + campoBanco + " = ? WHERE Cod_Transf = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, novoValor);
                stmt.setString(2, codigoTransferencia);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Informação alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose(); // Fecha o diálogo após sucesso
                } else {
                    JOptionPane.showMessageDialog(this, "Transfêrencia não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar informação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(NewJDialogAlterarTransf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialogAlterarTransf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialogAlterarTransf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialogAlterarTransf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialogAlterarTransf dialog = new NewJDialogAlterarTransf(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxTransf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldCodTransf;
    // End of variables declaration//GEN-END:variables
}
