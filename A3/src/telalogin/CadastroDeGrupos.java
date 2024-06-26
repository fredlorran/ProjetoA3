/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telalogin;


import crud.CrudDados;
import dados.Dados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fred
 */
public class CadastroDeGrupos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeGrupos
     */
    public CadastroDeGrupos() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1Membros = new javax.swing.JTextField();
        jComboBox1Modalidade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Horario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Local = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Grupos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menbros");

        jLabel2.setText("Modalidade");

        jComboBox1Modalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futebol", "Volei", "Basquete", "Handebol" }));

        jLabel3.setText("Data");

        jLabel4.setText("Horario");

        jLabel5.setText("Local");

        jTable1Grupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEMBROS", "MODALIDADE", "DATA", "HORÁRIO", "LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1Grupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1GruposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Grupos);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Autalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Data, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)
                                        .addGap(54, 54, 54)))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1Local, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1Membros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1Modalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Membros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1Modalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Criando uma instância de Dados e preenchendo seus atributos
Dados dados = new Dados();
dados.setMembros(jTextField1Membros.getText());
dados.setModalidade((String) jComboBox1Modalidade.getSelectedItem());
dados.setData(Integer.parseInt(jTextField1Data.getText()));
dados.setHorario(Integer.parseInt(jTextField1Horario.getText()));
dados.setLocal(jTextField1Local.getText());

// Criando uma instância de CrudDados
CrudDados cruddados = new CrudDados();

// Chamando o método criarDados() da classe CrudDados para salvar os dados
cruddados.criarDados(dados);


    
     
    // TODO add your handling code here:
//        DefaultTableModel dtmGrupos = (DefaultTableModel) jTable1Grupos.getModel();
//        Object[] dados = {jTextField1Membros.getText(), jComboBox1Modalidade.getSelectedItem(), jTextField1Data.getText(), jTextField1Horario.getText(), jTextField1Local.getText()};
//        dtmGrupos.addRow(dados);
//
//

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        if (jTable1Grupos.getSelectedRow() != -1) {

            DefaultTableModel dtmGrupos = (DefaultTableModel) jTable1Grupos.getModel();
            dtmGrupos.removeRow(jTable1Grupos.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }

    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int selectedRow = jTable1Grupos.getSelectedRow(); // Armazene a linha selecionada

if (selectedRow != -1) {
    // Verifique se os campos de texto e o combo box não estão nulos ou vazios antes de definir na tabela
    if (jTable1Grupos.getValueAt(selectedRow, 0) != null) {
        jTextField1Membros.setText(jTable1Grupos.getValueAt(selectedRow, 0).toString());
    }

    String membros = jTextField1Membros.getText();
    if (membros != null && !membros.isEmpty()) {
        jTable1Grupos.setValueAt(membros, selectedRow, 0);
    }

    Object selectedItem = jComboBox1Modalidade.getSelectedItem();
    if (selectedItem != null) {
        jTable1Grupos.setValueAt(selectedItem.toString(), selectedRow, 1);
    }

    String data = jTextField1Data.getText();
    if (data != null && !data.isEmpty()) {
        jTable1Grupos.setValueAt(data, selectedRow, 2); // Supondo que a coluna para data seja a coluna 2
    }

    String horario = jTextField1Horario.getText();
    if (horario != null && !horario.isEmpty()) {
        jTable1Grupos.setValueAt(horario, selectedRow, 3); // Supondo que a coluna para horário seja a coluna 3
    }

    String local = jTextField1Local.getText();
    if (local != null && !local.isEmpty()) {
        jTable1Grupos.setValueAt(local, selectedRow, 4); // Supondo que a coluna para local seja a coluna 4
    }
} else {
    System.out.println("Nenhuma linha selecionada no JTable.");
}

        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1GruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1GruposMouseClicked
if (jTable1Grupos.getSelectedRow() != -1) {
    jTextField1Membros.setText(jTable1Grupos.getValueAt(jTable1Grupos.getSelectedRow(), 0).toString());
    
    
    jComboBox1Modalidade.setSelectedItem(jTable1Grupos.getValueAt(jTable1Grupos.getSelectedRow(), 1).toString());
    jTextField1Data.setText(jTable1Grupos.getValueAt(jTable1Grupos.getSelectedRow(), 2).toString());
    jTextField1Horario.setText(jTable1Grupos.getValueAt(jTable1Grupos.getSelectedRow(), 3).toString());
    jTextField1Local.setText(jTable1Grupos.getValueAt(jTable1Grupos.getSelectedRow(), 4).toString());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1GruposMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1Modalidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Grupos;
    private javax.swing.JTextField jTextField1Data;
    private javax.swing.JTextField jTextField1Horario;
    private javax.swing.JTextField jTextField1Local;
    private javax.swing.JTextField jTextField1Membros;
    // End of variables declaration//GEN-END:variables
}
