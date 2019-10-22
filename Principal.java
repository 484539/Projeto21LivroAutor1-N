/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor objAut1 = new Autor("Lucas", 1995, "teste");
        Autor objAut2 = new Autor("Renato", 1564, "anonoo");
        Autor objAut3 = new Autor("teste", 1564, "anonoo");
        
        Livro objLiv1 = new Livro ("Teste","new edit",1959);

        
        
        System.out.println("Obra: "+objLiv1.getTitulo());
        objLiv1.setEscritores(objAut2);
        objLiv1.setEscritores(objAut1);
        
        Livro objLiv3 = new Livro ("Teste Titulo2","new edit33",1449);
        
        System.out.println("Obra : "+objLiv3.getTitulo());
        objLiv3.setEscritores(objAut3);
        
       objLiv1.getEscritores();
       objLiv3.getEscritores();
        

    }
}