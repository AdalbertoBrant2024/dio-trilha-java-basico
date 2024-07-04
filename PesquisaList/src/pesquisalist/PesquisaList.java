package pesquisalist;

import catalogoLivros.Livro;
import java.util.List;
import java.util.ArrayList;

public class PesquisaList {
    
    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogo.adicionarLivro("Os Três Mosqueteiros", "Alexandre Dumas", 1844);
        catalogo.adicionarLivro("O Jogador", "Fiodor Dostoievski", 1866);
        catalogo.adicionarLivro("Os Irmãos Karamazov", "Fiodor Dostoievski", 1879);
        catalogo.adicionarLivro("Os Miseráveis", "Victor Hugo", 1862);
        
        // imprimir livros
        catalogo.imprimirCatalago();
        
        // pesquisar autor no catálogo
        System.out.println(catalogo.pequisarPorAutor("Fiodor Dostoievski"));
        
        // pesquisar por intervalo de ano no catálogo
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1851, 1862));
        
        // pesquisar por título do livro no catálogo
        System.out.println(catalogo.pesquisarPorTitulo("Moby Dick"));
    }
    
}
