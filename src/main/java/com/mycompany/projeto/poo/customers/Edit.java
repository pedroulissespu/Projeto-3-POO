/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.poo.customers;

import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mycompany.projeto.poo.manipulacao.Manipulacao;

/**
 *
 * @author pedroupcm
 */
public class Edit extends javax.swing.JFrame {

    /**
     * Creates new form EditarClientes
     */
    public Edit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoNome = new javax.swing.JLabel();
        inserirNome = new javax.swing.JTextField();
        textoCPF = new javax.swing.JLabel();
        inserirCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cliente = new javax.swing.JTable();
        textoNovoNome = new javax.swing.JLabel();
        textoNovoCPF = new javax.swing.JLabel();
        textoNovaIdade = new javax.swing.JLabel();
        inserirNovoNome = new javax.swing.JTextField();
        inserirNovoCPF = new javax.swing.JTextField();
        inserirNovaIdade = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoNome.setText("Nome :");

        textoCPF.setText("CPF :");

        cliente.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Nome", "CPF", "Idade"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(cliente);

        textoNovoNome.setText("Novo nome :");

        textoNovoCPF.setText("Novo CPF :");

        textoNovaIdade.setText("Nova idade :");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
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
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(botaoPesquisar))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(textoNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textoCPF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(textoNovoCPF)
                                                                        .addComponent(textoNovaIdade))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(inserirNovoCPF)
                                                                        .addComponent(inserirNovaIdade)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textoNovoNome)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(inserirNovoNome,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 244,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(botaoEnviar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoSair)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoNome)
                                        .addComponent(inserirNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoCPF)
                                        .addComponent(inserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(botaoPesquisar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoNovoNome)
                                        .addComponent(inserirNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoNovoCPF)
                                        .addComponent(inserirNovoCPF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoNovaIdade)
                                        .addComponent(inserirNovaIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoSair)
                                        .addComponent(botaoEnviar))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoPesquisarActionPerformed
        String nome = inserirNome.getText();
        String cpf = inserirCPF.getText();
        String pesquisa = nome + "\t" + cpf + "\t";
        String preencher = "";
        File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
        String[] lines = Manipulacao.lerArquivo(clientes).split("\n");

        for (String line : lines) {
            String aux = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t";
            if (aux.equals(pesquisa)) {
                preencher = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
                break;
            }
        }

        DefaultTableModel modelo = (DefaultTableModel) cliente.getModel();
        if (modelo.getRowCount() > 0) {
            modelo.setRowCount(0);
        }

        Object[] obj = preencher.split("\t");
        modelo.addRow(obj);
    }// GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoEnviarActionPerformed
        if ((!inserirNovoCPF.getText().matches("") && !inserirNovoCPF.getText().matches("^\\d+$") ||
                !inserirNovaIdade.getText().matches("") && !inserirNovaIdade.getText().matches("^\\d+$"))) {
            JOptionPane.showMessageDialog(rootPane, "Digite valores validos para o CPF e a idade !");
        } else {
            String nome = inserirNome.getText();
            String cpf = inserirCPF.getText();
            String idade = "";
            String dadosAntigos = nome + "\t" + cpf + "\t";

            File temp = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
            String[] lines = Manipulacao.lerArquivo(temp).split("\n");

            for (String line : lines) {
                String aux = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t";
                if (aux.equals(dadosAntigos)) {
                    idade = line.split("\t")[2] + "\n";
                    break;
                }
            }

            String novoNome = inserirNovoNome.getText();
            if (inserirNovoNome.getText().equals(""))
                novoNome = nome;
            String novoCPF = inserirNovoCPF.getText();
            if (inserirNovoCPF.getText().equals(""))
                novoCPF = cpf;
            String novaIdade = inserirNovaIdade.getText();
            if (inserirNovaIdade.getText().equals(""))
                novaIdade = idade;
            String dadosNovos = novoNome + "\t" + novoCPF + "\t" + novaIdade + "\n";

            File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
            try {
                Manipulacao.alterarDadosArquivo(clientes, dadosAntigos, dadosNovos);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro");
            }

            JOptionPane.showMessageDialog(rootPane, "Dados do cliente " + novoNome + " Alterados com sucesso !");
            dispose();
        }
    }// GEN-LAST:event_botaoEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void adicionarclientes(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTable cliente;
    private javax.swing.JTextField inserirCPF;
    private javax.swing.JTextField inserirNome;
    private javax.swing.JTextField inserirNovaIdade;
    private javax.swing.JTextField inserirNovoCPF;
    private javax.swing.JTextField inserirNovoNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textoCPF;
    private javax.swing.JLabel textoNome;
    private javax.swing.JLabel textoNovaIdade;
    private javax.swing.JLabel textoNovoCPF;
    private javax.swing.JLabel textoNovoNome;
    // End of variables declaration//GEN-END:variables
}
