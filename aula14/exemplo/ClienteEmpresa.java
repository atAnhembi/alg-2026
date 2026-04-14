public class ClienteEmpresa {
    private String nome;
    private Telefone telefone;

    public ClienteEmpresa(String telefone) {
        this("Não cadastrado", telefone, 0);
    }

    public ClienteEmpresa(Telefone telefone) {
        this.nome = "Não cadastrado";
        this.telefone = telefone;
    }

    public ClienteEmpresa(String nome, String telefone, double saldo) {
        this.nome = nome;
        this.telefone = new Telefone(telefone, saldo);
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public String exibirDados() {
        return nome + " : " + telefone.getNumero() + " : " + telefone.getSaldo();
    }
    public String exibirDados2() {
        if(telefone != null){
        return nome + " : " + telefone.getNumero() + " : " + telefone.getSaldo();
        } 
        return nome + " - sem telefone ";
    }
}
