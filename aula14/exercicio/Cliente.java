public class Cliente {
    private String nome;
    private String telefone;
    private double saldo;
    private static double valorLigacao; // static é um atributo de classe e não de cada objeto

    public Cliente(String telefone) {
        this("Não cadastrado", telefone, 0);
    }

    public Cliente(String nome, String telefone, double saldo) {
        this.nome = nome;
        setTelefone(telefone);
        if(saldo > 0) {
            this.saldo = saldo;
        }
    }

    private void setTelefone(String telefone) {
        if(telefone.trim().length() > 0) {
            this.telefone = telefone;
        } else {
            this.telefone = "() xxxx-xxxx";
        }
    }

    public void setValorLigacao(double valor) {
        if (valor > 0) {
            valorLigacao = valor;
        }
    }

    public boolean chamar() {
        if(saldo >= valorLigacao) {
            saldo -= valorLigacao;
            return true;
        }
        return false;
    }

    public boolean recarregar(double valor) {
        if(valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public String exibirDados() {
        return nome + " : " + telefone + " : " + saldo;
    }
}
