public class Pessoa { //extends Object {
    private String nome;
    private String telefone;

    // public Pessoa(){
    // }

    public Pessoa(String nome) {
        this.nome = nome;
        this.telefone = "tel. não informado";
    }

    // overload = sobrecarga
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDados() {
        return nome + ": " + telefone;
    }

    @Override
    public String toString() {
        return nome + ": " + telefone;
    }
}
