package menu;

import banco_de_dados.GerarBancoDeDados;
import banco_de_dados.Manipulacao;
import entity.Cliente;

import java.io.File;
import java.util.ArrayList;
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
                case 3:
                    removerCliente();
                    break;
                case 4:
                    mostrarDadosClientesSeparado();
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
            System.out.println(Manipulacao.lerArquivo(files));
        }
    }

    public void removerCliente() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o cpf");
        String cpf = input.nextLine();
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        String salvaDados = nome + "\t" + cpf + "\t";
        File clientes = new File(banco_de_dados.GerarBancoDeDados.DB_CLIENTES + "clientes.txt");
        banco_de_dados.Manipulacao.removerDadosArquivo(clientes,salvaDados);
    }

    public void mostrarDadosClientesSeparado() throws Exception{
        File clientes = new File(banco_de_dados.GerarBancoDeDados.DB_CLIENTES + "clientes.txt");
        String[] lines = banco_de_dados.Manipulacao.lerArquivo(clientes).split("\n");

        for(String line: lines){
            String teste = "Pedro" + "\t" + "111111111" + "\t" + "12" + "\n";
            String mostra = line.split("\t")[0] + "\t" + line.split("\t")[1] + "\t" + line.split("\t")[2] + "\n";
            if(mostra.equals(teste)) System.out.println(mostra);
        }
    }

}