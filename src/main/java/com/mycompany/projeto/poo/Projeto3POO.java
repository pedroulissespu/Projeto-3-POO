package com.mycompany.projeto.poo;

public class Projeto3POO {

    public static void main(String[] args) {
        Manipulacao.criarBD();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
