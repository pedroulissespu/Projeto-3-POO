package banco_de_dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
}