package com.mycompany.projeto.poo.filmes;

public class Filmes {
    private String titulo;
    private int alugueis;
    
    public Filmes(String titulo , int alugueis){
        this.titulo = titulo;
        this.alugueis = alugueis;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAlugueis(){
        return alugueis;
    }
    
    public void setAlugueis(int alugueis){
        this.alugueis = alugueis;
    }
}
