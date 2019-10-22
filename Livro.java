/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String Titulo;
    private String Editora;
    private int ano;
   ArrayList<Autor> Escritores = new ArrayList<>();
    

    public Livro() {
    }

    public Livro(String Titulo, String Editora, int ano) {
        this.Titulo = Titulo;
        this.Editora = Editora;
        this.ano = ano;

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void getEscritores() {
        for (int i = 0; i < Escritores.size(); i++){
            System.out.println("Nomes Autor: "+this.Escritores.get(i).getNome());
            
        }
    }

    public void setEscritores(Autor teste) {
        Escritores.add(teste);
    }

}
