/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author pedroupcm
 */
public class AdicionarCliente extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarCliente
     */
    public AdicionarCliente() {
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

        botaoSair = new javax.swing.JButton();
        textoNome = new javax.swing.JLabel();
        textoCPF = new javax.swing.JLabel();
        textoIdade = new javax.swing.JLabel();
        inserirNome = new javax.swing.JTextField();
        inserirCPF = new javax.swing.JTextField();
        inserirIdade = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        textoNome.setText("Nome :");

        textoCPF.setText("CPF :");

        textoIdade.setText("Idade :");

        inserirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNomeActionPerformed(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(botaoSair))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textoCPF)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(inserirCPF,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 403,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textoNome)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(inserirNome))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textoIdade)
                                                                .addGap(13, 13, 13)
                                                                .addComponent(inserirIdade,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 403,
                                                                        Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoAdicionar)
                                .addGap(192, 192, 192)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoNome)
                                        .addComponent(inserirNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoCPF)
                                        .addComponent(inserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textoIdade)
                                        .addComponent(inserirIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(botaoAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105,
                                        Short.MAX_VALUE)
                                .addComponent(botaoSair)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void inserirNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inserirNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inserirNomeActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAdicionarActionPerformed
        if (inserirNome.getText().equals("") || inserirCPF.getText().equals("") || inserirIdade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos !");
        } else {
            String nome = inserirNome.getText();
            String cpf = inserirCPF.getText();
            String idade = inserirIdade.getText();
            String salvaDados = nome + "\t" + cpf + "\t" + idade + "\n";
            File cliente = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
            Manipulacao.escreverArquivo(cliente, salvaDados);
            JOptionPane.showMessageDialog(rootPane, "Cliente " + nome + " Registrado com sucesso !");
            dispose();
        }
    }// GEN-LAST:event_botaoAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void adicionarcliente(String args[]) {
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
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField inserirCPF;
    private javax.swing.JTextField inserirIdade;
    private javax.swing.JTextField inserirNome;
    private javax.swing.JLabel textoCPF;
    private javax.swing.JLabel textoIdade;
    private javax.swing.JLabel textoNome;
    // End of variables declaration//GEN-END:variables
}
