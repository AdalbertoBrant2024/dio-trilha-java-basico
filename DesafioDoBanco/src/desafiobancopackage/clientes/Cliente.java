
package desafiobancopackage.clientes;

public class Cliente {
    private String nome;
    private String sobreNome;
    private String cpf;
    private String endereco;
    private String whatsapp;
    
    public Cliente(String nome, String sobreNome, String cpf, String endereco
    , String whatsapp){
        this.nome = nome; this.sobreNome = sobreNome; this.cpf = cpf;
        this.endereco = endereco; this.whatsapp = whatsapp;
    }

    public boolean verificaCpf(){
        cpf = cpf.replace(".", "").replace("-", "");

    if (cpf.length() != 11 || cpf.matches(cpf.charAt(0) + "{11}")) return false;

    for (int j = 0; j < 2; j++) {
        int soma = 0, r;
        for (int i = 0; i < 9 + j; i++) {
            soma += Integer.parseInt(cpf.charAt(i) + "") * (10 + j - i);
        }
        r = (soma * 10) % 11;
        if (r == 10) r = 0;
        if (r != Integer.parseInt(cpf.charAt(9 + j) + "")) return false;
    }
    return true;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nSobrenome: " 
                + sobreNome + "\nCPF: " + cpf + "\nEndereço: " 
                + endereco + "\nWhatsapp: " + whatsapp + "\n";
    }
    
    
    
}
