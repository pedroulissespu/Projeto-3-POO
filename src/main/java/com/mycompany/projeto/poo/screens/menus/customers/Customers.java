/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.poo.screens.menus.customers;

import java.io.File;
import javax.swing.JOptionPane;

import com.mycompany.projeto.poo.customers.Add;
import com.mycompany.projeto.poo.customers.Edit;
import com.mycompany.projeto.poo.customers.List;
import com.mycompany.projeto.poo.customers.Show;
import com.mycompany.projeto.poo.customers.Remove;
import com.mycompany.projeto.poo.manipulacao.Manipulacao;

/**
 *
 * @author pedroupcm
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form MenuClientes
     */
    public Customers() {
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

        botaoAdicionaCliente = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoRemoveCliente = new javax.swing.JButton();
        listarClientes = new javax.swing.JButton();
        procurarCliente = new javax.swing.JButton();
        editarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAdicionaCliente.setText("Adicionar Cliente");
        botaoAdicionaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionaClienteActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoRemoveCliente.setText("Remover Cliente");
        botaoRemoveCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoveClienteActionPerformed(evt);
            }
        });

        listarClientes.setText("Listar Clientes");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
            }
        });

        procurarCliente.setText("Procurar Cliente");
        procurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarClienteActionPerformed(evt);
            }
        });

        editarCliente.setText("Editar Dados do Cliente");
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSair)
                                .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(botaoAdicionaCliente)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(listarClientes)))
                                                .addGap(48, 48, 48)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(procurarCliente)
                                                        .addComponent(botaoRemoveCliente)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(editarCliente)))
                                .addContainerGap(37, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoAdicionaCliente)
                                        .addComponent(botaoRemoveCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(listarClientes)
                                        .addComponent(procurarCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSair)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void botaoAdicionaClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAdicionaClienteActionPerformed
        Add adicionaCliente = new Add();
        adicionaCliente.setVisible(true);
        adicionaCliente.setTitle("Adicionar Cliente");
        adicionaCliente.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoAdicionaClienteActionPerformed

    private void botaoRemoveClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoRemoveClienteActionPerformed
        File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
        if (clientes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 cliente pra usar tal operação!");
        } else {
            Remove removeCliente = new Remove();
            removeCliente.setVisible(true);
            removeCliente.setTitle("Remover Cliente");
            removeCliente.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_botaoRemoveClienteActionPerformed

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listarClientesActionPerformed
        File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
        if (clientes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 cliente pra usar tal operação!");
        } else {
            List listarCliente = new List();
            listarCliente.setVisible(true);
            listarCliente.setTitle("Lista de Todos os Clientes");
            listarCliente.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_listarClientesActionPerformed

    private void procurarClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_procurarClienteActionPerformed
        File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
        if (clientes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 cliente pra usar tal operação!");
        } else {
            Show mostrarCliente = new Show();
            mostrarCliente.setVisible(true);
            mostrarCliente.setTitle("Pesquisa de Cliente");
            mostrarCliente.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_procurarClienteActionPerformed

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarClienteActionPerformed
        File clientes = new File(Manipulacao.DB_CLIENTES + "clientes.txt");
        if (clientes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 cliente pra usar tal operação!");
        } else {
            Edit editaCliente = new Edit();
            editaCliente.setVisible(true);
            editaCliente.setTitle("Editar Dados do Cliente");
            editaCliente.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_editarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public void menuclientes(String args[]) {
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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionaCliente;
    private javax.swing.JButton botaoRemoveCliente;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton editarCliente;
    private javax.swing.JButton listarClientes;
    private javax.swing.JButton procurarCliente;
    // End of variables declaration//GEN-END:variables
}