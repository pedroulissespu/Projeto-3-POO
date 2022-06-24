/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedroupcm
 */
public class RankingFilmes extends javax.swing.JFrame {

    /**
     * Creates new form RankingFilmes
     */
    public RankingFilmes() {
        initComponents();
    }

    public void preencheTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabelaRanking.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.setRowCount(0);
            }

            File ranking = new File(Manipulacao.DB_RANKING + "ranking.txt");

            FileInputStream fis = new FileInputStream(ranking);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            while (linha != null) {
                Object[] obj = linha.split("\t");
                modelo.addRow(obj);
                linha = br.readLine();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRanking = new javax.swing.JTable();
        botaoVerRanking = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Filme", "Número de Alugueis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaRanking);

        botaoVerRanking.setText("Ver Ranking");
        botaoVerRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerRankingActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVerRanking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVerRanking)
                    .addComponent(botaoSair)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }// GEN-LAST:event_botaoSairActionPerformed

    private void botaoVerRankingActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoVerRankingActionPerformed
        String out = "";
        File ranking = new File(Manipulacao.DB_RANKING + "ranking.txt");
        ArrayList<Filmes> filme = new ArrayList<Filmes>();
        String[] lines = Manipulacao.lerArquivo(ranking).split("\n");

        for (String line : lines) {
            String titulo = line.split("\t")[0];
            int alugueis = Integer.parseInt(line.split("\t")[1]);
            filme.add(new Filmes(titulo, alugueis));
        }

        List<Filmes> filmePorAluguel = filme.stream()
                .sorted(Comparator.comparing(filmes -> filmes.getAlugueis(), Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for (Filmes filmeFor : filmePorAluguel) {
            out += filmeFor.getTitulo() + "\t" + filmeFor.getAlugueis() + "\n";
        }

        try {
            FileWriter fw = new FileWriter(ranking);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(out);
            bw.close();
            fw.close();
        } catch (IOException e) {

        }

        preencheTabela();
    }// GEN-LAST:event_botaoVerRankingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void rankingfilmes(String args[]) {
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
            java.util.logging.Logger.getLogger(RankingFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankingFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVerRanking;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRanking;
    // End of variables declaration//GEN-END:variables
}
