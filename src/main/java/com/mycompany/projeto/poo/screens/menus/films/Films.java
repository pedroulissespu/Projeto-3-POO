/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.poo.screens.menus.films;

import java.io.File;
import javax.swing.JOptionPane;

import com.mycompany.projeto.poo.films.Add;
import com.mycompany.projeto.poo.films.Edit;
import com.mycompany.projeto.poo.films.List;
import com.mycompany.projeto.poo.films.Show;
import com.mycompany.projeto.poo.films.Remove;
import com.mycompany.projeto.poo.manipulacao.Manipulacao;

/**
 *
 * @author pedroupcm
 */
public class Films extends javax.swing.JFrame {

    /**
     * Creates new form MenuFilmes
     */
    public Films() {
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

        botaoAdicionarFilme = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        listarFilmes = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAdicionarFilme.setText("Adicionar Filme");
        botaoAdicionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarFilmeActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        listarFilmes.setText("Listar Filmes");
        listarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFilmesActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover Filme");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoProcurar.setText("Procurar Filme");
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar Dados de Filme");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
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
                                                .addContainerGap()
                                                .addComponent(botaoAdicionarFilme)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(listarFilmes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botaoRemover)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botaoProcurar)
                                                .addGap(0, 2, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(botaoAlterar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoAdicionarFilme)
                                        .addComponent(listarFilmes)
                                        .addComponent(botaoRemover)
                                        .addComponent(botaoProcurar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109,
                                        Short.MAX_VALUE)
                                .addComponent(botaoSair)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void botaoAdicionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAdicionarFilmeActionPerformed
        Add adicionarFilme = new Add();
        adicionarFilme.setVisible(true);
        adicionarFilme.setTitle("Adicionar Filme");
        adicionarFilme.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoAdicionarFilmeActionPerformed

    private void listarFilmesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listarFilmesActionPerformed
        File filmes = new File(Manipulacao.DB_FILMES + "filmes.txt");
        if (filmes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 filme pra usar tal operação!");
        } else {
            List listarFilme = new List();
            listarFilme.setVisible(true);
            listarFilme.setTitle("Listar Todos os Filmes");
            listarFilme.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_listarFilmesActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoRemoverActionPerformed
        File filmes = new File(Manipulacao.DB_FILMES + "filmes.txt");
        if (filmes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 filme pra usar tal operação!");
        } else {
            Remove removeFilme = new Remove();
            removeFilme.setVisible(true);
            removeFilme.setTitle("Remover Filme");
            removeFilme.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoProcurarActionPerformed
        File filmes = new File(Manipulacao.DB_FILMES + "filmes.txt");
        if (filmes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 filme pra usar tal operação!");
        } else {
            Show mostraFilme = new Show();
            mostraFilme.setVisible(true);
            mostraFilme.setTitle("Pesquisar Por Filme");
            mostraFilme.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAlterarActionPerformed
        File filmes = new File(Manipulacao.DB_FILMES + "filmes.txt");
        if (filmes.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Adicione primeiro pelo menos 1 filme pra usar tal operação!");
        } else {
            Edit editaFilme = new Edit();
            editaFilme.setVisible(true);
            editaFilme.setTitle("Alterar Dados do Filme");
            editaFilme.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_botaoAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void menufilmes(String args[]) {
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
            java.util.logging.Logger.getLogger(Films.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Films.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Films.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Films.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Films().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarFilme;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton listarFilmes;
    // End of variables declaration//GEN-END:variables
}
