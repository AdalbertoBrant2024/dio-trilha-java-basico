
package LivrariaCentral;


public class Main {
    public static void main(String[] args) {
        Livro mobyDick = new Livro("Moby Dick, A Baleia", "Herman Melville", 1851);
        Livro mosqueteiros = new Livro("Os três mosqueteiros", "Alexandre Dumas", 1844);
        Livro miseraveis = new Livro("Os miseráveis", "Victor Hugo", 1862);
        Livro frankstein = new Livro("Frankenstein ou o Prometeu Moderno", "Mary Shelley", 1818);
        
        Prateleira classicos = new Prateleira();
        
        classicos.adicionarLivro(mobyDick);
        classicos.adicionarLivro(mosqueteiros);
        classicos.adicionarLivro(miseraveis);
        classicos.adicionarLivro(frankstein);
        
        
        System.out.println(classicos.getColecaoLivros());
    }
}
