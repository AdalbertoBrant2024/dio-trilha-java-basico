
package agendas;

import java.util.Objects;

public class Contato {
    private String nome;
    private String sobreNome;
    private int numeroTelefone;
    
    public Contato(String nome, String sobreNome, int numeroTelefone){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    @Override
    public String toString(){
        return "Contato: " + getNome()+' ' + getSobreNome() +'\n'+
                "Telefone: " + getNumeroTelefone()+'\n';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.sobreNome);
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
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.sobreNome, other.sobreNome);
    }
    
    
}
