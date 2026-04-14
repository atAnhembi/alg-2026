public class Telefone {
    private String numero;
    private double saldo;
    private static double valorLigacao;

    public Telefone(String numero, double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
        setTelefone(numero);
    }

    private void setTelefone(String telefone) {
        if (telefone.trim().length() > 0) {
            this.numero = telefone;
        } else {
            this.numero = "() xxxx-xxxx";
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setValorLigacao(double valor) {
        if (valor > 0) {
            valorLigacao = valor;
        }
    }

    public boolean chamar() {
        if (saldo >= valorLigacao) {
            saldo -= valorLigacao;
            return true;
        }
        return false;
    }

    public boolean recarregar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }
}
