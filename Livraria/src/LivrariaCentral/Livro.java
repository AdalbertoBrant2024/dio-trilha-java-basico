
package LivrariaCentral;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private Integer ano;
    
    public Livro(String titulo, String autor, Integer ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }
    
    @Override
    public String toString(){
        return  "Título: "+ this.titulo + "\nAutor -> "+ this.autor + "\nAno -> " + this.ano+"\n";
    }
}
