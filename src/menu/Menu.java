package menu;

import banco_de_dados.GerarBancoDeDados;
import banco_de_dados.Manipulacao;

import java.io.File;
import java.util.Scanner;

public class Menu {

    public Menu() throws Exception{

        banco_de_dados.GerarBancoDeDados.criarBD();

        Scanner input = new Scanner(System.in);
        
        while(true){
            int entrada;
            entrada = input.nextInt();
            switch(entrada){
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                default:
                    break;
            }
        }
    }

    public void adicionarCliente(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        String nome = input.nextLine();
        System.out.println("Digite o CPF do cliente");
        String cpf = input.nextLine();
        System.out.println("Digite a idade do cliente");
        String idade = input.nextLine();
        String salvaDados = nome + "\t" + cpf + "\t" + idade + "\n";

        File cliente = new File(banco_de_dados.GerarBancoDeDados.DB_CLIENTES + "clientes.txt");
        banco_de_dados.Manipulacao.escreverArquivo(cliente, salvaDados);
    }

    public void mostrarClientes(){
        File file = new File(banco_de_dados.GerarBancoDeDados.DB_CLIENTES);
        for(File files : file.listFiles()){
            System.out.println(files.getName().replace(".txt", ""));
            System.out.println(Manipulacao.lerArquivo(files));
        }
    }
}