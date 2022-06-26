package com.mycompany.projeto.poo.manipulacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Manipulacao {
    public static final String DB_FILMES = "DIRETORIO_GERAL/FILMES/";
    public static final String DB_CLIENTES = "DIRETORIO_GERAL/CLIENTES/";
    public static final String DB_RANKING = "DIRETORIO_GERAL/RANKING/";
    public static final String DB_ALUGUEL = "DIRETORIO_GERAL/ALUGUEL/";
    public static final String DB_HISTORICO = "DIRETORIO_GERAL/HISTORICO/";
    public static final String DB_SUGESTAO = "DIRETORIO_GERAL/SUGESTAO/";

    public static void criarBD() {
        ArrayList<File> diretorios = new ArrayList<File>();
        diretorios.add(new File(DB_FILMES));
        diretorios.add(new File(DB_CLIENTES));
        diretorios.add(new File(DB_RANKING));
        diretorios.add(new File(DB_ALUGUEL));
        diretorios.add(new File(DB_HISTORICO));
        diretorios.add(new File(DB_SUGESTAO));

        for (File diretorio : diretorios) {
            if (!diretorio.exists()) {
                diretorio.mkdirs();
            }
        }
    }

    public static void escreverArquivo(File file, String texto) {
        try (FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }
    }

    public static String lerArquivo(File file) {
        String aux = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                aux += br.readLine() + "\n";
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");
        } catch (IOException e) {
            System.out.println("Falha na leitura do arquivo");
        }
        return aux;
    }

    public static void removerDadosArquivo(File clientes, String salvaDados) throws Exception {
        String[] lines = lerArquivo(clientes).split("\n");
        String remove = "";
        String aux = "";

        for (String line : lines) {
            String nome = line.split("\t")[0];
            String cpf = line.split("\t")[1];
            String verifica = nome + "\t" + cpf + "\t";
            if (verifica.equals(salvaDados)) {
                remove = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
                break;
            }
        }

        for (String line : lines) {
            String verifica = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
            if (verifica.equals(remove)) {
                continue;
            }

            aux += line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
        }

        try {
            FileWriter fw = new FileWriter(clientes);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(aux);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }

    }

    public static void alterarDadosArquivo(File clientes, String dadosAntigos, String dadosNovos) throws Exception {
        String[] lines = Manipulacao.lerArquivo(clientes).split("\n");
        String pula = "";
        String aux = "";

        for (String line : lines) {
            String nome = line.split("\t")[0];
            String cpf = line.split("\t")[1];
            String verifica = nome + "\t" + cpf + "\t";
            if (verifica.equals(dadosAntigos)) {
                pula = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
                break;
            }
        }

        for (String line : lines) {
            String verifica = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
            if (verifica.equals(pula)) {
                aux += dadosNovos;
                continue;
            }

            aux += line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
        }

        try {
            FileWriter fw = new FileWriter(clientes);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(aux);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }
    }

    public static void removerDadosArquivoFilme(File filme, String salvaDados) throws Exception {
        String[] lines = Manipulacao.lerArquivo(filme).split("\n");
        String remove = "";
        String aux = "";

        for (String line : lines) {
            String nome = line.split("\t")[0];
            String verifica = nome + "\t";
            if (verifica.equals(salvaDados)) {
                remove = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                        + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
                break;
            }
        }

        for (String line : lines) {
            String verifica = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                    + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
            if (verifica.equals(remove)) {
                continue;
            }

            aux += line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                    + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
        }

        try {
            FileWriter fw = new FileWriter(filme);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(aux);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }

    }

    public static void alterarDadosArquivoFilme(File clientes, String dadosAntigos, String dadosNovos)
            throws Exception {
        String[] lines = Manipulacao.lerArquivo(clientes).split("\n");
        String pula = "";
        String aux = "";

        for (String line : lines) {
            String nome = line.split("\t")[0];
            String verifica = nome + "\t";
            if (verifica.equals(dadosAntigos)) {
                pula = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                        + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
                break;
            }
        }

        for (String line : lines) {
            String verifica = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                    + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
            if (verifica.equals(pula)) {
                aux += dadosNovos;
                continue;
            }

            aux += line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\t"
                    + line.split("\t")[3] + "\t" + line.split("\t")[4] + "\n";
        }

        try {
            FileWriter fw = new FileWriter(clientes);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(aux);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }
    }
    
    public static void escreverArquivoApagandoTudo(File file, String texto){
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            fw.close();
        } catch(IOException e){
            
        }
    }
}