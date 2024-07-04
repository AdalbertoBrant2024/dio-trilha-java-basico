
package catalogo;

import java.util.Comparator;


public class Produto implements Comparable<Produto>{

    
    private String nome;
    private long codigo;
    private double preço;
    private int quantidade;

    public Produto(String nome, long codigo, double preço, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    
    @Override
    public int compareTo(Produto p) {
        return this.nome.compareToIgnoreCase(p.getNome());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", codigo=" + codigo + ", pre\u00e7o=" + preço + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }
    
        
    
}

class ComparatorPorPreco implements Comparator<Produto> { 
    
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreço(), p2.getPreço());
    }
    
}
