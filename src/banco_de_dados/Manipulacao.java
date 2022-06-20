package banco_de_dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Manipulacao {

    public static void escreverArquivo(File file, String texto) {
        try(FileWriter fw = new FileWriter(file,true)) {
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

    public static void removerDadosArquivo(File clientes,String salvaDados) throws Exception{
        String[] lines = banco_de_dados.Manipulacao.lerArquivo(clientes).split("\n");
        String remove = "";
        String aux = "";

        for(String line: lines){
            String nome = line.split("\t")[0];
            String cpf = line.split("\t")[1] ;
            String verifica = nome + "\t" + cpf + "\t";
            if(verifica.equals(salvaDados)){
                remove = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
                break;
            }
        }

        for(String line: lines){
            String verifica = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
            if(verifica.equals(remove)){
                continue;
            }

            aux += line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
        }

        try{
            FileWriter fw = new FileWriter(clientes);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(aux);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo");
        }

    }
}