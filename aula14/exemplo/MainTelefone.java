public class MainTelefone {
    public static void main(String[] args) {
        ClienteEmpresa c1 = new ClienteEmpresa("(11) 98765-4321");
        ClienteEmpresa c2 = new ClienteEmpresa("Carlos", "(11) 91234-5678", 10);
        // Telefone tel = null;
        // ClienteEmpresa c3 = new ClienteEmpresa(tel);

        // c3.exibirDados(); // vai dar erro

        c1.getTelefone().setValorLigacao(0.5);
        // Cliente.valorLigacao = 0.4;
        
        if (c1.getTelefone().chamar()) {
            System.out.println("Ligação feita com " + c1.exibirDados());
        } else {
            System.out.println("Não foi possíve ligar. Saldo insuficiente");
        }

        c1.getTelefone().recarregar(10);

        if (c1.getTelefone().chamar()) {
            System.out.println("Ligação feita com " + c1.exibirDados());
        } else {
            System.out.println("Não foi possíve ligar. Saldo insuficiente");
        }

        c2.getTelefone().chamar();
        System.out.println(c2.exibirDados());


    }
}
