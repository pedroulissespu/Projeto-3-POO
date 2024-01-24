package com.mycompany.projeto.poo.films;

public class Films {
    private String titulo;
    private int alugueis;
    
    public Films(String titulo , int alugueis){
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
