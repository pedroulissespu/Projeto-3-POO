package com.mycompany.projeto.poo;

import java.io.File;
import javax.swing.JOptionPane;

import com.mycompany.projeto.poo.films.Rent;
import com.mycompany.projeto.poo.films.Devolution;
import com.mycompany.projeto.poo.manipulacao.Manipulacao;
import com.mycompany.projeto.poo.screens.menus.customers.Customers;
import com.mycompany.projeto.poo.screens.menus.films.Films;
import com.mycompany.projeto.poo.screens.menus.report.Report;
import com.mycompany.projeto.poo.screens.menus.suggestion.Suggestion;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        Manipulacao.criarBD();
        setLocationRelativeTo(null);
        setTitle("Menu Principal");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoClientes = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoFilmes = new javax.swing.JButton();
        textoVersao = new javax.swing.JLabel();
        botaoAlugar = new javax.swing.JButton();
        botaoDevolucao = new javax.swing.JButton();
        botaoRelatorio = new javax.swing.JButton();
        botaoSugestoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoClientes.setText("Área Cliente");
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoFilmes.setText("Área Filmes");
        botaoFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFilmesActionPerformed(evt);
            }
        });

        textoVersao.setText("SeeYou v8.5");

        botaoAlugar.setText("Alugar");
        botaoAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlugarActionPerformed(evt);
            }
        });

        botaoDevolucao.setText("Devolução");
        botaoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDevolucaoActionPerformed(evt);
            }
        });

        botaoRelatorio.setText("Relatório");
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        botaoSugestoes.setText("Sugestões");
        botaoSugestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSugestoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSugestoes)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botaoSair))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botaoAlugar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFilmes)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(textoVersao)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRelatorio)
                    .addComponent(botaoDevolucao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textoVersao)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoClientes)
                    .addComponent(botaoFilmes)
                    .addComponent(botaoDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSugestoes)
                    .addComponent(botaoAlugar)
                    .addComponent(botaoRelatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSugestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSugestoesActionPerformed
        Suggestion menuSugestao = new Suggestion();
        menuSugestao.setVisible(true);
        menuSugestao.setTitle("Sugestão de Filme");
        menuSugestao.setLocationRelativeTo(null);
    }//GEN-LAST:event_botaoSugestoesActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoClientesActionPerformed
        Customers menuClientes = new Customers();
        menuClientes.setVisible(true);
        menuClientes.setTitle("Área do Cliente");
        menuClientes.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoClientesActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void botaoFilmesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoFilmesActionPerformed
        Films menuFilmes = new Films();
        menuFilmes.setVisible(true);
        menuFilmes.setTitle("Área do Filme");
        menuFilmes.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoFilmesActionPerformed

    private void botaoAlugarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAlugarActionPerformed
        Rent aluguelDeFilme = new Rent();
        aluguelDeFilme.setVisible(true);
        aluguelDeFilme.setTitle("Alugar Filmes");
        aluguelDeFilme.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoAlugarActionPerformed

    private void botaoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoDevolucaoActionPerformed
        File aluguel = new File(Manipulacao.DB_ALUGUEL + "aluguel.txt");

        if (aluguel.length() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Faça o aluguel de filme pelo menos de 1 cliente para usar tal opção");
        } else {
            Devolution devolucaoDeFilme = new Devolution();
            devolucaoDeFilme.setVisible(true);
            devolucaoDeFilme.setTitle("Devolução de Filme");
            devolucaoDeFilme.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_botaoDevolucaoActionPerformed

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoRelatorioActionPerformed
        Report menuRelatorio = new Report();
        menuRelatorio.setVisible(true);
        menuRelatorio.setTitle("Menu de Relátorios");
        menuRelatorio.setLocationRelativeTo(null);
    }// GEN-LAST:event_botaoRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlugar;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoDevolucao;
    private javax.swing.JButton botaoFilmes;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSugestoes;
    private javax.swing.JLabel textoVersao;
    // End of variables declaration//GEN-END:variables

}
