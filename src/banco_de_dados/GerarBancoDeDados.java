package banco_de_dados;

import java.io.File;
import java.util.ArrayList;

public class GerarBancoDeDados {
    public static final String DB_FILMES = "DIRETORIO_GERAL/FILMES/";
    public static final String DB_CLIENTES = "DIRETORIO_GERAL/CLIENTES/";
    public static final String DB_RELATORIOS = "DIRETORIO_GERAL/RELATORIOS/";

    public static void criarBD(){
        ArrayList<File> diretorios = new ArrayList<File>();
        diretorios.add(new File(DB_FILMES));
        diretorios.add(new File(DB_CLIENTES));
        diretorios.add(new File(DB_RELATORIOS));

        for(File diretorio: diretorios){
            if(!diretorio.exists()){
                diretorio.mkdirs();
            }
        }
    }
}
