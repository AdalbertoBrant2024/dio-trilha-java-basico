
package LivrariaCentral;

import java.util.ArrayList;

public class Prateleira {
    
    // cria uma lista de livros 
    private ArrayList<Livro> colecaoLivros;

    public Prateleira() {
        this.colecaoLivros = new ArrayList<>(); 
    }
    
    public void adicionarLivro(Livro livro){
        this.colecaoLivros.add(livro);
    }
    
    public boolean removerLivro(Livro livro){
        return colecaoLivros.remove(livro);
    }
    
    public ArrayList<Livro> getColecaoLivros(){
        return colecaoLivros;
    }

}
